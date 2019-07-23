package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Bsplines0 {

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 6.e-05)*/
  /*Abs error: -, Range: -*/
    def bspline0_fixed16(u : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 32768
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _tmp: Int = (_const0 - u)
    val _tmp1: Int = (_const1 - u)
    val _tmp2: Int = ((_tmp * _tmp1) >> 15)
    val _tmp3: Int = (_const2 - u)
    val _tmp4: Int = ((_tmp2 * _tmp3) >> 15)
    ((_tmp4 << 14) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 3.e-05)*/
  /*Abs error: -, Range: -*/
    def bspline0_fixed16_05(u : Int) : Long = {
    val _const0: Int = 32768
    val _const1: Int = 32768
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _tmp5: Int = (_const0 - u)
    val _tmp6: Int = (_const1 - u)
    val _tmp7: Long = (((_tmp5 << 16).toLong * (_tmp6 << 16).toLong) >> 31)
    val _tmp8: Long = ((_const2 << 16).toLong - (u << 16).toLong)
    val _tmp9: Long = ((_tmp7 * _tmp8) >> 31)
    ((_tmp9 << 14) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 6.e-06)*/
  /*Abs error: -, Range: -*/
    def bspline0_fixed16_01(u : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Int = 32768
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _tmp10: Long = (_const0 - u)
    val _tmp11: Long = ((_const1 << 16).toLong - u)
    val _tmp12: Long = ((_tmp10 * _tmp11) >> 31)
    val _tmp13: Long = ((_const2 << 16).toLong - u)
    val _tmp14: Long = ((_tmp12 * _tmp13) >> 31)
    ((_tmp14 << 14) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 6.e-07)*/
  /*Abs error: -, Range: -*/
    def bspline0_fixed16_001(u : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 2147483648l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _tmp15: Long = (_const0 - u)
    val _tmp16: Long = (_const1 - u)
    val _tmp17: Long = ((_tmp15 * _tmp16) >> 31)
    val _tmp18: Long = (_const2 - u)
    val _tmp19: Long = ((_tmp17 * _tmp18) >> 31)
    ((_tmp19 << 30) / _const3)
  }

  /*@pre : ((0. <= u) && (u <= 1.))*/
  /*@post: (res) => (res +/- 9.e-10)*/
  /*Abs error: -, Range: -*/
    def bspline0_fixed32(u : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 2147483648l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _tmp20: Long = (_const0 - u)
    val _tmp21: Long = (_const1 - u)
    val _tmp22: Long = ((_tmp20 * _tmp21) >> 31)
    val _tmp23: Long = (_const2 - u)
    val _tmp24: Long = ((_tmp22 * _tmp23) >> 31)
    ((_tmp24 << 30) / _const3)
  }

}
