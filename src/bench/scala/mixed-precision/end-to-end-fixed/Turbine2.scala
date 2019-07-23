package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Turbine2 {

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.04)*/
  /*()*/
    def turbine2_fixed16(v : Int, w : Int, r : Int) : Int = {
    val _const0: Int = 49152
    val _const1: Int = 32768
    val _const2: Int = 32768
    val _const3: Int = 40960
    val _tmp6: Int = ((_const0 * v) >> 15)
    val _tmp2: Int = ((_const1 * v) >> 15)
    val _tmp: Int = ((w * w) >> 16)
    val _tmp1: Int = ((_tmp * r) >> 16)
    val _tmp3: Int = ((_tmp1 * r) >> 16)
    val _tmp4: Int = ((_tmp2 * _tmp3) >> 15)
    val _tmp5: Int = ((_const2 - (v << 2)) >> 2)
    val _tmp7: Int = ((_tmp4 << 15) / _tmp5)
    val _tmp8: Int = (_tmp6 - _tmp7)
    (((_tmp8 << 3) - _const3) >> 3)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.02)*/
  /*Abs error: -, Range: -*/
    def turbine2_fixed16_05(v : Int, w : Int, r : Int) : Long = {
    val _const0: Int = 49152
    val _const1: Int = 32768
    val _const2: Int = 32768
    val _const3: Int = 40960
    val _tmp15: Int = ((_const0 * v) >> 15)
    val _tmp11: Long = (((_const1 << 16).toLong * (v << 16).toLong) >> 31)
    val _tmp9: Long = (((w << 16).toLong * (w << 16).toLong) >> 32)
    val _tmp10: Long = ((_tmp9 * (r << 16).toLong) >> 32)
    val _tmp12: Long = ((_tmp10 * (r << 16).toLong) >> 32)
    val _tmp13: Long = ((_tmp11 * _tmp12) >> 31)
    val _tmp14: Long = (((_const2 << 16).toLong - ((v << 16).toLong << 2)) >> 2)
    val _tmp16: Long = ((_tmp13 << 31) / _tmp14)
    val _tmp17: Long = ((_tmp15 << 16).toLong - _tmp16)
    (_tmp17 - (_const3 << 13))
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.004)*/
  /*()*/
    def turbine2_fixed16_01(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 2147483648l
    val _const2: Long = 2147483648l
    val _const3: Long = 2684354560l
    val _tmp24: Long = ((_const0 * v) >> 31)
    val _tmp20: Long = ((_const1 * v) >> 31)
    val _tmp18: Long = ((w * w) >> 32)
    val _tmp19: Long = ((_tmp18 * r) >> 32)
    val _tmp21: Long = ((_tmp19 * r) >> 32)
    val _tmp22: Long = ((_tmp20 * _tmp21) >> 31)
    val _tmp23: Long = ((_const2 - (v << 2)) >> 2)
    val _tmp25: Long = ((_tmp22 << 31) / _tmp23)
    val _tmp26: Long = (_tmp24 - _tmp25)
    (((_tmp26 << 3) - _const3) >> 3)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.0004)*/
  /*()*/
    def turbine2_fixed16_001(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 2147483648l
    val _const2: Long = 2147483648l
    val _const3: Long = 2684354560l
    val _tmp33: Long = ((_const0 * v) >> 31)
    val _tmp29: Long = ((_const1 * v) >> 31)
    val _tmp27: Long = ((w * w) >> 32)
    val _tmp28: Long = ((_tmp27 * r) >> 32)
    val _tmp30: Long = ((_tmp28 * r) >> 32)
    val _tmp31: Long = ((_tmp29 * _tmp30) >> 31)
    val _tmp32: Long = ((_const2 - (v << 2)) >> 2)
    val _tmp34: Long = ((_tmp31 << 31) / _tmp32)
    val _tmp35: Long = (_tmp33 - _tmp34)
    (((_tmp35 << 3) - _const3) >> 3)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 6.e-07)*/
  /*()*/
    def turbine2_fixed32(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 2147483648l
    val _const2: Long = 2147483648l
    val _const3: Long = 2684354560l
    val _tmp42: Long = ((_const0 * v) >> 31)
    val _tmp38: Long = ((_const1 * v) >> 31)
    val _tmp36: Long = ((w * w) >> 32)
    val _tmp37: Long = ((_tmp36 * r) >> 32)
    val _tmp39: Long = ((_tmp37 * r) >> 32)
    val _tmp40: Long = ((_tmp38 * _tmp39) >> 31)
    val _tmp41: Long = ((_const2 - (v << 2)) >> 2)
    val _tmp43: Long = ((_tmp40 << 31) / _tmp41)
    val _tmp44: Long = (_tmp42 - _tmp43)
    (((_tmp44 << 3) - _const3) >> 3)
  }

}
