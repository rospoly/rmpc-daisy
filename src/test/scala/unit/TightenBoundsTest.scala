package unit

import daisy.Main
import daisy.lang.Trees._
import daisy.tools.Rational._
import daisy.tools.{Interval, Rational, SMTRange}
import daisy.lang.Constructors.and

class TightenBoundsTest extends UnitSuite {

  Main.ctx = dummyContext
  // Uncomment this, if you want debug information (we cannot pass them
  // with command line params during tests)
  //SMTRange.reporter = new DefaultReporter(Set(DebugSectionRanges))

  test("point interval, no constraint") {
    val expr = Minus(Plus(x, y), Plus(y, x))
    val interval = Interval(zero, zero)

    // actually the use is not quite correct here, because we are not constraining
    // x and y by the constrs parameter
    val tight = SMTRange.tightenBounds(interval, expr, BooleanLiteral(true), Set(), Rational.fromReal(0.01), 75)
    assert(tight === interval)
  }

  test("underconstraint") {

    val expr = Plus(x, y)
    val interval = Interval(-6, 6)

    // x and y are unconstraint, in which case, the procedure should
    // default to he save choices of lower and upper bound
    val tight = SMTRange.tightenBounds(interval, expr, BooleanLiteral(true), Set(),Rational.fromReal(0.01), 75)
    assert(tight === interval)
  }

  test("false constraint") {

    val expr = Plus(x, y)
    val interval = Interval(-6, 6)

    val precond: Expr = And(
      LessThan(x, RealLiteral(zero)),
      GreaterThan(x, RealLiteral(zero))
      )

    // the given constraint is false, which should lead to an UNSAT
    // result in each query, which should result in an invalid interval
    // having lower bound bigger than upper bound, and thus in an exception
    intercept[java.lang.AssertionError] {
      val tight = SMTRange.tightenBounds(interval, expr, precond, Set(), Rational.fromReal(0.01), 75)
    }
  }

  test("tight interval") {
    val expr = Plus(x, y)
    val interval = Interval(-1, 5)

    val precond: Expr = and(
      LessEquals(RealLiteral(one), x),
      LessEquals(x, RealLiteral(Rational(3))),
      LessEquals(RealLiteral(Rational(-2)), y),
      LessEquals(y, RealLiteral(two)))

    val tight = SMTRange.tightenBounds(interval, expr, precond, Set(), Rational.fromReal(0.01), 75)

    assert(tight === interval)
  }

  test("bogus interval") {
    val expr = Plus(x, y)
    val interval = Interval(3, 5)

    val precond: Expr = and(
      LessEquals(RealLiteral(one), x),
      LessEquals(x, RealLiteral(Rational(3))),
      LessEquals(RealLiteral(Rational(-2)), y),
      LessEquals(y, RealLiteral(two)))

    val tight = SMTRange.tightenBounds(interval, expr, precond, Set(), Rational.fromReal(0.01), 75)
    assert(tight === interval)
  }



  test("simple expression, only variable constraint") {
    // test that the correlations are taken into account
    val expr = Minus(Plus(x, y), Plus(y, x))
    val interval = Interval(-6, 6)

    val precond: Expr = and(
      LessEquals(RealLiteral(one), x),
      LessEquals(x, RealLiteral(Rational(3))),
      LessEquals(RealLiteral(Rational(-2)), y),
      LessEquals(y, RealLiteral(two)))

    val tight = SMTRange.tightenBounds(interval, expr, precond, Set(), Rational.fromReal(0.01), 75)
    //println("tighted range for simple expr: \n" + tight)
    assert(tight === Interval(zero, zero))
  }

  test("simple effective constraint") {
    val expr = Times(x, x)
    val interval = Interval(-10, 10)

    val precond: Expr = And(
      LessEquals(RealLiteral(Rational(-10)), x),
      LessEquals(x, RealLiteral(Rational(10))))

    val addConstr = LessEquals(RealLiteral(zero), x)

    val tight = SMTRange.tightenBounds(interval, expr, precond, Set(addConstr), Rational.fromReal(0.01), 75)
    //println("tighted range for simple expr effective constraint: \n" + tight)
    assert(tight === Interval(zero, Rational(10)))
  }

  test("unrelated constraint") {
    val expr = Times(x, x)
    // this bound is tighter than what can be deduced from the constraint
    val interval = Interval(1, 10)

    val precond: Expr = And(
      LessEquals(RealLiteral(Rational(-10)), x),
      LessEquals(x, RealLiteral(Rational(10))))

    val addConstr = LessEquals(RealLiteral(zero), y)

    val tight = SMTRange.tightenBounds(interval, expr, precond, Set(addConstr), Rational.fromReal(0.01), 75)

    //println("tighted range for simple expr, ineffective constraint: \n" + tight)
    assert(tight == interval)   // no effect
  }


}
