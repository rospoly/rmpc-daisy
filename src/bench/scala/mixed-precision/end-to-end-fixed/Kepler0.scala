package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Kepler0 {

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 0.025)*/
  /*()*/
    def kepler0_fixed16(x1 : Int, x2 : Int, x3 : Int, x4 : Int, x5 : Int, x6 : Int) : Int = {
    val _tmp: Int = ((x2 * x5) >> 16)
    val _tmp1: Int = ((x3 * x6) >> 16)
    val _tmp2: Int = ((_tmp + _tmp1) >> 1)
    val _tmp3: Int = ((x2 * x3) >> 16)
    val _tmp4: Int = ((_tmp2 << 1) - _tmp3)
    val _tmp5: Int = ((x5 * x6) >> 16)
    val _tmp12: Int = ((_tmp4 - _tmp5) << 3)
    val _tmp6: Int = -(x1)
    val _tmp7: Int = ((_tmp6 + x2) << 1)
    val _tmp8: Int = ((_tmp7 + (x3 << 1)) >> 2)
    val _tmp9: Int = ((_tmp8 << 1) - x4)
    val _tmp10: Int = ((_tmp9 + x5) >> 1)
    val _tmp11: Int = (((_tmp10 << 1) + x6) >> 2)
    val _tmp13: Int = ((x1 * _tmp11) >> 15)
    ((_tmp12 + (_tmp13 << 4)) >> 4)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 0.0125)*/
  /*()*/
    def kepler0_fixed16_05(x1 : Int, x2 : Int, x3 : Int, x4 : Int, x5 : Int, x6 : Int) : Long = {
    val _tmp14: Int = ((x2 * x5) >> 16)
    val _tmp15: Int = ((x3 * x6) >> 16)
    val _tmp16: Int = ((_tmp14 + _tmp15) >> 1)
    val _tmp17: Int = ((x2 * x3) >> 16)
    val _tmp18: Long = (((_tmp16 << 16).toLong << 1) - (_tmp17 << 16).toLong)
    val _tmp19: Long = (((x5 << 16).toLong * (x6 << 16).toLong) >> 32)
    val _tmp26: Long = ((_tmp18 - _tmp19) << 3)
    val _tmp20: Long = -(x1)
    val _tmp21: Long = ((_tmp20 + (x2 << 16).toLong) << 1)
    val _tmp22: Long = ((_tmp21 + ((x3 << 16).toLong << 1)) >> 2)
    val _tmp23: Long = ((_tmp22 << 1) - (x4 << 16).toLong)
    val _tmp24: Long = ((_tmp23 + (x5 << 16).toLong) >> 1)
    val _tmp25: Long = (((_tmp24 << 1) + (x6 << 16).toLong) >> 2)
    val _tmp27: Long = (((x1 << 16).toLong * _tmp25) >> 31)
    ((_tmp26 + (_tmp27 << 4)) >> 4)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 0.0025)*/
  /*()*/
    def kepler0_fixed16_01(x1 : Int, x2 : Long, x3 : Long, x4 : Long, x5 : Long, x6 : Long) : Long = {
    val _tmp28: Long = ((x2 * x5) >> 32)
    val _tmp29: Long = ((x3 * x6) >> 32)
    val _tmp30: Long = ((_tmp28 + _tmp29) >> 1)
    val _tmp31: Long = ((x2 * x3) >> 32)
    val _tmp32: Long = ((_tmp30 << 1) - _tmp31)
    val _tmp33: Long = ((x5 * x6) >> 32)
    val _tmp40: Long = ((_tmp32 - _tmp33) << 3)
    val _tmp34: Long = -(x1)
    val _tmp35: Long = ((_tmp34 + x2) << 1)
    val _tmp36: Long = ((_tmp35 + (x3 << 1)) >> 2)
    val _tmp37: Long = ((_tmp36 << 1) - x4)
    val _tmp38: Long = ((_tmp37 + x5) >> 1)
    val _tmp39: Long = (((_tmp38 << 1) + x6) >> 2)
    val _tmp41: Long = (((x1 << 16).toLong * _tmp39) >> 31)
    ((_tmp40 + (_tmp41 << 4)) >> 4)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 0.00025)*/
  /*()*/
    def kepler0_fixed16_001(x1 : Long, x2 : Long, x3 : Long, x4 : Long, x5 : Long, x6 : Long) : Long = {
    val _tmp42: Long = ((x2 * x5) >> 32)
    val _tmp43: Long = ((x3 * x6) >> 32)
    val _tmp44: Long = ((_tmp42 + _tmp43) >> 1)
    val _tmp45: Long = ((x2 * x3) >> 32)
    val _tmp46: Long = ((_tmp44 << 1) - _tmp45)
    val _tmp47: Long = ((x5 * x6) >> 32)
    val _tmp54: Long = ((_tmp46 - _tmp47) << 3)
    val _tmp48: Long = -(x1)
    val _tmp49: Long = ((_tmp48 + x2) << 1)
    val _tmp50: Long = ((_tmp49 + (x3 << 1)) >> 2)
    val _tmp51: Long = ((_tmp50 << 1) - x4)
    val _tmp52: Long = ((_tmp51 + x5) >> 1)
    val _tmp53: Long = (((_tmp52 << 1) + x6) >> 2)
    val _tmp55: Long = ((x1 * _tmp53) >> 31)
    ((_tmp54 + (_tmp55 << 4)) >> 4)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 4.e-07)*/
  /*()*/
    def kepler0_fixed32(x1 : Long, x2 : Long, x3 : Long, x4 : Long, x5 : Long, x6 : Long) : Long = {
    val _tmp56: Long = ((x2 * x5) >> 32)
    val _tmp57: Long = ((x3 * x6) >> 32)
    val _tmp58: Long = ((_tmp56 + _tmp57) >> 1)
    val _tmp59: Long = ((x2 * x3) >> 32)
    val _tmp60: Long = ((_tmp58 << 1) - _tmp59)
    val _tmp61: Long = ((x5 * x6) >> 32)
    val _tmp68: Long = ((_tmp60 - _tmp61) << 3)
    val _tmp62: Long = -(x1)
    val _tmp63: Long = ((_tmp62 + x2) << 1)
    val _tmp64: Long = ((_tmp63 + (x3 << 1)) >> 2)
    val _tmp65: Long = ((_tmp64 << 1) - x4)
    val _tmp66: Long = ((_tmp65 + x5) >> 1)
    val _tmp67: Long = (((_tmp66 << 1) + x6) >> 2)
    val _tmp69: Long = ((x1 * _tmp67) >> 31)
    ((_tmp68 + (_tmp69 << 4)) >> 4)
  }

}
