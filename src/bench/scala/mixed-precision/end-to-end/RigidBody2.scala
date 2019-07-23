package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object RigidBody2 {

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.02)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_32(x1 : Float, x2 : Float, x3 : Float) : Float = {
    val _const0: Float = 3f
    val _const1: Float = 3f
    val _const2: Float = 2f
    val _tmp: Float = (x3 * x3)
    val _tmp1: Float = (_const0 * _tmp)
    val _tmp3: Float = (_tmp1 - x2)
    val _tmp2: Float = (x3 * x3)
    val _tmp4: Float = (_const1 * _tmp2)
    val _tmp7: Float = (_tmp3 + _tmp4)
    val _tmp5: Float = (x1 * _const2)
    val _tmp6: Float = (_tmp5 * x2)
    val _tmp8: Float = (_tmp6 * x3)
    val _tmp11: Float = (_tmp7 + _tmp8)
    val _tmp9: Float = (x2 * x1)
    val _tmp10: Float = (x2 * x3)
    val _tmp12: Float = (_tmp9 * _tmp10)
    (_tmp11 - _tmp12)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.01)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_32_05(x1 : Float, x2 : Float, x3 : Float) : Double = {
    val _const0: Float = 3f
    val _const1: Float = 3f
    val _const2: Float = 2f
    val _tmp13: Float = (x3 * x3)
    val _tmp14: Float = (_const0 * _tmp13)
    val _tmp16: Float = (_tmp14 - x2)
    val _tmp15: Float = (x3 * x3)
    val _tmp17: Float = (_const1 * _tmp15)
    val _tmp20: Float = (_tmp16 + _tmp17)
    val _tmp18: Float = (x1 * _const2)
    val _tmp19: Float = (_tmp18 * x2)
    val _tmp21: Double = (_tmp19.toDouble * x3.toDouble)
    val _tmp24: Double = (_tmp20.toDouble + _tmp21)
    val _tmp22: Double = (x2.toDouble * x1.toDouble)
    val _tmp23: Double = (x2.toDouble * x3.toDouble)
    val _tmp25: Double = (_tmp22 * _tmp23)
    (_tmp24 - _tmp25)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.002)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_32_01(x1 : Double, x2 : Double, x3 : Float) : Double = {
    val _const0: Float = 3f
    val _const1: Double = 3
    val _const2: Double = 2
    val _tmp26: Double = (x3.toDouble * x3.toDouble)
    val _tmp27: Double = (_const0.toDouble * _tmp26)
    val _tmp29: Double = (_tmp27 - x2)
    val _tmp28: Double = (x3.toDouble * x3.toDouble)
    val _tmp30: Double = (_const1 * _tmp28)
    val _tmp33: Double = (_tmp29 + _tmp30)
    val _tmp31: Double = (x1 * _const2)
    val _tmp32: Double = (_tmp31 * x2)
    val _tmp34: Double = (_tmp32 * x3.toDouble)
    val _tmp37: Double = (_tmp33 + _tmp34)
    val _tmp35: Double = (x2 * x1)
    val _tmp36: Double = (x2 * x3.toDouble)
    val _tmp38: Double = (_tmp35 * _tmp36)
    (_tmp37 - _tmp38)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.0002)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_32_001(x1 : Double, x2 : Double, x3 : Double) : Double = {
    val _const0: Double = 3
    val _const1: Double = 3
    val _const2: Double = 2
    val _tmp39: Double = (x3 * x3)
    val _tmp40: Double = (_const0 * _tmp39)
    val _tmp42: Double = (_tmp40 - x2)
    val _tmp41: Double = (x3 * x3)
    val _tmp43: Double = (_const1 * _tmp41)
    val _tmp46: Double = (_tmp42 + _tmp43)
    val _tmp44: Double = (x1 * _const2)
    val _tmp45: Double = (_tmp44 * x2)
    val _tmp47: Double = (_tmp45 * x3)
    val _tmp50: Double = (_tmp46 + _tmp47)
    val _tmp48: Double = (x2 * x1)
    val _tmp49: Double = (x2 * x3)
    val _tmp51: Double = (_tmp48 * _tmp49)
    (_tmp50 - _tmp51)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 4.e-11)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_64(x1 : Double, x2 : Double, x3 : Double) : Double = {
    val _const0: Double = 3
    val _const1: Double = 3
    val _const2: Double = 2
    val _tmp52: Double = (x3 * x3)
    val _tmp53: Double = (_const0 * _tmp52)
    val _tmp55: Double = (_tmp53 - x2)
    val _tmp54: Double = (x3 * x3)
    val _tmp56: Double = (_const1 * _tmp54)
    val _tmp59: Double = (_tmp55 + _tmp56)
    val _tmp57: Double = (x1 * _const2)
    val _tmp58: Double = (_tmp57 * x2)
    val _tmp60: Double = (_tmp58 * x3)
    val _tmp63: Double = (_tmp59 + _tmp60)
    val _tmp61: Double = (x2 * x1)
    val _tmp62: Double = (x2 * x3)
    val _tmp64: Double = (_tmp61 * _tmp62)
    (_tmp63 - _tmp64)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 2.e-11)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_64_05(x1 : Double, x2 : Double, x3 : Double) : DblDouble = {
    val _const0: Double = 3
    val _const1: Double = 3
    val _const2: Double = 2
    val _tmp65: Double = (x3 * x3)
    val _tmp66: Double = (_const0 * _tmp65)
    val _tmp68: Double = (_tmp66 - x2)
    val _tmp67: Double = (x3 * x3)
    val _tmp69: Double = (_const1 * _tmp67)
    val _tmp72: Double = (_tmp68 + _tmp69)
    val _tmp70: Double = (x1 * _const2)
    val _tmp71: Double = (_tmp70 * x2)
    val _tmp73: DblDouble = (DblDouble(_tmp71) * DblDouble(x3))
    val _tmp76: DblDouble = (DblDouble(_tmp72) + _tmp73)
    val _tmp74: DblDouble = (DblDouble(x2) * DblDouble(x1))
    val _tmp75: DblDouble = (DblDouble(x2) * DblDouble(x3))
    val _tmp77: DblDouble = (_tmp74 * _tmp75)
    (_tmp76 - _tmp77)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 4.e-12)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_64_01(x1 : DblDouble, x2 : DblDouble, x3 : Double) : DblDouble = {
    val _const0: Float = 3f
    val _const1: DblDouble = 3
    val _const2: DblDouble = 2
    val _tmp78: DblDouble = (DblDouble(x3) * DblDouble(x3))
    val _tmp79: DblDouble = (DblDouble(_const0) * _tmp78)
    val _tmp81: DblDouble = (_tmp79 - x2)
    val _tmp80: DblDouble = (DblDouble(x3) * DblDouble(x3))
    val _tmp82: DblDouble = (_const1 * _tmp80)
    val _tmp85: DblDouble = (_tmp81 + _tmp82)
    val _tmp83: DblDouble = (x1 * _const2)
    val _tmp84: DblDouble = (_tmp83 * x2)
    val _tmp86: DblDouble = (_tmp84 * DblDouble(x3))
    val _tmp89: DblDouble = (_tmp85 + _tmp86)
    val _tmp87: DblDouble = (x2 * x1)
    val _tmp88: DblDouble = (x2 * DblDouble(x3))
    val _tmp90: DblDouble = (_tmp87 * _tmp88)
    (_tmp89 - _tmp90)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 4.e-13)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_64_001(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 3
    val _const1: DblDouble = 3
    val _const2: DblDouble = 2
    val _tmp91: DblDouble = (x3 * x3)
    val _tmp92: DblDouble = (_const0 * _tmp91)
    val _tmp94: DblDouble = (_tmp92 - x2)
    val _tmp93: DblDouble = (x3 * x3)
    val _tmp95: DblDouble = (_const1 * _tmp93)
    val _tmp98: DblDouble = (_tmp94 + _tmp95)
    val _tmp96: DblDouble = (x1 * _const2)
    val _tmp97: DblDouble = (_tmp96 * x2)
    val _tmp99: DblDouble = (_tmp97 * x3)
    val _tmp102: DblDouble = (_tmp98 + _tmp99)
    val _tmp100: DblDouble = (x2 * x1)
    val _tmp101: DblDouble = (x2 * x3)
    val _tmp103: DblDouble = (_tmp100 * _tmp101)
    (_tmp102 - _tmp103)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 1.5e-26)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_dbldbl(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 3
    val _const1: DblDouble = 3
    val _const2: DblDouble = 2
    val _tmp104: DblDouble = (x3 * x3)
    val _tmp105: DblDouble = (_const0 * _tmp104)
    val _tmp107: DblDouble = (_tmp105 - x2)
    val _tmp106: DblDouble = (x3 * x3)
    val _tmp108: DblDouble = (_const1 * _tmp106)
    val _tmp111: DblDouble = (_tmp107 + _tmp108)
    val _tmp109: DblDouble = (x1 * _const2)
    val _tmp110: DblDouble = (_tmp109 * x2)
    val _tmp112: DblDouble = (_tmp110 * x3)
    val _tmp115: DblDouble = (_tmp111 + _tmp112)
    val _tmp113: DblDouble = (x2 * x1)
    val _tmp114: DblDouble = (x2 * x3)
    val _tmp116: DblDouble = (_tmp113 * _tmp114)
    (_tmp115 - _tmp116)
  }

}
