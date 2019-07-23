package unit

import daisy.analysis
import daisy.lang.Trees._
import daisy.tools.Rational

import scala.collection.immutable.Seq

class SpecsProcessingTest extends UnitSuite {

  test("complete spec") {
    val spec = And(Seq(LessThan(minFive, x),
                      LessEquals(x, five),
                      AbsError(x, bigError),
                      GreaterThan(y, minTen),
                      GreaterEquals(ten, y),
                      AbsError(y, smallError),
                      LessThan(minFive, z),
                      GreaterEquals(ten, z)
                      ))

    val (ranges, errors, _) = analysis.SpecsProcessingPhase.extractPreCondition(spec)

    //println("ranges " + ranges)

    assert(ranges.size === 3)
    assert(errors.size === 2)  // z has no specified error
    assert( ranges(x.id) === (Rational(-5), Rational(5)) )
    assert( ranges(y.id) === (Rational(-10), Rational(10)) )
    assert( ranges(z.id) === (Rational(-5), Rational(10)) )
    assert(errors(x.id) === Rational(5, 10000))
    assert(errors(y.id) === Rational(10, 1000000))
    assert(!errors.contains(z.id))
  }

}
