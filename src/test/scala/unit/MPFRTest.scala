package unit

import daisy.tools.{MPFRFloat, Rational}

class MPFRTest extends UnitSuite {

  test("compare with Rational") {

    val x = 3.368
    val y = 9.672
    val z = 0.00248

    val xF = 3.368f
    val yF = 9.672f
    val zF = 0.00248f

    val xR = Rational.fromReal(x)
    val yR = Rational.fromReal(y)
    val zR = Rational.fromReal(z)

    val xM = MPFRFloat.fromString(x.toString)
    val yM = MPFRFloat.fromString(y.toString)
    val zM = MPFRFloat.fromString(z.toString)

    val floatRes = ((xF / yF) * zF) / (xF + yF)
    val doubleRes = ((x / y) * z) / (x + y)
    val rationalRes = ((xR / yR) * zR) / (xR + yR)
    val arbitraryRes = ((xM / yM) * zM) / (xM + yM)

    assert(floatRes != doubleRes)
    assert(doubleRes != rationalRes)
    assert(rationalRes != arbitraryRes)
  }


}