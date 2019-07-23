package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Bsplines2 {

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.5e-07)*/
  /*Abs error: -, Range: -*/
    def bspline2_32(u : Float) : Float = {
    val _const0: Float = -3f
    val _const1: Float = 3f
    val _const2: Float = 3f
    val _const3: Float = 1f
    val _const4: Float = 6.0f
    val _tmp: Float = (_const0 * u)
    val _tmp1: Float = (_tmp + _const1)
    val _tmp2: Float = (u * _tmp1)
    val _tmp3: Float = (u * _tmp2)
    val _tmp4: Float = (_const2 * u)
    val _tmp5: Float = (_tmp3 + _tmp4)
    val _tmp6: Float = (_tmp5 + _const3)
    (_tmp6 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 1.75e-07)*/
  /*Abs error: -, Range: -*/
    def bspline2_32_05(u : Float) : Double = {
    val _const0: Float = -3f
    val _const1: Float = 3f
    val _const2: Float = 3f
    val _const3: Float = 1f
    val _const4: Float = 6.0f
    val _tmp7: Float = (_const0 * u)
    val _tmp8: Float = (_tmp7 + _const1)
    val _tmp9: Float = (u * _tmp8)
    val _tmp10: Double = (u.toDouble * _tmp9.toDouble)
    val _tmp11: Double = (_const2.toDouble * u.toDouble)
    val _tmp12: Double = (_tmp10 + _tmp11)
    val _tmp13: Double = (_tmp12 + _const3.toDouble)
    (_tmp13 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.5e-08)*/
  /*Abs error: -, Range: -*/
    def bspline2_32_01(u : Double) : Double = {
    val _const0: Double = -3
    val _const1: Double = 3
    val _const2: Double = 3
    val _const3: Double = 1
    val _const4: Double = 6.0
    val _tmp14: Double = (_const0 * u)
    val _tmp15: Double = (_tmp14 + _const1)
    val _tmp16: Double = (u * _tmp15)
    val _tmp17: Double = (u * _tmp16)
    val _tmp18: Double = (_const2 * u)
    val _tmp19: Double = (_tmp17 + _tmp18)
    val _tmp20: Double = (_tmp19 + _const3)
    (_tmp20 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.5e-09)*/
  /*Abs error: -, Range: -*/
    def bspline2_32_001(u : Double) : Double = {
    val _const0: Double = -3
    val _const1: Double = 3
    val _const2: Double = 3
    val _const3: Double = 1
    val _const4: Double = 6.0
    val _tmp21: Double = (_const0 * u)
    val _tmp22: Double = (_tmp21 + _const1)
    val _tmp23: Double = (u * _tmp22)
    val _tmp24: Double = (u * _tmp23)
    val _tmp25: Double = (_const2 * u)
    val _tmp26: Double = (_tmp24 + _tmp25)
    val _tmp27: Double = (_tmp26 + _const3)
    (_tmp27 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 6.5e-16)*/
  /*Abs error: -, Range: -*/
    def bspline2_64(u : Double) : Double = {
    val _const0: Double = -3
    val _const1: Double = 3
    val _const2: Double = 3
    val _const3: Double = 1
    val _const4: Double = 6.0
    val _tmp28: Double = (_const0 * u)
    val _tmp29: Double = (_tmp28 + _const1)
    val _tmp30: Double = (u * _tmp29)
    val _tmp31: Double = (u * _tmp30)
    val _tmp32: Double = (_const2 * u)
    val _tmp33: Double = (_tmp31 + _tmp32)
    val _tmp34: Double = (_tmp33 + _const3)
    (_tmp34 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.25e-16)*/
  /*Abs error: -, Range: -*/
    def bspline2_64_05(u : Double) : DblDouble = {
    val _const0: Double = -3
    val _const1: Double = 3
    val _const2: Double = 3
    val _const3: Float = 1f
    val _const4: Float = 6.0f
    val _tmp35: Double = (_const0 * u)
    val _tmp36: Double = (_tmp35 + _const1)
    val _tmp37: Double = (u * _tmp36)
    val _tmp38: DblDouble = (DblDouble(u) * DblDouble(_tmp37))
    val _tmp39: DblDouble = (DblDouble(_const2) * DblDouble(u))
    val _tmp40: DblDouble = (_tmp38 + _tmp39)
    val _tmp41: DblDouble = (_tmp40 + DblDouble(_const3))
    (_tmp41 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 6.5e-17)*/
  /*Abs error: -, Range: -*/
    def bspline2_64_01(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = -3
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    val _const3: DblDouble = 1
    val _const4: DblDouble = 6.0
    val _tmp42: DblDouble = (_const0 * u)
    val _tmp43: DblDouble = (_tmp42 + _const1)
    val _tmp44: DblDouble = (u * _tmp43)
    val _tmp45: DblDouble = (u * _tmp44)
    val _tmp46: DblDouble = (_const2 * u)
    val _tmp47: DblDouble = (_tmp45 + _tmp46)
    val _tmp48: DblDouble = (_tmp47 + _const3)
    (_tmp48 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 6.5e-18)*/
  /*Abs error: -, Range: -*/
    def bspline2_64_001(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = -3
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    val _const3: DblDouble = 1
    val _const4: DblDouble = 6.0
    val _tmp49: DblDouble = (_const0 * u)
    val _tmp50: DblDouble = (_tmp49 + _const1)
    val _tmp51: DblDouble = (u * _tmp50)
    val _tmp52: DblDouble = (u * _tmp51)
    val _tmp53: DblDouble = (_const2 * u)
    val _tmp54: DblDouble = (_tmp52 + _tmp53)
    val _tmp55: DblDouble = (_tmp54 + _const3)
    (_tmp55 / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-31)*/
  /*Abs error: -, Range: -*/
    def bspline2_dbldbl(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = -3
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    val _const3: DblDouble = 1
    val _const4: DblDouble = 6.0
    val _tmp56: DblDouble = (_const0 * u)
    val _tmp57: DblDouble = (_tmp56 + _const1)
    val _tmp58: DblDouble = (u * _tmp57)
    val _tmp59: DblDouble = (u * _tmp58)
    val _tmp60: DblDouble = (_const2 * u)
    val _tmp61: DblDouble = (_tmp59 + _tmp60)
    val _tmp62: DblDouble = (_tmp61 + _const3)
    (_tmp62 / _const4)
  }

}
