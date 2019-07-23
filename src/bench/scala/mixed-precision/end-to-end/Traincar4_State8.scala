package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Traincar4_State8 {

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 5.5e-06)*/
  /*Abs error: -, Range: -*/
    def train4_state8_32(s0 : Float, s1 : Float, s2 : Float, s3 : Float, s4 : Float, s5 : Float, s6 : Float, s7 : Float, s8 : Float, y0 : Float, y1 : Float, y2 : Float, y3 : Float, y4 : Float) : Float = {
    val _const0: Float = 2.5093E-10f
    val _const1: Float = 9.15884E-10f
    val _const2: Float = 7.81656E-6f
    val _const3: Float = -7.81701E-6f
    val _const4: Float = -6.54335E-7f
    val _const5: Float = 6.87341E-6f
    val _const6: Float = 1.00368E-5f
    val _const7: Float = 0.999907f
    val _const8: Float = 3.32876E-5f
    val _const9: Float = 6.5448232E-7f
    val _const10: Float = -6.8708837E-6f
    val _const11: Float = -8.9460042E-6f
    val _const12: Float = -9.65830567023206E-10f
    val _const13: Float = -3.2191562E-5f
    val _const14: Float = 9.0317123E-5f
    val _tmp: Float = (_const0 * s0)
    val _tmp1: Float = (_const1 * s1)
    val _tmp2: Float = (_tmp + _tmp1)
    val _tmp3: Float = (_const2 * s2)
    val _tmp8: Float = (_tmp2 + _tmp3)
    val _tmp4: Float = (_const3 * s3)
    val _tmp5: Float = (s4 * _const4)
    val _tmp6: Float = (_tmp4 + _tmp5)
    val _tmp7: Float = (_const5 * s5)
    val _tmp9: Float = (_tmp6 + _tmp7)
    val _tmp10: Float = (_tmp8 + _tmp9)
    val _tmp11: Float = (_const6 * s6)
    val _tmp12: Float = (_tmp10 + _tmp11)
    val _tmp13: Float = (_const7 * s7)
    val _tmp25: Float = (_tmp12 + _tmp13)
    val _tmp19: Float = (_const8 * s8)
    val _tmp14: Float = (_const9 * y0)
    val _tmp15: Float = (y1 * _const10)
    val _tmp16: Float = (_tmp14 + _tmp15)
    val _tmp17: Float = (y2 * _const11)
    val _tmp18: Float = (_tmp16 + _tmp17)
    val _tmp20: Float = (_const12 + _tmp18)
    val _tmp23: Float = (_tmp19 + _tmp20)
    val _tmp21: Float = (_const13 * y4)
    val _tmp22: Float = (_const14 * y3)
    val _tmp24: Float = (_tmp21 + _tmp22)
    val _tmp26: Float = (_tmp23 + _tmp24)
    (_tmp25 + _tmp26)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 2.75e-06)*/
  /*Abs error: -, Range: -*/
    def train4_state8_32_05(s0 : Float, s1 : Float, s2 : Float, s3 : Float, s4 : Float, s5 : Float, s6 : Float, s7 : Float, s8 : Float, y0 : Float, y1 : Float, y2 : Float, y3 : Float, y4 : Float) : Float = {
    val _const0: Float = 2.5093E-10f
    val _const1: Float = 9.15884E-10f
    val _const2: Float = 7.81656E-6f
    val _const3: Float = -7.81701E-6f
    val _const4: Float = -6.54335E-7f
    val _const5: Float = 6.87341E-6f
    val _const6: Float = 1.00368E-5f
    val _const7: Float = 0.999907f
    val _const8: Float = 3.32876E-5f
    val _const9: Float = 6.5448232E-7f
    val _const10: Float = -6.8708837E-6f
    val _const11: Float = -8.9460042E-6f
    val _const12: Float = -9.65830567023206E-10f
    val _const13: Float = -3.2191562E-5f
    val _const14: Float = 9.0317123E-5f
    val _tmp27: Float = (_const0 * s0)
    val _tmp28: Float = (_const1 * s1)
    val _tmp29: Float = (_tmp27 + _tmp28)
    val _tmp30: Float = (_const2 * s2)
    val _tmp35: Float = (_tmp29 + _tmp30)
    val _tmp31: Float = (_const3 * s3)
    val _tmp32: Float = (s4 * _const4)
    val _tmp33: Float = (_tmp31 + _tmp32)
    val _tmp34: Float = (_const5 * s5)
    val _tmp36: Float = (_tmp33 + _tmp34)
    val _tmp37: Float = (_tmp35 + _tmp36)
    val _tmp38: Float = (_const6 * s6)
    val _tmp39: Float = (_tmp37 + _tmp38)
    val _tmp40: Float = (_const7 * s7)
    val _tmp52: Float = (_tmp39 + _tmp40)
    val _tmp46: Float = (_const8 * s8)
    val _tmp41: Float = (_const9 * y0)
    val _tmp42: Float = (y1 * _const10)
    val _tmp43: Float = (_tmp41 + _tmp42)
    val _tmp44: Float = (y2 * _const11)
    val _tmp45: Float = (_tmp43 + _tmp44)
    val _tmp47: Float = (_const12 + _tmp45)
    val _tmp50: Float = (_tmp46 + _tmp47)
    val _tmp48: Float = (_const13 * y4)
    val _tmp49: Float = (_const14 * y3)
    val _tmp51: Float = (_tmp48 + _tmp49)
    val _tmp53: Float = (_tmp50 + _tmp51)
    (_tmp52 + _tmp53)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 5.5e-07)*/
  /*Abs error: -, Range: -*/
    def train4_state8_32_01(s0 : Float, s1 : Float, s2 : Float, s3 : Float, s4 : Float, s5 : Float, s6 : Float, s7 : Float, s8 : Float, y0 : Float, y1 : Float, y2 : Float, y3 : Float, y4 : Float) : Double = {
    val _const0: Float = 2.5093E-10f
    val _const1: Float = 9.15884E-10f
    val _const2: Float = 7.81656E-6f
    val _const3: Float = -7.81701E-6f
    val _const4: Float = -6.54335E-7f
    val _const5: Float = 6.87341E-6f
    val _const6: Float = 1.00368E-5f
    val _const7: Double = 0.999907
    val _const8: Double = 3.32876E-5
    val _const9: Double = 6.5448232E-7
    val _const10: Double = -6.8708837E-6
    val _const11: Double = -8.9460042E-6
    val _const12: Double = -9.65830567023206E-10
    val _const13: Double = -3.2191562E-5
    val _const14: Float = 9.0317123E-5f
    val _tmp54: Float = (_const0 * s0)
    val _tmp55: Float = (_const1 * s1)
    val _tmp56: Float = (_tmp54 + _tmp55)
    val _tmp57: Float = (_const2 * s2)
    val _tmp62: Float = (_tmp56 + _tmp57)
    val _tmp58: Float = (_const3 * s3)
    val _tmp59: Float = (s4 * _const4)
    val _tmp60: Float = (_tmp58 + _tmp59)
    val _tmp61: Float = (_const5 * s5)
    val _tmp63: Float = (_tmp60 + _tmp61)
    val _tmp64: Float = (_tmp62 + _tmp63)
    val _tmp65: Float = (_const6 * s6)
    val _tmp66: Float = (_tmp64 + _tmp65)
    val _tmp67: Double = (_const7 * s7.toDouble)
    val _tmp79: Double = (_tmp66.toDouble + _tmp67)
    val _tmp73: Double = (_const8 * s8.toDouble)
    val _tmp68: Double = (_const9 * y0.toDouble)
    val _tmp69: Double = (y1.toDouble * _const10)
    val _tmp70: Double = (_tmp68 + _tmp69)
    val _tmp71: Double = (y2.toDouble * _const11)
    val _tmp72: Double = (_tmp70 + _tmp71)
    val _tmp74: Double = (_const12 + _tmp72)
    val _tmp77: Double = (_tmp73 + _tmp74)
    val _tmp75: Double = (_const13 * y4.toDouble)
    val _tmp76: Double = (_const14.toDouble * y3.toDouble)
    val _tmp78: Double = (_tmp75 + _tmp76)
    val _tmp80: Double = (_tmp77 + _tmp78)
    (_tmp79 + _tmp80)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 5.5e-08)*/
  /*Abs error: -, Range: -*/
    def train4_state8_32_001(s0 : Double, s1 : Double, s2 : Double, s3 : Double, s4 : Double, s5 : Double, s6 : Double, s7 : Double, s8 : Double, y0 : Double, y1 : Double, y2 : Double, y3 : Double, y4 : Double) : Double = {
    val _const0: Double = 2.5093E-10
    val _const1: Double = 9.15884E-10
    val _const2: Double = 7.81656E-6
    val _const3: Double = -7.81701E-6
    val _const4: Double = -6.54335E-7
    val _const5: Double = 6.87341E-6
    val _const6: Double = 1.00368E-5
    val _const7: Double = 0.999907
    val _const8: Double = 3.32876E-5
    val _const9: Double = 6.5448232E-7
    val _const10: Double = -6.8708837E-6
    val _const11: Double = -8.9460042E-6
    val _const12: Double = -9.65830567023206E-10
    val _const13: Double = -3.2191562E-5
    val _const14: Double = 9.0317123E-5
    val _tmp81: Double = (_const0 * s0)
    val _tmp82: Double = (_const1 * s1)
    val _tmp83: Double = (_tmp81 + _tmp82)
    val _tmp84: Double = (_const2 * s2)
    val _tmp89: Double = (_tmp83 + _tmp84)
    val _tmp85: Double = (_const3 * s3)
    val _tmp86: Double = (s4 * _const4)
    val _tmp87: Double = (_tmp85 + _tmp86)
    val _tmp88: Double = (_const5 * s5)
    val _tmp90: Double = (_tmp87 + _tmp88)
    val _tmp91: Double = (_tmp89 + _tmp90)
    val _tmp92: Double = (_const6 * s6)
    val _tmp93: Double = (_tmp91 + _tmp92)
    val _tmp94: Double = (_const7 * s7)
    val _tmp106: Double = (_tmp93 + _tmp94)
    val _tmp100: Double = (_const8 * s8)
    val _tmp95: Double = (_const9 * y0)
    val _tmp96: Double = (y1 * _const10)
    val _tmp97: Double = (_tmp95 + _tmp96)
    val _tmp98: Double = (y2 * _const11)
    val _tmp99: Double = (_tmp97 + _tmp98)
    val _tmp101: Double = (_const12 + _tmp99)
    val _tmp104: Double = (_tmp100 + _tmp101)
    val _tmp102: Double = (_const13 * y4)
    val _tmp103: Double = (_const14 * y3)
    val _tmp105: Double = (_tmp102 + _tmp103)
    val _tmp107: Double = (_tmp104 + _tmp105)
    (_tmp106 + _tmp107)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 1.e-14)*/
  /*Abs error: -, Range: -*/
    def train4_state8_64(s0 : Double, s1 : Double, s2 : Double, s3 : Double, s4 : Double, s5 : Double, s6 : Double, s7 : Double, s8 : Double, y0 : Double, y1 : Double, y2 : Double, y3 : Double, y4 : Double) : Double = {
    val _const0: Double = 2.5093E-10
    val _const1: Double = 9.15884E-10
    val _const2: Double = 7.81656E-6
    val _const3: Double = -7.81701E-6
    val _const4: Double = -6.54335E-7
    val _const5: Double = 6.87341E-6
    val _const6: Double = 1.00368E-5
    val _const7: Double = 0.999907
    val _const8: Double = 3.32876E-5
    val _const9: Double = 6.5448232E-7
    val _const10: Double = -6.8708837E-6
    val _const11: Double = -8.9460042E-6
    val _const12: Double = -9.65830567023206E-10
    val _const13: Double = -3.2191562E-5
    val _const14: Double = 9.0317123E-5
    val _tmp108: Double = (_const0 * s0)
    val _tmp109: Double = (_const1 * s1)
    val _tmp110: Double = (_tmp108 + _tmp109)
    val _tmp111: Double = (_const2 * s2)
    val _tmp116: Double = (_tmp110 + _tmp111)
    val _tmp112: Double = (_const3 * s3)
    val _tmp113: Double = (s4 * _const4)
    val _tmp114: Double = (_tmp112 + _tmp113)
    val _tmp115: Double = (_const5 * s5)
    val _tmp117: Double = (_tmp114 + _tmp115)
    val _tmp118: Double = (_tmp116 + _tmp117)
    val _tmp119: Double = (_const6 * s6)
    val _tmp120: Double = (_tmp118 + _tmp119)
    val _tmp121: Double = (_const7 * s7)
    val _tmp133: Double = (_tmp120 + _tmp121)
    val _tmp127: Double = (_const8 * s8)
    val _tmp122: Double = (_const9 * y0)
    val _tmp123: Double = (y1 * _const10)
    val _tmp124: Double = (_tmp122 + _tmp123)
    val _tmp125: Double = (y2 * _const11)
    val _tmp126: Double = (_tmp124 + _tmp125)
    val _tmp128: Double = (_const12 + _tmp126)
    val _tmp131: Double = (_tmp127 + _tmp128)
    val _tmp129: Double = (_const13 * y4)
    val _tmp130: Double = (_const14 * y3)
    val _tmp132: Double = (_tmp129 + _tmp130)
    val _tmp134: Double = (_tmp131 + _tmp132)
    (_tmp133 + _tmp134)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 5.e-15)*/
  /*Abs error: -, Range: -*/
    def train4_state8_64_05(s0 : Double, s1 : Double, s2 : Double, s3 : Double, s4 : Double, s5 : Double, s6 : Double, s7 : Double, s8 : Double, y0 : Double, y1 : Double, y2 : Double, y3 : Double, y4 : Double) : Double = {
    val _const0: Double = 2.5093E-10
    val _const1: Double = 9.15884E-10
    val _const2: Double = 7.81656E-6
    val _const3: Double = -7.81701E-6
    val _const4: Double = -6.54335E-7
    val _const5: Double = 6.87341E-6
    val _const6: Double = 1.00368E-5
    val _const7: Double = 0.999907
    val _const8: Double = 3.32876E-5
    val _const9: Double = 6.5448232E-7
    val _const10: Double = -6.8708837E-6
    val _const11: Double = -8.9460042E-6
    val _const12: Double = -9.65830567023206E-10
    val _const13: Double = -3.2191562E-5
    val _const14: Double = 9.0317123E-5
    val _tmp135: Double = (_const0 * s0)
    val _tmp136: Double = (_const1 * s1)
    val _tmp137: Double = (_tmp135 + _tmp136)
    val _tmp138: Double = (_const2 * s2)
    val _tmp143: Double = (_tmp137 + _tmp138)
    val _tmp139: Double = (_const3 * s3)
    val _tmp140: Double = (s4 * _const4)
    val _tmp141: Double = (_tmp139 + _tmp140)
    val _tmp142: Double = (_const5 * s5)
    val _tmp144: Double = (_tmp141 + _tmp142)
    val _tmp145: Double = (_tmp143 + _tmp144)
    val _tmp146: Double = (_const6 * s6)
    val _tmp147: Double = (_tmp145 + _tmp146)
    val _tmp148: Double = (_const7 * s7)
    val _tmp160: Double = (_tmp147 + _tmp148)
    val _tmp154: Double = (_const8 * s8)
    val _tmp149: Double = (_const9 * y0)
    val _tmp150: Double = (y1 * _const10)
    val _tmp151: Double = (_tmp149 + _tmp150)
    val _tmp152: Double = (y2 * _const11)
    val _tmp153: Double = (_tmp151 + _tmp152)
    val _tmp155: Double = (_const12 + _tmp153)
    val _tmp158: Double = (_tmp154 + _tmp155)
    val _tmp156: Double = (_const13 * y4)
    val _tmp157: Double = (_const14 * y3)
    val _tmp159: Double = (_tmp156 + _tmp157)
    val _tmp161: Double = (_tmp158 + _tmp159)
    (_tmp160 + _tmp161)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 1.e-15)*/
  /*Abs error: -, Range: -*/
    def train4_state8_64_01(s0 : Double, s1 : Double, s2 : Double, s3 : Double, s4 : Double, s5 : Double, s6 : Double, s7 : Double, s8 : Double, y0 : Double, y1 : Double, y2 : Double, y3 : Double, y4 : Double) : DblDouble = {
    val _const0: Double = 2.5093E-10
    val _const1: Double = 9.15884E-10
    val _const2: Double = 7.81656E-6
    val _const3: Double = -7.81701E-6
    val _const4: Double = -6.54335E-7
    val _const5: Double = 6.87341E-6
    val _const6: Double = 1.00368E-5
    val _const7: DblDouble = 0.999907
    val _const8: DblDouble = 3.32876E-5
    val _const9: DblDouble = 6.5448232E-7
    val _const10: DblDouble = -6.8708837E-6
    val _const11: DblDouble = -8.9460042E-6
    val _const12: DblDouble = -9.65830567023206E-10
    val _const13: DblDouble = -3.2191562E-5
    val _const14: Double = 9.0317123E-5
    val _tmp162: Double = (_const0 * s0)
    val _tmp163: Double = (_const1 * s1)
    val _tmp164: Double = (_tmp162 + _tmp163)
    val _tmp165: Double = (_const2 * s2)
    val _tmp170: Double = (_tmp164 + _tmp165)
    val _tmp166: Double = (_const3 * s3)
    val _tmp167: Double = (s4 * _const4)
    val _tmp168: Double = (_tmp166 + _tmp167)
    val _tmp169: Double = (_const5 * s5)
    val _tmp171: Double = (_tmp168 + _tmp169)
    val _tmp172: Double = (_tmp170 + _tmp171)
    val _tmp173: Double = (_const6 * s6)
    val _tmp174: Double = (_tmp172 + _tmp173)
    val _tmp175: DblDouble = (_const7 * DblDouble(s7))
    val _tmp187: DblDouble = (DblDouble(_tmp174) + _tmp175)
    val _tmp181: DblDouble = (_const8 * DblDouble(s8))
    val _tmp176: DblDouble = (_const9 * DblDouble(y0))
    val _tmp177: DblDouble = (DblDouble(y1) * _const10)
    val _tmp178: DblDouble = (_tmp176 + _tmp177)
    val _tmp179: DblDouble = (DblDouble(y2) * _const11)
    val _tmp180: DblDouble = (_tmp178 + _tmp179)
    val _tmp182: DblDouble = (_const12 + _tmp180)
    val _tmp185: DblDouble = (_tmp181 + _tmp182)
    val _tmp183: DblDouble = (_const13 * DblDouble(y4))
    val _tmp184: DblDouble = (DblDouble(_const14) * DblDouble(y3))
    val _tmp186: DblDouble = (_tmp183 + _tmp184)
    val _tmp188: DblDouble = (_tmp185 + _tmp186)
    (_tmp187 + _tmp188)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 1.e-16)*/
  /*Abs error: -, Range: -*/
    def train4_state8_64_001(s0 : DblDouble, s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble, s5 : DblDouble, s6 : DblDouble, s7 : DblDouble, s8 : DblDouble, y0 : DblDouble, y1 : DblDouble, y2 : DblDouble, y3 : DblDouble, y4 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2.5093E-10
    val _const1: DblDouble = 9.15884E-10
    val _const2: DblDouble = 7.81656E-6
    val _const3: DblDouble = -7.81701E-6
    val _const4: DblDouble = -6.54335E-7
    val _const5: DblDouble = 6.87341E-6
    val _const6: DblDouble = 1.00368E-5
    val _const7: DblDouble = 0.999907
    val _const8: DblDouble = 3.32876E-5
    val _const9: DblDouble = 6.5448232E-7
    val _const10: DblDouble = -6.8708837E-6
    val _const11: DblDouble = -8.9460042E-6
    val _const12: DblDouble = -9.65830567023206E-10
    val _const13: DblDouble = -3.2191562E-5
    val _const14: Double = 9.0317123E-5
    val _tmp189: Double = (_const0 * s0).toDouble
    val _tmp190: Double = (_const1 * s1).toDouble
    val _tmp191: Double = (_tmp189 + _tmp190)
    val _tmp192: Double = (_const2 * s2).toDouble
    val _tmp197: Double = (_tmp191 + _tmp192)
    val _tmp193: Double = (_const3 * s3).toDouble
    val _tmp194: Double = (s4 * _const4).toDouble
    val _tmp195: Double = (_tmp193 + _tmp194)
    val _tmp196: Double = (_const5 * s5).toDouble
    val _tmp198: Double = (_tmp195 + _tmp196)
    val _tmp199: Double = (_tmp197 + _tmp198)
    val _tmp200: Double = (_const6 * s6).toDouble
    val _tmp201: Double = (_tmp199 + _tmp200)
    val _tmp202: DblDouble = (_const7 * s7)
    val _tmp214: DblDouble = (DblDouble(_tmp201) + _tmp202)
    val _tmp208: DblDouble = (_const8 * s8)
    val _tmp203: DblDouble = (_const9 * y0)
    val _tmp204: DblDouble = (y1 * _const10)
    val _tmp205: DblDouble = (_tmp203 + _tmp204)
    val _tmp206: DblDouble = (y2 * _const11)
    val _tmp207: DblDouble = (_tmp205 + _tmp206)
    val _tmp209: DblDouble = (_const12 + _tmp207)
    val _tmp212: DblDouble = (_tmp208 + _tmp209)
    val _tmp210: DblDouble = (_const13 * y4)
    val _tmp211: DblDouble = (DblDouble(_const14) * y3)
    val _tmp213: DblDouble = (_tmp210 + _tmp211)
    val _tmp215: DblDouble = (_tmp212 + _tmp213)
    (_tmp214 + _tmp215)
  }

  /*@pre : ((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2. <= s4) && (s4 <= 12.) && (-2. <= s5) && (s5 <= 12.) && (-2. <= s6) && (s6 <= 12.) && (-2. <= s7) && (s7 <= 12.) && (-2. <= s8) && (s8 <= 12.) && (-2. <= y0) && (y0 <= 12.) && (-2. <= y1) && (y1 <= 12.) && (-2. <= y2) && (y2 <= 12.) && (-2. <= y3) && (y3 <= 12.) && (-2. <= y4) && (y4 <= 12.))*/
  /*@post: (res) => (res +/- 3.5e-30)*/
  /*Abs error: -, Range: -*/
    def train4_state8_dbldbl(s0 : DblDouble, s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble, s5 : DblDouble, s6 : DblDouble, s7 : DblDouble, s8 : DblDouble, y0 : DblDouble, y1 : DblDouble, y2 : DblDouble, y3 : DblDouble, y4 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2.5093E-10
    val _const1: DblDouble = 9.15884E-10
    val _const2: DblDouble = 7.81656E-6
    val _const3: DblDouble = -7.81701E-6
    val _const4: DblDouble = -6.54335E-7
    val _const5: DblDouble = 6.87341E-6
    val _const6: DblDouble = 1.00368E-5
    val _const7: DblDouble = 0.999907
    val _const8: DblDouble = 3.32876E-5
    val _const9: DblDouble = 6.5448232E-7
    val _const10: DblDouble = -6.8708837E-6
    val _const11: DblDouble = -8.9460042E-6
    val _const12: DblDouble = -9.65830567023206E-10
    val _const13: DblDouble = -3.2191562E-5
    val _const14: DblDouble = 9.0317123E-5
    val _tmp216: DblDouble = (_const0 * s0)
    val _tmp217: DblDouble = (_const1 * s1)
    val _tmp218: DblDouble = (_tmp216 + _tmp217)
    val _tmp219: DblDouble = (_const2 * s2)
    val _tmp224: DblDouble = (_tmp218 + _tmp219)
    val _tmp220: DblDouble = (_const3 * s3)
    val _tmp221: DblDouble = (s4 * _const4)
    val _tmp222: DblDouble = (_tmp220 + _tmp221)
    val _tmp223: DblDouble = (_const5 * s5)
    val _tmp225: DblDouble = (_tmp222 + _tmp223)
    val _tmp226: DblDouble = (_tmp224 + _tmp225)
    val _tmp227: DblDouble = (_const6 * s6)
    val _tmp228: DblDouble = (_tmp226 + _tmp227)
    val _tmp229: DblDouble = (_const7 * s7)
    val _tmp241: DblDouble = (_tmp228 + _tmp229)
    val _tmp235: DblDouble = (_const8 * s8)
    val _tmp230: DblDouble = (_const9 * y0)
    val _tmp231: DblDouble = (y1 * _const10)
    val _tmp232: DblDouble = (_tmp230 + _tmp231)
    val _tmp233: DblDouble = (y2 * _const11)
    val _tmp234: DblDouble = (_tmp232 + _tmp233)
    val _tmp236: DblDouble = (_const12 + _tmp234)
    val _tmp239: DblDouble = (_tmp235 + _tmp236)
    val _tmp237: DblDouble = (_const13 * y4)
    val _tmp238: DblDouble = (_const14 * y3)
    val _tmp240: DblDouble = (_tmp237 + _tmp238)
    val _tmp242: DblDouble = (_tmp239 + _tmp240)
    (_tmp241 + _tmp242)
  }

}
