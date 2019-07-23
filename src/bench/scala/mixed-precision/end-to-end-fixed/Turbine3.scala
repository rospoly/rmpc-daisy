package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Turbine3 {

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.025)*/
  /*()*/
    def turbine3_fixed16(v : Int, w : Int, r : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 49152
    val _const2: Int = 32768
    val _const3: Int = 32768
    val _const4: Int = 8192
    val _const5: Int = 32768
    val _const6: Int = 32768
    val _tmp: Int = ((r * r) >> 16)
    val _tmp1: Int = ((_const0 << 12) / _tmp)
    val _tmp10: Int = (((_const1 << 2) - _tmp1) >> 2)
    val _tmp2: Int = ((_const2 * v) >> 15)
    val _tmp3: Int = ((_const3 + (_tmp2 << 3)) >> 3)
    val _tmp6: Int = ((_const4 * _tmp3) >> 13)
    val _tmp4: Int = ((w * w) >> 16)
    val _tmp5: Int = ((_tmp4 * r) >> 16)
    val _tmp7: Int = ((_tmp5 * r) >> 16)
    val _tmp8: Int = ((_tmp6 * _tmp7) >> 15)
    val _tmp9: Int = ((_const5 - (v << 2)) >> 2)
    val _tmp11: Int = ((_tmp8 << 15) / _tmp9)
    val _tmp12: Int = ((_tmp10 - (_tmp11 << 2)) >> 2)
    (((_tmp12 << 4) - _const6) >> 4)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.0125)*/
  /*Abs error: -, Range: -*/
    def turbine3_fixed16_05(v : Int, w : Int, r : Int) : Long = {
    val _const0: Int = 32768
    val _const1: Int = 49152
    val _const2: Int = 32768
    val _const3: Int = 32768
    val _const4: Int = 8192
    val _const5: Int = 32768
    val _const6: Int = 32768
    val _tmp13: Int = ((r * r) >> 16)
    val _tmp14: Long = (((_const0 << 16).toLong << 28) / (_tmp13 << 16).toLong)
    val _tmp23: Long = ((((_const1 << 16).toLong << 2) - _tmp14) >> 2)
    val _tmp15: Long = (((_const2 << 16).toLong * (v << 16).toLong) >> 31)
    val _tmp16: Long = (((_const3 << 16).toLong + (_tmp15 << 3)) >> 3)
    val _tmp19: Long = (((_const4 << 16).toLong * _tmp16) >> 29)
    val _tmp17: Long = (((w << 16).toLong * (w << 16).toLong) >> 32)
    val _tmp18: Long = ((_tmp17 * (r << 16).toLong) >> 32)
    val _tmp20: Long = ((_tmp18 * (r << 16).toLong) >> 32)
    val _tmp21: Long = ((_tmp19 * _tmp20) >> 31)
    val _tmp22: Long = (((_const5 << 16).toLong - ((v << 16).toLong << 2)) >> 2)
    val _tmp24: Long = ((_tmp21 << 31) / _tmp22)
    val _tmp25: Long = ((_tmp23 - (_tmp24 << 2)) >> 2)
    (_tmp25 - (_const6 << 12))
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.0025)*/
  /*()*/
    def turbine3_fixed16_01(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 2147483648l
    val _const4: Long = 536870912l
    val _const5: Long = 2147483648l
    val _const6: Long = 2147483648l
    val _tmp26: Long = ((r * r) >> 32)
    val _tmp27: Long = ((_const0 << 28) / _tmp26)
    val _tmp36: Long = (((_const1 << 2) - _tmp27) >> 2)
    val _tmp28: Long = ((_const2 * v) >> 31)
    val _tmp29: Long = ((_const3 + (_tmp28 << 3)) >> 3)
    val _tmp32: Long = ((_const4 * _tmp29) >> 29)
    val _tmp30: Long = ((w * w) >> 32)
    val _tmp31: Long = ((_tmp30 * r) >> 32)
    val _tmp33: Long = ((_tmp31 * r) >> 32)
    val _tmp34: Long = ((_tmp32 * _tmp33) >> 31)
    val _tmp35: Long = ((_const5 - (v << 2)) >> 2)
    val _tmp37: Long = ((_tmp34 << 31) / _tmp35)
    val _tmp38: Long = ((_tmp36 - (_tmp37 << 2)) >> 2)
    (((_tmp38 << 4) - _const6) >> 4)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 0.00025)*/
  /*()*/
    def turbine3_fixed16_001(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 2147483648l
    val _const4: Long = 536870912l
    val _const5: Long = 2147483648l
    val _const6: Long = 2147483648l
    val _tmp39: Long = ((r * r) >> 32)
    val _tmp40: Long = ((_const0 << 28) / _tmp39)
    val _tmp49: Long = (((_const1 << 2) - _tmp40) >> 2)
    val _tmp41: Long = ((_const2 * v) >> 31)
    val _tmp42: Long = ((_const3 + (_tmp41 << 3)) >> 3)
    val _tmp45: Long = ((_const4 * _tmp42) >> 29)
    val _tmp43: Long = ((w * w) >> 32)
    val _tmp44: Long = ((_tmp43 * r) >> 32)
    val _tmp46: Long = ((_tmp44 * r) >> 32)
    val _tmp47: Long = ((_tmp45 * _tmp46) >> 31)
    val _tmp48: Long = ((_const5 - (v << 2)) >> 2)
    val _tmp50: Long = ((_tmp47 << 31) / _tmp48)
    val _tmp51: Long = ((_tmp49 - (_tmp50 << 2)) >> 2)
    (((_tmp51 << 4) - _const6) >> 4)
  }

  /*@pre : ((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8))*/
  /*@post: (res) => (res +/- 3.5e-07)*/
  /*()*/
    def turbine3_fixed32(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 2147483648l
    val _const4: Long = 536870912l
    val _const5: Long = 2147483648l
    val _const6: Long = 2147483648l
    val _tmp52: Long = ((r * r) >> 32)
    val _tmp53: Long = ((_const0 << 28) / _tmp52)
    val _tmp62: Long = (((_const1 << 2) - _tmp53) >> 2)
    val _tmp54: Long = ((_const2 * v) >> 31)
    val _tmp55: Long = ((_const3 + (_tmp54 << 3)) >> 3)
    val _tmp58: Long = ((_const4 * _tmp55) >> 29)
    val _tmp56: Long = ((w * w) >> 32)
    val _tmp57: Long = ((_tmp56 * r) >> 32)
    val _tmp59: Long = ((_tmp57 * r) >> 32)
    val _tmp60: Long = ((_tmp58 * _tmp59) >> 31)
    val _tmp61: Long = ((_const5 - (v << 2)) >> 2)
    val _tmp63: Long = ((_tmp60 << 31) / _tmp61)
    val _tmp64: Long = ((_tmp62 - (_tmp63 << 2)) >> 2)
    (((_tmp64 << 4) - _const6) >> 4)
  }

}
