package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Bsplines0 {

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 9.e-08)*/
  /*Abs error: -, Range: -*/
    def bspline0_32(u : Float) : Float = {
    val _const0: Float = 1f
    val _const1: Float = 1f
    val _const2: Float = 1f
    val _const3: Float = 6.0f
    val _tmp: Float = (_const0 - u)
    val _tmp1: Float = (_const1 - u)
    val _tmp2: Float = (_tmp * _tmp1)
    val _tmp3: Float = (_const2 - u)
    val _tmp4: Float = (_tmp2 * _tmp3)
    (_tmp4 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 4.5e-08)*/
  /*Abs error: -, Range: -*/
    def bspline0_32_05(u : Float) : Double = {
    val _const0: Float = 1f
    val _const1: Float = 1f
    val _const2: Float = 1f
    val _const3: Float = 6.0f
    val _tmp5: Double = (_const0.toDouble - u.toDouble)
    val _tmp6: Double = (_const1.toDouble - u.toDouble)
    val _tmp7: Double = (_tmp5 * _tmp6)
    val _tmp8: Double = (_const2.toDouble - u.toDouble)
    val _tmp9: Double = (_tmp7 * _tmp8)
    (_tmp9 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 9.e-09)*/
  /*Abs error: -, Range: -*/
    def bspline0_32_01(u : Double) : Double = {
    val _const0: Double = 1
    val _const1: Double = 1
    val _const2: Double = 1
    val _const3: Double = 6.0
    val _tmp10: Double = (_const0 - u)
    val _tmp11: Double = (_const1 - u)
    val _tmp12: Double = (_tmp10 * _tmp11)
    val _tmp13: Double = (_const2 - u)
    val _tmp14: Double = (_tmp12 * _tmp13)
    (_tmp14 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 9.e-10)*/
  /*Abs error: -, Range: -*/
    def bspline0_32_001(u : Double) : Double = {
    val _const0: Double = 1
    val _const1: Double = 1
    val _const2: Double = 1
    val _const3: Double = 6.0
    val _tmp15: Double = (_const0 - u)
    val _tmp16: Double = (_const1 - u)
    val _tmp17: Double = (_tmp15 * _tmp16)
    val _tmp18: Double = (_const2 - u)
    val _tmp19: Double = (_tmp17 * _tmp18)
    (_tmp19 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-16)*/
  /*Abs error: -, Range: -*/
    def bspline0_64(u : Double) : Double = {
    val _const0: Double = 1
    val _const1: Double = 1
    val _const2: Double = 1
    val _const3: Double = 6.0
    val _tmp20: Double = (_const0 - u)
    val _tmp21: Double = (_const1 - u)
    val _tmp22: Double = (_tmp20 * _tmp21)
    val _tmp23: Double = (_const2 - u)
    val _tmp24: Double = (_tmp22 * _tmp23)
    (_tmp24 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 1.e-16)*/
  /*Abs error: -, Range: -*/
    def bspline0_64_05(u : Double) : DblDouble = {
    val _const0: Double = 1
    val _const1: Double = 1
    val _const2: Float = 1f
    val _const3: Float = 6.0f
    val _tmp25: Double = (_const0 - u)
    val _tmp26: Double = (_const1 - u)
    val _tmp27: DblDouble = (DblDouble(_tmp25) * DblDouble(_tmp26))
    val _tmp28: DblDouble = (DblDouble(_const2) - DblDouble(u))
    val _tmp29: DblDouble = (_tmp27 * _tmp28)
    (_tmp29 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-17)*/
  /*Abs error: -, Range: -*/
    def bspline0_64_01(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = 1
    val _const1: Float = 1f
    val _const2: Float = 1f
    val _const3: Float = 6.0f
    val _tmp30: DblDouble = (_const0 - u)
    val _tmp31: DblDouble = (DblDouble(_const1) - u)
    val _tmp32: DblDouble = (_tmp30 * _tmp31)
    val _tmp33: DblDouble = (DblDouble(_const2) - u)
    val _tmp34: DblDouble = (_tmp32 * _tmp33)
    (_tmp34 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-18)*/
  /*Abs error: -, Range: -*/
    def bspline0_64_001(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = 1
    val _const1: DblDouble = 1
    val _const2: DblDouble = 1
    val _const3: DblDouble = 6.0
    val _tmp35: DblDouble = (_const0 - u)
    val _tmp36: DblDouble = (_const1 - u)
    val _tmp37: DblDouble = (_tmp35 * _tmp36)
    val _tmp38: DblDouble = (_const2 - u)
    val _tmp39: DblDouble = (_tmp37 * _tmp38)
    (_tmp39 / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 4.e-32)*/
  /*Abs error: -, Range: -*/
    def bspline0_dbldbl(u : DblDouble) : DblDouble = {
    val _const0: DblDouble = 1
    val _const1: DblDouble = 1
    val _const2: DblDouble = 1
    val _const3: DblDouble = 6.0
    val _tmp40: DblDouble = (_const0 - u)
    val _tmp41: DblDouble = (_const1 - u)
    val _tmp42: DblDouble = (_tmp40 * _tmp41)
    val _tmp43: DblDouble = (_const2 - u)
    val _tmp44: DblDouble = (_tmp42 * _tmp43)
    (_tmp44 / _const3)
  }

}
