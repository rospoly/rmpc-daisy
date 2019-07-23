package unit

import daisy.tools.FinitePrecision.Float16
import daisy.tools.Rational
import org.scalatest.FunSuite


class FinitePrecisionTest extends FunSuite {

  val tests = Seq(
    (Rational(65504), "1.1111111111₂ * 2^15", true),
    (Rational(65503), "1.111111111000001₂ * 2^15", false),
    (Rational(65505), "1.111111111100001₂ * 2^15", false),
    (Rational(65472), "1.1111111110₂ * 2^15", true),
    (Rational(65536), "1.0000000000₂ * 2^16", false),
    (Rational.powerTwo(-14), "1.0000000000₂ * 2^-14", true),
    (Rational(2046), "1.1111111110₂ * 2^10", true),
    (Rational(2047), "1.1111111111₂ * 2^10", true),
    (Rational(2048), "1.0000000000₂ * 2^11", true),
    (Rational(2049), "1.00000000001₂ * 2^11", false),
    (Rational(4094), "1.1111111111₂ * 2^11", true),
    (Rational(4095), "1.11111111111₂ * 2^11", false),
    (Rational(4096), "1.0000000000₂ * 2^12", true)
  )

  for ((num, binary, representable) <- tests) {
    test(s"$num = $binary ${if (representable) "" else "not "}representable in Float16") {
      assert(Float16.canRepresent(num) == representable)
    }
  }
}
