package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Sqrt {

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 0.3)*/
  /*()*/
    def sqroot_fixed16(x : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 32768
    val _const2: Int = 8192
    val _const3: Int = 4096
    val _const4: Int = 2560
    val _tmp: Int = ((_const0 * x) >> 15)
    val _tmp2: Int = ((_const1 + (_tmp << 2)) >> 2)
    val _tmp1: Int = ((_const2 * x) >> 13)
    val _tmp3: Int = ((_tmp1 * x) >> 15)
    val _tmp6: Int = (_tmp2 - (_tmp3 << 1))
    val _tmp4: Int = ((_const3 * x) >> 12)
    val _tmp5: Int = ((_tmp4 * x) >> 15)
    val _tmp7: Int = ((_tmp5 * x) >> 15)
    val _tmp11: Int = ((_tmp6 + (_tmp7 << 3)) >> 3)
    val _tmp8: Int = ((_const4 * x) >> 12)
    val _tmp9: Int = ((_tmp8 * x) >> 14)
    val _tmp10: Int = ((_tmp9 * x) >> 16)
    val _tmp12: Int = ((_tmp10 * x) >> 15)
    ((_tmp11 - (_tmp12 << 3)) >> 3)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 0.15)*/
  /*()*/
    def sqroot_fixed16_05(x : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 32768
    val _const2: Int = 8192
    val _const3: Long = 268435456l
    val _const4: Long = 167772160l
    val _tmp13: Long = (((_const0 << 16).toLong * (x << 16).toLong) >> 31)
    val _tmp15: Long = (((_const1 << 16).toLong + (_tmp13 << 2)) >> 2)
    val _tmp14: Long = (((_const2 << 16).toLong * (x << 16).toLong) >> 29)
    val _tmp16: Int = (((_tmp14 * (x << 16).toLong) >> 31) >> 16).toInt
    val _tmp19: Int = ((_tmp15 - ((_tmp16 << 16).toLong << 1)) >> 16).toInt
    val _tmp17: Int = (((_const3 * (x << 16).toLong) >> 28) >> 16).toInt
    val _tmp18: Int = ((_tmp17 * x) >> 15)
    val _tmp20: Int = ((_tmp18 * x) >> 15)
    val _tmp24: Int = ((_tmp19 + (_tmp20 << 3)) >> 3)
    val _tmp21: Int = (((_const4 * (x << 16).toLong) >> 28) >> 16).toInt
    val _tmp22: Int = ((_tmp21 * x) >> 14)
    val _tmp23: Int = ((_tmp22 * x) >> 16)
    val _tmp25: Int = ((_tmp23 * x) >> 15)
    ((_tmp24 - (_tmp25 << 3)) >> 3)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 0.03)*/
  /*()*/
    def sqroot_fixed16_01(x : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 2147483648l
    val _const2: Long = 536870912l
    val _const3: Long = 268435456l
    val _const4: Long = 167772160l
    val _tmp26: Long = ((_const0 * x) >> 31)
    val _tmp28: Long = ((_const1 + (_tmp26 << 2)) >> 2)
    val _tmp27: Long = ((_const2 * x) >> 29)
    val _tmp29: Long = ((_tmp27 * x) >> 31)
    val _tmp32: Long = (_tmp28 - (_tmp29 << 1))
    val _tmp30: Long = ((_const3 * x) >> 28)
    val _tmp31: Long = ((_tmp30 * x) >> 31)
    val _tmp33: Long = ((_tmp31 * x) >> 31)
    val _tmp37: Long = ((_tmp32 + (_tmp33 << 3)) >> 3)
    val _tmp34: Long = ((_const4 * x) >> 28)
    val _tmp35: Long = ((_tmp34 * x) >> 30)
    val _tmp36: Long = ((_tmp35 * x) >> 32)
    val _tmp38: Long = ((_tmp36 * x) >> 31)
    ((_tmp37 - (_tmp38 << 3)) >> 3)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 0.003)*/
  /*()*/
    def sqroot_fixed16_001(x : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 2147483648l
    val _const2: Long = 536870912l
    val _const3: Long = 268435456l
    val _const4: Long = 167772160l
    val _tmp39: Long = ((_const0 * x) >> 31)
    val _tmp41: Long = ((_const1 + (_tmp39 << 2)) >> 2)
    val _tmp40: Long = ((_const2 * x) >> 29)
    val _tmp42: Long = ((_tmp40 * x) >> 31)
    val _tmp45: Long = (_tmp41 - (_tmp42 << 1))
    val _tmp43: Long = ((_const3 * x) >> 28)
    val _tmp44: Long = ((_tmp43 * x) >> 31)
    val _tmp46: Long = ((_tmp44 * x) >> 31)
    val _tmp50: Long = ((_tmp45 + (_tmp46 << 3)) >> 3)
    val _tmp47: Long = ((_const4 * x) >> 28)
    val _tmp48: Long = ((_tmp47 * x) >> 30)
    val _tmp49: Long = ((_tmp48 * x) >> 32)
    val _tmp51: Long = ((_tmp49 * x) >> 31)
    ((_tmp50 - (_tmp51 << 3)) >> 3)
  }

  /*@pre : ((x >= 0.) && (x < 10.))*/
  /*@post: (res) => (res +/- 4.e-06)*/
  /*()*/
    def sqroot_fixed32(x : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 2147483648l
    val _const2: Long = 536870912l
    val _const3: Long = 268435456l
    val _const4: Long = 167772160l
    val _tmp52: Long = ((_const0 * x) >> 31)
    val _tmp54: Long = ((_const1 + (_tmp52 << 2)) >> 2)
    val _tmp53: Long = ((_const2 * x) >> 29)
    val _tmp55: Long = ((_tmp53 * x) >> 31)
    val _tmp58: Long = (_tmp54 - (_tmp55 << 1))
    val _tmp56: Long = ((_const3 * x) >> 28)
    val _tmp57: Long = ((_tmp56 * x) >> 31)
    val _tmp59: Long = ((_tmp57 * x) >> 31)
    val _tmp63: Long = ((_tmp58 + (_tmp59 << 3)) >> 3)
    val _tmp60: Long = ((_const4 * x) >> 28)
    val _tmp61: Long = ((_tmp60 * x) >> 30)
    val _tmp62: Long = ((_tmp61 * x) >> 32)
    val _tmp64: Long = ((_tmp62 * x) >> 31)
    ((_tmp63 - (_tmp64 << 3)) >> 3)
  }

}
