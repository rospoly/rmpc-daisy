// Copyright 2017 MPI-SWS, Saarbruecken, Germany

package daisy
package analysis

import lang.Trees._
import tools.Rational.max
import lang.Identifiers.Identifier
import tools._
import tools.FinitePrecision._

import scala.collection.immutable.Map
import scala.collection.parallel.ParSeq

/**
 * Compute relative errors through absolute, i.e. not through first computing
 * absolute errors.
 *
 * Uses the (1 + delta) abstraction for floating-point computations.
 *
 *
 * Prerequisites:
 * - SpecsProcessingPhase
 */
object DataflowSubdivisionPhase extends DaisyPhase with Subdivision with RoundoffEvaluators {
  override val name = "Forward Dataflow with Subdivision"
  override val shortName = "subdiv"
  override val description = "Forward dataflow with subdivision"
  override val definedOptions: Set[CmdLineOption[Any]] = Set(
    NumOption(
      "divLimit",
      3,
      "Max amount of interval divisions"),
    NumOption(
      "totalOpt",
      32,
      "Max total amount of analysis runs")
//    StringChoiceOption(
//      "subdiv",
//      Set("simple", "model"),
//      "simple",
//      "Method to subdivide intervals"),
  )

  implicit val debugSection = DebugSectionAnalysis

  override def runPhase(ctx: Context, prg: Program): (Context, Program) = {
    val errorMethod = ctx.option[String]("errorMethod")
    require(errorMethod == "affine", s"$name only supports error method 'affine'")

    val divLimit = ctx.option[Long]("divLimit").toInt
    val totalOpt = ctx.option[Long]("totalOpt").toInt
    //  val subdiv: String = ctx.option("subdiv")

    // for each function, returns (abs error, rel error, result interval)
    val res = analyzeConsideredFunctions(ctx, prg){ fnc =>

      ctx.reporter.info("analyzing fnc: " + fnc.id)
      val inputValMap: Map[Identifier, Interval] = ctx.specInputRanges(fnc.id)

      val bodyReal = fnc.body.get

      //  Subdivide input ranges
      var subIntervals: ParSeq[Map[Identifier, Interval]] =
        getEqualSubintervals(inputValMap, divLimit, totalOpt).par

      val precisionMap: Map[Identifier, Precision] = ctx.specInputPrecisions(fnc.id)
      val uniformPrecision = ctx.option[Precision]("precision")

      // TODO: remove this mutable state
      DataflowPhase.rangeMethod = ctx.option[String]("rangeMethod")
      DataflowPhase.errorMethod = ctx.option[String]("errorMethod")

      var intermRanges: Seq[Map[(Expr, PathCond), Interval]] = Seq()
      var intermErrors: Seq[Map[(Expr, PathCond), Rational]] = Seq()

      //filtering is done offline
      println("Original map lenght: "+subIntervals.length)
      var parSubInt=SMTRange.cleanSubIntervals(subIntervals,fnc.precondition.get)
      println("Filtered map lenght: "+parSubInt.length)

      //val errors = subIntervals.par.map(subInt => {
      val errors = parSubInt.par.map(subInt => {

          val inputErrorMap: Map[Identifier, Rational] = ctx.specInputErrors(fnc.id)

          val (absError, realRange, _intermErrors, _intermRanges) = DataflowPhase.computeRoundoff(
            subInt, inputErrorMap, precisionMap, bodyReal, uniformPrecision, fnc.precondition.get)

          val relError: Option[Rational] = if (realRange.includes(Rational.zero)) {
            None
          } else {
            Some(absError / Interval.minAbs(realRange))
          }

          //Note: corrected for threads safe parallelization
          //intermRanges = intermRanges :+ _intermRanges
          //intermErrors = intermErrors :+ _intermErrors
          //(absError, relError, realRange)
          /////////////////////////////
          (absError, relError, realRange,_intermRanges,_intermErrors)
      })

      // Ugly
      val absErrors = errors.map(x => x._1)
      val relErrors = errors.map(x => x._2)
      val ranges = errors.map(x => x._3)
      val _intermRanges = errors.map(x => x._4)
      val _intermErrors = errors.map(x => x._5)

      //val (absErrors, relErrors, ranges) = errors.toSeq.unzip3

      val totalAbsError = absErrors.tail.fold(absErrors.head)({
        case (x, y) => max(x, y)
        })

      val totalRelError = relErrors.tail.fold(relErrors.head)({
        case (None, _) | (_, None) => None
        case (Some(x), Some(y)) => Some(max(x, y))
        })

      val totalRange = ranges.tail.fold(ranges.head)({
        case (x, y) => x.union(y)
        })

      val totalIntermRanges = _intermRanges.tail.fold(_intermRanges.head)({
        case (acc, m) =>
          acc.keys.map(key => (key -> acc(key).union(m(key)))).toMap
      })


      val totalIntermErrors = _intermErrors.tail.fold(_intermErrors.head)({
        case (acc, m) =>
          acc.keys.map(key => (key -> max(acc(key), m(key)))).toMap
      })

      (totalAbsError, totalRelError, totalRange, totalIntermRanges, totalIntermErrors)

      // val relError = errors.max(optionAbsOrdering).getOrElse("NaN")

      // if (failIntervals.nonEmpty)
      //   ctx.reporter.info("For several sub-intervals it was not possible to compute relative error")
      // for(x <- failIntervals){
      //   val (m, er) = x
      //   ctx.reporter.info(s"absErr: $er on $m")
      // }
      // ctx.reporter.info(s"relError: $relError, time: " +
      //   (System.currentTimeMillis - startTime))
    }

    (ctx.copy(
      resultAbsoluteErrors = res.mapValues(_._1),
      resultRelativeErrors = res.mapValues(_._2),
      resultRealRanges = res.mapValues(_._3),
      intermediateRanges = res.mapValues(_._4),
      intermediateAbsErrors = res.mapValues(_._5)),
    prg)
  }

  def evalError(expr: Expr, inputValMap: Map[Identifier, Interval],
    inputErrorMap: Map[Identifier, Rational], precondition: Expr, rangeMethod: String, errorMethod: String,
    precision: Precision): (Rational, Interval) = {

    (rangeMethod, errorMethod) match {
      case ("interval", "affine") =>
        uniformRoundoff_IA_AA(expr, inputValMap, inputErrorMap, precision,
          trackRoundoffErrors = true)

      case ("affine", "affine") =>
        uniformRoundoff_AA_AA(expr, inputValMap, inputErrorMap, precision,
          trackRoundoffErrors = true)

      case ("smt", "affine") =>
        uniformRoundoff_SMT_AA(expr, inputValMap, inputErrorMap, precondition, precision,
          trackRoundoffErrors = true)
    }
  }

}

