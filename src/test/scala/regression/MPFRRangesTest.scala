package regression

import daisy._
import org.scalatest.FunSuite

import daisy.tools.{MPFRInterval, Interval, Rational, AffineForm, MPFRAffineForm}
import daisy.lang.Trees._
import daisy.lang.Identifiers._
import daisy.tools.MPFRFloat

/**
  Regression test for the basic absolute error and range computations.
*/
class MPFRRangesTest extends FunSuite with daisy.tools.RangeEvaluators  {
  val fileName = "src/test/resources/RegressionFunctions.scala"

  //val __ctx : Context =
  //Main.ctx = _ctx
  val (_ctx, _prg) = frontend.ExtractionPhase.run(Main.processOptions(List(fileName, "--silent")).get, null)


  val (ctx, prg) = analysis.SpecsProcessingPhase.run(_ctx, _prg)


  for (fnc <- prg.defs if (fnc.id.toString != "euclideanDistance")) {

    val body = fnc.body.get

    println("\n" + fnc.id)

    val inputRanges = ctx.specInputRanges(fnc.id)

    val inputsAA = inputRanges.map({ case (id, i) => (id -> AffineForm(i)) })
    // eval body in Intervals
    val intervalResult = evalAA(body, inputsAA).toInterval


    // eval body in AffineIntervals
    val inputsMPFR = inputRanges.map({
      case (id, Interval(lo, hi)) => (id -> MPFRAffineForm(MPFRInterval(MPFRFloat.fromString(lo.toStringDown),
        MPFRFloat.fromString(hi.toStringUp))))
      })
    val mpfrResult = evalAAMPFR(body, inputsMPFR).toInterval

    // val mpfrResultRational = Interval(Rational.fromString(mpfrResult.xlo.toString),
    //   Rational.fromString(mpfrResult.xhi.toString))

    println(s"intervalResult: $intervalResult")
    println(s"mpfr result:    $mpfrResult")

    println(mpfrResult.includes(intervalResult))

  }


  def evalMPFRInterval(expr: Expr, _valMap: Map[Identifier, MPFRInterval]): MPFRInterval = {
    var valMap = _valMap

    def eval(e: Expr): MPFRInterval = (e: @unchecked) match {

      case Variable(id) => valMap(id)
      case RealLiteral(r) => MPFRInterval(r)
      case Plus(x, y) => eval(x) + eval(y)
      case Minus(x, y) => eval(x) - eval(y)
      case Times(x, y) => eval(x) * eval(y)
      case Division(x, y) => eval(x) / eval(y)
      //case IntPow(x, y) => MPFRFloat.pow(eval(x), MPFRFloat.fromDouble(y))
      case UMinus(x) => - eval(x)
      case Sqrt(x) => eval(x).squareRoot
      case Sin(x) => eval(x).sine
      case Cos(x) => eval(x).cosine
      case Tan(x) => eval(x).tangent
      case Exp(x) => eval(x).exp
      case Log(x) => eval(x).log
      case Let(id, v, b) =>
        valMap += (id -> eval(v))
        eval(b)

    }
    eval(expr)
  }

  def evalInterval(expr: Expr, _valMap: Map[Identifier, Interval]): Interval = {
    var valMap = _valMap

    def eval(e: Expr): Interval = (e: @unchecked) match {

      case Variable(id) => valMap(id)
      case RealLiteral(r) => Interval(r)
      case Plus(x, y) => eval(x) + eval(y)
      case Minus(x, y) => eval(x) - eval(y)
      case Times(x, y) => eval(x) * eval(y)
      case Division(x, y) => eval(x) / eval(y)
      //case IntPow(x, y) => MPFRFloat.pow(eval(x), MPFRFloat.fromDouble(y))
      case UMinus(x) => - eval(x)
      case Sqrt(x) => eval(x).squareRoot
      case Sin(x) => eval(x).sine
      case Cos(x) => eval(x).cosine
      case Tan(x) => eval(x).tangent
      case Exp(x) => eval(x).exp
      case Log(x) => eval(x).log
      case Let(id, v, b) =>
        valMap += (id -> eval(v))
        eval(b)

    }
    eval(expr)
  }

  def evalAA(expr: Expr, _valMap: Map[Identifier, AffineForm]): AffineForm = {
    var valMap = _valMap

    def eval(e: Expr): AffineForm = (e: @unchecked) match {

      case Variable(id) => valMap(id)
      case RealLiteral(r) => AffineForm(r)
      case Plus(x, y) => eval(x) + eval(y)
      case Minus(x, y) => eval(x) - eval(y)
      case Times(x, y) => eval(x) * eval(y)
      case Division(x, y) => eval(x) / eval(y)
      //case IntPow(x, y) => MPFRFloat.pow(eval(x), MPFRFloat.fromDouble(y))
      case UMinus(x) => - eval(x)
      case Sqrt(x) => eval(x).squareRoot
      case Sin(x) => eval(x).sine
      case Cos(x) => eval(x).cosine
      case Tan(x) => eval(x).tangent
      case Exp(x) => eval(x).exp
      case Log(x) => eval(x).log
      case Let(id, v, b) =>
        valMap += (id -> eval(v))
        eval(b)

    }
    eval(expr)
  }

  def evalAAMPFR(expr: Expr, _valMap: Map[Identifier, MPFRAffineForm]): MPFRAffineForm = {
    var valMap = _valMap

    def eval(e: Expr): MPFRAffineForm = (e: @unchecked) match {

      case Variable(id) => valMap(id)
      case RealLiteral(r) => MPFRAffineForm(r)
      case Plus(x, y) => eval(x) + eval(y)
      case Minus(x, y) => eval(x) - eval(y)
      case Times(x, y) => eval(x) * eval(y)
      case Division(x, y) => eval(x) / eval(y)
      //case IntPow(x, y) => MPFRFloat.pow(eval(x), MPFRFloat.fromDouble(y))
      case UMinus(x) => - eval(x)
      case Sqrt(x) => eval(x).squareRoot
      case Sin(x) => eval(x).sine
      case Cos(x) => eval(x).cosine
      case Tan(x) => eval(x).tangent
      case Exp(x) => eval(x).exp
      case Log(x) => eval(x).log
      case Let(id, v, b) =>
        valMap += (id -> eval(v))
        eval(b)

    }
    eval(expr)
  }
}