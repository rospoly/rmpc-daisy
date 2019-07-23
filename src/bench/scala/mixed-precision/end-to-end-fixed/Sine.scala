package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Sine {

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 0.00025)*/
  /*()*/
    def sine_fixed16(x : Int) : Int = {
    val _const0: Int = 49152
    val _const1: Int = 61440
    val _const2: Int = 40320
    val _tmp: Int = ((x * x) >> 16)
    val _tmp1: Int = ((_tmp * x) >> 15)
    val _tmp2: Int = ((_tmp1 << 15) / _const0)
    val _tmp7: Int = ((x << 1) - _tmp2)
    val _tmp3: Int = ((x * x) >> 16)
    val _tmp4: Int = ((_tmp3 * x) >> 15)
    val _tmp5: Int = ((_tmp4 * x) >> 16)
    val _tmp6: Int = ((_tmp5 * x) >> 16)
    val _tmp8: Int = ((_tmp6 << 13) / _const1)
    val _tmp15: Int = ((_tmp7 + _tmp8) >> 1)
    val _tmp9: Int = ((x * x) >> 16)
    val _tmp10: Int = ((_tmp9 * x) >> 15)
    val _tmp11: Int = ((_tmp10 * x) >> 16)
    val _tmp12: Int = ((_tmp11 * x) >> 16)
    val _tmp13: Int = ((_tmp12 * x) >> 15)
    val _tmp14: Int = ((_tmp13 * x) >> 16)
    val _tmp16: Int = ((_tmp14 << 8) / _const2)
    (((_tmp15 << 1) - _tmp16) >> 1)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 0.000125)*/
  /*()*/
    def sine_fixed16_05(x : Int) : Long = {
    val _const0: Int = 49152
    val _const1: Int = 61440
    val _const2: Int = 40320
    val _tmp17: Int = ((x * x) >> 16)
    val _tmp18: Int = ((_tmp17 * x) >> 15)
    val _tmp19: Int = ((_tmp18 << 15) / _const0)
    val _tmp24: Int = ((x << 1) - _tmp19)
    val _tmp20: Int = ((x * x) >> 16)
    val _tmp21: Int = ((_tmp20 * x) >> 15)
    val _tmp22: Long = (((_tmp21 << 16).toLong * (x << 16).toLong) >> 32)
    val _tmp23: Long = ((_tmp22 * (x << 16).toLong) >> 32)
    val _tmp25: Long = ((_tmp23 << 29) / (_const1 << 16).toLong)
    val _tmp32: Long = (((_tmp24 << 16).toLong + _tmp25) >> 1)
    val _tmp26: Long = (((x << 16).toLong * (x << 16).toLong) >> 32)
    val _tmp27: Long = ((_tmp26 * (x << 16).toLong) >> 31)
    val _tmp28: Long = ((_tmp27 * (x << 16).toLong) >> 32)
    val _tmp29: Long = ((_tmp28 * (x << 16).toLong) >> 32)
    val _tmp30: Long = ((_tmp29 * (x << 16).toLong) >> 31)
    val _tmp31: Long = ((_tmp30 * (x << 16).toLong) >> 32)
    val _tmp33: Long = ((_tmp31 << 24) / (_const2 << 16).toLong)
    (((_tmp32 << 1) - _tmp33) >> 1)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 2.5e-05)*/
  /*()*/
    def sine_fixed16_01(x : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 4026531840l
    val _const2: Long = 2642411520l
    val _tmp34: Long = ((x * x) >> 32)
    val _tmp35: Long = ((_tmp34 * x) >> 31)
    val _tmp36: Long = ((_tmp35 << 31) / _const0)
    val _tmp41: Long = ((x << 1) - _tmp36)
    val _tmp37: Long = ((x * x) >> 32)
    val _tmp38: Long = ((_tmp37 * x) >> 31)
    val _tmp39: Long = ((_tmp38 * x) >> 32)
    val _tmp40: Long = ((_tmp39 * x) >> 32)
    val _tmp42: Long = ((_tmp40 << 29) / _const1)
    val _tmp49: Long = ((_tmp41 + _tmp42) >> 1)
    val _tmp43: Long = ((x * x) >> 32)
    val _tmp44: Long = ((_tmp43 * x) >> 31)
    val _tmp45: Long = ((_tmp44 * x) >> 32)
    val _tmp46: Long = ((_tmp45 * x) >> 32)
    val _tmp47: Long = ((_tmp46 * x) >> 31)
    val _tmp48: Long = ((_tmp47 * x) >> 32)
    val _tmp50: Long = ((_tmp48 << 24) / _const2)
    (((_tmp49 << 1) - _tmp50) >> 1)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 2.5e-06)*/
  /*()*/
    def sine_fixed16_001(x : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 4026531840l
    val _const2: Long = 2642411520l
    val _tmp51: Long = ((x * x) >> 32)
    val _tmp52: Long = ((_tmp51 * x) >> 31)
    val _tmp53: Long = ((_tmp52 << 31) / _const0)
    val _tmp58: Long = ((x << 1) - _tmp53)
    val _tmp54: Long = ((x * x) >> 32)
    val _tmp55: Long = ((_tmp54 * x) >> 31)
    val _tmp56: Long = ((_tmp55 * x) >> 32)
    val _tmp57: Long = ((_tmp56 * x) >> 32)
    val _tmp59: Long = ((_tmp57 << 29) / _const1)
    val _tmp66: Long = ((_tmp58 + _tmp59) >> 1)
    val _tmp60: Long = ((x * x) >> 32)
    val _tmp61: Long = ((_tmp60 * x) >> 31)
    val _tmp62: Long = ((_tmp61 * x) >> 32)
    val _tmp63: Long = ((_tmp62 * x) >> 32)
    val _tmp64: Long = ((_tmp63 * x) >> 31)
    val _tmp65: Long = ((_tmp64 * x) >> 32)
    val _tmp67: Long = ((_tmp65 << 24) / _const2)
    (((_tmp66 << 1) - _tmp67) >> 1)
  }

  /*@pre : ((x > -1.57079632679) && (x < 1.57079632679))*/
  /*@post: (res) => (res +/- 3.5e-09)*/
  /*()*/
    def sine_fixed32(x : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 4026531840l
    val _const2: Long = 2642411520l
    val _tmp68: Long = ((x * x) >> 32)
    val _tmp69: Long = ((_tmp68 * x) >> 31)
    val _tmp70: Long = ((_tmp69 << 31) / _const0)
    val _tmp75: Long = ((x << 1) - _tmp70)
    val _tmp71: Long = ((x * x) >> 32)
    val _tmp72: Long = ((_tmp71 * x) >> 31)
    val _tmp73: Long = ((_tmp72 * x) >> 32)
    val _tmp74: Long = ((_tmp73 * x) >> 32)
    val _tmp76: Long = ((_tmp74 << 29) / _const1)
    val _tmp83: Long = ((_tmp75 + _tmp76) >> 1)
    val _tmp77: Long = ((x * x) >> 32)
    val _tmp78: Long = ((_tmp77 * x) >> 31)
    val _tmp79: Long = ((_tmp78 * x) >> 32)
    val _tmp80: Long = ((_tmp79 * x) >> 32)
    val _tmp81: Long = ((_tmp80 * x) >> 31)
    val _tmp82: Long = ((_tmp81 * x) >> 32)
    val _tmp84: Long = ((_tmp82 << 24) / _const2)
    (((_tmp83 << 1) - _tmp84) >> 1)
  }

}
