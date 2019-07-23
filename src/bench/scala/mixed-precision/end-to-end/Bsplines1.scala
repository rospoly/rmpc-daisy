package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Bsplines1 {

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 4.e-07)*/
  /*Abs error: -, Range: -*/
    def bspline1_32(u : Float) : Float = {
    val _const0: Float = 3f
    val _const1: Float = 6f
    val _const2: Float = 4f
    val _const3: Float = 6.0f
    val _tmp: Float = (_const0 * u)
    val _tmp1: Float = (_tmp - _const1)
    val _tmp2: Float = (u * _tmp1)
    val _tmp3: Float = (u * _tmp2)
    val _tmp4: Float = (_const2 + _tmp3)
    (_tmp4 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-07)*/
  /*Abs error: -, Range: -*/
    def bspline1_32_05(u : Float) : Double = {
    val _const0: Float = 3f
    val _const1: Float = 6f
    val _const2: Float = 4f
    val _const3: Float = 6.0f
    val _tmp5: Float = (_const0 * u)
    val _tmp6: Float = (_tmp5 - _const1)
    val _tmp7: Double = (u.toDouble * _tmp6.toDouble)
    val _tmp8: Double = (u.toDouble * _tmp7)
    val _tmp9: Double = (_const2.toDouble + _tmp8)
    (_tmp9 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 4.e-08)*/
  /*Abs error: -, Range: -*/
    def bspline1_32_01(u : Double) : Double = {
    val _const0: Double = 3
    val _const1: Float = 6f
    val _const2: Float = 4f
    val _const3: Float = 6.0f
    val _tmp10: Double = (_const0 * u)
    val _tmp11: Double = (_tmp10 - _const1.toDouble)
    val _tmp12: Double = (u * _tmp11)
    val _tmp13: Double = (u * _tmp12)
    val _tmp14: Double = (_const2.toDouble + _tmp13)
    (_tmp14 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 4.e-09)*/
  /*Abs error: -, Range: -*/
    def bspline1_32_001(u : Double) : Double = {
    val _const0: Double = 3
    val _const1: Double = 6
    val _const2: Double = 4
    val _const3: Double = 6.0
    val _tmp15: Double = (_const0 * u)
    val _tmp16: Double = (_tmp15 - _const1)
    val _tmp17: Double = (u * _tmp16)
    val _tmp18: Double = (u * _tmp17)
    val _tmp19: Double = (_const2 + _tmp18)
    (_tmp19 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 7.5e-16)*/
  /*Abs error: -, Range: -*/
    def bspline1_64(u : Double) : Double = {
    val _const0: Double = 3
    val _const1: Double = 6
    val _const2: Double = 4
    val _const3: Double = 6.0
    val _tmp20: Double = (_const0 * u)
    val _tmp21: Double = (_tmp20 - _const1)
    val _tmp22: Double = (u * _tmp21)
    val _tmp23: Double = (u * _tmp22)
    val _tmp24: Double = (_const2 + _tmp23)
    (_tmp24 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.75e-16)*/
  /*Abs error: -, Range: -*/
    def bspline1_64_05(u : Double) : Double = {
    val _const0: Double = 3
    val _const1: Float = 6f
    val _const2: Float = 4f
    val _const3: Double = 6.0
    val _tmp25: DblDouble = (DblDouble(_const0) * DblDouble(u))
    val _tmp26: DblDouble = (_tmp25 - DblDouble(_const1))
    val _tmp27: Double = (DblDouble(u) * _tmp26).toDouble
    val _tmp28: Double = (u * _tmp27)
    val _tmp29: Double = (_const2.toDouble + _tmp28)
    (_tmp29 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 7.5e-17)*/
  /*Abs error: -, Range: -*/
    def bspline1_64_01(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = 3
    val _const1: Float = 6f
    val _const2: Float = 4f
    val _const3: Float = 6.0f
    val _tmp30: DblDouble = (_const0 * u)
    val _tmp31: DblDouble = (_tmp30 - DblDouble(_const1))
    val _tmp32: DblDouble = (u * _tmp31)
    val _tmp33: DblDouble = (u * _tmp32)
    val _tmp34: DblDouble = (DblDouble(_const2) + _tmp33)
    (_tmp34 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 7.5e-18)*/
  /*Abs error: -, Range: -*/
    def bspline1_64_001(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = 3
    val _const1: DblDouble = 6
    val _const2: DblDouble = 4
    val _const3: DblDouble = 6.0
    val _tmp35: DblDouble = (_const0 * u)
    val _tmp36: DblDouble = (_tmp35 - _const1)
    val _tmp37: DblDouble = (u * _tmp36)
    val _tmp38: DblDouble = (u * _tmp37)
    val _tmp39: DblDouble = (_const2 + _tmp38)
    (_tmp39 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-31)*/
  /*Abs error: -, Range: -*/
    def bspline1_dbldbl(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = 3
    val _const1: DblDouble = 6
    val _const2: DblDouble = 4
    val _const3: DblDouble = 6.0
    val _tmp40: DblDouble = (_const0 * u)
    val _tmp41: DblDouble = (_tmp40 - _const1)
    val _tmp42: DblDouble = (u * _tmp41)
    val _tmp43: DblDouble = (u * _tmp42)
    val _tmp44: DblDouble = (_const2 + _tmp43)
    (_tmp44 / _const3)
  }

}
