package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Bsplines1 {

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 0.0002)*/
  /*Abs error: -, Range: -*/
    def bspline1_fixed16(u : Int) : Int = {
    val _const0: Int = 49152
    val _const1: Int = 49152
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _tmp: Int = ((_const0 * u) >> 15)
    val _tmp1: Int = ((_tmp * u) >> 15)
    val _tmp3: Int = ((_tmp1 * u) >> 15)
    val _tmp2: Int = ((_const1 * u) >> 15)
    val _tmp4: Int = ((_tmp2 * u) >> 15)
    val _tmp5: Int = (_tmp3 - (_tmp4 << 1))
    val _tmp6: Int = ((_tmp5 + (_const2 << 1)) >> 1)
    ((_tmp6 << 16) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 0.0001)*/
  /*Abs error: -, Range: -*/
    def bspline1_fixed16_05(u : Int) : Long = {
    val _const0: Int = 49152
    val _const1: Int = 49152
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _tmp7: Int = ((_const0 * u) >> 15)
    val _tmp8: Long = (((_tmp7 << 16).toLong * (u << 16).toLong) >> 31)
    val _tmp10: Long = ((_tmp8 * (u << 16).toLong) >> 31)
    val _tmp9: Long = (((_const1 << 16).toLong * (u << 16).toLong) >> 31)
    val _tmp11: Long = ((_tmp9 * (u << 16).toLong) >> 31)
    val _tmp12: Long = (_tmp10 - (_tmp11 << 1))
    val _tmp13: Long = ((_tmp12 + ((_const2 << 16).toLong << 1)) >> 1)
    ((_tmp13 << 16) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-05)*/
  /*Abs error: -, Range: -*/
    def bspline1_fixed16_01(u : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _tmp14: Long = ((_const0 * u) >> 31)
    val _tmp15: Long = ((_tmp14 * u) >> 31)
    val _tmp17: Long = ((_tmp15 * u) >> 31)
    val _tmp16: Long = ((_const1 * u) >> 31)
    val _tmp18: Long = ((_tmp16 * u) >> 31)
    val _tmp19: Long = (_tmp17 - (_tmp18 << 1))
    val _tmp20: Long = ((_tmp19 + (_const2 << 1)) >> 1)
    ((_tmp20 << 32) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 2.e-06)*/
  /*Abs error: -, Range: -*/
    def bspline1_fixed16_001(u : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _tmp21: Long = ((_const0 * u) >> 31)
    val _tmp22: Long = ((_tmp21 * u) >> 31)
    val _tmp24: Long = ((_tmp22 * u) >> 31)
    val _tmp23: Long = ((_const1 * u) >> 31)
    val _tmp25: Long = ((_tmp23 * u) >> 31)
    val _tmp26: Long = (_tmp24 - (_tmp25 << 1))
    val _tmp27: Long = ((_tmp26 + (_const2 << 1)) >> 1)
    ((_tmp27 << 32) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.e-09)*/
  /*Abs error: -, Range: -*/
    def bspline1_fixed32(u : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _tmp28: Long = ((_const0 * u) >> 31)
    val _tmp29: Long = ((_tmp28 * u) >> 31)
    val _tmp31: Long = ((_tmp29 * u) >> 31)
    val _tmp30: Long = ((_const1 * u) >> 31)
    val _tmp32: Long = ((_tmp30 * u) >> 31)
    val _tmp33: Long = (_tmp31 - (_tmp32 << 1))
    val _tmp34: Long = ((_tmp33 + (_const2 << 1)) >> 1)
    ((_tmp34 << 32) / _const3)
  }

}
