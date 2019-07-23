package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Sqrt {

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 0.0002)*/
  /*Abs error: -, Range: -*/
    def sqroot_32(x : Float) : Float = {
    val _const0: Float = 0.5f
    val _const1: Float = 1.0f
    val _const2: Float = 0.125f
    val _const3: Float = 0.0625f
    val _const4: Float = 0.0390625f
    val _tmp: Float = (_const0 * x)
    val _tmp2: Float = (_tmp + _const1)
    val _tmp1: Float = (x * x)
    val _tmp3: Float = (_tmp1 * _const2)
    val _tmp6: Float = (_tmp2 - _tmp3)
    val _tmp4: Float = (x * x)
    val _tmp5: Float = (_tmp4 * x)
    val _tmp7: Float = (_tmp5 * _const3)
    val _tmp11: Float = (_tmp6 + _tmp7)
    val _tmp8: Float = (x * x)
    val _tmp9: Float = (_tmp8 * _const4)
    val _tmp10: Float = (x * x)
    val _tmp12: Float = (_tmp9 * _tmp10)
    (_tmp11 - _tmp12)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 0.0001)*/
  /*Abs error: -, Range: -*/
    def sqroot_32_05(x : Float) : Double = {
    val _const0: Float = 0.5f
    val _const1: Float = 1.0f
    val _const2: Float = 0.125f
    val _const3: Float = 0.0625f
    val _const4: Float = 0.0390625f
    val _tmp13: Float = (_const0 * x)
    val _tmp15: Float = (_tmp13 + _const1)
    val _tmp14: Float = (x * x)
    val _tmp16: Float = (_tmp14 * _const2)
    val _tmp19: Float = (_tmp15 - _tmp16)
    val _tmp17: Float = (x * x)
    val _tmp18: Float = (_tmp17 * x)
    val _tmp20: Float = (_tmp18 * _const3)
    val _tmp24: Double = (_tmp19.toDouble + _tmp20.toDouble)
    val _tmp21: Double = (x.toDouble * x.toDouble)
    val _tmp22: Double = (_tmp21 * _const4.toDouble)
    val _tmp23: Double = (x.toDouble * x.toDouble)
    val _tmp25: Double = (_tmp22 * _tmp23)
    (_tmp24 - _tmp25)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 2.e-05)*/
  /*Abs error: -, Range: -*/
    def sqroot_32_01(x : Double) : Double = {
    val _const0: Double = 0.5
    val _const1: Float = 1.0f
    val _const2: Float = 0.125f
    val _const3: Double = 0.0625
    val _const4: Double = 0.0390625
    val _tmp26: Double = (_const0 * x)
    val _tmp28: Double = (_tmp26 + _const1.toDouble)
    val _tmp27: Double = (x * x)
    val _tmp29: Double = (_tmp27 * _const2.toDouble)
    val _tmp32: Double = (_tmp28 - _tmp29)
    val _tmp30: Double = (x * x)
    val _tmp31: Double = (_tmp30 * x)
    val _tmp33: Double = (_tmp31 * _const3)
    val _tmp37: Double = (_tmp32 + _tmp33)
    val _tmp34: Double = (x * x)
    val _tmp35: Double = (_tmp34 * _const4)
    val _tmp36: Double = (x * x)
    val _tmp38: Double = (_tmp35 * _tmp36)
    (_tmp37 - _tmp38)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 2.e-06)*/
  /*Abs error: -, Range: -*/
    def sqroot_32_001(x : Double) : Double = {
    val _const0: Double = 0.5
    val _const1: Double = 1.0
    val _const2: Double = 0.125
    val _const3: Double = 0.0625
    val _const4: Double = 0.0390625
    val _tmp39: Double = (_const0 * x)
    val _tmp41: Double = (_tmp39 + _const1)
    val _tmp40: Double = (x * x)
    val _tmp42: Double = (_tmp40 * _const2)
    val _tmp45: Double = (_tmp41 - _tmp42)
    val _tmp43: Double = (x * x)
    val _tmp44: Double = (_tmp43 * x)
    val _tmp46: Double = (_tmp44 * _const3)
    val _tmp50: Double = (_tmp45 + _tmp46)
    val _tmp47: Double = (x * x)
    val _tmp48: Double = (_tmp47 * _const4)
    val _tmp49: Double = (x * x)
    val _tmp51: Double = (_tmp48 * _tmp49)
    (_tmp50 - _tmp51)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 3.5e-13)*/
  /*Abs error: -, Range: -*/
    def sqroot_64(x : Double) : Double = {
    val _const0: Double = 0.5
    val _const1: Double = 1.0
    val _const2: Double = 0.125
    val _const3: Double = 0.0625
    val _const4: Double = 0.0390625
    val _tmp52: Double = (_const0 * x)
    val _tmp54: Double = (_tmp52 + _const1)
    val _tmp53: Double = (x * x)
    val _tmp55: Double = (_tmp53 * _const2)
    val _tmp58: Double = (_tmp54 - _tmp55)
    val _tmp56: Double = (x * x)
    val _tmp57: Double = (_tmp56 * x)
    val _tmp59: Double = (_tmp57 * _const3)
    val _tmp63: Double = (_tmp58 + _tmp59)
    val _tmp60: Double = (x * x)
    val _tmp61: Double = (_tmp60 * _const4)
    val _tmp62: Double = (x * x)
    val _tmp64: Double = (_tmp61 * _tmp62)
    (_tmp63 - _tmp64)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 1.75e-13)*/
  /*Abs error: -, Range: -*/
    def sqroot_64_05(x : Double) : DblDouble = {
    val _const0: Double = 0.5
    val _const1: Double = 1.0
    val _const2: Double = 0.125
    val _const3: Double = 0.0625
    val _const4: Float = 0.0390625f
    val _tmp65: Double = (_const0 * x)
    val _tmp67: Double = (_tmp65 + _const1)
    val _tmp66: Double = (x * x)
    val _tmp68: Double = (_tmp66 * _const2)
    val _tmp71: Double = (_tmp67 - _tmp68)
    val _tmp69: Double = (x * x)
    val _tmp70: Double = (_tmp69 * x)
    val _tmp72: Double = (_tmp70 * _const3)
    val _tmp76: DblDouble = (DblDouble(_tmp71) + DblDouble(_tmp72))
    val _tmp73: DblDouble = (DblDouble(x) * DblDouble(x))
    val _tmp74: DblDouble = (_tmp73 * DblDouble(_const4))
    val _tmp75: DblDouble = (DblDouble(x) * DblDouble(x))
    val _tmp77: DblDouble = (_tmp74 * _tmp75)
    (_tmp76 - _tmp77)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 3.5e-14)*/
  /*Abs error: -, Range: -*/
    def sqroot_64_01(x : DblDouble) : DblDouble = {
    val _const0: DblDouble = 0.5
    val _const1: Float = 1.0f
    val _const2: Float = 0.125f
    val _const3: DblDouble = 0.0625
    val _const4: DblDouble = 0.0390625
    val _tmp78: DblDouble = (_const0 * x)
    val _tmp80: DblDouble = (_tmp78 + DblDouble(_const1))
    val _tmp79: DblDouble = (x * x)
    val _tmp81: DblDouble = (_tmp79 * DblDouble(_const2))
    val _tmp84: DblDouble = (_tmp80 - _tmp81)
    val _tmp82: DblDouble = (x * x)
    val _tmp83: DblDouble = (_tmp82 * x)
    val _tmp85: DblDouble = (_tmp83 * _const3)
    val _tmp89: DblDouble = (_tmp84 + _tmp85)
    val _tmp86: DblDouble = (x * x)
    val _tmp87: DblDouble = (_tmp86 * _const4)
    val _tmp88: DblDouble = (x * x)
    val _tmp90: DblDouble = (_tmp87 * _tmp88)
    (_tmp89 - _tmp90)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 3.5e-15)*/
  /*Abs error: -, Range: -*/
    def sqroot_64_001(x : DblDouble) : DblDouble = {
    val _const0: DblDouble = 0.5
    val _const1: DblDouble = 1.0
    val _const2: DblDouble = 0.125
    val _const3: DblDouble = 0.0625
    val _const4: DblDouble = 0.0390625
    val _tmp91: DblDouble = (_const0 * x)
    val _tmp93: DblDouble = (_tmp91 + _const1)
    val _tmp92: DblDouble = (x * x)
    val _tmp94: DblDouble = (_tmp92 * _const2)
    val _tmp97: DblDouble = (_tmp93 - _tmp94)
    val _tmp95: DblDouble = (x * x)
    val _tmp96: DblDouble = (_tmp95 * x)
    val _tmp98: DblDouble = (_tmp96 * _const3)
    val _tmp102: DblDouble = (_tmp97 + _tmp98)
    val _tmp99: DblDouble = (x * x)
    val _tmp100: DblDouble = (_tmp99 * _const4)
    val _tmp101: DblDouble = (x * x)
    val _tmp103: DblDouble = (_tmp100 * _tmp101)
    (_tmp102 - _tmp103)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 1.5e-28)*/
  /*Abs error: -, Range: -*/
    def sqroot_dbldbl(x : DblDouble) : DblDouble = {
    val _const0: DblDouble = 0.5
    val _const1: DblDouble = 1.0
    val _const2: DblDouble = 0.125
    val _const3: DblDouble = 0.0625
    val _const4: DblDouble = 0.0390625
    val _tmp104: DblDouble = (_const0 * x)
    val _tmp106: DblDouble = (_tmp104 + _const1)
    val _tmp105: DblDouble = (x * x)
    val _tmp107: DblDouble = (_tmp105 * _const2)
    val _tmp110: DblDouble = (_tmp106 - _tmp107)
    val _tmp108: DblDouble = (x * x)
    val _tmp109: DblDouble = (_tmp108 * x)
    val _tmp111: DblDouble = (_tmp109 * _const3)
    val _tmp115: DblDouble = (_tmp110 + _tmp111)
    val _tmp112: DblDouble = (x * x)
    val _tmp113: DblDouble = (_tmp112 * _const4)
    val _tmp114: DblDouble = (x * x)
    val _tmp116: DblDouble = (_tmp113 * _tmp114)
    (_tmp115 - _tmp116)
  }

}
