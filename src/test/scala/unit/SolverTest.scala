package unit

import java.math.BigInteger

import daisy.lang.Trees._
import daisy.solvers.{DRealSolver, Z3Solver}
import daisy.tools.Rational
import daisy.tools.Rational._

class SolverTest extends UnitSuite {

  val ctx = dummyContext


  test("simple sat") {
    val constr = Equals(x, Plus(y, bigError))

    val solver = new Z3Solver(ctx)
    solver.assertConstraint(constr)
    val res = solver.checkSat
    assert(res == Some(true))
    solver.free()
  }

  test("simple unsat") {
    val constr = And(GreaterThan(x, RealLiteral(one)),
                      LessThan(Times(x, x), RealLiteral(zero)))

    val solver = new Z3Solver(ctx)
    solver.assertConstraint(constr)
    val res = solver.checkSat
    assert(res == Some(false))
    solver.free()
  }

  test("nlsat") {
    // x*x == 2  has to return sat for nlsat to be used

    val constr = Equals(Times(x, x), RealLiteral(two))

    val solver = new Z3Solver(ctx)
    solver.assertConstraint(constr)
    val res = solver.checkSat
    assert(res == Some(true))
    solver.free()

  }

  test("idempotent checks") {
    val solver = new Z3Solver(ctx)

    solver.assertConstraint(Equals(x, ten))

    solver.assertConstraint(Equals(x, five))
    val res = solver.checkSat
    assert(res == Some(false))

    val res2 = solver.checkSat
    assert(res2 == Some(false))

  }

  ignore("reset") {

    val solver = new Z3Solver(ctx)

    solver.assertConstraint(Equals(x, ten))

    solver.assertConstraint(Equals(x, five))
    val res = solver.checkSat
    assert(res == Some(false))

    // Unless we do a reset, the constraints remain asserted
    val res2 = solver.checkSat
    assert(res2 == Some(false))


    /*solver.reset
    solver.assertConstraint(Equals(x, five))
    val res3 = solver.checkSat
    assert(res3 == Some(true))
    */
  }



  test("extract simple model") {
    val constr1 = Equals(x, Plus(y, bigError))

    val solver = new Z3Solver(ctx)
    solver.assertConstraint(constr1)
    val res = solver.checkSat
    assert(res == Some(true))

    val model = solver.getModel
    assert(model.isDefinedAt(x.id))
    assert(model.isDefinedAt(y.id))
    assert(!model.isDefinedAt(z.id))
    // ask for sat
    // ask for model
  }




  ignore("dReal simple sat") {
    val constr = Equals(x, Plus(y, bigError))

    val solver = new DRealSolver(ctx)
    solver.writeLogic()
    solver.assertConstraint(constr)
    val res = solver.checkSat
    assert(res == Some(true))
    solver.free()
  }

  ignore("dReal simple unsat") {
    val constr = And(GreaterThan(x, RealLiteral(one)),
                      LessThan(Times(x, x), RealLiteral(zero)))

    val solver = new DRealSolver(ctx)
    solver.writeLogic()
    solver.assertConstraint(constr)
    val res = solver.checkSat
    assert(res == Some(false))
    solver.free()
  }

  ignore("dReal simple sin") {
    val constr = Equals(Cos(x), Sin(x))

    val solver = new DRealSolver(ctx)
    solver.writeLogic()
    solver.assertConstraint(constr)
    val res = solver.checkSat
    assert(res == Some(true))
    solver.free()
  }

  ignore("dReal large number sanity") {
    // This test checks whether dReal has still the bug that too large numbers
    // cause an unsat result.
    val num = new BigInt(new BigInteger("-5958794406280026737321749580044627371847784122820048012901591655062228043291584529320676278333634395479263695438352461080903866550657496326983330733939397122608118001752501366467078247679639248858985308475645248852528421752796443859977179980652986183631006035696164936589846712144996689667535556521700877530526056136831681938495273018295601429023268910164621445837592456216568037516054009760152112737778625102759932844096230189554513187632834566219070781559871632141159360310105873887881030113588478889194394136769"))
    val den = new BigInt(new BigInteger("2232727415076580820455037352120792611443113190203232546351347940953849902041751947669168711144617720671893465217755961028483893834536496684559005005242543837497203388022222335086445966289054121316350779770703674169606698911437418313809920000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"))
    val constr = (GreaterThan(x, RealLiteral(Rational(num, den))))

    val solver = new DRealSolver(ctx)
    solver.writeLogic()
    solver.assertConstraint(constr)
    val res = solver.checkSat
    assert(res != Some(false))
    solver.free()
  }


}
