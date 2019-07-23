package unit

import daisy.lang.Trees._
import daisy.lang.Trees.RealLiteral.{one, two}
import daisy.opt.RewritingOps
import org.scalactic.Equality

class RewritingTest extends UnitSuite with RewritingOps {

  var rand: util.Random = null

  implicit val debugSection: daisy.DebugSection = null

  implicit val realEquality = new Equality[Expr] {
    override def areEqual(self: Expr, b: Any): Boolean = b match {
      case other: Expr => self =~= other
      case _ => false
    }
  }

  test("cancel nominators"){
    val nom = (one Plus y) Times (one Plus z)
    val root_denom = (one Plus x) Times (one Plus y) Times (one Plus z)

    val result = moreSimplify(nom Division (root_denom Times root_denom))
    val expected = one Division ((one Plus x) Times (one Plus x) Times (one Plus y) Times (one Plus z))
    assert(result === expected)
  }

  test("real equality") {
    assert((x Times two) === (two Times x))
    assert((x Plus one Plus x) === (one Plus x Plus x))
//    assert((two Times x Times one) === (one Times x Times two))
    assert((x Times two) !== (x Plus two))
    assert((x Division two) === (x Division two))
    assert((x Division two) !== (x Division one))
  }

  test("set of real expressions") {
    assert(Set[RealExpr](RealExpr(two Times x), RealExpr(x Times two)).size === 1)
//    assert(Set[RealExpr](RealExpr(one Times two Times x), RealExpr(one Times x Times two)).size === 1)
  }
}