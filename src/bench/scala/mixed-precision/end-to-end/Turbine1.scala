package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Turbine1 {

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 5.e-05)*/
  /*Abs error: -, Range: -*/
    def turbine1_32(v : Float, w : Float, r : Float) : Float = {
    val _const0: Float = 2f
    val _const1: Float = 3f
    val _const2: Float = 0.125f
    val _const3: Float = 2f
    val _const4: Float = 3f
    val _const5: Float = 1f
    val _const6: Float = 4.5f
    val _tmp: Float = (_const0 / r)
    val _tmp1: Float = (_tmp / r)
    val _tmp10: Float = (_const1 + _tmp1)
    val _tmp3: Float = (_const2 * w)
    val _tmp2: Float = (r * r)
    val _tmp4: Float = (w * _tmp2)
    val _tmp6: Float = (_tmp3 * _tmp4)
    val _tmp5: Float = (_const3 * v)
    val _tmp7: Float = (_const4 - _tmp5)
    val _tmp8: Float = (_tmp6 * _tmp7)
    val _tmp9: Float = (_const5 - v)
    val _tmp11: Float = (_tmp8 / _tmp9)
    val _tmp12: Float = (_tmp10 - _tmp11)
    (_tmp12 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 2.5e-05)*/
  /*Abs error: -, Range: -*/
    def turbine1_32_05(v : Float, w : Float, r : Float) : Double = {
    val _const0: Float = 2f
    val _const1: Float = 3f
    val _const2: Float = 0.125f
    val _const3: Float = 2f
    val _const4: Float = 3f
    val _const5: Float = 1f
    val _const6: Float = 4.5f
    val _tmp13: Float = (_const0 / r)
    val _tmp14: Double = (_tmp13.toDouble / r.toDouble)
    val _tmp23: Double = (_const1.toDouble + _tmp14)
    val _tmp16: Double = (_const2.toDouble * w.toDouble)
    val _tmp15: Double = (r.toDouble * r.toDouble)
    val _tmp17: Double = (w.toDouble * _tmp15)
    val _tmp19: Double = (_tmp16 * _tmp17)
    val _tmp18: Double = (_const3.toDouble * v.toDouble)
    val _tmp20: Double = (_const4.toDouble - _tmp18)
    val _tmp21: Double = (_tmp19 * _tmp20)
    val _tmp22: Double = (_const5.toDouble - v.toDouble)
    val _tmp24: Double = (_tmp21 / _tmp22)
    val _tmp25: Double = (_tmp23 - _tmp24)
    (_tmp25 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 5.e-06)*/
  /*Abs error: -, Range: -*/
    def turbine1_32_01(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 2
    val _const1: Double = 3
    val _const2: Double = 0.125
    val _const3: Double = 2
    val _const4: Double = 3
    val _const5: Double = 1
    val _const6: Double = 4.5
    val _tmp26: Double = (_const0 / r)
    val _tmp27: Double = (_tmp26 / r)
    val _tmp36: Double = (_const1 + _tmp27)
    val _tmp29: Double = (_const2 * w)
    val _tmp28: Double = (r * r)
    val _tmp30: Double = (w * _tmp28)
    val _tmp32: Double = (_tmp29 * _tmp30)
    val _tmp31: Double = (_const3 * v)
    val _tmp33: Double = (_const4 - _tmp31)
    val _tmp34: Double = (_tmp32 * _tmp33)
    val _tmp35: Double = (_const5 - v)
    val _tmp37: Double = (_tmp34 / _tmp35)
    val _tmp38: Double = (_tmp36 - _tmp37)
    (_tmp38 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 5.e-07)*/
  /*Abs error: -, Range: -*/
    def turbine1_32_001(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 2
    val _const1: Double = 3
    val _const2: Double = 0.125
    val _const3: Double = 2
    val _const4: Double = 3
    val _const5: Double = 1
    val _const6: Double = 4.5
    val _tmp39: Double = (_const0 / r)
    val _tmp40: Double = (_tmp39 / r)
    val _tmp49: Double = (_const1 + _tmp40)
    val _tmp42: Double = (_const2 * w)
    val _tmp41: Double = (r * r)
    val _tmp43: Double = (w * _tmp41)
    val _tmp45: Double = (_tmp42 * _tmp43)
    val _tmp44: Double = (_const3 * v)
    val _tmp46: Double = (_const4 - _tmp44)
    val _tmp47: Double = (_tmp45 * _tmp46)
    val _tmp48: Double = (_const5 - v)
    val _tmp50: Double = (_tmp47 / _tmp48)
    val _tmp51: Double = (_tmp49 - _tmp50)
    (_tmp51 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 9.e-14)*/
  /*Abs error: -, Range: -*/
    def turbine1_64(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 2
    val _const1: Double = 3
    val _const2: Double = 0.125
    val _const3: Double = 2
    val _const4: Double = 3
    val _const5: Double = 1
    val _const6: Double = 4.5
    val _tmp52: Double = (_const0 / r)
    val _tmp53: Double = (_tmp52 / r)
    val _tmp62: Double = (_const1 + _tmp53)
    val _tmp55: Double = (_const2 * w)
    val _tmp54: Double = (r * r)
    val _tmp56: Double = (w * _tmp54)
    val _tmp58: Double = (_tmp55 * _tmp56)
    val _tmp57: Double = (_const3 * v)
    val _tmp59: Double = (_const4 - _tmp57)
    val _tmp60: Double = (_tmp58 * _tmp59)
    val _tmp61: Double = (_const5 - v)
    val _tmp63: Double = (_tmp60 / _tmp61)
    val _tmp64: Double = (_tmp62 - _tmp63)
    (_tmp64 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 4.5e-14)*/
  /*Abs error: -, Range: -*/
    def turbine1_64_05(v : Double, w : Double, r : Double) : DblDouble = {
    val _const0: Double = 2
    val _const1: Double = 3
    val _const2: Float = 0.125f
    val _const3: Float = 2f
    val _const4: Float = 3f
    val _const5: Double = 1
    val _const6: Double = 4.5
    val _tmp65: Double = (_const0 / r)
    val _tmp66: DblDouble = (DblDouble(_tmp65) / DblDouble(r))
    val _tmp75: DblDouble = (DblDouble(_const1) + _tmp66)
    val _tmp68: DblDouble = (DblDouble(_const2) * DblDouble(w))
    val _tmp67: DblDouble = (DblDouble(r) * DblDouble(r))
    val _tmp69: DblDouble = (DblDouble(w) * _tmp67)
    val _tmp71: DblDouble = (_tmp68 * _tmp69)
    val _tmp70: DblDouble = (DblDouble(_const3) * DblDouble(v))
    val _tmp72: DblDouble = (DblDouble(_const4) - _tmp70)
    val _tmp73: DblDouble = (_tmp71 * _tmp72)
    val _tmp74: DblDouble = (DblDouble(_const5) - DblDouble(v))
    val _tmp76: DblDouble = (_tmp73 / _tmp74)
    val _tmp77: DblDouble = (_tmp75 - _tmp76)
    (_tmp77 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 9.e-15)*/
  /*Abs error: -, Range: -*/
    def turbine1_64_01(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 0.125
    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 1
    val _const6: DblDouble = 4.5
    val _tmp78: DblDouble = (_const0 / r)
    val _tmp79: DblDouble = (_tmp78 / r)
    val _tmp88: DblDouble = (_const1 + _tmp79)
    val _tmp81: DblDouble = (_const2 * w)
    val _tmp80: DblDouble = (r * r)
    val _tmp82: DblDouble = (w * _tmp80)
    val _tmp84: DblDouble = (_tmp81 * _tmp82)
    val _tmp83: DblDouble = (_const3 * v)
    val _tmp85: DblDouble = (_const4 - _tmp83)
    val _tmp86: DblDouble = (_tmp84 * _tmp85)
    val _tmp87: DblDouble = (_const5 - v)
    val _tmp89: DblDouble = (_tmp86 / _tmp87)
    val _tmp90: DblDouble = (_tmp88 - _tmp89)
    (_tmp90 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 9.e-16)*/
  /*Abs error: -, Range: -*/
    def turbine1_64_001(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 0.125
    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 1
    val _const6: DblDouble = 4.5
    val _tmp91: DblDouble = (_const0 / r)
    val _tmp92: DblDouble = (_tmp91 / r)
    val _tmp101: DblDouble = (_const1 + _tmp92)
    val _tmp94: DblDouble = (_const2 * w)
    val _tmp93: DblDouble = (r * r)
    val _tmp95: DblDouble = (w * _tmp93)
    val _tmp97: DblDouble = (_tmp94 * _tmp95)
    val _tmp96: DblDouble = (_const3 * v)
    val _tmp98: DblDouble = (_const4 - _tmp96)
    val _tmp99: DblDouble = (_tmp97 * _tmp98)
    val _tmp100: DblDouble = (_const5 - v)
    val _tmp102: DblDouble = (_tmp99 / _tmp100)
    val _tmp103: DblDouble = (_tmp101 - _tmp102)
    (_tmp103 - _const6)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 3.e-29)*/
  /*Abs error: -, Range: -*/
    def turbine1_dbldbl(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 0.125
    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 1
    val _const6: DblDouble = 4.5
    val _tmp104: DblDouble = (_const0 / r)
    val _tmp105: DblDouble = (_tmp104 / r)
    val _tmp114: DblDouble = (_const1 + _tmp105)
    val _tmp107: DblDouble = (_const2 * w)
    val _tmp106: DblDouble = (r * r)
    val _tmp108: DblDouble = (w * _tmp106)
    val _tmp110: DblDouble = (_tmp107 * _tmp108)
    val _tmp109: DblDouble = (_const3 * v)
    val _tmp111: DblDouble = (_const4 - _tmp109)
    val _tmp112: DblDouble = (_tmp110 * _tmp111)
    val _tmp113: DblDouble = (_const5 - v)
    val _tmp115: DblDouble = (_tmp112 / _tmp113)
    val _tmp116: DblDouble = (_tmp114 - _tmp115)
    (_tmp116 - _const6)
  }

}
