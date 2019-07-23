package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Sine {

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 4.e-07)*/
  /*Abs error: -, Range: -*/
    def sine_32(x : Float) : Float = {
    val _const0: Float = 6.0f
    val _const1: Float = 120.0f
    val _const2: Float = 5040.0f
    val _tmp: Float = (x * x)
    val _tmp1: Float = (x * _tmp)
    val _tmp14: Float = (_tmp1 / _const0)
    val _tmp2: Float = (x * x)
    val _tmp3: Float = (_tmp2 * x)
    val _tmp4: Float = (_tmp3 * x)
    val _tmp5: Float = (x * _tmp4)
    val _tmp12: Float = (_tmp5 / _const1)
    val _tmp6: Float = (x * x)
    val _tmp7: Float = (x * _tmp6)
    val _tmp9: Float = (_tmp7 * x)
    val _tmp8: Float = (x * x)
    val _tmp10: Float = (_tmp8 * x)
    val _tmp11: Float = (_tmp9 * _tmp10)
    val _tmp13: Float = (_tmp11 / _const2)
    val _tmp15: Float = (_tmp12 - _tmp13)
    val _tmp16: Float = (_tmp14 - _tmp15)
    (x - _tmp16)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 2.e-07)*/
  /*Abs error: -, Range: -*/
    def sine_32_05(x : Float) : Double = {
    val _const0: Float = 6.0f
    val _const1: Float = 120.0f
    val _const2: Float = 5040.0f
    val _tmp17: Float = (x * x)
    val _tmp18: Double = (x.toDouble * _tmp17.toDouble)
    val _tmp31: Double = (_tmp18 / _const0.toDouble)
    val _tmp19: Double = (x.toDouble * x.toDouble)
    val _tmp20: Double = (_tmp19 * x.toDouble)
    val _tmp21: Double = (_tmp20 * x.toDouble)
    val _tmp22: Double = (x.toDouble * _tmp21)
    val _tmp29: Double = (_tmp22 / _const1.toDouble)
    val _tmp23: Double = (x.toDouble * x.toDouble)
    val _tmp24: Double = (x.toDouble * _tmp23)
    val _tmp26: Double = (_tmp24 * x.toDouble)
    val _tmp25: Double = (x.toDouble * x.toDouble)
    val _tmp27: Double = (_tmp25 * x.toDouble)
    val _tmp28: Double = (_tmp26 * _tmp27)
    val _tmp30: Double = (_tmp28 / _const2.toDouble)
    val _tmp32: Double = (_tmp29 - _tmp30)
    val _tmp33: Double = (_tmp31 - _tmp32)
    (x - _tmp33)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 4.e-08)*/
  /*Abs error: -, Range: -*/
    def sine_32_01(x : Double) : Double = {
    val _const0: Float = 6.0f
    val _const1: Double = 120.0
    val _const2: Double = 5040.0
    val _tmp34: Double = (x * x)
    val _tmp35: Double = (x * _tmp34)
    val _tmp48: Double = (_tmp35 / _const0.toDouble)
    val _tmp36: Double = (x * x)
    val _tmp37: Double = (_tmp36 * x)
    val _tmp38: Double = (_tmp37 * x)
    val _tmp39: Double = (x * _tmp38)
    val _tmp46: Double = (_tmp39 / _const1)
    val _tmp40: Double = (x * x)
    val _tmp41: Double = (x * _tmp40)
    val _tmp43: Double = (_tmp41 * x)
    val _tmp42: Double = (x * x)
    val _tmp44: Double = (_tmp42 * x)
    val _tmp45: Double = (_tmp43 * _tmp44)
    val _tmp47: Double = (_tmp45 / _const2)
    val _tmp49: Double = (_tmp46 - _tmp47)
    val _tmp50: Double = (_tmp48 - _tmp49)
    (x - _tmp50)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 4.e-09)*/
  /*Abs error: -, Range: -*/
    def sine_32_001(x : Double) : Double = {
    val _const0: Double = 6.0
    val _const1: Double = 120.0
    val _const2: Double = 5040.0
    val _tmp51: Double = (x * x)
    val _tmp52: Double = (x * _tmp51)
    val _tmp65: Double = (_tmp52 / _const0)
    val _tmp53: Double = (x * x)
    val _tmp54: Double = (_tmp53 * x)
    val _tmp55: Double = (_tmp54 * x)
    val _tmp56: Double = (x * _tmp55)
    val _tmp63: Double = (_tmp56 / _const1)
    val _tmp57: Double = (x * x)
    val _tmp58: Double = (x * _tmp57)
    val _tmp60: Double = (_tmp58 * x)
    val _tmp59: Double = (x * x)
    val _tmp61: Double = (_tmp59 * x)
    val _tmp62: Double = (_tmp60 * _tmp61)
    val _tmp64: Double = (_tmp62 / _const2)
    val _tmp66: Double = (_tmp63 - _tmp64)
    val _tmp67: Double = (_tmp65 - _tmp66)
    (x - _tmp67)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 7.e-16)*/
  /*Abs error: -, Range: -*/
    def sine_64(x : Double) : Double = {
    val _const0: Double = 6.0
    val _const1: Double = 120.0
    val _const2: Double = 5040.0
    val _tmp68: Double = (x * x)
    val _tmp69: Double = (x * _tmp68)
    val _tmp82: Double = (_tmp69 / _const0)
    val _tmp70: Double = (x * x)
    val _tmp71: Double = (_tmp70 * x)
    val _tmp72: Double = (_tmp71 * x)
    val _tmp73: Double = (x * _tmp72)
    val _tmp80: Double = (_tmp73 / _const1)
    val _tmp74: Double = (x * x)
    val _tmp75: Double = (x * _tmp74)
    val _tmp77: Double = (_tmp75 * x)
    val _tmp76: Double = (x * x)
    val _tmp78: Double = (_tmp76 * x)
    val _tmp79: Double = (_tmp77 * _tmp78)
    val _tmp81: Double = (_tmp79 / _const2)
    val _tmp83: Double = (_tmp80 - _tmp81)
    val _tmp84: Double = (_tmp82 - _tmp83)
    (x - _tmp84)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 3.5e-16)*/
  /*Abs error: -, Range: -*/
    def sine_64_05(x : Double) : DblDouble = {
    val _const0: Double = 6.0
    val _const1: Double = 120.0
    val _const2: Float = 5040.0f
    val _tmp85: Double = (x * x)
    val _tmp86: DblDouble = (DblDouble(x) * DblDouble(_tmp85))
    val _tmp99: DblDouble = (_tmp86 / DblDouble(_const0))
    val _tmp87: DblDouble = (DblDouble(x) * DblDouble(x))
    val _tmp88: DblDouble = (_tmp87 * DblDouble(x))
    val _tmp89: DblDouble = (_tmp88 * DblDouble(x))
    val _tmp90: DblDouble = (DblDouble(x) * _tmp89)
    val _tmp97: DblDouble = (_tmp90 / DblDouble(_const1))
    val _tmp91: DblDouble = (DblDouble(x) * DblDouble(x))
    val _tmp92: DblDouble = (DblDouble(x) * _tmp91)
    val _tmp94: DblDouble = (_tmp92 * DblDouble(x))
    val _tmp93: DblDouble = (DblDouble(x) * DblDouble(x))
    val _tmp95: DblDouble = (_tmp93 * DblDouble(x))
    val _tmp96: DblDouble = (_tmp94 * _tmp95)
    val _tmp98: DblDouble = (_tmp96 / DblDouble(_const2))
    val _tmp100: DblDouble = (_tmp97 - _tmp98)
    val _tmp101: DblDouble = (_tmp99 - _tmp100)
    (x - _tmp101)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 7.e-17)*/
  /*Abs error: -, Range: -*/
    def sine_64_01(x : DblDouble) : DblDouble = {
    val _const0: Float = 6.0f
    val _const1: DblDouble = 120.0
    val _const2: DblDouble = 5040.0
    val _tmp102: DblDouble = (x * x)
    val _tmp103: DblDouble = (x * _tmp102)
    val _tmp116: DblDouble = (_tmp103 / DblDouble(_const0))
    val _tmp104: DblDouble = (x * x)
    val _tmp105: DblDouble = (_tmp104 * x)
    val _tmp106: DblDouble = (_tmp105 * x)
    val _tmp107: DblDouble = (x * _tmp106)
    val _tmp114: DblDouble = (_tmp107 / _const1)
    val _tmp108: DblDouble = (x * x)
    val _tmp109: DblDouble = (x * _tmp108)
    val _tmp111: DblDouble = (_tmp109 * x)
    val _tmp110: DblDouble = (x * x)
    val _tmp112: DblDouble = (_tmp110 * x)
    val _tmp113: DblDouble = (_tmp111 * _tmp112)
    val _tmp115: DblDouble = (_tmp113 / _const2)
    val _tmp117: DblDouble = (_tmp114 - _tmp115)
    val _tmp118: DblDouble = (_tmp116 - _tmp117)
    (x - _tmp118)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 7.e-18)*/
  /*Abs error: -, Range: -*/
    def sine_64_001(x : DblDouble) : DblDouble = {
    val _const0: DblDouble = 6.0
    val _const1: DblDouble = 120.0
    val _const2: DblDouble = 5040.0
    val _tmp119: DblDouble = (x * x)
    val _tmp120: DblDouble = (x * _tmp119)
    val _tmp133: DblDouble = (_tmp120 / _const0)
    val _tmp121: DblDouble = (x * x)
    val _tmp122: DblDouble = (_tmp121 * x)
    val _tmp123: DblDouble = (_tmp122 * x)
    val _tmp124: DblDouble = (x * _tmp123)
    val _tmp131: DblDouble = (_tmp124 / _const1)
    val _tmp125: DblDouble = (x * x)
    val _tmp126: DblDouble = (x * _tmp125)
    val _tmp128: DblDouble = (_tmp126 * x)
    val _tmp127: DblDouble = (x * x)
    val _tmp129: DblDouble = (_tmp127 * x)
    val _tmp130: DblDouble = (_tmp128 * _tmp129)
    val _tmp132: DblDouble = (_tmp130 / _const2)
    val _tmp134: DblDouble = (_tmp131 - _tmp132)
    val _tmp135: DblDouble = (_tmp133 - _tmp134)
    (x - _tmp135)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 2.5e-31)*/
  /*Abs error: -, Range: -*/
    def sine_dbldbl(x : DblDouble) : DblDouble = {
    val _const0: DblDouble = 6.0
    val _const1: DblDouble = 120.0
    val _const2: DblDouble = 5040.0
    val _tmp136: DblDouble = (x * x)
    val _tmp137: DblDouble = (x * _tmp136)
    val _tmp150: DblDouble = (_tmp137 / _const0)
    val _tmp138: DblDouble = (x * x)
    val _tmp139: DblDouble = (_tmp138 * x)
    val _tmp140: DblDouble = (_tmp139 * x)
    val _tmp141: DblDouble = (x * _tmp140)
    val _tmp148: DblDouble = (_tmp141 / _const1)
    val _tmp142: DblDouble = (x * x)
    val _tmp143: DblDouble = (x * _tmp142)
    val _tmp145: DblDouble = (_tmp143 * x)
    val _tmp144: DblDouble = (x * x)
    val _tmp146: DblDouble = (_tmp144 * x)
    val _tmp147: DblDouble = (_tmp145 * _tmp146)
    val _tmp149: DblDouble = (_tmp147 / _const2)
    val _tmp151: DblDouble = (_tmp148 - _tmp149)
    val _tmp152: DblDouble = (_tmp150 - _tmp151)
    (x - _tmp152)
  }

}
