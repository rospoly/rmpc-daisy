package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Traincar4_State9 {

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 0.005)*/
  /*()*/
    def train4_state9_fixed16(s0 : Int, s1 : Int, s2 : Int, s3 : Int, s4 : Int, s5 : Int, s6 : Int, s7 : Int, s8 : Int, y0 : Int, y1 : Int, y2 : Int, y3 : Int, y4 : Int) : Int = {
    val _const0: Int = -1
    val _const1: Int = -1
    val _const2: Int = 0
    val _const3: Int = 1
    val _const4: Int = 0
    val _const5: Int = -1
    val _const6: Int = 0
    val _const7: Int = 2
    val _const8: Int = 65532
    val _const9: Int = -1
    val _const10: Int = 0
    val _const11: Int = -1
    val _const12: Int = -3
    val _const13: Int = 4
    val _const14: Int = 0
    val _tmp: Int = ((_const0 * s0) >> 13)
    val _tmp1: Int = ((_const1 * s1) >> 13)
    val _tmp2: Int = (_tmp + _tmp1)
    val _tmp3: Int = ((_const2 * s2) >> 13)
    val _tmp4: Int = (_tmp2 + _tmp3)
    val _tmp5: Int = ((_const3 * s3) >> 13)
    val _tmp6: Int = (_tmp4 + _tmp5)
    val _tmp7: Int = ((_const4 * s4) >> 12)
    val _tmp8: Int = (_tmp6 + _tmp7)
    val _tmp9: Int = ((_const5 * s5) >> 12)
    val _tmp10: Int = (_tmp8 + _tmp9)
    val _tmp11: Int = ((_const6 * s6) >> 12)
    val _tmp12: Int = (_tmp10 + _tmp11)
    val _tmp13: Int = ((_const7 * s7) >> 12)
    val _tmp14: Int = (_tmp12 + _tmp13)
    val _tmp15: Int = ((_const8 * s8) >> 16)
    val _tmp16: Int = ((_tmp14 + (_tmp15 << 4)) >> 4)
    val _tmp17: Int = ((_const9 * y0) >> 12)
    val _tmp18: Int = (((_tmp16 << 4) + _tmp17) >> 4)
    val _tmp19: Int = ((_const10 * y1) >> 12)
    val _tmp20: Int = (((_tmp18 << 4) + _tmp19) >> 4)
    val _tmp21: Int = ((_const11 * y2) >> 12)
    val _tmp22: Int = (((_tmp20 << 4) + _tmp21) >> 4)
    val _tmp23: Int = ((_const12 * y3) >> 12)
    val _tmp24: Int = (((_tmp22 << 4) + _tmp23) >> 4)
    val _tmp25: Int = ((_const13 * y4) >> 12)
    val _tmp26: Int = (((_tmp24 << 4) + _tmp25) >> 4)
    (((_tmp26 << 4) + _const14) >> 4)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 0.0025)*/
  /*()*/
    def train4_state9_fixed16_05(s0 : Long, s1 : Long, s2 : Long, s3 : Long, s4 : Long, s5 : Long, s6 : Long, s7 : Long, s8 : Long, y0 : Long, y1 : Long, y2 : Long, y3 : Long, y4 : Long) : Int = {
    val _const0: Long = -8l
    val _const1: Long = -30l
    val _const2: Long = 82l
    val _const3: Long = 33519l
    val _const4: Long = 21540l
    val _const5: Long = -20356l
    val _const6: Long = 1849l
    val _const7: Long = 144002l
    val _const8: Long = 4294683828l
    val _const9: Long = -21546l
    val _const10: Long = 20273l
    val _const11: Long = -1786l
    val _const12: Long = -139185l
    val _const13: Long = 279118l
    val _const14: Int = 0
    val _tmp27: Int = (((_const0 * s0) >> 29) >> 16).toInt
    val _tmp28: Int = (((_const1 * s1) >> 29) >> 16).toInt
    val _tmp29: Int = (_tmp27 + _tmp28)
    val _tmp30: Int = (((_const2 * s2) >> 29) >> 16).toInt
    val _tmp31: Int = (_tmp29 + _tmp30)
    val _tmp32: Int = (((_const3 * s3) >> 29) >> 16).toInt
    val _tmp33: Int = (_tmp31 + _tmp32)
    val _tmp34: Int = (((_const4 * s4) >> 28) >> 16).toInt
    val _tmp35: Int = (_tmp33 + _tmp34)
    val _tmp36: Int = (((_const5 * s5) >> 28) >> 16).toInt
    val _tmp37: Int = (_tmp35 + _tmp36)
    val _tmp38: Int = (((_const6 * s6) >> 28) >> 16).toInt
    val _tmp39: Int = (_tmp37 + _tmp38)
    val _tmp40: Int = (((_const7 * s7) >> 28) >> 16).toInt
    val _tmp41: Int = (_tmp39 + _tmp40)
    val _tmp42: Int = (((_const8 * s8) >> 32) >> 16).toInt
    val _tmp43: Int = ((_tmp41 + (_tmp42 << 4)) >> 4)
    val _tmp44: Int = (((_const9 * y0) >> 28) >> 16).toInt
    val _tmp45: Int = (((_tmp43 << 4) + _tmp44) >> 4)
    val _tmp46: Int = (((_const10 * y1) >> 28) >> 16).toInt
    val _tmp47: Int = (((_tmp45 << 4) + _tmp46) >> 4)
    val _tmp48: Int = (((_const11 * y2) >> 28) >> 16).toInt
    val _tmp49: Int = (((_tmp47 << 4) + _tmp48) >> 4)
    val _tmp50: Int = (((_const12 * y3) >> 28) >> 16).toInt
    val _tmp51: Int = (((_tmp49 << 4) + _tmp50) >> 4)
    val _tmp52: Int = (((_const13 * y4) >> 28) >> 16).toInt
    val _tmp53: Int = (((_tmp51 << 4) + _tmp52) >> 4)
    (((_tmp53 << 4) + _const14) >> 4)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 0.0005)*/
  /*Abs error: -, Range: -*/
    def train4_state9_fixed16_01(s0 : Long, s1 : Long, s2 : Long, s3 : Long, s4 : Long, s5 : Long, s6 : Long, s7 : Long, s8 : Long, y0 : Long, y1 : Long, y2 : Long, y3 : Long, y4 : Long) : Long = {
    val _const0: Long = -8l
    val _const1: Long = -30l
    val _const2: Long = 82l
    val _const3: Long = 33519l
    val _const4: Long = 21540l
    val _const5: Long = -20356l
    val _const6: Long = 1849l
    val _const7: Long = 144002l
    val _const8: Long = 4294683828l
    val _const9: Long = -21546l
    val _const10: Long = 20273l
    val _const11: Long = -1786l
    val _const12: Long = -139185l
    val _const13: Long = 279118l
    val _const14: Int = 0
    val _tmp54: Int = (((_const0 * s0) >> 29) >> 16).toInt
    val _tmp55: Int = (((_const1 * s1) >> 29) >> 16).toInt
    val _tmp56: Int = (_tmp54 + _tmp55)
    val _tmp57: Int = (((_const2 * s2) >> 29) >> 16).toInt
    val _tmp58: Int = (_tmp56 + _tmp57)
    val _tmp59: Int = (((_const3 * s3) >> 29) >> 16).toInt
    val _tmp60: Int = (_tmp58 + _tmp59)
    val _tmp61: Int = (((_const4 * s4) >> 28) >> 16).toInt
    val _tmp62: Int = (_tmp60 + _tmp61)
    val _tmp63: Int = (((_const5 * s5) >> 28) >> 16).toInt
    val _tmp64: Int = (_tmp62 + _tmp63)
    val _tmp65: Int = (((_const6 * s6) >> 28) >> 16).toInt
    val _tmp66: Int = (_tmp64 + _tmp65)
    val _tmp67: Long = ((_const7 * s7) >> 28)
    val _tmp68: Long = ((_tmp66 << 16).toLong + _tmp67)
    val _tmp69: Long = ((_const8 * s8) >> 32)
    val _tmp70: Long = ((_tmp68 + (_tmp69 << 4)) >> 4)
    val _tmp71: Long = ((_const9 * y0) >> 28)
    val _tmp72: Long = (((_tmp70 << 4) + _tmp71) >> 4)
    val _tmp73: Long = ((_const10 * y1) >> 28)
    val _tmp74: Long = (((_tmp72 << 4) + _tmp73) >> 4)
    val _tmp75: Long = ((_const11 * y2) >> 28)
    val _tmp76: Long = (((_tmp74 << 4) + _tmp75) >> 4)
    val _tmp77: Long = ((_const12 * y3) >> 28)
    val _tmp78: Long = (((_tmp76 << 4) + _tmp77) >> 4)
    val _tmp79: Long = ((_const13 * y4) >> 28)
    val _tmp80: Long = (((_tmp78 << 4) + _tmp79) >> 4)
    (_tmp80 + (_const14 << 12))
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 5.e-05)*/
  /*()*/
    def train4_state9_fixed16_001(s0 : Long, s1 : Long, s2 : Long, s3 : Long, s4 : Long, s5 : Long, s6 : Long, s7 : Long, s8 : Long, y0 : Long, y1 : Long, y2 : Long, y3 : Long, y4 : Long) : Long = {
    val _const0: Long = -8l
    val _const1: Long = -30l
    val _const2: Long = 82l
    val _const3: Long = 33519l
    val _const4: Long = 21540l
    val _const5: Long = -20356l
    val _const6: Long = 1849l
    val _const7: Long = 144002l
    val _const8: Long = 4294683828l
    val _const9: Long = -21546l
    val _const10: Long = 20273l
    val _const11: Long = -1786l
    val _const12: Long = -139185l
    val _const13: Long = 279118l
    val _const14: Long = 32l
    val _tmp81: Long = ((_const0 * s0) >> 29)
    val _tmp82: Long = ((_const1 * s1) >> 29)
    val _tmp83: Long = (_tmp81 + _tmp82)
    val _tmp84: Long = ((_const2 * s2) >> 29)
    val _tmp85: Long = (_tmp83 + _tmp84)
    val _tmp86: Long = ((_const3 * s3) >> 29)
    val _tmp87: Int = ((_tmp85 + _tmp86) >> 16).toInt
    val _tmp88: Int = (((_const4 * s4) >> 28) >> 16).toInt
    val _tmp89: Int = (_tmp87 + _tmp88)
    val _tmp90: Long = ((_const5 * s5) >> 28)
    val _tmp91: Long = ((_tmp89 << 16).toLong + _tmp90)
    val _tmp92: Long = ((_const6 * s6) >> 28)
    val _tmp93: Long = (_tmp91 + _tmp92)
    val _tmp94: Long = ((_const7 * s7) >> 28)
    val _tmp95: Long = (_tmp93 + _tmp94)
    val _tmp96: Long = ((_const8 * s8) >> 32)
    val _tmp97: Long = ((_tmp95 + (_tmp96 << 4)) >> 4)
    val _tmp98: Long = ((_const9 * y0) >> 28)
    val _tmp99: Long = (((_tmp97 << 4) + _tmp98) >> 4)
    val _tmp100: Long = ((_const10 * y1) >> 28)
    val _tmp101: Long = (((_tmp99 << 4) + _tmp100) >> 4)
    val _tmp102: Long = ((_const11 * y2) >> 28)
    val _tmp103: Long = (((_tmp101 << 4) + _tmp102) >> 4)
    val _tmp104: Long = ((_const12 * y3) >> 28)
    val _tmp105: Long = (((_tmp103 << 4) + _tmp104) >> 4)
    val _tmp106: Long = ((_const13 * y4) >> 28)
    val _tmp107: Long = (((_tmp105 << 4) + _tmp106) >> 4)
    (((_tmp107 << 4) + _const14) >> 4)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 7.5e-08)*/
  /*()*/
    def train4_state9_fixed32(s0 : Long, s1 : Long, s2 : Long, s3 : Long, s4 : Long, s5 : Long, s6 : Long, s7 : Long, s8 : Long, y0 : Long, y1 : Long, y2 : Long, y3 : Long, y4 : Long) : Long = {
    val _const0: Long = -8l
    val _const1: Long = -30l
    val _const2: Long = 82l
    val _const3: Long = 33519l
    val _const4: Long = 21540l
    val _const5: Long = -20356l
    val _const6: Long = 1849l
    val _const7: Long = 144002l
    val _const8: Long = 4294683828l
    val _const9: Long = -21546l
    val _const10: Long = 20273l
    val _const11: Long = -1786l
    val _const12: Long = -139185l
    val _const13: Long = 279118l
    val _const14: Long = 32l
    val _tmp108: Long = ((_const0 * s0) >> 29)
    val _tmp109: Long = ((_const1 * s1) >> 29)
    val _tmp110: Long = (_tmp108 + _tmp109)
    val _tmp111: Long = ((_const2 * s2) >> 29)
    val _tmp112: Long = (_tmp110 + _tmp111)
    val _tmp113: Long = ((_const3 * s3) >> 29)
    val _tmp114: Long = (_tmp112 + _tmp113)
    val _tmp115: Long = ((_const4 * s4) >> 28)
    val _tmp116: Long = (_tmp114 + _tmp115)
    val _tmp117: Long = ((_const5 * s5) >> 28)
    val _tmp118: Long = (_tmp116 + _tmp117)
    val _tmp119: Long = ((_const6 * s6) >> 28)
    val _tmp120: Long = (_tmp118 + _tmp119)
    val _tmp121: Long = ((_const7 * s7) >> 28)
    val _tmp122: Long = (_tmp120 + _tmp121)
    val _tmp123: Long = ((_const8 * s8) >> 32)
    val _tmp124: Long = ((_tmp122 + (_tmp123 << 4)) >> 4)
    val _tmp125: Long = ((_const9 * y0) >> 28)
    val _tmp126: Long = (((_tmp124 << 4) + _tmp125) >> 4)
    val _tmp127: Long = ((_const10 * y1) >> 28)
    val _tmp128: Long = (((_tmp126 << 4) + _tmp127) >> 4)
    val _tmp129: Long = ((_const11 * y2) >> 28)
    val _tmp130: Long = (((_tmp128 << 4) + _tmp129) >> 4)
    val _tmp131: Long = ((_const12 * y3) >> 28)
    val _tmp132: Long = (((_tmp130 << 4) + _tmp131) >> 4)
    val _tmp133: Long = ((_const13 * y4) >> 28)
    val _tmp134: Long = (((_tmp132 << 4) + _tmp133) >> 4)
    (((_tmp134 << 4) + _const14) >> 4)
  }

}
