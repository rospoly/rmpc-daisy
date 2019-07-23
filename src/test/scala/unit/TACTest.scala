package unit

import daisy.lang.Trees._
import daisy.transform.TACTransformerPhase

class TACTest extends UnitSuite {

  val ssaPhase = TACTransformerPhase

  // Note: does not test for equality of the trees!
  test("plus expr") {
    val e = Plus(Plus(Plus(x, y), Plus(z, w)), five)
    val ssa = ssaPhase.toSSA(e)

    assert(testSSALet(ssa))
  }

  test("simple expr") {
    val e = Division(Minus(Plus(a, b), c), Plus(Times(five, x), y))
    val ssa = ssaPhase.toSSA(e)

    assert(testSSALet(ssa))
  }

  test("expr uminus") {
    val e = Plus(UMinus(Minus(Plus(a, b), c)), y)
    val ssa = ssaPhase.toSSA(e)

    assert(testSSALet(ssa))
  }

  test("let expr") {
    val e = Let(x.id, Minus(Plus(a, b), c), Plus(Times(five, x), y))

    val ssa = ssaPhase.toSSA(e)

    assert(testSSALet(ssa))
  }

  // invariant to check: foreach isSimpleExpr(Let.value)


  def testSSALet(e: Expr): Boolean = e match {
    case e if ssaPhase.isSimpleExpr(e) => true
    case Let(i, v, b) =>
      ssaPhase.isSimpleExpr(v) && testSSALet(b)
  }
}