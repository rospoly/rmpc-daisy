package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Kepler1 {

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 0.15)*/
  /*()*/
    def kepler1_fixed16(x1 : Int, x2 : Int, x3 : Int, x4 : Int) : Int = {
    val _tmp3: Int = ((x1 * x4) >> 16)
    val _tmp: Int = -(x1)
    val _tmp1: Int = ((_tmp + x2) << 1)
    val _tmp2: Int = ((_tmp1 + (x3 << 1)) >> 2)
    val _tmp4: Int = ((_tmp2 << 1) - x4)
    val _tmp8: Int = ((_tmp3 * _tmp4) >> 15)
    val _tmp5: Int = ((x1 - x2) << 1)
    val _tmp6: Int = ((_tmp5 + (x3 << 1)) >> 2)
    val _tmp7: Int = (((_tmp6 << 1) + x4) >> 1)
    val _tmp9: Int = ((x2 * _tmp7) >> 16)
    val _tmp13: Int = (((_tmp8 << 1) + _tmp9) >> 1)
    val _tmp10: Int = ((x1 + x2) >> 1)
    val _tmp11: Int = (((_tmp10 << 1) - x3) >> 1)
    val _tmp12: Int = (((_tmp11 << 1) + x4) >> 1)
    val _tmp14: Int = ((x3 * _tmp12) >> 16)
    val _tmp16: Int = (((_tmp13 << 1) + _tmp14) >> 1)
    val _tmp15: Int = ((x2 * x3) >> 16)
    val _tmp17: Int = ((_tmp15 * x4) >> 16)
    val _tmp18: Int = (_tmp16 - (_tmp17 << 1))
    val _tmp19: Int = ((x1 * x3) >> 16)
    val _tmp20: Int = (((_tmp18 << 2) - _tmp19) >> 2)
    val _tmp21: Int = ((x1 * x2) >> 16)
    val _tmp22: Int = (((_tmp20 << 2) - _tmp21) >> 2)
    (((_tmp22 << 5) - x4) >> 5)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 0.075)*/
  /*Abs error: -, Range: -*/
    def kepler1_fixed16_05(x1 : Int, x2 : Int, x3 : Int, x4 : Int) : Long = {
    val _tmp26: Int = ((x1 * x4) >> 16)
    val _tmp23: Int = -(x1)
    val _tmp24: Int = ((_tmp23 + x2) << 1)
    val _tmp25: Int = ((_tmp24 + (x3 << 1)) >> 2)
    val _tmp27: Int = ((_tmp25 << 1) - x4)
    val _tmp31: Int = ((_tmp26 * _tmp27) >> 15)
    val _tmp28: Int = ((x1 - x2) << 1)
    val _tmp29: Int = ((_tmp28 + (x3 << 1)) >> 2)
    val _tmp30: Int = (((_tmp29 << 1) + x4) >> 1)
    val _tmp32: Long = (((x2 << 16).toLong * (_tmp30 << 16).toLong) >> 32)
    val _tmp36: Long = ((((_tmp31 << 16).toLong << 1) + _tmp32) >> 1)
    val _tmp33: Long = (((x1 << 16).toLong + (x2 << 16).toLong) >> 1)
    val _tmp34: Long = (((_tmp33 << 1) - (x3 << 16).toLong) >> 1)
    val _tmp35: Long = (((_tmp34 << 1) + (x4 << 16).toLong) >> 1)
    val _tmp37: Long = (((x3 << 16).toLong * _tmp35) >> 32)
    val _tmp39: Long = (((_tmp36 << 1) + _tmp37) >> 1)
    val _tmp38: Long = (((x2 << 16).toLong * (x3 << 16).toLong) >> 32)
    val _tmp40: Long = ((_tmp38 * (x4 << 16).toLong) >> 32)
    val _tmp41: Long = ((_tmp39 - (_tmp40 << 1)) >> 1)
    val _tmp42: Long = (((x1 << 16).toLong * (x3 << 16).toLong) >> 32)
    val _tmp43: Long = (((_tmp41 << 3) - _tmp42) >> 3)
    val _tmp44: Long = (((x1 << 16).toLong * (x2 << 16).toLong) >> 32)
    val _tmp45: Long = (((_tmp43 << 3) - _tmp44) >> 3)
    (_tmp45 - (x4 << 10))
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 0.015)*/
  /*()*/
    def kepler1_fixed16_01(x1 : Int, x2 : Long, x3 : Long, x4 : Long) : Long = {
    val _tmp49: Long = (((x1 << 16).toLong * x4) >> 32)
    val _tmp46: Long = -(x1)
    val _tmp47: Long = ((_tmp46 + x2) << 1)
    val _tmp48: Long = ((_tmp47 + (x3 << 1)) >> 2)
    val _tmp50: Long = ((_tmp48 << 1) - x4)
    val _tmp54: Long = ((_tmp49 * _tmp50) >> 31)
    val _tmp51: Long = (((x1 << 16).toLong - x2) << 1)
    val _tmp52: Long = ((_tmp51 + (x3 << 1)) >> 2)
    val _tmp53: Long = (((_tmp52 << 1) + x4) >> 1)
    val _tmp55: Long = ((x2 * _tmp53) >> 32)
    val _tmp59: Long = (((_tmp54 << 1) + _tmp55) >> 1)
    val _tmp56: Long = (((x1 << 16).toLong + x2) >> 1)
    val _tmp57: Long = (((_tmp56 << 1) - x3) >> 1)
    val _tmp58: Long = (((_tmp57 << 1) + x4) >> 1)
    val _tmp60: Long = ((x3 * _tmp58) >> 32)
    val _tmp62: Long = (((_tmp59 << 1) + _tmp60) >> 1)
    val _tmp61: Long = ((x2 * x3) >> 32)
    val _tmp63: Long = ((_tmp61 * x4) >> 32)
    val _tmp64: Long = ((_tmp62 - (_tmp63 << 1)) >> 1)
    val _tmp65: Long = (((x1 << 16).toLong * x3) >> 32)
    val _tmp66: Long = (((_tmp64 << 3) - _tmp65) >> 3)
    val _tmp67: Long = (((x1 << 16).toLong * x2) >> 32)
    val _tmp68: Long = (((_tmp66 << 3) - _tmp67) >> 3)
    (((_tmp68 << 6) - x4) >> 6)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 0.0015)*/
  /*()*/
    def kepler1_fixed16_001(x1 : Long, x2 : Long, x3 : Long, x4 : Long) : Long = {
    val _tmp72: Long = ((x1 * x4) >> 32)
    val _tmp69: Long = -(x1)
    val _tmp70: Long = ((_tmp69 + x2) << 1)
    val _tmp71: Long = ((_tmp70 + (x3 << 1)) >> 2)
    val _tmp73: Long = ((_tmp71 << 1) - x4)
    val _tmp77: Long = ((_tmp72 * _tmp73) >> 31)
    val _tmp74: Long = ((x1 - x2) << 1)
    val _tmp75: Long = ((_tmp74 + (x3 << 1)) >> 2)
    val _tmp76: Long = (((_tmp75 << 1) + x4) >> 1)
    val _tmp78: Long = ((x2 * _tmp76) >> 32)
    val _tmp82: Long = (((_tmp77 << 1) + _tmp78) >> 1)
    val _tmp79: Long = ((x1 + x2) >> 1)
    val _tmp80: Long = (((_tmp79 << 1) - x3) >> 1)
    val _tmp81: Long = (((_tmp80 << 1) + x4) >> 1)
    val _tmp83: Long = ((x3 * _tmp81) >> 32)
    val _tmp85: Long = (((_tmp82 << 1) + _tmp83) >> 1)
    val _tmp84: Long = ((x2 * x3) >> 32)
    val _tmp86: Long = ((_tmp84 * x4) >> 32)
    val _tmp87: Long = ((_tmp85 - (_tmp86 << 1)) >> 1)
    val _tmp88: Long = ((x1 * x3) >> 32)
    val _tmp89: Long = (((_tmp87 << 3) - _tmp88) >> 3)
    val _tmp90: Long = ((x1 * x2) >> 32)
    val _tmp91: Long = (((_tmp89 << 3) - _tmp90) >> 3)
    (((_tmp91 << 6) - x4) >> 6)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 2.e-06)*/
  /*()*/
    def kepler1_fixed32(x1 : Long, x2 : Long, x3 : Long, x4 : Long) : Long = {
    val _tmp95: Long = ((x1 * x4) >> 32)
    val _tmp92: Long = -(x1)
    val _tmp93: Long = ((_tmp92 + x2) << 1)
    val _tmp94: Long = ((_tmp93 + (x3 << 1)) >> 2)
    val _tmp96: Long = ((_tmp94 << 1) - x4)
    val _tmp100: Long = ((_tmp95 * _tmp96) >> 31)
    val _tmp97: Long = ((x1 - x2) << 1)
    val _tmp98: Long = ((_tmp97 + (x3 << 1)) >> 2)
    val _tmp99: Long = (((_tmp98 << 1) + x4) >> 1)
    val _tmp101: Long = ((x2 * _tmp99) >> 32)
    val _tmp105: Long = (((_tmp100 << 1) + _tmp101) >> 1)
    val _tmp102: Long = ((x1 + x2) >> 1)
    val _tmp103: Long = (((_tmp102 << 1) - x3) >> 1)
    val _tmp104: Long = (((_tmp103 << 1) + x4) >> 1)
    val _tmp106: Long = ((x3 * _tmp104) >> 32)
    val _tmp108: Long = (((_tmp105 << 1) + _tmp106) >> 1)
    val _tmp107: Long = ((x2 * x3) >> 32)
    val _tmp109: Long = ((_tmp107 * x4) >> 32)
    val _tmp110: Long = ((_tmp108 - (_tmp109 << 1)) >> 1)
    val _tmp111: Long = ((x1 * x3) >> 32)
    val _tmp112: Long = (((_tmp110 << 3) - _tmp111) >> 3)
    val _tmp113: Long = ((x1 * x2) >> 32)
    val _tmp114: Long = (((_tmp112 << 3) - _tmp113) >> 3)
    (((_tmp114 << 6) - x4) >> 6)
  }

}
