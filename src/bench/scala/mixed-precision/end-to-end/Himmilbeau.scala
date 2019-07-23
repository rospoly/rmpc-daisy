package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Himmilbeau {

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 0.00055)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_32(x1 : Float, x2 : Float) : Float = {
    val _const0: Float = 11f
    val _const1: Float = 11f
    val _const2: Float = 7f
    val _const3: Float = 7f
    val _tmp: Float = (x1 * x1)
    val _tmp1: Float = (_tmp + x2)
    val _tmp4: Float = (_tmp1 - _const0)
    val _tmp2: Float = (x1 * x1)
    val _tmp3: Float = (_tmp2 + x2)
    val _tmp5: Float = (_tmp3 - _const1)
    val _tmp12: Float = (_tmp4 * _tmp5)
    val _tmp6: Float = (x2 * x2)
    val _tmp7: Float = (x1 - _const2)
    val _tmp10: Float = (_tmp6 + _tmp7)
    val _tmp8: Float = (x2 * x2)
    val _tmp9: Float = (x1 - _const3)
    val _tmp11: Float = (_tmp8 + _tmp9)
    val _tmp13: Float = (_tmp10 * _tmp11)
    (_tmp12 + _tmp13)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 0.000275)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_32_05(x1 : Float, x2 : Float) : Double = {
    val _const0: Float = 11f
    val _const1: Float = 11f
    val _const2: Float = 7f
    val _const3: Double = 7
    val _tmp14: Double = (x1.toDouble * x1.toDouble)
    val _tmp15: Double = (_tmp14 + x2.toDouble)
    val _tmp18: Double = (_tmp15 - _const0.toDouble)
    val _tmp16: Double = (x1.toDouble * x1.toDouble)
    val _tmp17: Double = (_tmp16 + x2.toDouble)
    val _tmp19: Double = (_tmp17 - _const1.toDouble)
    val _tmp26: Double = (_tmp18 * _tmp19)
    val _tmp20: Double = (x2.toDouble * x2.toDouble)
    val _tmp21: Double = (x1.toDouble - _const2.toDouble)
    val _tmp24: Double = (_tmp20 + _tmp21)
    val _tmp22: Double = (x2.toDouble * x2.toDouble)
    val _tmp23: Double = (x1.toDouble - _const3)
    val _tmp25: Double = (_tmp22 + _tmp23)
    val _tmp27: Double = (_tmp24 * _tmp25)
    (_tmp26 + _tmp27)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 5.5e-05)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_32_01(x1 : Double, x2 : Double) : Double = {
    val _const0: Float = 11f
    val _const1: Float = 11f
    val _const2: Float = 7f
    val _const3: Double = 7
    val _tmp28: Double = (x1 * x1)
    val _tmp29: Double = (_tmp28 + x2)
    val _tmp32: Double = (_tmp29 - _const0.toDouble)
    val _tmp30: Double = (x1 * x1)
    val _tmp31: Double = (_tmp30 + x2)
    val _tmp33: Double = (_tmp31 - _const1.toDouble)
    val _tmp40: Double = (_tmp32 * _tmp33)
    val _tmp34: Double = (x2 * x2)
    val _tmp35: Double = (x1 - _const2.toDouble)
    val _tmp38: Double = (_tmp34 + _tmp35)
    val _tmp36: Double = (x2 * x2)
    val _tmp37: Double = (x1 - _const3)
    val _tmp39: Double = (_tmp36 + _tmp37)
    val _tmp41: Double = (_tmp38 * _tmp39)
    (_tmp40 + _tmp41)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 5.5e-06)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_32_001(x1 : Double, x2 : Double) : Double = {
    val _const0: Double = 11
    val _const1: Double = 11
    val _const2: Double = 7
    val _const3: Double = 7
    val _tmp42: Double = (x1 * x1)
    val _tmp43: Double = (_tmp42 + x2)
    val _tmp46: Double = (_tmp43 - _const0)
    val _tmp44: Double = (x1 * x1)
    val _tmp45: Double = (_tmp44 + x2)
    val _tmp47: Double = (_tmp45 - _const1)
    val _tmp54: Double = (_tmp46 * _tmp47)
    val _tmp48: Double = (x2 * x2)
    val _tmp49: Double = (x1 - _const2)
    val _tmp52: Double = (_tmp48 + _tmp49)
    val _tmp50: Double = (x2 * x2)
    val _tmp51: Double = (x1 - _const3)
    val _tmp53: Double = (_tmp50 + _tmp51)
    val _tmp55: Double = (_tmp52 * _tmp53)
    (_tmp54 + _tmp55)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 1.5e-12)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_64(x1 : Double, x2 : Double) : Double = {
    val _const0: Double = 11
    val _const1: Double = 11
    val _const2: Double = 7
    val _const3: Double = 7
    val _tmp56: Double = (x1 * x1)
    val _tmp57: Double = (_tmp56 + x2)
    val _tmp60: Double = (_tmp57 - _const0)
    val _tmp58: Double = (x1 * x1)
    val _tmp59: Double = (_tmp58 + x2)
    val _tmp61: Double = (_tmp59 - _const1)
    val _tmp68: Double = (_tmp60 * _tmp61)
    val _tmp62: Double = (x2 * x2)
    val _tmp63: Double = (x1 - _const2)
    val _tmp66: Double = (_tmp62 + _tmp63)
    val _tmp64: Double = (x2 * x2)
    val _tmp65: Double = (x1 - _const3)
    val _tmp67: Double = (_tmp64 + _tmp65)
    val _tmp69: Double = (_tmp66 * _tmp67)
    (_tmp68 + _tmp69)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 7.5e-13)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_64_05(x1 : Double, x2 : Double) : DblDouble = {
    val _const0: Double = 11
    val _const1: Double = 11
    val _const2: Double = 7
    val _const3: Float = 7f
    val _tmp70: Double = (x1 * x1)
    val _tmp71: Double = (_tmp70 + x2)
    val _tmp74: Double = (_tmp71 - _const0)
    val _tmp72: Double = (x1 * x1)
    val _tmp73: Double = (_tmp72 + x2)
    val _tmp75: Double = (_tmp73 - _const1)
    val _tmp82: Double = (_tmp74 * _tmp75)
    val _tmp76: Double = (x2 * x2)
    val _tmp77: Double = (x1 - _const2)
    val _tmp80: DblDouble = (DblDouble(_tmp76) + DblDouble(_tmp77))
    val _tmp78: DblDouble = (DblDouble(x2) * DblDouble(x2))
    val _tmp79: DblDouble = (DblDouble(x1) - DblDouble(_const3))
    val _tmp81: DblDouble = (_tmp78 + _tmp79)
    val _tmp83: DblDouble = (_tmp80 * _tmp81)
    (_tmp82 + _tmp83)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 1.5e-13)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_64_01(x1 : DblDouble, x2 : DblDouble) : DblDouble = {
    val _const0: Float = 11f
    val _const1: Float = 11f
    val _const2: Float = 7f
    val _const3: DblDouble = 7
    val _tmp84: DblDouble = (x1 * x1)
    val _tmp85: DblDouble = (_tmp84 + x2)
    val _tmp88: DblDouble = (_tmp85 - DblDouble(_const0))
    val _tmp86: DblDouble = (x1 * x1)
    val _tmp87: DblDouble = (_tmp86 + x2)
    val _tmp89: DblDouble = (_tmp87 - DblDouble(_const1))
    val _tmp96: DblDouble = (_tmp88 * _tmp89)
    val _tmp90: DblDouble = (x2 * x2)
    val _tmp91: DblDouble = (x1 - DblDouble(_const2))
    val _tmp94: DblDouble = (_tmp90 + _tmp91)
    val _tmp92: DblDouble = (x2 * x2)
    val _tmp93: DblDouble = (x1 - _const3)
    val _tmp95: DblDouble = (_tmp92 + _tmp93)
    val _tmp97: DblDouble = (_tmp94 * _tmp95)
    (_tmp96 + _tmp97)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 1.5e-14)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_64_001(x1 : DblDouble, x2 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 11
    val _const1: DblDouble = 11
    val _const2: DblDouble = 7
    val _const3: DblDouble = 7
    val _tmp98: DblDouble = (x1 * x1)
    val _tmp99: DblDouble = (_tmp98 + x2)
    val _tmp102: DblDouble = (_tmp99 - _const0)
    val _tmp100: DblDouble = (x1 * x1)
    val _tmp101: DblDouble = (_tmp100 + x2)
    val _tmp103: DblDouble = (_tmp101 - _const1)
    val _tmp110: DblDouble = (_tmp102 * _tmp103)
    val _tmp104: DblDouble = (x2 * x2)
    val _tmp105: DblDouble = (x1 - _const2)
    val _tmp108: DblDouble = (_tmp104 + _tmp105)
    val _tmp106: DblDouble = (x2 * x2)
    val _tmp107: DblDouble = (x1 - _const3)
    val _tmp109: DblDouble = (_tmp106 + _tmp107)
    val _tmp111: DblDouble = (_tmp108 * _tmp109)
    (_tmp110 + _tmp111)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 3.5e-28)*/
  /*Abs error: -, Range: -*/
    def himmilbeau_dbldbl(x1 : DblDouble, x2 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 11
    val _const1: DblDouble = 11
    val _const2: DblDouble = 7
    val _const3: DblDouble = 7
    val _tmp112: DblDouble = (x1 * x1)
    val _tmp113: DblDouble = (_tmp112 + x2)
    val _tmp116: DblDouble = (_tmp113 - _const0)
    val _tmp114: DblDouble = (x1 * x1)
    val _tmp115: DblDouble = (_tmp114 + x2)
    val _tmp117: DblDouble = (_tmp115 - _const1)
    val _tmp124: DblDouble = (_tmp116 * _tmp117)
    val _tmp118: DblDouble = (x2 * x2)
    val _tmp119: DblDouble = (x1 - _const2)
    val _tmp122: DblDouble = (_tmp118 + _tmp119)
    val _tmp120: DblDouble = (x2 * x2)
    val _tmp121: DblDouble = (x1 - _const3)
    val _tmp123: DblDouble = (_tmp120 + _tmp121)
    val _tmp125: DblDouble = (_tmp122 * _tmp123)
    (_tmp124 + _tmp125)
  }

}
