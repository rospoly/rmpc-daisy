package unit

import daisy.lang.Trees.{IntPow, Plus, RealLiteral, Times}
import daisy.transform.PowTransformerPhase

class TimesToPowTransformerPhaseTest extends UnitSuite {
  private val rollFunction = PowTransformerPhase.timesToPow
  private val unrollFunction = PowTransformerPhase.powToTimes

  test("x * x converts to square") {
    val x = RealLiteral(2.0)
    val testExpression = Times(x, x)

    assert(rollFunction(testExpression) == IntPow(x, 2))
  }

  test("x * (x * x) converts to cube") {
    val x = RealLiteral(2.0)
    val testExpression = Times(x, Times(x, x))

    assert(rollFunction(testExpression) == IntPow(x, 3))
  }

  test("(x * x) * x converts to cube") {
    val x = RealLiteral(2.0)
    val testExpression = Times(Times(x, x), x)

    assert(rollFunction(testExpression) == IntPow(x, 3))
  }

  test("x * x * x * x * x * x converts to x ^ 6") {
    val x = RealLiteral(2.0)
    val testExpression = Times(Times(x, Times(x, Times(x, Times(x, x)))), x)

    assert(rollFunction(testExpression) == IntPow(x, 6))
  }

  test("x * (x ^ 5) converts to x ^ 6") {
    val x = RealLiteral(2.0)
    val testExpression = Times(x, IntPow(x, 5))

    assert(rollFunction(testExpression) == IntPow(x, 6))
  }

  test("(x ^ 5) * x converges to x ^ 6") {
    val x = RealLiteral(2.0)
    val testExpression = Times(IntPow(x, 5), x)

    assert(rollFunction(testExpression) == IntPow(x, 6))
  }

  test("(x * y) * x remains the same") {
    val x = RealLiteral(2.0)
    val y = RealLiteral(3.0)
    val testExpression = Times(Times(x, y), x)

    assert(rollFunction(testExpression) == Times(Times(x, y), x))
  }

  test("(x + y) * (x + y) converts into (x + y)^2") {
    val x = RealLiteral(2.0)
    val y = RealLiteral(3.0)
    val testExpression = Times(Plus(x, y), Plus(x, y))
    val expectedResult = IntPow(Plus(x, y), 2)

    assert(rollFunction(testExpression) == expectedResult)
  }

  test("context doesn't matter") {
    val x = RealLiteral(2.0)
    val y = RealLiteral(3.0)
    val z = RealLiteral(3.0)
    val testExpression = Plus(Times(x, x), Times(Plus(y, z), x))

    assert(rollFunction(testExpression) == Plus(IntPow(x, 2), Times(Plus(y, z), x)))
  }

  test("x^2 unrolls into x * x") {
    val x = RealLiteral(2.0)
    val testExpression = IntPow(x, 2)
    val expectedResult = Times(x, x)

    assert(unrollFunction(testExpression) == expectedResult)
  }

  test("x^5 unrolls into x * x * x * x * x") {
    val x = RealLiteral(2.0)
    val testExpression = IntPow(x, 5)
    val expectedResult = Times(x, Times(x, Times(x, Times(x, x))))

    assert(unrollFunction(testExpression) == expectedResult)
  }

  test("x * x^2 unrolls into x * x * x") {
    val x = RealLiteral(2.0)
    val testExpression = Times(x, IntPow(x, 2))
    val expectedResult = Times(x, Times(x, x))

    assert(unrollFunction(testExpression) == expectedResult)
  }

  test("(x + y)^2 unrolls into (x + y) * (x + y)") {
    val x = RealLiteral(2.0)
    val y = RealLiteral(3.0)
    val testExpression = IntPow(Plus(x, y), 2)
    val expectedResult = Times(Plus(x, y), Plus(x, y))

    assert(unrollFunction(testExpression) == expectedResult)
  }

}