package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Turbine2 {

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 7.e-05)*/
  /*Abs error: -, Range: -*/
    def turbine2_32(v : Float, w : Float, r : Float) : Float = {
    val _const0: Float = 6f
    val _const1: Float = 2.5f
    val _const2: Float = 0.5f
    val _const3: Float = 1f
    val _tmp: Float = (_const0 * v)
    val _tmp7: Float = (_tmp - _const1)
    val _tmp1: Float = (r * r)
    val _tmp2: Float = (w * _tmp1)
    val _tmp3: Float = (w * _tmp2)
    val _tmp4: Float = (_tmp3 * v)
    val _tmp5: Float = (_const2 * _tmp4)
    val _tmp6: Float = (_const3 - v)
    val _tmp8: Float = (_tmp5 / _tmp6)
    (_tmp7 - _tmp8)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 3.5e-05)*/
  /*Abs error: -, Range: -*/
    def turbine2_32_05(v : Float, w : Float, r : Float) : Double = {
    val _const0: Float = 6f
    val _const1: Float = 2.5f
    val _const2: Float = 0.5f
    val _const3: Float = 1f
    val _tmp9: Float = (_const0 * v)
    val _tmp16: Double = (_tmp9.toDouble - _const1.toDouble)
    val _tmp10: Double = (r.toDouble * r.toDouble)
    val _tmp11: Double = (w.toDouble * _tmp10)
    val _tmp12: Double = (w.toDouble * _tmp11)
    val _tmp13: Double = (_tmp12 * v.toDouble)
    val _tmp14: Double = (_const2.toDouble * _tmp13)
    val _tmp15: Double = (_const3.toDouble - v.toDouble)
    val _tmp17: Double = (_tmp14 / _tmp15)
    (_tmp16 - _tmp17)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 7.e-06)*/
  /*Abs error: -, Range: -*/
    def turbine2_32_01(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 6
    val _const1: Double = 2.5
    val _const2: Double = 0.5
    val _const3: Double = 1
    val _tmp18: Double = (_const0 * v)
    val _tmp25: Double = (_tmp18 - _const1)
    val _tmp19: Double = (r * r)
    val _tmp20: Double = (w * _tmp19)
    val _tmp21: Double = (w * _tmp20)
    val _tmp22: Double = (_tmp21 * v)
    val _tmp23: Double = (_const2 * _tmp22)
    val _tmp24: Double = (_const3 - v)
    val _tmp26: Double = (_tmp23 / _tmp24)
    (_tmp25 - _tmp26)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 7.e-07)*/
  /*Abs error: -, Range: -*/
    def turbine2_32_001(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 6
    val _const1: Double = 2.5
    val _const2: Double = 0.5
    val _const3: Double = 1
    val _tmp27: Double = (_const0 * v)
    val _tmp34: Double = (_tmp27 - _const1)
    val _tmp28: Double = (r * r)
    val _tmp29: Double = (w * _tmp28)
    val _tmp30: Double = (w * _tmp29)
    val _tmp31: Double = (_tmp30 * v)
    val _tmp32: Double = (_const2 * _tmp31)
    val _tmp33: Double = (_const3 - v)
    val _tmp35: Double = (_tmp32 / _tmp33)
    (_tmp34 - _tmp35)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 1.5e-13)*/
  /*Abs error: -, Range: -*/
    def turbine2_64(v : Double, w : Double, r : Double) : Double = {
    val _const0: Double = 6
    val _const1: Double = 2.5
    val _const2: Double = 0.5
    val _const3: Double = 1
    val _tmp36: Double = (_const0 * v)
    val _tmp43: Double = (_tmp36 - _const1)
    val _tmp37: Double = (r * r)
    val _tmp38: Double = (w * _tmp37)
    val _tmp39: Double = (w * _tmp38)
    val _tmp40: Double = (_tmp39 * v)
    val _tmp41: Double = (_const2 * _tmp40)
    val _tmp42: Double = (_const3 - v)
    val _tmp44: Double = (_tmp41 / _tmp42)
    (_tmp43 - _tmp44)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 7.5e-14)*/
  /*Abs error: -, Range: -*/
    def turbine2_64_05(v : DblDouble, w : DblDouble, r : DblDouble) : Double = {
    val _const0: DblDouble = 6
    val _const1: Float = 2.5f
    val _const2: Float = 0.5f
    val _const3: Float = 1f
    val _tmp45: Double = (_const0 * v).toDouble
    val _tmp52: Double = (_tmp45 - _const1.toDouble)
    val _tmp46: Double = (r * r).toDouble
    val _tmp47: Double = (w * DblDouble(_tmp46)).toDouble
    val _tmp48: Double = (w * DblDouble(_tmp47)).toDouble
    val _tmp49: Double = (DblDouble(_tmp48) * v).toDouble
    val _tmp50: Double = (_const2.toDouble * _tmp49)
    val _tmp51: Double = (DblDouble(_const3) - v).toDouble
    val _tmp53: Double = (_tmp50 / _tmp51)
    (_tmp52 - _tmp53)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 1.5e-14)*/
  /*Abs error: -, Range: -*/
    def turbine2_64_01(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 6
    val _const1: DblDouble = 2.5
    val _const2: DblDouble = 0.5
    val _const3: DblDouble = 1
    val _tmp54: DblDouble = (_const0 * v)
    val _tmp61: DblDouble = (_tmp54 - _const1)
    val _tmp55: DblDouble = (r * r)
    val _tmp56: DblDouble = (w * _tmp55)
    val _tmp57: DblDouble = (w * _tmp56)
    val _tmp58: DblDouble = (_tmp57 * v)
    val _tmp59: DblDouble = (_const2 * _tmp58)
    val _tmp60: DblDouble = (_const3 - v)
    val _tmp62: DblDouble = (_tmp59 / _tmp60)
    (_tmp61 - _tmp62)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 1.5e-15)*/
  /*Abs error: -, Range: -*/
    def turbine2_64_001(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 6
    val _const1: DblDouble = 2.5
    val _const2: DblDouble = 0.5
    val _const3: DblDouble = 1
    val _tmp63: DblDouble = (_const0 * v)
    val _tmp70: DblDouble = (_tmp63 - _const1)
    val _tmp64: DblDouble = (r * r)
    val _tmp65: DblDouble = (w * _tmp64)
    val _tmp66: DblDouble = (w * _tmp65)
    val _tmp67: DblDouble = (_tmp66 * v)
    val _tmp68: DblDouble = (_const2 * _tmp67)
    val _tmp69: DblDouble = (_const3 - v)
    val _tmp71: DblDouble = (_tmp68 / _tmp69)
    (_tmp70 - _tmp71)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 4.5e-29)*/
  /*Abs error: -, Range: -*/
    def turbine2_dbldbl(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    val _const0: DblDouble = 6
    val _const1: DblDouble = 2.5
    val _const2: DblDouble = 0.5
    val _const3: DblDouble = 1
    val _tmp72: DblDouble = (_const0 * v)
    val _tmp79: DblDouble = (_tmp72 - _const1)
    val _tmp73: DblDouble = (r * r)
    val _tmp74: DblDouble = (w * _tmp73)
    val _tmp75: DblDouble = (w * _tmp74)
    val _tmp76: DblDouble = (_tmp75 * v)
    val _tmp77: DblDouble = (_const2 * _tmp76)
    val _tmp78: DblDouble = (_const3 - v)
    val _tmp80: DblDouble = (_tmp77 / _tmp78)
    (_tmp79 - _tmp80)
  }

}
