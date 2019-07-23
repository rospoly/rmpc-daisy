package unit

import daisy._
import daisy.lang.Identifiers.{FreshIdentifier, Identifier}
import daisy.lang.TreeOps._
import daisy.lang.Trees.RealLiteral.{one, two}
import daisy.lang.Trees._
import daisy.lang.Types.RealType
import daisy.tools.FinitePrecision.Float64
import daisy.tools.Interval._
import daisy.tools.{RangeEvaluators, Interval, Rational, Taylor}
/**
  * Created by izycheva on 12/21/16.
  */
class TaylorDerivativeTest extends UnitSuite with Taylor with RangeEvaluators {

  val ctx = dummyContext

  val debugSection = DebugSectionAnalysis

  ignore("constant no variable"){
    val derivative = derive(RealLiteral(Rational.fromReal(5)),
      FreshIdentifier("x", RealType))
    val expected = zero
    ctx.reporter.info(derivative)
    assert(derivative.equals(expected))
  }

  ignore("single variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    val derivative = derive(x, x.id)
    val expected = one
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected))
  }

  ignore("power variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    val derivative = derive(Times(x, x), x.id)
    val expected = Times(two, x)
    val expOption = Plus(x, x)
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected) || expressionsEqual(derivative, expOption))
  }

  ignore("sqrt variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    val derivative = derive(Sqrt(x), x.id)
    val expected = Division(one, Times(two, Sqrt(x)))
    val expOption = Division(one, Plus(Sqrt(x), Sqrt(x)))
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected) || expressionsEqual(derivative, expOption))
  }

  ignore("sum variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    // x + x
    val derivative = derive(Plus(x, x), x.id)
    val expected = two
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected))
  }

  ignore("subtraction variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    val expr = Minus(
      Times(RealLiteral(Rational.fromReal(3)), x),
      Times(x, x))
    // 3x - x * x
    val derivative = derive(expr, x.id)
    val expected = Minus(RealLiteral(Rational.fromReal(3)),
      Times(two, x))
    val expectedOpt = Minus(RealLiteral(Rational.fromReal(3)),
      Plus(x, x))
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected) || expressionsEqual(derivative, expectedOpt))
  }

  ignore("multiplication variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    // (x + 1) * (2*x)
    val expr = Times(
      Plus(x, one),
      Times(two, x))
    val derivative = derive(expr, x.id)
    // 2x + 2(x+1)
    val expected = Plus(Times(two, x),
      Times(two, Plus(x, one)))
    val expOption = Times(two, Plus(x, Plus(x, one)))
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected) || expressionsEqual(derivative, expOption))
  }

  ignore("easy division variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    // 1 / (x + 1)
    val expr = Division(one, Plus(x, one))
    val derivative = derive(expr, x.id)
    val expected = Division(UMinus(one), Times(Plus(x, one), Plus(x, one)))
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected))
  }

  ignore("division variable"){
    // fails if nominators aren't cancelled
    val x = Delta(FreshIdentifier("x", RealType))
    // (x + 1) / (2*x)
    val expr = Division(
      Plus(x, one),
      Times(two, x))
    val derivative = derive(expr, x.id)
    val expected = Division(UMinus(one), Times(Times(two, x), x))
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected))
  }

  ignore("constant and variable"){
    val x = Delta(FreshIdentifier("x", RealType))
    val y = Delta(FreshIdentifier("y", RealType))
    // (y + 1) * (2 + x)
    val expr = Times(
      Plus(y, one),
      Plus(two, x))
    val derivative = derive(expr, x.id)
    val expected = Plus(y, one)
    ctx.reporter.info(derivative)
    assert(expressionsEqual(derivative, expected))
  }

   ignore("turbine two part") {

    val x = Variable(FreshIdentifier("x", RealType))

    // 0.5 *x*x*x*x
    val (exprSimple, _) = deltaAbstract(Times(Times
    (Times(Times(
      RealLiteral(Rational.fromReal(0.5)), x), x), x), x), false)

    // '(0.5 *x ')*(x*x*x)
    val (exprWithParenthesis, _) = deltaAbstract(
          Times(
          Times(RealLiteral(Rational.fromReal(0.5)), x)
          , Times(Times(x, x), x)), false)
    ctx.reporter.info(s"expr simple is $exprSimple")
    ctx.reporter.info(s"expr parenthesis is $exprWithParenthesis")

    val derivativeSimple = derive(exprSimple, deltasOf(exprSimple).head.id)
    val derivativeWithParenthesis = derive(exprWithParenthesis, deltasOf(exprWithParenthesis).head.id)
    ctx.reporter.info(s"derivative simple is $derivativeSimple")
    ctx.reporter.info(s"derivative parenthesis is $derivativeWithParenthesis")

    val input: Map[Identifier, Interval] =
        deltasOf(derivativeSimple).map(_.id -> Interval(-Float64.machineEpsilon, Float64.machineEpsilon)).toMap +
          (x.id -> Interval(Rational.fromReal(-4.5), Rational.fromReal(-0.3)))

    val simpleEval = evalRange[Interval](derivativeSimple, input, Interval.apply)._1
    val parentEval = evalRange[Interval](derivativeWithParenthesis, input, Interval.apply)._1
    assert(simpleEval.equals(parentEval))

  }

  ignore("doppler rel"){
    //(-722800. / ((361.4 + u) * (361.4 + u)))
    val x = Variable(FreshIdentifier("x", RealType))

    val bodyReal: Expr = Division(
      RealLiteral(Rational.fromReal(-722800)),
      Times(Plus(RealLiteral(Rational.fromReal(361.4)), x),
        Plus(RealLiteral(Rational.fromReal(361.4)), x))
    )
    val (bodyDelta, _) = deltaAbstract(bodyReal, false)
    val relErrorExpr = Division(Minus(bodyReal, bodyDelta), bodyReal)

    val input: Map[Identifier, Interval] =
      deltasOf(bodyDelta).map(_.id -> Interval(Rational.zero)).toMap +
        (x.id -> Interval(Rational.fromReal(-100.0), Rational.fromReal(100.0))) +
        (newDelta.id -> deltaIntervalFloat64)

    var error: Rational = Rational.zero
    val taylors = getDerivative(relErrorExpr)
    taylors.foreach(x => {
      val tmp = Times(replaceDeltasWithZeros(x._1), newDelta)
      error = error.+(maxAbs(evalRange[Interval](tmp, input, Interval.apply)._1))})

    error = error.+(getTaylorRemainder(relErrorExpr, Seq(input)).getOrElse(Rational.zero))
 // dynamic 5.64824642221707E-16
    val expectedError:Rational = Rational.fromReal(5.64824642221707./(Math.pow(10, 16)))
    ctx.reporter.info(s"error $error")
    assert(error.>(expectedError))
  }

  ignore("doppler abs"){
    //(-722800. / ((361.4 + u) * (361.4 + u)))
    val x = Variable(FreshIdentifier("x", RealType))

    val bodyReal: Expr = Division(
      RealLiteral(Rational.fromReal(-722800)),
      Times(Plus(RealLiteral(Rational.fromReal(361.4)), x),
        Plus(RealLiteral(Rational.fromReal(361.4)), x))
    )
    val (bodyDelta, _) = deltaAbstract(bodyReal, false)
    val input: Map[Identifier, Interval] = Map.empty +
        (x.id -> Interval(Rational.fromReal(-100.0), Rational.fromReal(100.0))) +
        (newDelta.id -> deltaIntervalFloat64)

    val expectedExprOne: Expr = Division(
      Times(RealLiteral(Rational.fromReal(722800)), newDelta),
      Times(Plus(RealLiteral(Rational.fromReal(361.4)), x),
        Plus(RealLiteral(Rational.fromReal(361.4)), x))
    )
    val expectedExprTwo: Expr = Division(
      Times(UMinus(RealLiteral(Rational.fromReal(722800))), newDelta),
      Times(Plus(RealLiteral(Rational.fromReal(361.4)), x),
        Plus(RealLiteral(Rational.fromReal(361.4)), x))
    )

    var error: Rational = Rational.zero
    val taylors = getDerivative(bodyDelta)
    taylors.foreach(x => {
      val tmp = easySimplify(Times(replaceDeltasWithZeros(x._1), newDelta))
      ctx.reporter.info(tmp)
    // fixme this assertion fails if no simplifications are made for expressions
    // assert(expressionsEqual(tmp, expectedExprOne) ||expressionsEqual(tmp, expectedExprTwo))
      val tmpErr = evalRange[Interval](tmp, input, Interval.apply)._1
      ctx.reporter.warning(tmpErr)
      ctx.reporter.warning(evalRange[Interval](x._1, input, Interval.apply)._1)
      error = error.+(maxAbs(tmpErr))})

    error = error.+(getTaylorRemainder(bodyDelta, Seq(input)).getOrElse(Rational.zero))
 // dynamic 5.94057910316686E-15
    val expectedError:Rational = Rational.fromReal(5.94057910316686./(Math.pow(10, 15)))
    ctx.reporter.info(s"error $error")
    assert(error.>(expectedError))
  }

  ignore("cancel nominators"){
//    ((1. + delta1) * (1. + delta2))
//    ((((1. + delta) * (1. + delta1)) * (1. + delta2))
// * (((1. + delta) * (1. + delta1)) * (1. + delta2)))
    val x = Delta(FreshIdentifier("x", RealType))
    val x1 = Delta(FreshIdentifier("x1", RealType))
    val x2 = Delta(FreshIdentifier("x2", RealType))

    val nom: Expr = Times(Plus(one, x1), Plus(one, x2))
    val denom: Expr = Times(Times(Times(Plus(one, x), Plus(one, x1)), Plus(one, x2)),
      Times(Times(Plus(one, x), Plus(one, x1)), Plus(one, x2)))

    val result = cancelNominators(nom, denom)
    val expected:Expr = Division(one, Times(Times(Times(Plus(one, x),Plus(one, x)), Plus(one, x1)), Plus(one, x2)))
    assert(expressionsEqual(result, expected))
  }

  ignore("batchprocessor state1 abs"){
    val x = Variable(FreshIdentifier("x", RealType))

    val (expr, _) = deltaAbstract(
      Plus(RealLiteral(Rational.fromReal(0.520032)),
        Times(RealLiteral(Rational.fromReal(0.0447)), x)), false)

    val input: Map[Identifier, Interval] =
      deltasOf(expr).map(_.id -> Interval(-Float64.machineEpsilon, Float64.machineEpsilon)).toMap +
        (x.id -> Interval(Rational.fromReal(-10.0), Rational.fromReal(10.0)))

    var error: Rational = Rational.zero
    val taylors = deltasOf(expr).foreach(y => {
      val tmp = derive(expr, y.id)
      ctx.reporter.info(s"== wrt $y derivative is $tmp")
      error = error.+(maxAbs(evalRange[Interval](Times(tmp, y), input, Interval.apply)._1))
    })
    error = error.+(getTaylorRemainder(expr, Seq(input)).getOrElse(Rational.zero))
    ctx.reporter.info(s"error $error")

    val expectedError:Rational = Rational.fromReal(1.14070530798926483./(Math.pow(10, 16)))
    assert(error.>(expectedError))

  }

  ignore("batchprocessor state1 rel"){
    val x = Variable(FreshIdentifier("x", RealType))

    val bodyReal: Expr = Plus(RealLiteral(Rational.fromReal(0.520032)),
      Times(RealLiteral(Rational.fromReal(0.0447)), x))
    val (bodyDelta, _) = deltaAbstract(bodyReal, false)
    val relErrorExpr = Division(Minus(bodyReal, bodyDelta), bodyReal)
    val relErrorExprVV = Division(Minus(bodyDelta, bodyReal), bodyReal)

    val input: Map[Identifier, Interval] =
      deltasOf(bodyDelta).map(_.id -> Interval(-Float64.machineEpsilon, Float64.machineEpsilon)).toMap +
        (x.id -> Interval(Rational.fromReal(-10.0), Rational.fromReal(10.0)))

    var error: Rational = Rational.zero
    var errorVV: Rational = Rational.zero

    val taylors = getDerivative(relErrorExpr)
    val taylorsVV = getDerivative(relErrorExprVV)
//      deltasOf(bodyDelta).foreach(y => {
//      val tmp = derive(relErrorExpr, y.id)
//      ctx.reporter.info(s"== wrt $y derivative is $tmp")
//      error = error.+(maxAbs(evalRange[Interval](Times(tmp, y), input, Interval.apply)._1))
//    })
    taylors.foreach(x => {error = error.+(maxAbs(evalRange[Interval](x._1, input, Interval.apply)._1))})
    taylorsVV.foreach(x => {errorVV = errorVV.+(maxAbs(evalRange[Interval](x._1, input, Interval.apply)._1))})
    error = error.+(getTaylorRemainder(relErrorExpr, Seq(input)).getOrElse(Rational.zero))
    ctx.reporter.info(s"error $error")
    ctx.reporter.info(s"errorVV $errorVV")

    val expectedError:Rational = Rational.fromReal(1.49261843457544./(Math.pow(10, 15)))
    assert(error.>(expectedError))

  }

  ignore("batchprocessor state1 rel viceversa"){
    val x = Variable(FreshIdentifier("x", RealType))

    val bodyReal: Expr = Plus(RealLiteral(Rational.fromReal(0.520032)),
      Times(RealLiteral(Rational.fromReal(0.0447)), x))
    val (bodyDelta, _) = deltaAbstract(bodyReal, false)
    val relErrorExpr = Division(Minus(bodyReal, bodyDelta), bodyReal)
    val relErrorExprVV = Division(Minus(bodyDelta, bodyReal), bodyReal)

    val input: Map[Identifier, Interval] =
      deltasOf(bodyDelta).map(_.id -> Interval(-Float64.machineEpsilon, Float64.machineEpsilon)).toMap +
        (x.id -> Interval(Rational.fromReal(-10.0), Rational.fromReal(10.0)))

    var error: Rational = Rational.zero
    var errorVV: Rational = Rational.zero

    val taylors = getDerivative(relErrorExpr)
    val taylorsVV = getDerivative(relErrorExprVV)
    taylors.foreach(x => {error = error.+(maxAbs(evalRange[Interval](x._1, input, Interval.apply)._1))})
    taylorsVV.foreach(x => {errorVV = errorVV.+(maxAbs(evalRange[Interval](x._1, input, Interval.apply)._1))})
    error = error.+(getTaylorRemainder(relErrorExpr, Seq(input)).getOrElse(Rational.zero))
    errorVV = errorVV.+(getTaylorRemainder(relErrorExprVV, Seq(input)).getOrElse(Rational.zero))
    ctx.reporter.info(s"error $error")
    ctx.reporter.info(s"errorVV $errorVV")

    assert(error.equals(errorVV))

  }

  def expressionsEqual(e1:Expr, e2: Expr):Boolean = (e1, e2) match{
    case (RealLiteral(r1), RealLiteral(r2)) => r1.equals(r2)
    case (Delta(r1), Delta(r2)) => true
    case (Variable(r1), Variable(r2)) => r1.equals(r2)
    case (Sqrt(r1), Sqrt(r2)) => expressionsEqual(r1, r2)
    case (UMinus(r1), UMinus(r2)) => expressionsEqual(r1, r2)
    case (Let(id1, val1, body1), Let(id2, val2, body2)) =>
      id1.equals(id2) && val1.equals(val2) && expressionsEqual(body1, body2)
//      //FIXME handle different order of terms inside Plus()
//    case (Plus(lhs1, Plus(lhsIn1, rhsIn1)), Plus(Plus(lhsIn2, rhsIn2), rhs2)) =>
//      expressionsEqual(lhs1, lhsIn2) && expressionsEqual(lhsIn1, lhsIn2) && expressionsEqual(rhsIn1, rhs2)
    case (Plus(lhs1, rhs1), Plus(lhs2, rhs2)) =>
      (expressionsEqual(lhs1, lhs2) && expressionsEqual(rhs1, rhs2)) ||
        (expressionsEqual(lhs1, rhs2) && expressionsEqual(rhs1, lhs2))
//      // FIXME handle different order of terms inside Times()
//    case (Times(lhs1, Times(lhsIn1, rhsIn1)), Times(Times(lhsIn2, rhsIn2), rhs2)) =>
//      expressionsEqual(lhs1, lhsIn2) && expressionsEqual(lhsIn1, lhsIn2) && expressionsEqual(rhsIn1, rhs2)
    case (Times(lhs1, rhs1), Times(lhs2, rhs2)) =>
      (expressionsEqual(lhs1, lhs2) && expressionsEqual(rhs1, rhs2)) ||
        (expressionsEqual(lhs1, rhs2) && expressionsEqual(rhs1, lhs2))
      // FIXME handle reverse order
    case (Minus(lhs1, rhs1), Minus(lhs2, rhs2)) =>
      expressionsEqual(lhs1, lhs2) && expressionsEqual(rhs1, rhs2)
    case (Division(lhs1, rhs1), Division(lhs2, rhs2)) =>
      expressionsEqual(lhs1, lhs2) && expressionsEqual(rhs1, rhs2)
    case _ => false
  }

  def derive(ex:Expr, wrt: Identifier): Expr = {
    easySimplify(getPartialDerivative(ex, wrt))
  }
}
