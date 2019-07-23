package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Bsplines2 {

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 0.0002)*/
  /*Abs error: -, Range: -*/
    def bspline2_fixed16(u : Int) : Int = {
    val _const0: Int = -49153
    val _const1: Int = 49152
    val _const2: Int = 49152
    val _const3: Int = 32768
    val _const4: Int = 49152
    val _tmp: Int = ((_const0 * u) >> 15)
    val _tmp1: Int = ((_tmp * u) >> 15)
    val _tmp3: Int = ((_tmp1 * u) >> 15)
    val _tmp2: Int = ((_const1 * u) >> 15)
    val _tmp4: Int = ((_tmp2 * u) >> 15)
    val _tmp5: Int = ((_tmp3 + _tmp4) << 2)
    val _tmp6: Int = ((_const2 * u) >> 15)
    val _tmp7: Int = ((_tmp5 + (_tmp6 << 2)) >> 2)
    val _tmp8: Int = (((_tmp7 << 1) + _const3) >> 2)
    ((_tmp8 << 16) / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 0.0001)*/
  /*Abs error: -, Range: -*/
    def bspline2_fixed16_05(u : Int) : Long = {
    val _const0: Int = -49153
    val _const1: Int = 49152
    val _const2: Int = 49152
    val _const3: Int = 32768
    val _const4: Int = 49152
    val _tmp9: Int = ((_const0 * u) >> 15)
    val _tmp10: Long = (((_tmp9 << 16).toLong * (u << 16).toLong) >> 31)
    val _tmp12: Long = ((_tmp10 * (u << 16).toLong) >> 31)
    val _tmp11: Long = (((_const1 << 16).toLong * (u << 16).toLong) >> 31)
    val _tmp13: Long = ((_tmp11 * (u << 16).toLong) >> 31)
    val _tmp14: Long = ((_tmp12 + _tmp13) << 2)
    val _tmp15: Long = (((_const2 << 16).toLong * (u << 16).toLong) >> 31)
    val _tmp16: Long = ((_tmp14 + (_tmp15 << 2)) >> 2)
    val _tmp17: Long = (((_tmp16 << 1) + (_const3 << 16).toLong) >> 2)
    ((_tmp17 << 16) / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-05)*/
  /*Abs error: -, Range: -*/
    def bspline2_fixed16_01(u : Long) : Long = {
    val _const0: Long = -3221225473l
    val _const1: Long = 3221225472l
    val _const2: Long = 3221225472l
    val _const3: Long = 2147483648l
    val _const4: Long = 3221225472l
    val _tmp18: Long = ((_const0 * u) >> 31)
    val _tmp19: Long = ((_tmp18 * u) >> 31)
    val _tmp21: Long = ((_tmp19 * u) >> 31)
    val _tmp20: Long = ((_const1 * u) >> 31)
    val _tmp22: Long = ((_tmp20 * u) >> 31)
    val _tmp23: Long = ((_tmp21 + _tmp22) << 2)
    val _tmp24: Long = ((_const2 * u) >> 31)
    val _tmp25: Long = ((_tmp23 + (_tmp24 << 2)) >> 2)
    val _tmp26: Long = (((_tmp25 << 1) + _const3) >> 2)
    ((_tmp26 << 32) / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-06)*/
  /*Abs error: -, Range: -*/
    def bspline2_fixed16_001(u : Long) : Long = {
    val _const0: Long = -3221225473l
    val _const1: Long = 3221225472l
    val _const2: Long = 3221225472l
    val _const3: Long = 2147483648l
    val _const4: Long = 3221225472l
    val _tmp27: Long = ((_const0 * u) >> 31)
    val _tmp28: Long = ((_tmp27 * u) >> 31)
    val _tmp30: Long = ((_tmp28 * u) >> 31)
    val _tmp29: Long = ((_const1 * u) >> 31)
    val _tmp31: Long = ((_tmp29 * u) >> 31)
    val _tmp32: Long = ((_tmp30 + _tmp31) << 2)
    val _tmp33: Long = ((_const2 * u) >> 31)
    val _tmp34: Long = ((_tmp32 + (_tmp33 << 2)) >> 2)
    val _tmp35: Long = (((_tmp34 << 1) + _const3) >> 2)
    ((_tmp35 << 32) / _const4)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.e-09)*/
  /*Abs error: -, Range: -*/
    def bspline2_fixed32(u : Long) : Long = {
    val _const0: Long = -3221225473l
    val _const1: Long = 3221225472l
    val _const2: Long = 3221225472l
    val _const3: Long = 2147483648l
    val _const4: Long = 3221225472l
    val _tmp36: Long = ((_const0 * u) >> 31)
    val _tmp37: Long = ((_tmp36 * u) >> 31)
    val _tmp39: Long = ((_tmp37 * u) >> 31)
    val _tmp38: Long = ((_const1 * u) >> 31)
    val _tmp40: Long = ((_tmp38 * u) >> 31)
    val _tmp41: Long = ((_tmp39 + _tmp40) << 2)
    val _tmp42: Long = ((_const2 * u) >> 31)
    val _tmp43: Long = ((_tmp41 + (_tmp42 << 2)) >> 2)
    val _tmp44: Long = (((_tmp43 << 1) + _const3) >> 2)
    ((_tmp44 << 32) / _const4)
  }

}
