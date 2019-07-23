package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Turbine3 {

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 3.5e-05)*/
  /*Abs error: -, Range: -*/
    def turbine3_32(v : Float, w : Float, r : Float) : Float = {
    val _const0: Float = 2f
    val _const1: Float = 0.5f
    val _const2: Float = 3f
    val _const3: Float = 2f
    val _const4: Float = 1f
    val _const5: Float = 0.125f
    val _const6: Float = 1f
    val _tmp: Float = (_const0 / r)
    val _tmp1: Float = (_tmp / r)
    val _tmp2: Float = (_tmp1 + _const1)
    val _tmp11: Float = (_const2 - _tmp2)
    val _tmp3: Float = (_const3 * v)
    val _tmp6: Float = (_tmp3 + _const4)
    val _tmp4: Float = (r * r)
    val _tmp5: Float = (w * _tmp4)
    val _tmp7: Float = (w * _tmp5)
    val _tmp8: Float = (_tmp6 * _tmp7)
    val _tmp9: Float = (_const5 * _tmp8)
    val _tmp10: Float = (_const6 - v)
    val _tmp12: Float = (_tmp9 / _tmp10)
    (_tmp11 - _tmp12)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 1.75e-05)*/
  /*Abs error: -, Range: -*/
    def turbine3_32_05(v : Float, w : Float, r : Float) : Double = {
    val _const0: Float = 2f
    val _const1: Float = 0.5f
    val _const2: Float = 3f
    val _const3: Float = 2f
    val _const4: Float = 1f
    val _const5: Float = 0.125f
    val _const6: Float = 1f
    val _tmp13: Float = (_const0 / r)
    val _tmp14: Double = (_tmp13.toDouble / r.toDouble)
    val _tmp15: Double = (_tmp14 + _const1.toDouble)
    val _tmp24: Double = (_const2.toDouble - _tmp15)
    val _tmp16: Double = (_const3.toDouble * v.toDouble)
    val _tmp19: Double = (_tmp16 + _const4.toDouble)
    val _tmp17: Double = (r.toDouble * r.toDouble)
    val _tmp18: Double = (w.toDouble * _tmp17)
    val _tmp20: Double = (w.toDouble * _tmp18)
    val _tmp21: Double = (_tmp19 * _tmp20)
    val _tmp22: Double = (_const5.toDouble * _tmp21)
    val _tmp23: Double = (_const6.toDouble - v.toDouble)
    val _tmp25: Double = (_tmp22 / _tmp23)
    (_tmp24 - _tmp25)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 3.5e-06)*/
  /*Abs error: -, Range: -*/
    def turbine3_32_01(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 2
    val _const1: Double = 0.5
    val _const2: Double = 3
    val _const3: Double = 2
    val _const4: Double = 1
    val _const5: Double = 0.125
    val _const6: Double = 1
    val _tmp26: Double = (_const0 / r)
    val _tmp27: Double = (_tmp26 / r)
    val _tmp28: Double = (_tmp27 + _const1)
    val _tmp37: Double = (_const2 - _tmp28)
    val _tmp29: Double = (_const3 * v)
    val _tmp32: Double = (_tmp29 + _const4)
    val _tmp30: Double = (r * r)
    val _tmp31: Double = (w * _tmp30)
    val _tmp33: Double = (w * _tmp31)
    val _tmp34: Double = (_tmp32 * _tmp33)
    val _tmp35: Double = (_const5 * _tmp34)
    val _tmp36: Double = (_const6 - v)
    val _tmp38: Double = (_tmp35 / _tmp36)
    (_tmp37 - _tmp38)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 3.5e-07)*/
  /*Abs error: -, Range: -*/
    def turbine3_32_001(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 2
    val _const1: Double = 0.5
    val _const2: Double = 3
    val _const3: Double = 2
    val _const4: Double = 1
    val _const5: Double = 0.125
    val _const6: Double = 1
    val _tmp39: Double = (_const0 / r)
    val _tmp40: Double = (_tmp39 / r)
    val _tmp41: Double = (_tmp40 + _const1)
    val _tmp50: Double = (_const2 - _tmp41)
    val _tmp42: Double = (_const3 * v)
    val _tmp45: Double = (_tmp42 + _const4)
    val _tmp43: Double = (r * r)
    val _tmp44: Double = (w * _tmp43)
    val _tmp46: Double = (w * _tmp44)
    val _tmp47: Double = (_tmp45 * _tmp46)
    val _tmp48: Double = (_const5 * _tmp47)
    val _tmp49: Double = (_const6 - v)
    val _tmp51: Double = (_tmp48 / _tmp49)
    (_tmp50 - _tmp51)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 6.5e-14)*/
  /*Abs error: -, Range: -*/
    def turbine3_64(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 2
    val _const1: Double = 0.5
    val _const2: Double = 3
    val _const3: Double = 2
    val _const4: Double = 1
    val _const5: Double = 0.125
    val _const6: Double = 1
    val _tmp52: Double = (_const0 / r)
    val _tmp53: Double = (_tmp52 / r)
    val _tmp54: Double = (_tmp53 + _const1)
    val _tmp63: Double = (_const2 - _tmp54)
    val _tmp55: Double = (_const3 * v)
    val _tmp58: Double = (_tmp55 + _const4)
    val _tmp56: Double = (r * r)
    val _tmp57: Double = (w * _tmp56)
    val _tmp59: Double = (w * _tmp57)
    val _tmp60: Double = (_tmp58 * _tmp59)
    val _tmp61: Double = (_const5 * _tmp60)
    val _tmp62: Double = (_const6 - v)
    val _tmp64: Double = (_tmp61 / _tmp62)
    (_tmp63 - _tmp64)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 3.25e-14)*/
  /*Abs error: -, Range: -*/
    def turbine3_64_05(v : Double, w : Double, r : Double) : DblDouble = {
    val _const0: Double = 2
    val _const1: Double = 0.5
    val _const2: Float = 3f
    val _const3: Float = 2f
    val _const4: Float = 1f
    val _const5: Double = 0.125
    val _const6: Double = 1
    val _tmp65: Double = (_const0 / r)
    val _tmp66: DblDouble = (DblDouble(_tmp65) / DblDouble(r))
    val _tmp67: DblDouble = (_tmp66 + DblDouble(_const1))
    val _tmp76: DblDouble = (DblDouble(_const2) - _tmp67)
    val _tmp68: DblDouble = (DblDouble(_const3) * DblDouble(v))
    val _tmp71: DblDouble = (_tmp68 + DblDouble(_const4))
    val _tmp69: DblDouble = (DblDouble(r) * DblDouble(r))
    val _tmp70: DblDouble = (DblDouble(w) * _tmp69)
    val _tmp72: DblDouble = (DblDouble(w) * _tmp70)
    val _tmp73: DblDouble = (_tmp71 * _tmp72)
    val _tmp74: DblDouble = (DblDouble(_const5) * _tmp73)
    val _tmp75: DblDouble = (DblDouble(_const6) - DblDouble(v))
    val _tmp77: DblDouble = (_tmp74 / _tmp75)
    (_tmp76 - _tmp77)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 6.5e-15)*/
  /*Abs error: -, Range: -*/
    def turbine3_64_01(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 0.5
    val _const2: DblDouble = 3
    val _const3: DblDouble = 2
    val _const4: DblDouble = 1
    val _const5: DblDouble = 0.125
    val _const6: DblDouble = 1
    val _tmp78: DblDouble = (_const0 / r)
    val _tmp79: DblDouble = (_tmp78 / r)
    val _tmp80: DblDouble = (_tmp79 + _const1)
    val _tmp89: DblDouble = (_const2 - _tmp80)
    val _tmp81: DblDouble = (_const3 * v)
    val _tmp84: DblDouble = (_tmp81 + _const4)
    val _tmp82: DblDouble = (r * r)
    val _tmp83: DblDouble = (w * _tmp82)
    val _tmp85: DblDouble = (w * _tmp83)
    val _tmp86: DblDouble = (_tmp84 * _tmp85)
    val _tmp87: DblDouble = (_const5 * _tmp86)
    val _tmp88: DblDouble = (_const6 - v)
    val _tmp90: DblDouble = (_tmp87 / _tmp88)
    (_tmp89 - _tmp90)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 6.5e-16)*/
  /*Abs error: -, Range: -*/
    def turbine3_64_001(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 0.5
    val _const2: DblDouble = 3
    val _const3: DblDouble = 2
    val _const4: DblDouble = 1
    val _const5: DblDouble = 0.125
    val _const6: DblDouble = 1
    val _tmp91: DblDouble = (_const0 / r)
    val _tmp92: DblDouble = (_tmp91 / r)
    val _tmp93: DblDouble = (_tmp92 + _const1)
    val _tmp102: DblDouble = (_const2 - _tmp93)
    val _tmp94: DblDouble = (_const3 * v)
    val _tmp97: DblDouble = (_tmp94 + _const4)
    val _tmp95: DblDouble = (r * r)
    val _tmp96: DblDouble = (w * _tmp95)
    val _tmp98: DblDouble = (w * _tmp96)
    val _tmp99: DblDouble = (_tmp97 * _tmp98)
    val _tmp100: DblDouble = (_const5 * _tmp99)
    val _tmp101: DblDouble = (_const6 - v)
    val _tmp103: DblDouble = (_tmp100 / _tmp101)
    (_tmp102 - _tmp103)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 2.e-29)*/
  /*Abs error: -, Range: -*/
    def turbine3_dbldbl(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 0.5
    val _const2: DblDouble = 3
    val _const3: DblDouble = 2
    val _const4: DblDouble = 1
    val _const5: DblDouble = 0.125
    val _const6: DblDouble = 1
    val _tmp104: DblDouble = (_const0 / r)
    val _tmp105: DblDouble = (_tmp104 / r)
    val _tmp106: DblDouble = (_tmp105 + _const1)
    val _tmp115: DblDouble = (_const2 - _tmp106)
    val _tmp107: DblDouble = (_const3 * v)
    val _tmp110: DblDouble = (_tmp107 + _const4)
    val _tmp108: DblDouble = (r * r)
    val _tmp109: DblDouble = (w * _tmp108)
    val _tmp111: DblDouble = (w * _tmp109)
    val _tmp112: DblDouble = (_tmp110 * _tmp111)
    val _tmp113: DblDouble = (_const5 * _tmp112)
    val _tmp114: DblDouble = (_const6 - v)
    val _tmp116: DblDouble = (_tmp113 / _tmp114)
    (_tmp115 - _tmp116)
  }

}
