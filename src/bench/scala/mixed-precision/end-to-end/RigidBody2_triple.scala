package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object RigidBody2_triple {

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 0.1) */

    def rigidBody2_triple_32(x1: Float, x2: Float, x3: Float, x4: Float, x5: Float, x6: Float, x7: Float, x8: Float, x9: Float): Float = {
    val _const0: Float = 2f
    val _const1: Float = 3f
    val _const2: Float = 3f
    val _const3: Float = 2f
    val _const4: Float = 3f
    val _const5: Float = 3f
    val _const6: Float = 2f
    val _const7: Float = 3f
    val _const8: Float = 3f
    val _tmp: Float = (x1 * x2)
    val _tmp1: Float = (_tmp * x3)
    val _tmp3: Float = (_const0 * _tmp1)
    val _tmp2: Float = (_const1 * x3)
    val _tmp4: Float = (_tmp2 * x3)
    val _tmp7: Float = (_tmp3 + _tmp4)
    val _tmp5: Float = (x1 * x2)
    val _tmp6: Float = (_tmp5 * x3)
    val _tmp8: Float = (x2 * _tmp6)
    val _tmp10: Float = (_tmp7 - _tmp8)
    val _tmp9: Float = (_const2 * x3)
    val _tmp11: Float = (_tmp9 * x3)
    val _tmp12: Float = (_tmp10 + _tmp11)
    val _tmp15: Float = (_tmp12 - x2)
    val _tmp13: Float = (x4 * x5)
    val _tmp14: Float = (_tmp13 * x6)
    val _tmp16: Float = (_const3 * _tmp14)
    val _tmp18: Float = (_tmp15 + _tmp16)
    val _tmp17: Float = (_const4 * x6)
    val _tmp19: Float = (_tmp17 * x6)
    val _tmp22: Float = (_tmp18 + _tmp19)
    val _tmp20: Float = (x4 * x5)
    val _tmp21: Float = (_tmp20 * x6)
    val _tmp23: Float = (x5 * _tmp21)
    val _tmp25: Float = (_tmp22 - _tmp23)
    val _tmp24: Float = (_const5 * x6)
    val _tmp26: Float = (_tmp24 * x6)
    val _tmp27: Float = (_tmp25 + _tmp26)
    val _tmp30: Float = (_tmp27 - x5)
    val _tmp28: Float = (x7 * x8)
    val _tmp29: Float = (_tmp28 * x9)
    val _tmp31: Float = (_const6 * _tmp29)
    val _tmp33: Float = (_tmp30 + _tmp31)
    val _tmp32: Float = (_const7 * x9)
    val _tmp34: Float = (_tmp32 * x9)
    val _tmp37: Float = (_tmp33 + _tmp34)
    val _tmp35: Float = (x7 * x8)
    val _tmp36: Float = (_tmp35 * x9)
    val _tmp38: Float = (x8 * _tmp36)
    val _tmp40: Float = (_tmp37 - _tmp38)
    val _tmp39: Float = (_const8 * x9)
    val _tmp41: Float = (_tmp39 * x9)
    val _tmp42: Float = (_tmp40 + _tmp41)
    (_tmp42 - x8)
  } // [-170790.01234321846, 176220.0] +/- 0.09544229659013584

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 0.05) */

    def rigidBody2_triple_32_05(x1: Float, x2: Float, x3: Float, x4: Float, x5: Float, x6: Float, x7: Float, x8: Float, x9: Float): Double = {
    val _const0: Float = 2f
    val _const1: Float = 3f
    val _const2: Float = 3f
    val _const3: Float = 2f
    val _const4: Float = 3f
    val _const5: Float = 3f
    val _const6: Float = 2f
    val _const7: Float = 3f
    val _const8: Float = 3f
    val _tmp43: Float = (x1 * x2)
    val _tmp44: Float = (_tmp43 * x3)
    val _tmp46: Float = (_const0 * _tmp44)
    val _tmp45: Float = (_const1 * x3)
    val _tmp47: Float = (_tmp45 * x3)
    val _tmp50: Float = (_tmp46 + _tmp47)
    val _tmp48: Float = (x1 * x2)
    val _tmp49: Float = (_tmp48 * x3)
    val _tmp51: Float = (x2 * _tmp49)
    val _tmp53: Float = (_tmp50 - _tmp51)
    val _tmp52: Float = (_const2 * x3)
    val _tmp54: Float = (_tmp52 * x3)
    val _tmp55: Double = (_tmp53.toDouble + _tmp54.toDouble)
    val _tmp58: Double = (_tmp55 - x2.toDouble)
    val _tmp56: Double = (x4.toDouble * x5.toDouble)
    val _tmp57: Double = (_tmp56 * x6.toDouble)
    val _tmp59: Double = (_const3.toDouble * _tmp57)
    val _tmp61: Double = (_tmp58 + _tmp59)
    val _tmp60: Double = (_const4.toDouble * x6.toDouble)
    val _tmp62: Double = (_tmp60 * x6.toDouble)
    val _tmp65: Double = (_tmp61 + _tmp62)
    val _tmp63: Double = (x4.toDouble * x5.toDouble)
    val _tmp64: Double = (_tmp63 * x6.toDouble)
    val _tmp66: Double = (x5.toDouble * _tmp64)
    val _tmp68: Double = (_tmp65 - _tmp66)
    val _tmp67: Double = (_const5.toDouble * x6.toDouble)
    val _tmp69: Double = (_tmp67 * x6.toDouble)
    val _tmp70: Double = (_tmp68 + _tmp69)
    val _tmp73: Double = (_tmp70 - x5.toDouble)
    val _tmp71: Double = (x7.toDouble * x8.toDouble)
    val _tmp72: Double = (_tmp71 * x9.toDouble)
    val _tmp74: Double = (_const6.toDouble * _tmp72)
    val _tmp76: Double = (_tmp73 + _tmp74)
    val _tmp75: Double = (_const7.toDouble * x9.toDouble)
    val _tmp77: Double = (_tmp75 * x9.toDouble)
    val _tmp80: Double = (_tmp76 + _tmp77)
    val _tmp78: Double = (x7.toDouble * x8.toDouble)
    val _tmp79: Double = (_tmp78 * x9.toDouble)
    val _tmp81: Double = (x8.toDouble * _tmp79)
    val _tmp83: Double = (_tmp80 - _tmp81)
    val _tmp82: Double = (_const8.toDouble * x9.toDouble)
    val _tmp84: Double = (_tmp82 * x9.toDouble)
    val _tmp85: Double = (_tmp83 + _tmp84)
    (_tmp85 - x8)
  } // [-170115.0032663693, 176220.0] +/- 0.0300354970426753

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 0.01) */

    def rigidBody2_triple_32_01(x1: Double, x2: Double, x3: Double, x4: Double, x5: Double, x6: Double, x7: Double, x8: Float, x9: Float): Double = {
    val _const0: Float = 2f
    val _const1: Float = 3f
    val _const2: Float = 3f
    val _const3: Float = 2f
    val _const4: Float = 3f
    val _const5: Float = 3f
    val _const6: Double = 2
    val _const7: Double = 3
    val _const8: Double = 3
    val _tmp86: Double = (x1 * x2)
    val _tmp87: Double = (_tmp86 * x3)
    val _tmp89: Double = (_const0.toDouble * _tmp87)
    val _tmp88: Double = (_const1.toDouble * x3)
    val _tmp90: Double = (_tmp88 * x3)
    val _tmp93: Double = (_tmp89 + _tmp90)
    val _tmp91: Double = (x1 * x2)
    val _tmp92: Double = (_tmp91 * x3)
    val _tmp94: Double = (x2 * _tmp92)
    val _tmp96: Double = (_tmp93 - _tmp94)
    val _tmp95: Double = (_const2.toDouble * x3)
    val _tmp97: Double = (_tmp95 * x3)
    val _tmp98: Double = (_tmp96 + _tmp97)
    val _tmp101: Double = (_tmp98 - x2)
    val _tmp99: Double = (x4 * x5)
    val _tmp100: Double = (_tmp99 * x6)
    val _tmp102: Double = (_const3.toDouble * _tmp100)
    val _tmp104: Double = (_tmp101 + _tmp102)
    val _tmp103: Double = (_const4.toDouble * x6)
    val _tmp105: Double = (_tmp103 * x6)
    val _tmp108: Double = (_tmp104 + _tmp105)
    val _tmp106: Double = (x4 * x5)
    val _tmp107: Double = (_tmp106 * x6)
    val _tmp109: Double = (x5 * _tmp107)
    val _tmp111: Double = (_tmp108 - _tmp109)
    val _tmp110: Double = (_const5.toDouble * x6)
    val _tmp112: Double = (_tmp110 * x6)
    val _tmp113: Double = (_tmp111 + _tmp112)
    val _tmp116: Double = (_tmp113 - x5)
    val _tmp114: Double = (x7 * x8.toDouble)
    val _tmp115: Double = (_tmp114 * x9.toDouble)
    val _tmp117: Double = (_const6 * _tmp115)
    val _tmp119: Double = (_tmp116 + _tmp117)
    val _tmp118: Double = (_const7 * x9.toDouble)
    val _tmp120: Double = (_tmp118 * x9.toDouble)
    val _tmp123: Double = (_tmp119 + _tmp120)
    val _tmp121: Double = (x7 * x8.toDouble)
    val _tmp122: Double = (_tmp121 * x9.toDouble)
    val _tmp124: Double = (x8.toDouble * _tmp122)
    val _tmp126: Double = (_tmp123 - _tmp124)
    val _tmp125: Double = (_const8 * x9.toDouble)
    val _tmp127: Double = (_tmp125 * x9.toDouble)
    val _tmp128: Double = (_tmp126 + _tmp127)
    (_tmp128 - x8)
  } // [-170115.0032663693, 176220.0] +/- 0.005343437524309105

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 0.001) */

    def rigidBody2_triple_32_001(x1: Double, x2: Double, x3: Double, x4: Double, x5: Double, x6: Double, x7: Double, x8: Double, x9: Double): Double = {
    val _const0: Double = 2
    val _const1: Double = 3
    val _const2: Double = 3
    val _const3: Double = 2
    val _const4: Double = 3
    val _const5: Double = 3
    val _const6: Double = 2
    val _const7: Double = 3
    val _const8: Double = 3
    val _tmp129: Double = (x1 * x2)
    val _tmp130: Double = (_tmp129 * x3)
    val _tmp132: Double = (_const0 * _tmp130)
    val _tmp131: Double = (_const1 * x3)
    val _tmp133: Double = (_tmp131 * x3)
    val _tmp136: Double = (_tmp132 + _tmp133)
    val _tmp134: Double = (x1 * x2)
    val _tmp135: Double = (_tmp134 * x3)
    val _tmp137: Double = (x2 * _tmp135)
    val _tmp139: Double = (_tmp136 - _tmp137)
    val _tmp138: Double = (_const2 * x3)
    val _tmp140: Double = (_tmp138 * x3)
    val _tmp141: Double = (_tmp139 + _tmp140)
    val _tmp144: Double = (_tmp141 - x2)
    val _tmp142: Double = (x4 * x5)
    val _tmp143: Double = (_tmp142 * x6)
    val _tmp145: Double = (_const3 * _tmp143)
    val _tmp147: Double = (_tmp144 + _tmp145)
    val _tmp146: Double = (_const4 * x6)
    val _tmp148: Double = (_tmp146 * x6)
    val _tmp151: Double = (_tmp147 + _tmp148)
    val _tmp149: Double = (x4 * x5)
    val _tmp150: Double = (_tmp149 * x6)
    val _tmp152: Double = (x5 * _tmp150)
    val _tmp154: Double = (_tmp151 - _tmp152)
    val _tmp153: Double = (_const5 * x6)
    val _tmp155: Double = (_tmp153 * x6)
    val _tmp156: Double = (_tmp154 + _tmp155)
    val _tmp159: Double = (_tmp156 - x5)
    val _tmp157: Double = (x7 * x8)
    val _tmp158: Double = (_tmp157 * x9)
    val _tmp160: Double = (_const6 * _tmp158)
    val _tmp162: Double = (_tmp159 + _tmp160)
    val _tmp161: Double = (_const7 * x9)
    val _tmp163: Double = (_tmp161 * x9)
    val _tmp166: Double = (_tmp162 + _tmp163)
    val _tmp164: Double = (x7 * x8)
    val _tmp165: Double = (_tmp164 * x9)
    val _tmp167: Double = (x8 * _tmp165)
    val _tmp169: Double = (_tmp166 - _tmp167)
    val _tmp168: Double = (_const8 * x9)
    val _tmp170: Double = (_tmp168 * x9)
    val _tmp171: Double = (_tmp169 + _tmp170)
    (_tmp171 - x8)
  } // [-170115.0032663693, 176220.0] +/- 1.7777512795191797e-10

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 1.8e-10) */

    def rigidBody2_triple_64(x1: Double, x2: Double, x3: Double, x4: Double, x5: Double, x6: Double, x7: Double, x8: Double, x9: Double): Double = {
    val _const0: Double = 2
    val _const1: Double = 3
    val _const2: Double = 3
    val _const3: Double = 2
    val _const4: Double = 3
    val _const5: Double = 3
    val _const6: Double = 2
    val _const7: Double = 3
    val _const8: Double = 3
    val _tmp172: Double = (x1 * x2)
    val _tmp173: Double = (_tmp172 * x3)
    val _tmp175: Double = (_const0 * _tmp173)
    val _tmp174: Double = (_const1 * x3)
    val _tmp176: Double = (_tmp174 * x3)
    val _tmp179: Double = (_tmp175 + _tmp176)
    val _tmp177: Double = (x1 * x2)
    val _tmp178: Double = (_tmp177 * x3)
    val _tmp180: Double = (x2 * _tmp178)
    val _tmp182: Double = (_tmp179 - _tmp180)
    val _tmp181: Double = (_const2 * x3)
    val _tmp183: Double = (_tmp181 * x3)
    val _tmp184: Double = (_tmp182 + _tmp183)
    val _tmp187: Double = (_tmp184 - x2)
    val _tmp185: Double = (x4 * x5)
    val _tmp186: Double = (_tmp185 * x6)
    val _tmp188: Double = (_const3 * _tmp186)
    val _tmp190: Double = (_tmp187 + _tmp188)
    val _tmp189: Double = (_const4 * x6)
    val _tmp191: Double = (_tmp189 * x6)
    val _tmp194: Double = (_tmp190 + _tmp191)
    val _tmp192: Double = (x4 * x5)
    val _tmp193: Double = (_tmp192 * x6)
    val _tmp195: Double = (x5 * _tmp193)
    val _tmp197: Double = (_tmp194 - _tmp195)
    val _tmp196: Double = (_const5 * x6)
    val _tmp198: Double = (_tmp196 * x6)
    val _tmp199: Double = (_tmp197 + _tmp198)
    val _tmp202: Double = (_tmp199 - x5)
    val _tmp200: Double = (x7 * x8)
    val _tmp201: Double = (_tmp200 * x9)
    val _tmp203: Double = (_const6 * _tmp201)
    val _tmp205: Double = (_tmp202 + _tmp203)
    val _tmp204: Double = (_const7 * x9)
    val _tmp206: Double = (_tmp204 * x9)
    val _tmp209: Double = (_tmp205 + _tmp206)
    val _tmp207: Double = (x7 * x8)
    val _tmp208: Double = (_tmp207 * x9)
    val _tmp210: Double = (x8 * _tmp208)
    val _tmp212: Double = (_tmp209 - _tmp210)
    val _tmp211: Double = (_const8 * x9)
    val _tmp213: Double = (_tmp211 * x9)
    val _tmp214: Double = (_tmp212 + _tmp213)
    (_tmp214 - x8)
  } // [-170115.0032663693, 176220.0] +/- 1.7777512795191797e-10

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 9.0e-11) */

    def rigidBody2_triple_64_05(x1: Double, x2: Double, x3: Double, x4: Double, x5: Double, x6: Double, x7: Double, x8: Double, x9: Double): DblDouble = {
    val _const0: Double = 2
    val _const1: Double = 3
    val _const2: Double = 3
    val _const3: Double = 2
    val _const4: Double = 3
    val _const5: Double = 3
    val _const6: Double = 2
    val _const7: Double = 3
    val _const8: Float = 3f
    val _tmp215: Double = (x1 * x2)
    val _tmp216: Double = (_tmp215 * x3)
    val _tmp218: Double = (_const0 * _tmp216)
    val _tmp217: Double = (_const1 * x3)
    val _tmp219: Double = (_tmp217 * x3)
    val _tmp222: DblDouble = (DblDouble(_tmp218) + DblDouble(_tmp219))
    val _tmp220: DblDouble = (DblDouble(x1) * DblDouble(x2))
    val _tmp221: DblDouble = (_tmp220 * DblDouble(x3))
    val _tmp223: DblDouble = (DblDouble(x2) * _tmp221)
    val _tmp225: DblDouble = (_tmp222 - _tmp223)
    val _tmp224: DblDouble = (DblDouble(_const2) * DblDouble(x3))
    val _tmp226: DblDouble = (_tmp224 * DblDouble(x3))
    val _tmp227: Double = (_tmp225 + _tmp226).toDouble
    val _tmp230: Double = (_tmp227 - x2)
    val _tmp228: Double = (x4 * x5)
    val _tmp229: Double = (_tmp228 * x6)
    val _tmp231: Double = (_const3 * _tmp229)
    val _tmp233: Double = (_tmp230 + _tmp231)
    val _tmp232: Double = (_const4 * x6)
    val _tmp234: Double = (_tmp232 * x6)
    val _tmp237: Double = (_tmp233 + _tmp234)
    val _tmp235: Double = (x4 * x5)
    val _tmp236: Double = (_tmp235 * x6)
    val _tmp238: Double = (x5 * _tmp236)
    val _tmp240: Double = (_tmp237 - _tmp238)
    val _tmp239: Double = (_const5 * x6)
    val _tmp241: Double = (_tmp239 * x6)
    val _tmp242: DblDouble = (DblDouble(_tmp240) + DblDouble(_tmp241))
    val _tmp245: DblDouble = (_tmp242 - DblDouble(x5))
    val _tmp243: DblDouble = (DblDouble(x7) * DblDouble(x8))
    val _tmp244: DblDouble = (_tmp243 * DblDouble(x9))
    val _tmp246: DblDouble = (DblDouble(_const6) * _tmp244)
    val _tmp248: DblDouble = (_tmp245 + _tmp246)
    val _tmp247: DblDouble = (DblDouble(_const7) * DblDouble(x9))
    val _tmp249: DblDouble = (_tmp247 * DblDouble(x9))
    val _tmp252: DblDouble = (_tmp248 + _tmp249)
    val _tmp250: DblDouble = (DblDouble(x7) * DblDouble(x8))
    val _tmp251: DblDouble = (_tmp250 * DblDouble(x9))
    val _tmp253: DblDouble = (DblDouble(x8) * _tmp251)
    val _tmp255: DblDouble = (_tmp252 - _tmp253)
    val _tmp254: DblDouble = (DblDouble(_const8) * DblDouble(x9))
    val _tmp256: DblDouble = (_tmp254 * DblDouble(x9))
    val _tmp257: DblDouble = (_tmp255 + _tmp256)
    (_tmp257 - x8)
  } // [-170790.01234321846, 176220.0] +/- 7.87645504374268e-11

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 1.8e-11) */

    def rigidBody2_triple_64_01(x1: DblDouble, x2: DblDouble, x3: DblDouble, x4: DblDouble, x5: DblDouble, x6: DblDouble, x7: DblDouble, x8: DblDouble, x9: DblDouble): DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 3
    val _const6: Float = 2f
    val _const7: Float = 3f
    val _const8: Float = 3f
    val _tmp258: Double = (x1 * x2).toDouble
    val _tmp259: Double = (DblDouble(_tmp258) * x3).toDouble
    val _tmp261: Double = (_const0 * DblDouble(_tmp259)).toDouble
    val _tmp260: Double = (_const1 * x3).toDouble
    val _tmp262: Double = (DblDouble(_tmp260) * x3).toDouble
    val _tmp265: Double = (_tmp261 + _tmp262)
    val _tmp263: Double = (x1 * x2).toDouble
    val _tmp264: Double = (DblDouble(_tmp263) * x3).toDouble
    val _tmp266: Double = (x2 * DblDouble(_tmp264)).toDouble
    val _tmp268: Double = (_tmp265 - _tmp266)
    val _tmp267: Double = (_const2 * x3).toDouble
    val _tmp269: Double = (DblDouble(_tmp267) * x3).toDouble
    val _tmp270: DblDouble = (DblDouble(_tmp268) + DblDouble(_tmp269))
    val _tmp273: DblDouble = (_tmp270 - x2)
    val _tmp271: DblDouble = (x4 * x5)
    val _tmp272: DblDouble = (_tmp271 * x6)
    val _tmp274: DblDouble = (_const3 * _tmp272)
    val _tmp276: DblDouble = (_tmp273 + _tmp274)
    val _tmp275: DblDouble = (_const4 * x6)
    val _tmp277: DblDouble = (_tmp275 * x6)
    val _tmp280: DblDouble = (_tmp276 + _tmp277)
    val _tmp278: DblDouble = (x4 * x5)
    val _tmp279: DblDouble = (_tmp278 * x6)
    val _tmp281: DblDouble = (x5 * _tmp279)
    val _tmp283: DblDouble = (_tmp280 - _tmp281)
    val _tmp282: DblDouble = (_const5 * x6)
    val _tmp284: DblDouble = (_tmp282 * x6)
    val _tmp285: DblDouble = (_tmp283 + _tmp284)
    val _tmp288: DblDouble = (_tmp285 - x5)
    val _tmp286: DblDouble = (x7 * x8)
    val _tmp287: DblDouble = (_tmp286 * x9)
    val _tmp289: DblDouble = (DblDouble(_const6) * _tmp287)
    val _tmp291: DblDouble = (_tmp288 + _tmp289)
    val _tmp290: DblDouble = (DblDouble(_const7) * x9)
    val _tmp292: DblDouble = (_tmp290 * x9)
    val _tmp295: DblDouble = (_tmp291 + _tmp292)
    val _tmp293: DblDouble = (x7 * x8)
    val _tmp294: DblDouble = (_tmp293 * x9)
    val _tmp296: DblDouble = (x8 * _tmp294)
    val _tmp298: DblDouble = (_tmp295 - _tmp296)
    val _tmp297: DblDouble = (DblDouble(_const8) * x9)
    val _tmp299: DblDouble = (_tmp297 * x9)
    val _tmp300: DblDouble = (_tmp298 + _tmp299)
    (_tmp300 - x8)
  } // [-170790.01234321846, 176220.0] +/- 1.589484099895344e-11

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 1.8e-12) */

    def rigidBody2_triple_64_001(x1: DblDouble, x2: DblDouble, x3: DblDouble, x4: DblDouble, x5: DblDouble, x6: DblDouble, x7: DblDouble, x8: DblDouble, x9: DblDouble): DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 3
    val _const6: DblDouble = 2
    val _const7: DblDouble = 3
    val _const8: DblDouble = 3
    val _tmp301: DblDouble = (x1 * x2)
    val _tmp302: DblDouble = (_tmp301 * x3)
    val _tmp304: DblDouble = (_const0 * _tmp302)
    val _tmp303: DblDouble = (_const1 * x3)
    val _tmp305: DblDouble = (_tmp303 * x3)
    val _tmp308: DblDouble = (_tmp304 + _tmp305)
    val _tmp306: DblDouble = (x1 * x2)
    val _tmp307: DblDouble = (_tmp306 * x3)
    val _tmp309: DblDouble = (x2 * _tmp307)
    val _tmp311: DblDouble = (_tmp308 - _tmp309)
    val _tmp310: DblDouble = (_const2 * x3)
    val _tmp312: DblDouble = (_tmp310 * x3)
    val _tmp313: DblDouble = (_tmp311 + _tmp312)
    val _tmp316: DblDouble = (_tmp313 - x2)
    val _tmp314: DblDouble = (x4 * x5)
    val _tmp315: DblDouble = (_tmp314 * x6)
    val _tmp317: DblDouble = (_const3 * _tmp315)
    val _tmp319: DblDouble = (_tmp316 + _tmp317)
    val _tmp318: DblDouble = (_const4 * x6)
    val _tmp320: DblDouble = (_tmp318 * x6)
    val _tmp323: DblDouble = (_tmp319 + _tmp320)
    val _tmp321: DblDouble = (x4 * x5)
    val _tmp322: DblDouble = (_tmp321 * x6)
    val _tmp324: DblDouble = (x5 * _tmp322)
    val _tmp326: DblDouble = (_tmp323 - _tmp324)
    val _tmp325: DblDouble = (_const5 * x6)
    val _tmp327: DblDouble = (_tmp325 * x6)
    val _tmp328: DblDouble = (_tmp326 + _tmp327)
    val _tmp331: DblDouble = (_tmp328 - x5)
    val _tmp329: DblDouble = (x7 * x8)
    val _tmp330: DblDouble = (_tmp329 * x9)
    val _tmp332: DblDouble = (_const6 * _tmp330)
    val _tmp334: DblDouble = (_tmp331 + _tmp332)
    val _tmp333: DblDouble = (_const7 * x9)
    val _tmp335: DblDouble = (_tmp333 * x9)
    val _tmp338: DblDouble = (_tmp334 + _tmp335)
    val _tmp336: DblDouble = (x7 * x8)
    val _tmp337: DblDouble = (_tmp336 * x9)
    val _tmp339: DblDouble = (x8 * _tmp337)
    val _tmp341: DblDouble = (_tmp338 - _tmp339)
    val _tmp340: DblDouble = (_const8 * x9)
    val _tmp342: DblDouble = (_tmp340 * x9)
    val _tmp343: DblDouble = (_tmp341 + _tmp342)
    (_tmp343 - x8)
  } // [-170790.01234321846, 176220.0] +/- 2.569758695146167e-28

  /* @pre: ((-15.0 <= x1) && (x1 <= 15.0) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15.0) && (-15.0 <= x4) && (x4 <= 15.0) && (-15.0 <= x5) && (x5 <= 15.0) && (-15.0 <= x6) && (x6 <= 15.0) && (-15.0 <= x7) && (x7 <= 15.0) && (-15.0 <= x8) && (x8 <= 15.0) && (-15.0 <= x9) && (x9 <= 15.0)) */
  /* @post: (res) => (res +/- 2.55e-28) */

    def rigidBody2_triple_dbldbl(x1: DblDouble, x2: DblDouble, x3: DblDouble, x4: DblDouble, x5: DblDouble, x6: DblDouble, x7: DblDouble, x8: DblDouble, x9: DblDouble): DblDouble = {
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 3
    val _const6: DblDouble = 2
    val _const7: DblDouble = 3
    val _const8: DblDouble = 3
    val _tmp344: DblDouble = (x1 * x2)
    val _tmp345: DblDouble = (_tmp344 * x3)
    val _tmp347: DblDouble = (_const0 * _tmp345)
    val _tmp346: DblDouble = (_const1 * x3)
    val _tmp348: DblDouble = (_tmp346 * x3)
    val _tmp351: DblDouble = (_tmp347 + _tmp348)
    val _tmp349: DblDouble = (x1 * x2)
    val _tmp350: DblDouble = (_tmp349 * x3)
    val _tmp352: DblDouble = (x2 * _tmp350)
    val _tmp354: DblDouble = (_tmp351 - _tmp352)
    val _tmp353: DblDouble = (_const2 * x3)
    val _tmp355: DblDouble = (_tmp353 * x3)
    val _tmp356: DblDouble = (_tmp354 + _tmp355)
    val _tmp359: DblDouble = (_tmp356 - x2)
    val _tmp357: DblDouble = (x4 * x5)
    val _tmp358: DblDouble = (_tmp357 * x6)
    val _tmp360: DblDouble = (_const3 * _tmp358)
    val _tmp362: DblDouble = (_tmp359 + _tmp360)
    val _tmp361: DblDouble = (_const4 * x6)
    val _tmp363: DblDouble = (_tmp361 * x6)
    val _tmp366: DblDouble = (_tmp362 + _tmp363)
    val _tmp364: DblDouble = (x4 * x5)
    val _tmp365: DblDouble = (_tmp364 * x6)
    val _tmp367: DblDouble = (x5 * _tmp365)
    val _tmp369: DblDouble = (_tmp366 - _tmp367)
    val _tmp368: DblDouble = (_const5 * x6)
    val _tmp370: DblDouble = (_tmp368 * x6)
    val _tmp371: DblDouble = (_tmp369 + _tmp370)
    val _tmp374: DblDouble = (_tmp371 - x5)
    val _tmp372: DblDouble = (x7 * x8)
    val _tmp373: DblDouble = (_tmp372 * x9)
    val _tmp375: DblDouble = (_const6 * _tmp373)
    val _tmp377: DblDouble = (_tmp374 + _tmp375)
    val _tmp376: DblDouble = (_const7 * x9)
    val _tmp378: DblDouble = (_tmp376 * x9)
    val _tmp381: DblDouble = (_tmp377 + _tmp378)
    val _tmp379: DblDouble = (x7 * x8)
    val _tmp380: DblDouble = (_tmp379 * x9)
    val _tmp382: DblDouble = (x8 * _tmp380)
    val _tmp384: DblDouble = (_tmp381 - _tmp382)
    val _tmp383: DblDouble = (_const8 * x9)
    val _tmp385: DblDouble = (_tmp383 * x9)
    val _tmp386: DblDouble = (_tmp384 + _tmp385)
    (_tmp386 - x8)
  } // [-170790.01234321846, 176220.0] +/- 2.569758695146167e-28

}
