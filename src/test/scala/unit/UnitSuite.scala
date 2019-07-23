package unit

import daisy.Main
import daisy.Context
import daisy.lang.Identifiers._
import daisy.lang.Trees._
import daisy.lang.Types.RealType
import daisy.tools.Rational
import org.scalatest.FunSuite

abstract class UnitSuite extends FunSuite {
  // put here anything that can be re-used between tests
  val x = Variable(FreshIdentifier("x", RealType))
  val y = Variable(FreshIdentifier("y", RealType))
  val z = Variable(FreshIdentifier("z", RealType))
  val w = Variable(FreshIdentifier("w", RealType))

  val a = Variable(FreshIdentifier("a", RealType))
  val b = Variable(FreshIdentifier("b", RealType))
  val c = Variable(FreshIdentifier("c", RealType))

  val newDelta = FreshIdentifier("delta", RealType, alwaysShowUniqueID = true).toDeltaVariable

  val minFive = RealLiteral(Rational(-5))
  val five = RealLiteral(Rational(5))
  val minTen = RealLiteral(Rational(-10))
  val ten = RealLiteral(Rational(10))

  val bigError = RealLiteral(Rational(5, 10000))
  val smallError = RealLiteral(Rational(10, 1000000))

  // file is never used, just has to exist
   val dummyContext : Context = Main.processOptions(List("build.sbt")).get
}