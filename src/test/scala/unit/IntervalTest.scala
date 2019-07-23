package unit

import daisy.tools.{Interval, Rational}

class IntervalTest extends UnitSuite {

  test("simple arithmetic") {

    val a = Interval(1, 3)
    val b = Interval(-2, 2)

    val res = (a + b) - (b + a)
    assert(res === Interval(-6, 6))

  }


  test("all arithmetic") {
    val a = Interval(-1, 1)
    val b = Interval(3, 4)
    val c = Interval(-2, 3)

    val res = ((a + b) - (c*c)) / b

    assert(res === Interval(Rational(-7, 3), Rational(11, 3)))

  }


  test("sine") {
    def sineTest(iv: Interval, reference: Interval) = {
      val res = iv.sine
      assert(res.includes(reference), s"input: '$iv', res: '$res', reference: '$reference'")
    }

    // computed by python
    sineTest(Interval(-10, 10), Interval(-1, 1))
    sineTest(Interval(0, 10), Interval(-1, 1))
    sineTest(Interval(-10, 0), Interval(-1, 1))
    sineTest(Interval(-3, 3), Interval(-1, 1))
    sineTest(Interval(-1, 3), Interval(-0.84147098480, 1))
    sineTest(Interval(-3, 1), Interval(-1, 0.84147098480))
    sineTest(Interval(-0.5, 1.5), Interval(-0.47942553860, 0.99749498660))
    sineTest(Interval(-1.5, 0.5), Interval(-0.99749498660, 0.47942553860))
    sineTest(Interval(3, 4), Interval(-0.75680249530, 0.14112000805))
    sineTest(Interval(12, 13), Interval(-0.53657291799, 0.42016703682))
    sineTest(Interval(53, 54), Interval(-0.55878904885, 0.39592515018))
    sineTest(Interval(1336, 1337), Interval(-1, -0.73327231022))
  }

  test("cosine") {
    def cosineTest(iv: Interval, reference: Interval) = {
      val res = iv.cosine
      assert(res.includes(reference), s"input: '$iv', res: '$res', reference: '$reference'")
    }

    // computed by python
    cosineTest(Interval(-10, 10), Interval(-1, 1))
    cosineTest(Interval(0, 10), Interval(-1, 1))
    cosineTest(Interval(-10, 0), Interval(-1, 1))
    cosineTest(Interval(-3, 3), Interval(-0.989992496600, 1))

    cosineTest(Interval(0.5, 1.5), Interval(0.07073720167,  0.87758256189))
  }

  test("tangent") {
    def tangentTest(iv: Interval, reference: Interval) = {
      val res = iv.tangent
      assert(res.includes(reference), s"input: '$iv', res: '$res', reference: '$reference'")
    }

    // computed by python
    tangentTest(Interval(-1, 1), Interval(-1.55740772465, 1.55740772465))
    tangentTest(Interval(0, 1), Interval(0, 1.55740772465))
    tangentTest(Interval(1, 1.5703), Interval(1.55740772466, 2014.80139329))
    tangentTest(Interval(3.1, 4.1), Interval(-0.04161665458, 1.42352648319))
  }

  ignore("exp") {
    def expTest(iv: Interval, reference: Interval) = {
      val res = iv.exp
      assert(res.includes(reference), s"input: '$iv', res: '$res', reference: '$reference'")
    }

    // computed by python // computing with python is not very helpful here, it's rounded too much
    expTest(Interval(-7.48235150414, 6.28372592572), Interval(0.000562932120755, 535.781230511))
    expTest(Interval(-278.104044101, -5.50184471626), Interval(1.66321445895e-121, 0.00407923945406))
  }

  ignore("log") {
    def logTest(iv: Interval, reference: Interval) = {
      val res = iv.log
      assert(res.includes(reference), s"input: '$iv', res: '$res', reference: '$reference'")
    }

    // computed by python
    logTest(Interval(5.26288564971, 755.288056337), Interval(1.66067947893, 6.62709920806))
    logTest(Interval(50981530.9514, 52287304.3513), Interval(17.7469739869, 17.7722641529))
  }
}
