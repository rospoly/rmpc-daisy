package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Kepler0 {

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 5.e-05)*/
  /*Abs error: -, Range: -*/
    def kepler0_32(x1 : Float, x2 : Float, x3 : Float, x4 : Float, x5 : Float, x6 : Float) : Float = {
    val _tmp: Float = (x6 - x2)
    val _tmp2: Float = (_tmp * x3)
    val _tmp1: Float = (x2 - x6)
    val _tmp3: Float = (x5 * _tmp1)
    val _tmp12: Float = (_tmp2 + _tmp3)
    val _tmp4: Float = (x6 + x5)
    val _tmp10: Float = (x1 * _tmp4)
    val _tmp5: Float = -(x1)
    val _tmp6: Float = (_tmp5 + x2)
    val _tmp8: Float = (_tmp6 * x1)
    val _tmp7: Float = (x3 - x4)
    val _tmp9: Float = (_tmp7 * x1)
    val _tmp11: Float = (_tmp8 + _tmp9)
    val _tmp13: Float = (_tmp10 + _tmp11)
    (_tmp12 + _tmp13)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 2.5e-05)*/
  /*Abs error: -, Range: -*/
    def kepler0_32_05(x1 : Float, x2 : Float, x3 : Float, x4 : Float, x5 : Float, x6 : Float) : Double = {
    val _tmp14: Float = (x6 - x2)
    val _tmp16: Float = (_tmp14 * x3)
    val _tmp15: Float = (x2 - x6)
    val _tmp17: Float = (x5 * _tmp15)
    val _tmp26: Float = (_tmp16 + _tmp17)
    val _tmp18: Float = (x6 + x5)
    val _tmp24: Float = (x1 * _tmp18)
    val _tmp19: Float = -(x1)
    val _tmp20: Float = (_tmp19 + x2)
    val _tmp22: Double = (_tmp20.toDouble * x1.toDouble)
    val _tmp21: Double = (x3.toDouble - x4.toDouble)
    val _tmp23: Double = (_tmp21 * x1.toDouble)
    val _tmp25: Double = (_tmp22 + _tmp23)
    val _tmp27: Double = (_tmp24.toDouble + _tmp25)
    (_tmp26 + _tmp27)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 5.e-06)*/
  /*Abs error: -, Range: -*/
    def kepler0_32_01(x1 : Double, x2 : Double, x3 : Double, x4 : Float, x5 : Float, x6 : Double) : Double = {
    val _tmp28: Double = (x6 - x2)
    val _tmp30: Double = (_tmp28 * x3)
    val _tmp29: Double = (x2 - x6)
    val _tmp31: Double = (x5.toDouble * _tmp29)
    val _tmp40: Double = (_tmp30 + _tmp31)
    val _tmp32: Double = (x6 + x5.toDouble)
    val _tmp38: Double = (x1 * _tmp32)
    val _tmp33: Double = -(x1)
    val _tmp34: Double = (_tmp33 + x2)
    val _tmp36: Double = (_tmp34 * x1)
    val _tmp35: Double = (x3 - x4.toDouble)
    val _tmp37: Double = (_tmp35 * x1)
    val _tmp39: Double = (_tmp36 + _tmp37)
    val _tmp41: Double = (_tmp38 + _tmp39)
    (_tmp40 + _tmp41)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 5.e-07)*/
  /*Abs error: -, Range: -*/
    def kepler0_32_001(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : Double = {
    val _tmp42: Double = (x6 - x2)
    val _tmp44: Double = (_tmp42 * x3)
    val _tmp43: Double = (x2 - x6)
    val _tmp45: Double = (x5 * _tmp43)
    val _tmp54: Double = (_tmp44 + _tmp45)
    val _tmp46: Double = (x6 + x5)
    val _tmp52: Double = (x1 * _tmp46)
    val _tmp47: Double = -(x1)
    val _tmp48: Double = (_tmp47 + x2)
    val _tmp50: Double = (_tmp48 * x1)
    val _tmp49: Double = (x3 - x4)
    val _tmp51: Double = (_tmp49 * x1)
    val _tmp53: Double = (_tmp50 + _tmp51)
    val _tmp55: Double = (_tmp52 + _tmp53)
    (_tmp54 + _tmp55)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 9.5e-14)*/
  /*Abs error: -, Range: -*/
    def kepler0_64(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : Double = {
    val _tmp56: Double = (x6 - x2)
    val _tmp58: Double = (_tmp56 * x3)
    val _tmp57: Double = (x2 - x6)
    val _tmp59: Double = (x5 * _tmp57)
    val _tmp68: Double = (_tmp58 + _tmp59)
    val _tmp60: Double = (x6 + x5)
    val _tmp66: Double = (x1 * _tmp60)
    val _tmp61: Double = -(x1)
    val _tmp62: Double = (_tmp61 + x2)
    val _tmp64: Double = (_tmp62 * x1)
    val _tmp63: Double = (x3 - x4)
    val _tmp65: Double = (_tmp63 * x1)
    val _tmp67: Double = (_tmp64 + _tmp65)
    val _tmp69: Double = (_tmp66 + _tmp67)
    (_tmp68 + _tmp69)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 4.75e-14)*/
  /*Abs error: -, Range: -*/
    def kepler0_64_05(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : DblDouble = {
    val _tmp70: Double = (x6 - x2)
    val _tmp72: Double = (_tmp70 * x3)
    val _tmp71: Double = (x2 - x6)
    val _tmp73: Double = (x5 * _tmp71)
    val _tmp82: Double = (_tmp72 + _tmp73)
    val _tmp74: Double = (x6 + x5)
    val _tmp80: Double = (x1 * _tmp74)
    val _tmp75: Double = -(x1)
    val _tmp76: Double = (_tmp75 + x2)
    val _tmp78: DblDouble = (DblDouble(_tmp76) * DblDouble(x1))
    val _tmp77: DblDouble = (DblDouble(x3) - DblDouble(x4))
    val _tmp79: DblDouble = (_tmp77 * DblDouble(x1))
    val _tmp81: DblDouble = (_tmp78 + _tmp79)
    val _tmp83: DblDouble = (DblDouble(_tmp80) + _tmp81)
    (_tmp82 + _tmp83)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 9.5e-15)*/
  /*Abs error: -, Range: -*/
    def kepler0_64_01(x1 : Double, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    val _tmp84: DblDouble = (x6 - x2)
    val _tmp86: DblDouble = (_tmp84 * x3)
    val _tmp85: DblDouble = (x2 - x6)
    val _tmp87: DblDouble = (x5 * _tmp85)
    val _tmp96: DblDouble = (_tmp86 + _tmp87)
    val _tmp88: DblDouble = (x6 + x5)
    val _tmp94: DblDouble = (DblDouble(x1) * _tmp88)
    val _tmp89: DblDouble = -(x1)
    val _tmp90: DblDouble = (_tmp89 + x2)
    val _tmp92: DblDouble = (_tmp90 * DblDouble(x1))
    val _tmp91: DblDouble = (x3 - x4)
    val _tmp93: DblDouble = (_tmp91 * DblDouble(x1))
    val _tmp95: DblDouble = (_tmp92 + _tmp93)
    val _tmp97: DblDouble = (_tmp94 + _tmp95)
    (_tmp96 + _tmp97)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 9.5e-16)*/
  /*Abs error: -, Range: -*/
    def kepler0_64_001(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    val _tmp98: DblDouble = (x6 - x2)
    val _tmp100: DblDouble = (_tmp98 * x3)
    val _tmp99: DblDouble = (x2 - x6)
    val _tmp101: DblDouble = (x5 * _tmp99)
    val _tmp110: DblDouble = (_tmp100 + _tmp101)
    val _tmp102: DblDouble = (x6 + x5)
    val _tmp108: DblDouble = (x1 * _tmp102)
    val _tmp103: DblDouble = -(x1)
    val _tmp104: DblDouble = (_tmp103 + x2)
    val _tmp106: DblDouble = (_tmp104 * x1)
    val _tmp105: DblDouble = (x3 - x4)
    val _tmp107: DblDouble = (_tmp105 * x1)
    val _tmp109: DblDouble = (_tmp106 + _tmp107)
    val _tmp111: DblDouble = (_tmp108 + _tmp109)
    (_tmp110 + _tmp111)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 3.e-29)*/
  /*Abs error: -, Range: -*/
    def kepler0_dbldbl(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    val _tmp112: DblDouble = (x6 - x2)
    val _tmp114: DblDouble = (_tmp112 * x3)
    val _tmp113: DblDouble = (x2 - x6)
    val _tmp115: DblDouble = (x5 * _tmp113)
    val _tmp124: DblDouble = (_tmp114 + _tmp115)
    val _tmp116: DblDouble = (x6 + x5)
    val _tmp122: DblDouble = (x1 * _tmp116)
    val _tmp117: DblDouble = -(x1)
    val _tmp118: DblDouble = (_tmp117 + x2)
    val _tmp120: DblDouble = (_tmp118 * x1)
    val _tmp119: DblDouble = (x3 - x4)
    val _tmp121: DblDouble = (_tmp119 * x1)
    val _tmp123: DblDouble = (_tmp120 + _tmp121)
    val _tmp125: DblDouble = (_tmp122 + _tmp123)
    (_tmp124 + _tmp125)
  }

}
