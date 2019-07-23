package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Doppler {

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 0.00025)*/
  /*Abs error: -, Range: -*/
    def doppler_32(u : Float, v : Float, T : Float) : Float = {
    val _const0: Float = 0.6f
    val _const1: Float = 331.4f
    val _tmp: Float = (_const0 * T)
    val t1: Float = (_const1 + _tmp)
    val _tmp1: Float = -(t1)
    val _tmp2: Float = (t1 + u)
    val _tmp4: Float = (_tmp1 / _tmp2)
    val _tmp3: Float = (t1 + u)
    val _tmp5: Float = (v / _tmp3)
    (_tmp4 * _tmp5)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 0.000125)*/
  /*Abs error: -, Range: -*/
    def doppler_32_05(u : Float, v : Float, T : Float) : Float = {
    val _const0: Float = 0.6f
    val _const1: Float = 331.4f
    val _tmp6: Float = (_const0 * T)
    val t1: Float = (_const1 + _tmp6)
    val _tmp7: Float = -(t1)
    val _tmp8: Float = (t1 + u)
    val _tmp10: Float = (_tmp7 / _tmp8)
    val _tmp9: Float = (t1 + u)
    val _tmp11: Float = (v / _tmp9)
    (_tmp10 * _tmp11)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 2.5e-05)*/
  /*Abs error: -, Range: -*/
    def doppler_32_01(u : Float, v : Float, T : Float) : Double = {
    val _const0: Double = 0.6
    val _const1: Double = 331.4
    val _tmp12: Double = (_const0 * T.toDouble)
    val t1: Double = (_const1 + _tmp12)
    val _tmp13: Double = -(t1)
    val _tmp14: Double = (t1 + u.toDouble)
    val _tmp16: Double = (_tmp13 / _tmp14)
    val _tmp15: Double = (t1 + u.toDouble)
    val _tmp17: Double = (v.toDouble / _tmp15)
    (_tmp16 * _tmp17)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 2.5e-06)*/
  /*Abs error: -, Range: -*/
    def doppler_32_001(u : Double, v : Double, T : Double) : Double = {
    val _const0: Double = 0.6
    val _const1: Double = 331.4
    val _tmp18: Double = (_const0 * T)
    val t1: Double = (_const1 + _tmp18)
    val _tmp19: Double = -(t1)
    val _tmp20: Double = (t1 + u)
    val _tmp22: Double = (_tmp19 / _tmp20)
    val _tmp21: Double = (t1 + u)
    val _tmp23: Double = (v / _tmp21)
    (_tmp22 * _tmp23)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 4.5e-13)*/
  /*Abs error: -, Range: -*/
    def doppler_64(u : Double, v : Double, T : Double) : Double = {
    val _const0: Double = 0.6
    val _const1: Double = 331.4
    val _tmp24: Double = (_const0 * T)
    val t1: Double = (_const1 + _tmp24)
    val _tmp25: Double = -(t1)
    val _tmp26: Double = (t1 + u)
    val _tmp28: Double = (_tmp25 / _tmp26)
    val _tmp27: Double = (t1 + u)
    val _tmp29: Double = (v / _tmp27)
    (_tmp28 * _tmp29)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 2.25e-13)*/
  /*Abs error: -, Range: -*/
    def doppler_64_05(u : Double, v : Double, T : Double) : Double = {
    val _const0: Double = 0.6
    val _const1: Double = 331.4
    val _tmp30: Double = (_const0 * T)
    val t1: Double = (_const1 + _tmp30)
    val _tmp31: Double = -(t1)
    val _tmp32: Double = (t1 + u)
    val _tmp34: Double = (_tmp31 / _tmp32)
    val _tmp33: Double = (t1 + u)
    val _tmp35: Double = (v / _tmp33)
    (_tmp34 * _tmp35)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 4.5e-14)*/
  /*Abs error: -, Range: -*/
    def doppler_64_01(u : DblDouble, v : DblDouble, T : DblDouble) : DblDouble = {
    val _const0: DblDouble = 0.6
    val _const1: DblDouble = 331.4
    val _tmp36: DblDouble = (_const0 * T)
    val t1: Double = (_const1 + _tmp36).toDouble
    val _tmp37: DblDouble = -(t1)
    val _tmp38: DblDouble = (DblDouble(t1) + u)
    val _tmp40: DblDouble = (_tmp37 / _tmp38)
    val _tmp39: DblDouble = (DblDouble(t1) + u)
    val _tmp41: DblDouble = (v / _tmp39)
    (_tmp40 * _tmp41)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 4.5e-15)*/
  /*Abs error: -, Range: -*/
    def doppler_64_001(u : DblDouble, v : DblDouble, T : DblDouble) : DblDouble = {
    val _const0: DblDouble = 0.6
    val _const1: DblDouble = 331.4
    val _tmp42: DblDouble = (_const0 * T)
    val t1: DblDouble = (_const1 + _tmp42)
    val _tmp43: DblDouble = -(t1)
    val _tmp44: DblDouble = (t1 + u)
    val _tmp46: DblDouble = (_tmp43 / _tmp44)
    val _tmp45: DblDouble = (t1 + u)
    val _tmp47: DblDouble = (v / _tmp45)
    (_tmp46 * _tmp47)
  }

  /*@pre : ((-100. <= u) && (u <= 100.) && (20. <= v) && (v <= 20000.) && (-30. <= T) && (T <= 50.))*/
  /*@post: (res) => (res +/- 1.5e-28)*/
  /*Abs error: -, Range: -*/
    def doppler_dbldbl(u : DblDouble, v : DblDouble, T : DblDouble) : DblDouble = {
    val _const0: DblDouble = 0.6
    val _const1: DblDouble = 331.4
    val _tmp48: DblDouble = (_const0 * T)
    val t1: DblDouble = (_const1 + _tmp48)
    val _tmp49: DblDouble = -(t1)
    val _tmp50: DblDouble = (t1 + u)
    val _tmp52: DblDouble = (_tmp49 / _tmp50)
    val _tmp51: DblDouble = (t1 + u)
    val _tmp53: DblDouble = (v / _tmp51)
    (_tmp52 * _tmp53)
  }

}
