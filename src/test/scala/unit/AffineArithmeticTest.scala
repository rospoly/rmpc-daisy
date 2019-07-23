package unit

import daisy.tools.Rational._
import daisy.tools.{AffineForm, Interval, Rational}

class AffineArithmeticTest extends UnitSuite {

  test("foo") {

  }

  test("conversions") {
    val a = Interval(-1, 1)
    val b = Interval(3, 3)
    val c = Interval(2, 3)

    val aform1 = AffineForm(a)
    assert(aform1.toInterval === a)
    assert(aform1.noise.size === 1)

    val aform2 = AffineForm(b)
    assert(aform2.toInterval === b)
    assert(aform2.noise.size === 0)

    val aform3 = AffineForm(c)
    assert(aform3.toInterval === c)
    assert(aform3.noise.size === 1)

    val aform4 = AffineForm(Rational(5))
    assert(aform4.toInterval === Interval(5, 5))
    assert(aform4.noise.size === 0)
  }

  test("simple arithmetic") {

    val a = AffineForm(Interval(1, 3))
    val b = AffineForm(Interval(-2, 2))

    val e0 = a + b
    val e1 = (a + b) - (b + a)

    assert(e0.toInterval === Interval(-1, 5))

    assert(e1.toInterval === Interval(zero, zero))

  }

  test("multiplication") {
    val a = AffineForm(Interval(1, 3))
    val b = AffineForm(Interval(-2, 2))
    val c = AffineForm(Interval(5, 9))

    val e0 = a * a
    assert(e0.toInterval === Interval(0, 9))
    assert(e0.noise.size === 2)

    val e1 = a * b
    assert(e1.toInterval === Interval(-6, 6))
    assert(e1.noise.size === 2)

    val e2 = a * c
    assert(e2.toInterval === Interval(1, 27))
    assert(e2.noise.size === 3)

    val e3 = (a * c) * a
    assert(e3.toInterval === Interval(-18, 81))
    assert(e3.noise.size === 4)

  }

  test("sine") {
    def sineTest(af: AffineForm, reference: Interval) = {
      val res = af.sine
      assert(res.toInterval.includes(reference), s"input: '$af', res: '$res', reference: '$reference'")
    }

    // computed by python
    sineTest(AffineForm(Interval(-10, 10)), Interval(-1, 1))
    sineTest(AffineForm(Interval(0, 10)), Interval(-1, 1))
    sineTest(AffineForm(Interval(-10, 0)), Interval(-1, 1))
    sineTest(AffineForm(Interval(-3, 3)), Interval(-1, 1))
    sineTest(AffineForm(Interval(-1, 3)), Interval(-0.84147098480, 1))
    sineTest(AffineForm(Interval(-3, 1)), Interval(-1, 0.84147098480))
    sineTest(AffineForm(Interval(-0.5, 1.5)), Interval(-0.47942553860, 0.99749498660))
    sineTest(AffineForm(Interval(-1.5, 0.5)), Interval(-0.99749498660, 0.47942553860))
    sineTest(AffineForm(Interval(3, 4)), Interval(-0.75680249530, 0.14112000805))
    sineTest(AffineForm(Interval(12, 13)), Interval(-0.53657291799, 0.42016703682))
    sineTest(AffineForm(Interval(53, 54)), Interval(-0.55878904885, 0.39592515018))
    sineTest(AffineForm(Interval(1336, 1337)), Interval(-1, -0.73327231022))
  }

  test("cosine") {
    def cosineTest(af: AffineForm, reference: Interval) = {
      val res = af.cosine
      assert(res.toInterval.includes(reference), s"input: '$af', res: '$res', reference: '$reference'")
    }

    // computed by python
    cosineTest(AffineForm(Interval(-10, 10)), Interval(-1, 1))
    cosineTest(AffineForm(Interval(0, 10)), Interval(-1, 1))
    cosineTest(AffineForm(Interval(-10, 0)), Interval(-1, 1))
    cosineTest(AffineForm(Interval(-3, 3)), Interval(-0.989992496600, 1))

    cosineTest(AffineForm(Interval(0.5, 1.5)), Interval(0.07073720167,  0.87758256189))
  }

  test("tangent") {
    def tangentTest(af: AffineForm, reference: Interval) = {
      val res = af.tangent
      assert(res.toInterval.includes(reference), s"input: '$af', res: '$res', reference: '$reference'")
    }

    // computed by python
    tangentTest(AffineForm(Interval(-1, 1)), Interval(-1.55740772465, 1.55740772465))
    tangentTest(AffineForm(Interval(0, 1)), Interval(0, 1.55740772465))
    tangentTest(AffineForm(Interval(1, 1.5703)), Interval(1.55740772466, 2014.80139329))
    tangentTest(AffineForm(Interval(3.1, 4.1)), Interval(-0.04161665458, 1.42352648319))
  }

  ignore("exp") {
    def expTest(af: AffineForm, reference: Interval) = {
      val res = af.exp
      assert(res.toInterval.includes(reference), s"input: '$af', res: '$res', reference: '$reference'")
    }

    // computed by python // computing with python is not very helpful here, it's rounded too much
    expTest(AffineForm(Interval(-7.48235150414, 6.28372592572)), Interval(0.000562932120755, 535.781230511))
    expTest(AffineForm(Interval(-278.104044101, -5.50184471626)), Interval(1.66321445895e-121, 0.00407923945406))
  }

  ignore("log") {
    def logTest(af: AffineForm, reference: Interval) = {
      val res = af.log.toInterval
      assert(res.includes(reference), s"input: '$af', res: '$res', reference: '$reference'")
    }

    // computed by python
    logTest(AffineForm(Interval(5.26288564971, 755.288056337)), Interval(1.66067947893, 6.62709920806))
    logTest(AffineForm(Interval(50981530.9514, 52287304.3513)), Interval(17.7469739869, 17.7722641529))
  }

}