package unit

import daisy.tools.Rational
import daisy.tools.MPFRFloat

class RationalTest extends UnitSuite {

  test("sine") {
    def sineTest(x: Double) = {
      val reference = Rational.fromString(MPFRFloat.sin(MPFRFloat.fromDouble(x)).toLongString)
      val rX = Rational.fromDouble(x)

      val (l, u) = (Rational.sineDown(rX), Rational.sineUp(rX))
      val succ = l <= reference && reference <= u
      assert(succ, s"input: '$x', res: ('$l', '$u'), reference: '$reference'")
    }

    sineTest(0)
    sineTest(math.Pi/2)
    sineTest(-math.Pi/2)
    sineTest(math.Pi)
    sineTest(-math.Pi)
    sineTest(-1)
    sineTest(1)
    sineTest(-0.5)
    sineTest(1.5)
    sineTest(0.5)
    sineTest(-1.5)
    sineTest(-1.5)
    sineTest(-1.5)
    sineTest(-1.5)
    sineTest(1.5)
    sineTest(-7.48235150414)
    sineTest(8.35631753098)
    sineTest(8.8079684882)
    sineTest(6.28372592572)
    sineTest(-5.50184471626)
    sineTest(-59.3752893658)
    sineTest(-60.9499520661)
    sineTest(55.5670366678)
    sineTest(62.564611047)
    sineTest(71.2982529342)
    sineTest(470.736829205)
    sineTest(568.652033806)
    sineTest(-278.104044101)
    sineTest(263.172591692)
    sineTest(353.725493546)
  }

  test("exp") {
    def expTest(x: Double) = {
      val reference = Rational.fromString(MPFRFloat.exp(MPFRFloat.fromDouble(x)).toLongString)
      val rX = Rational.fromDouble(x)

      val (l, u) = (Rational.expDown(rX), Rational.expUp(rX))
      val succ = l <= reference && reference <= u
      assert(succ, s"input: '$x', res: ('$l', '$u'), reference: '$reference'")
    }

    expTest(0)

    expTest(-7.48235150414)
    expTest(8.35631753098)
    expTest(8.8079684882)
    expTest(6.28372592572)
    expTest(-5.50184471626)
    expTest(-59.3752893658)
    expTest(-60.9499520661)
    expTest(55.5670366678)
    expTest(62.564611047)
    expTest(71.2982529342)
    expTest(470.736829205)
    expTest(568.652033806)
    expTest(-278.104044101)
    expTest(263.172591692)
    expTest(353.725493546)
  }

  test("log") {
    def logTest(x: Double) = {
      val reference = Rational.fromString(MPFRFloat.log(MPFRFloat.fromDouble(x)).toLongString)
      val rX = Rational.fromDouble(x)

      val (l, u) = (Rational.logDown(rX), Rational.logUp(rX))
      val succ = l <= reference && reference <= u
      assert(succ, s"input: '$x', res: ('$l', '$u'), reference: '$reference'")
    }

    logTest(1)

    logTest(9.50950718982)
    logTest(5.39809550082)
    logTest(8.2232697051)
    logTest(2.54239745619)
    logTest(5.26288564971)
    logTest(755.288056337)
    logTest(2.72440907903)
    logTest(593.267263509)
    logTest(628.092053823)
    logTest(343.158167889)
    logTest(64777462.2997)
    logTest(50981530.9514)
    logTest(52287304.3513)
    logTest(45398836.926)
    logTest(4172244.44305)
  }

  test("sqrt") {
    def sqrtTest(x: Double) = {
      val reference = Rational.fromString(MPFRFloat.sqrt(MPFRFloat.fromDouble(x)).toLongString)
      val rX = Rational.fromDouble(x)

      val (l, u) = (Rational.sqrtDown(rX), Rational.sqrtUp(rX))
      val succ = l <= reference && reference <= u
      assert(succ, s"input: '$x', res: ('$l', '$u'), reference: '$reference'")
    }

    sqrtTest(1)

    sqrtTest(9.50950718982)
    sqrtTest(5.39809550082)
    sqrtTest(8.2232697051)
    sqrtTest(2.54239745619)
    sqrtTest(5.26288564971)
    sqrtTest(755.288056337)
    sqrtTest(2.72440907903)
    sqrtTest(593.267263509)
    sqrtTest(628.092053823)
    sqrtTest(343.158167889)
    sqrtTest(64777462.2997)
    sqrtTest(50981530.9514)
    sqrtTest(52287304.3513)
    sqrtTest(45398836.926)
    sqrtTest(4172244.44305)
  }
}
