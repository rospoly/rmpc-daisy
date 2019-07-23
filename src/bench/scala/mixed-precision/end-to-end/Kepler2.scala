package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Kepler2 {

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 0.0015)*/
  /*Abs error: -, Range: -*/
    def kepler2_32(x1 : Float, x2 : Float, x3 : Float, x4 : Float, x5 : Float, x6 : Float) : Float = {
    val _tmp: Float = -(x1)
    val _tmp1: Float = (_tmp + x2)
    val _tmp2: Float = (x3 - x4)
    val _tmp3: Float = (_tmp1 + _tmp2)
    val _tmp4: Float = (_tmp3 + x5)
    val _tmp5: Float = (_tmp4 + x6)
    val _tmp6: Float = (x4 * _tmp5)
    val _tmp13: Float = (x1 * _tmp6)
    val _tmp7: Float = (x1 - x2)
    val _tmp8: Float = (_tmp7 + x3)
    val _tmp9: Float = (_tmp8 + x4)
    val _tmp10: Float = (x5 - x6)
    val _tmp11: Float = (_tmp9 - _tmp10)
    val _tmp12: Float = (x5 * _tmp11)
    val _tmp14: Float = (x2 * _tmp12)
    val _tmp33: Float = (_tmp13 + _tmp14)
    val _tmp15: Float = (x2 - x3)
    val _tmp16: Float = (x1 + _tmp15)
    val _tmp17: Float = (_tmp16 + x4)
    val _tmp18: Float = (x5 - x6)
    val _tmp19: Float = (_tmp17 + _tmp18)
    val _tmp20: Float = (x3 * _tmp19)
    val _tmp22: Float = (x6 * _tmp20)
    val _tmp21: Float = (x2 * x3)
    val _tmp23: Float = (x4 * _tmp21)
    val _tmp28: Float = (_tmp22 - _tmp23)
    val _tmp24: Float = (x1 * x3)
    val _tmp26: Float = (_tmp24 * x5)
    val _tmp25: Float = (x1 * x2)
    val _tmp27: Float = (_tmp25 * x6)
    val _tmp29: Float = (_tmp26 + _tmp27)
    val _tmp31: Float = (_tmp28 - _tmp29)
    val _tmp30: Float = (x4 * x5)
    val _tmp32: Float = (_tmp30 * x6)
    val _tmp34: Float = (_tmp31 - _tmp32)
    (_tmp33 + _tmp34)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 0.00075)*/
  /*Abs error: -, Range: -*/
    def kepler2_32_05(x1 : Float, x2 : Float, x3 : Float, x4 : Float, x5 : Float, x6 : Float) : Double = {
    val _tmp35: Float = -(x1)
    val _tmp36: Float = (_tmp35 + x2)
    val _tmp37: Float = (x3 - x4)
    val _tmp38: Float = (_tmp36 + _tmp37)
    val _tmp39: Float = (_tmp38 + x5)
    val _tmp40: Float = (_tmp39 + x6)
    val _tmp41: Float = (x4 * _tmp40)
    val _tmp48: Float = (x1 * _tmp41)
    val _tmp42: Float = (x1 - x2)
    val _tmp43: Float = (_tmp42 + x3)
    val _tmp44: Float = (_tmp43 + x4)
    val _tmp45: Float = (x5 - x6)
    val _tmp46: Float = (_tmp44 - _tmp45)
    val _tmp47: Float = (x5 * _tmp46)
    val _tmp49: Float = (x2 * _tmp47)
    val _tmp68: Float = (_tmp48 + _tmp49)
    val _tmp50: Float = (x2 - x3)
    val _tmp51: Float = (x1 + _tmp50)
    val _tmp52: Float = (_tmp51 + x4)
    val _tmp53: Float = (x5 - x6)
    val _tmp54: Float = (_tmp52 + _tmp53)
    val _tmp55: Float = (x3 * _tmp54)
    val _tmp57: Float = (x6 * _tmp55)
    val _tmp56: Float = (x2 * x3)
    val _tmp58: Double = (x4.toDouble * _tmp56.toDouble)
    val _tmp63: Double = (_tmp57.toDouble - _tmp58)
    val _tmp59: Double = (x1.toDouble * x3.toDouble)
    val _tmp61: Double = (_tmp59 * x5.toDouble)
    val _tmp60: Double = (x1.toDouble * x2.toDouble)
    val _tmp62: Double = (_tmp60 * x6.toDouble)
    val _tmp64: Double = (_tmp61 + _tmp62)
    val _tmp66: Double = (_tmp63 - _tmp64)
    val _tmp65: Double = (x4.toDouble * x5.toDouble)
    val _tmp67: Double = (_tmp65 * x6.toDouble)
    val _tmp69: Double = (_tmp66 - _tmp67)
    (_tmp68 + _tmp69)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 0.00015)*/
  /*Abs error: -, Range: -*/
    def kepler2_32_01(x1 : Double, x2 : Double, x3 : Float, x4 : Float, x5 : Float, x6 : Double) : Double = {
    val _tmp70: Double = -(x1)
    val _tmp71: Double = (_tmp70 + x2)
    val _tmp72: Double = (x3.toDouble - x4.toDouble)
    val _tmp73: Double = (_tmp71 + _tmp72)
    val _tmp74: Double = (_tmp73 + x5.toDouble)
    val _tmp75: Double = (_tmp74 + x6)
    val _tmp76: Double = (x4.toDouble * _tmp75)
    val _tmp83: Double = (x1 * _tmp76)
    val _tmp77: Double = (x1 - x2)
    val _tmp78: Double = (_tmp77 + x3.toDouble)
    val _tmp79: Double = (_tmp78 + x4.toDouble)
    val _tmp80: Double = (x5.toDouble - x6)
    val _tmp81: Double = (_tmp79 - _tmp80)
    val _tmp82: Double = (x5.toDouble * _tmp81)
    val _tmp84: Double = (x2 * _tmp82)
    val _tmp103: Double = (_tmp83 + _tmp84)
    val _tmp85: Double = (x2 - x3.toDouble)
    val _tmp86: Double = (x1 + _tmp85)
    val _tmp87: Double = (_tmp86 + x4.toDouble)
    val _tmp88: Double = (x5.toDouble - x6)
    val _tmp89: Double = (_tmp87 + _tmp88)
    val _tmp90: Double = (x3.toDouble * _tmp89)
    val _tmp92: Double = (x6 * _tmp90)
    val _tmp91: Double = (x2 * x3.toDouble)
    val _tmp93: Double = (x4.toDouble * _tmp91)
    val _tmp98: Double = (_tmp92 - _tmp93)
    val _tmp94: Double = (x1 * x3.toDouble)
    val _tmp96: Double = (_tmp94 * x5.toDouble)
    val _tmp95: Double = (x1 * x2)
    val _tmp97: Double = (_tmp95 * x6)
    val _tmp99: Double = (_tmp96 + _tmp97)
    val _tmp101: Double = (_tmp98 - _tmp99)
    val _tmp100: Double = (x4.toDouble * x5.toDouble)
    val _tmp102: Double = (_tmp100 * x6)
    val _tmp104: Double = (_tmp101 - _tmp102)
    (_tmp103 + _tmp104)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 1.5e-05)*/
  /*Abs error: -, Range: -*/
    def kepler2_32_001(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : Double = {
    val _tmp105: Double = -(x1)
    val _tmp106: Double = (_tmp105 + x2)
    val _tmp107: Double = (x3 - x4)
    val _tmp108: Double = (_tmp106 + _tmp107)
    val _tmp109: Double = (_tmp108 + x5)
    val _tmp110: Double = (_tmp109 + x6)
    val _tmp111: Double = (x4 * _tmp110)
    val _tmp118: Double = (x1 * _tmp111)
    val _tmp112: Double = (x1 - x2)
    val _tmp113: Double = (_tmp112 + x3)
    val _tmp114: Double = (_tmp113 + x4)
    val _tmp115: Double = (x5 - x6)
    val _tmp116: Double = (_tmp114 - _tmp115)
    val _tmp117: Double = (x5 * _tmp116)
    val _tmp119: Double = (x2 * _tmp117)
    val _tmp138: Double = (_tmp118 + _tmp119)
    val _tmp120: Double = (x2 - x3)
    val _tmp121: Double = (x1 + _tmp120)
    val _tmp122: Double = (_tmp121 + x4)
    val _tmp123: Double = (x5 - x6)
    val _tmp124: Double = (_tmp122 + _tmp123)
    val _tmp125: Double = (x3 * _tmp124)
    val _tmp127: Double = (x6 * _tmp125)
    val _tmp126: Double = (x2 * x3)
    val _tmp128: Double = (x4 * _tmp126)
    val _tmp133: Double = (_tmp127 - _tmp128)
    val _tmp129: Double = (x1 * x3)
    val _tmp131: Double = (_tmp129 * x5)
    val _tmp130: Double = (x1 * x2)
    val _tmp132: Double = (_tmp130 * x6)
    val _tmp134: Double = (_tmp131 + _tmp132)
    val _tmp136: Double = (_tmp133 - _tmp134)
    val _tmp135: Double = (x4 * x5)
    val _tmp137: Double = (_tmp135 * x6)
    val _tmp139: Double = (_tmp136 - _tmp137)
    (_tmp138 + _tmp139)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 2.5e-12)*/
  /*Abs error: -, Range: -*/
    def kepler2_64(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : Double = {
    val _tmp140: Double = -(x1)
    val _tmp141: Double = (_tmp140 + x2)
    val _tmp142: Double = (x3 - x4)
    val _tmp143: Double = (_tmp141 + _tmp142)
    val _tmp144: Double = (_tmp143 + x5)
    val _tmp145: Double = (_tmp144 + x6)
    val _tmp146: Double = (x4 * _tmp145)
    val _tmp153: Double = (x1 * _tmp146)
    val _tmp147: Double = (x1 - x2)
    val _tmp148: Double = (_tmp147 + x3)
    val _tmp149: Double = (_tmp148 + x4)
    val _tmp150: Double = (x5 - x6)
    val _tmp151: Double = (_tmp149 - _tmp150)
    val _tmp152: Double = (x5 * _tmp151)
    val _tmp154: Double = (x2 * _tmp152)
    val _tmp173: Double = (_tmp153 + _tmp154)
    val _tmp155: Double = (x2 - x3)
    val _tmp156: Double = (x1 + _tmp155)
    val _tmp157: Double = (_tmp156 + x4)
    val _tmp158: Double = (x5 - x6)
    val _tmp159: Double = (_tmp157 + _tmp158)
    val _tmp160: Double = (x3 * _tmp159)
    val _tmp162: Double = (x6 * _tmp160)
    val _tmp161: Double = (x2 * x3)
    val _tmp163: Double = (x4 * _tmp161)
    val _tmp168: Double = (_tmp162 - _tmp163)
    val _tmp164: Double = (x1 * x3)
    val _tmp166: Double = (_tmp164 * x5)
    val _tmp165: Double = (x1 * x2)
    val _tmp167: Double = (_tmp165 * x6)
    val _tmp169: Double = (_tmp166 + _tmp167)
    val _tmp171: Double = (_tmp168 - _tmp169)
    val _tmp170: Double = (x4 * x5)
    val _tmp172: Double = (_tmp170 * x6)
    val _tmp174: Double = (_tmp171 - _tmp172)
    (_tmp173 + _tmp174)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 1.25e-12)*/
  /*Abs error: -, Range: -*/
    def kepler2_64_05(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : DblDouble = {
    val _tmp175: Double = -(x1)
    val _tmp176: Double = (_tmp175 + x2)
    val _tmp177: Double = (x3 - x4)
    val _tmp178: Double = (_tmp176 + _tmp177)
    val _tmp179: Double = (_tmp178 + x5)
    val _tmp180: Double = (_tmp179 + x6)
    val _tmp181: Double = (x4 * _tmp180)
    val _tmp188: Double = (x1 * _tmp181)
    val _tmp182: Double = (x1 - x2)
    val _tmp183: Double = (_tmp182 + x3)
    val _tmp184: Double = (_tmp183 + x4)
    val _tmp185: Double = (x5 - x6)
    val _tmp186: Double = (_tmp184 - _tmp185)
    val _tmp187: Double = (x5 * _tmp186)
    val _tmp189: DblDouble = (DblDouble(x2) * DblDouble(_tmp187))
    val _tmp208: DblDouble = (DblDouble(_tmp188) + _tmp189)
    val _tmp190: DblDouble = (DblDouble(x2) - DblDouble(x3))
    val _tmp191: DblDouble = (DblDouble(x1) + _tmp190)
    val _tmp192: DblDouble = (_tmp191 + DblDouble(x4))
    val _tmp193: DblDouble = (DblDouble(x5) - DblDouble(x6))
    val _tmp194: DblDouble = (_tmp192 + _tmp193)
    val _tmp195: DblDouble = (DblDouble(x3) * _tmp194)
    val _tmp197: DblDouble = (DblDouble(x6) * _tmp195)
    val _tmp196: DblDouble = (DblDouble(x2) * DblDouble(x3))
    val _tmp198: Double = (DblDouble(x4) * _tmp196).toDouble
    val _tmp203: Double = (_tmp197 - DblDouble(_tmp198)).toDouble
    val _tmp199: Double = (x1 * x3)
    val _tmp201: Double = (_tmp199 * x5)
    val _tmp200: Double = (x1 * x2)
    val _tmp202: Double = (_tmp200 * x6)
    val _tmp204: Double = (_tmp201 + _tmp202)
    val _tmp206: Double = (_tmp203 - _tmp204)
    val _tmp205: Double = (x4 * x5)
    val _tmp207: Double = (_tmp205 * x6)
    val _tmp209: Double = (_tmp206 - _tmp207)
    (_tmp208 + _tmp209)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 2.5e-13)*/
  /*Abs error: -, Range: -*/
    def kepler2_64_01(x1 : Double, x2 : Double, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    val _tmp210: DblDouble = -(x1)
    val _tmp211: DblDouble = (_tmp210 + DblDouble(x2))
    val _tmp212: DblDouble = (x3 - x4)
    val _tmp213: DblDouble = (_tmp211 + _tmp212)
    val _tmp214: DblDouble = (_tmp213 + x5)
    val _tmp215: DblDouble = (_tmp214 + x6)
    val _tmp216: DblDouble = (x4 * _tmp215)
    val _tmp223: DblDouble = (DblDouble(x1) * _tmp216)
    val _tmp217: DblDouble = (DblDouble(x1) - DblDouble(x2))
    val _tmp218: DblDouble = (_tmp217 + x3)
    val _tmp219: DblDouble = (_tmp218 + x4)
    val _tmp220: DblDouble = (x5 - x6)
    val _tmp221: DblDouble = (_tmp219 - _tmp220)
    val _tmp222: DblDouble = (x5 * _tmp221)
    val _tmp224: DblDouble = (DblDouble(x2) * _tmp222)
    val _tmp243: DblDouble = (_tmp223 + _tmp224)
    val _tmp225: DblDouble = (DblDouble(x2) - x3)
    val _tmp226: DblDouble = (DblDouble(x1) + _tmp225)
    val _tmp227: DblDouble = (_tmp226 + x4)
    val _tmp228: DblDouble = (x5 - x6)
    val _tmp229: DblDouble = (_tmp227 + _tmp228)
    val _tmp230: DblDouble = (x3 * _tmp229)
    val _tmp232: DblDouble = (x6 * _tmp230)
    val _tmp231: DblDouble = (DblDouble(x2) * x3)
    val _tmp233: DblDouble = (x4 * _tmp231)
    val _tmp238: DblDouble = (_tmp232 - _tmp233)
    val _tmp234: DblDouble = (DblDouble(x1) * x3)
    val _tmp236: DblDouble = (_tmp234 * x5)
    val _tmp235: DblDouble = (DblDouble(x1) * DblDouble(x2))
    val _tmp237: DblDouble = (_tmp235 * x6)
    val _tmp239: DblDouble = (_tmp236 + _tmp237)
    val _tmp241: DblDouble = (_tmp238 - _tmp239)
    val _tmp240: DblDouble = (x4 * x5)
    val _tmp242: DblDouble = (_tmp240 * x6)
    val _tmp244: DblDouble = (_tmp241 - _tmp242)
    (_tmp243 + _tmp244)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 2.5e-14)*/
  /*Abs error: -, Range: -*/
    def kepler2_64_001(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    val _tmp245: DblDouble = -(x1)
    val _tmp246: DblDouble = (_tmp245 + x2)
    val _tmp247: DblDouble = (x3 - x4)
    val _tmp248: DblDouble = (_tmp246 + _tmp247)
    val _tmp249: DblDouble = (_tmp248 + x5)
    val _tmp250: DblDouble = (_tmp249 + x6)
    val _tmp251: DblDouble = (x4 * _tmp250)
    val _tmp258: DblDouble = (x1 * _tmp251)
    val _tmp252: DblDouble = (x1 - x2)
    val _tmp253: DblDouble = (_tmp252 + x3)
    val _tmp254: DblDouble = (_tmp253 + x4)
    val _tmp255: DblDouble = (x5 - x6)
    val _tmp256: DblDouble = (_tmp254 - _tmp255)
    val _tmp257: DblDouble = (x5 * _tmp256)
    val _tmp259: DblDouble = (x2 * _tmp257)
    val _tmp278: DblDouble = (_tmp258 + _tmp259)
    val _tmp260: DblDouble = (x2 - x3)
    val _tmp261: DblDouble = (x1 + _tmp260)
    val _tmp262: DblDouble = (_tmp261 + x4)
    val _tmp263: DblDouble = (x5 - x6)
    val _tmp264: DblDouble = (_tmp262 + _tmp263)
    val _tmp265: DblDouble = (x3 * _tmp264)
    val _tmp267: DblDouble = (x6 * _tmp265)
    val _tmp266: DblDouble = (x2 * x3)
    val _tmp268: DblDouble = (x4 * _tmp266)
    val _tmp273: DblDouble = (_tmp267 - _tmp268)
    val _tmp269: DblDouble = (x1 * x3)
    val _tmp271: DblDouble = (_tmp269 * x5)
    val _tmp270: DblDouble = (x1 * x2)
    val _tmp272: DblDouble = (_tmp270 * x6)
    val _tmp274: DblDouble = (_tmp271 + _tmp272)
    val _tmp276: DblDouble = (_tmp273 - _tmp274)
    val _tmp275: DblDouble = (x4 * x5)
    val _tmp277: DblDouble = (_tmp275 * x6)
    val _tmp279: DblDouble = (_tmp276 - _tmp277)
    (_tmp278 + _tmp279)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36) && (4. <= x5) && (x5 <= 6.36) && (4. <= x6) && (x6 <= 6.36))*/
  /*@post: (res) => (res +/- 7.e-28)*/
  /*Abs error: -, Range: -*/
    def kepler2_dbldbl(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    val _tmp280: DblDouble = -(x1)
    val _tmp281: DblDouble = (_tmp280 + x2)
    val _tmp282: DblDouble = (x3 - x4)
    val _tmp283: DblDouble = (_tmp281 + _tmp282)
    val _tmp284: DblDouble = (_tmp283 + x5)
    val _tmp285: DblDouble = (_tmp284 + x6)
    val _tmp286: DblDouble = (x4 * _tmp285)
    val _tmp293: DblDouble = (x1 * _tmp286)
    val _tmp287: DblDouble = (x1 - x2)
    val _tmp288: DblDouble = (_tmp287 + x3)
    val _tmp289: DblDouble = (_tmp288 + x4)
    val _tmp290: DblDouble = (x5 - x6)
    val _tmp291: DblDouble = (_tmp289 - _tmp290)
    val _tmp292: DblDouble = (x5 * _tmp291)
    val _tmp294: DblDouble = (x2 * _tmp292)
    val _tmp313: DblDouble = (_tmp293 + _tmp294)
    val _tmp295: DblDouble = (x2 - x3)
    val _tmp296: DblDouble = (x1 + _tmp295)
    val _tmp297: DblDouble = (_tmp296 + x4)
    val _tmp298: DblDouble = (x5 - x6)
    val _tmp299: DblDouble = (_tmp297 + _tmp298)
    val _tmp300: DblDouble = (x3 * _tmp299)
    val _tmp302: DblDouble = (x6 * _tmp300)
    val _tmp301: DblDouble = (x2 * x3)
    val _tmp303: DblDouble = (x4 * _tmp301)
    val _tmp308: DblDouble = (_tmp302 - _tmp303)
    val _tmp304: DblDouble = (x1 * x3)
    val _tmp306: DblDouble = (_tmp304 * x5)
    val _tmp305: DblDouble = (x1 * x2)
    val _tmp307: DblDouble = (_tmp305 * x6)
    val _tmp309: DblDouble = (_tmp306 + _tmp307)
    val _tmp311: DblDouble = (_tmp308 - _tmp309)
    val _tmp310: DblDouble = (x4 * x5)
    val _tmp312: DblDouble = (_tmp310 * x6)
    val _tmp314: DblDouble = (_tmp311 - _tmp312)
    (_tmp313 + _tmp314)
  }

}