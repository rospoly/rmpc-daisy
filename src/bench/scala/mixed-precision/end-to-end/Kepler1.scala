package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object Kepler1 {

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 0.00025)*/
  /*Abs error: -, Range: -*/
    def kepler1_32(x1 : Float, x2 : Float, x3 : Float, x4 : Float) : Float = {
    val _tmp3: Float = (x1 * x4)
    val _tmp: Float = -(x1)
    val _tmp1: Float = (_tmp + x2)
    val _tmp2: Float = (x3 - x4)
    val _tmp4: Float = (_tmp1 + _tmp2)
    val _tmp16: Float = (_tmp3 * _tmp4)
    val _tmp5: Float = (x1 - x2)
    val _tmp6: Float = (_tmp5 + x3)
    val _tmp7: Float = (_tmp6 + x4)
    val _tmp11: Float = (x2 * _tmp7)
    val _tmp8: Float = (x2 - x3)
    val _tmp9: Float = (x1 + _tmp8)
    val _tmp10: Float = (_tmp9 + x4)
    val _tmp12: Float = (x3 * _tmp10)
    val _tmp14: Float = (_tmp11 + _tmp12)
    val _tmp13: Float = (x3 * x2)
    val _tmp15: Float = (_tmp13 * x4)
    val _tmp17: Float = (_tmp14 - _tmp15)
    val _tmp21: Float = (_tmp16 + _tmp17)
    val _tmp19: Float = (x1 * x3)
    val _tmp18: Float = (x2 * x1)
    val _tmp20: Float = (_tmp18 + x4)
    val _tmp22: Float = (_tmp19 + _tmp20)
    (_tmp21 - _tmp22)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 0.000125)*/
  /*Abs error: -, Range: -*/
    def kepler1_32_05(x1 : Float, x2 : Float, x3 : Float, x4 : Float) : Double = {
    val _tmp26: Float = (x1 * x4)
    val _tmp23: Float = -(x1)
    val _tmp24: Float = (_tmp23 + x2)
    val _tmp25: Float = (x3 - x4)
    val _tmp27: Float = (_tmp24 + _tmp25)
    val _tmp39: Float = (_tmp26 * _tmp27)
    val _tmp28: Float = (x1 - x2)
    val _tmp29: Float = (_tmp28 + x3)
    val _tmp30: Float = (_tmp29 + x4)
    val _tmp34: Double = (x2.toDouble * _tmp30.toDouble)
    val _tmp31: Double = (x2.toDouble - x3.toDouble)
    val _tmp32: Double = (x1.toDouble + _tmp31)
    val _tmp33: Double = (_tmp32 + x4.toDouble)
    val _tmp35: Double = (x3.toDouble * _tmp33)
    val _tmp37: Double = (_tmp34 + _tmp35)
    val _tmp36: Double = (x3.toDouble * x2.toDouble)
    val _tmp38: Double = (_tmp36 * x4.toDouble)
    val _tmp40: Double = (_tmp37 - _tmp38)
    val _tmp44: Double = (_tmp39.toDouble + _tmp40)
    val _tmp42: Double = (x1.toDouble * x3.toDouble)
    val _tmp41: Double = (x2.toDouble * x1.toDouble)
    val _tmp43: Double = (_tmp41 + x4.toDouble)
    val _tmp45: Double = (_tmp42 + _tmp43)
    (_tmp44 - _tmp45)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 2.5e-05)*/
  /*Abs error: -, Range: -*/
    def kepler1_32_01(x1 : Double, x2 : Double, x3 : Double, x4 : Float) : Double = {
    val _tmp49: Double = (x1 * x4.toDouble)
    val _tmp46: Double = -(x1)
    val _tmp47: Double = (_tmp46 + x2)
    val _tmp48: Double = (x3 - x4.toDouble)
    val _tmp50: Double = (_tmp47 + _tmp48)
    val _tmp62: Double = (_tmp49 * _tmp50)
    val _tmp51: Double = (x1 - x2)
    val _tmp52: Double = (_tmp51 + x3)
    val _tmp53: Double = (_tmp52 + x4.toDouble)
    val _tmp57: Double = (x2 * _tmp53)
    val _tmp54: Double = (x2 - x3)
    val _tmp55: Double = (x1 + _tmp54)
    val _tmp56: Double = (_tmp55 + x4.toDouble)
    val _tmp58: Double = (x3 * _tmp56)
    val _tmp60: Double = (_tmp57 + _tmp58)
    val _tmp59: Double = (x3 * x2)
    val _tmp61: Double = (_tmp59 * x4.toDouble)
    val _tmp63: Double = (_tmp60 - _tmp61)
    val _tmp67: Double = (_tmp62 + _tmp63)
    val _tmp65: Double = (x1 * x3)
    val _tmp64: Double = (x2 * x1)
    val _tmp66: Double = (_tmp64 + x4.toDouble)
    val _tmp68: Double = (_tmp65 + _tmp66)
    (_tmp67 - _tmp68)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 2.5e-06)*/
  /*Abs error: -, Range: -*/
    def kepler1_32_001(x1 : Double, x2 : Double, x3 : Double, x4 : Double) : Double = {
    val _tmp72: Double = (x1 * x4)
    val _tmp69: Double = -(x1)
    val _tmp70: Double = (_tmp69 + x2)
    val _tmp71: Double = (x3 - x4)
    val _tmp73: Double = (_tmp70 + _tmp71)
    val _tmp85: Double = (_tmp72 * _tmp73)
    val _tmp74: Double = (x1 - x2)
    val _tmp75: Double = (_tmp74 + x3)
    val _tmp76: Double = (_tmp75 + x4)
    val _tmp80: Double = (x2 * _tmp76)
    val _tmp77: Double = (x2 - x3)
    val _tmp78: Double = (x1 + _tmp77)
    val _tmp79: Double = (_tmp78 + x4)
    val _tmp81: Double = (x3 * _tmp79)
    val _tmp83: Double = (_tmp80 + _tmp81)
    val _tmp82: Double = (x3 * x2)
    val _tmp84: Double = (_tmp82 * x4)
    val _tmp86: Double = (_tmp83 - _tmp84)
    val _tmp90: Double = (_tmp85 + _tmp86)
    val _tmp88: Double = (x1 * x3)
    val _tmp87: Double = (x2 * x1)
    val _tmp89: Double = (_tmp87 + x4)
    val _tmp91: Double = (_tmp88 + _tmp89)
    (_tmp90 - _tmp91)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 5.e-13)*/
  /*Abs error: -, Range: -*/
    def kepler1_64(x1 : Double, x2 : Double, x3 : Double, x4 : Double) : Double = {
    val _tmp95: Double = (x1 * x4)
    val _tmp92: Double = -(x1)
    val _tmp93: Double = (_tmp92 + x2)
    val _tmp94: Double = (x3 - x4)
    val _tmp96: Double = (_tmp93 + _tmp94)
    val _tmp108: Double = (_tmp95 * _tmp96)
    val _tmp97: Double = (x1 - x2)
    val _tmp98: Double = (_tmp97 + x3)
    val _tmp99: Double = (_tmp98 + x4)
    val _tmp103: Double = (x2 * _tmp99)
    val _tmp100: Double = (x2 - x3)
    val _tmp101: Double = (x1 + _tmp100)
    val _tmp102: Double = (_tmp101 + x4)
    val _tmp104: Double = (x3 * _tmp102)
    val _tmp106: Double = (_tmp103 + _tmp104)
    val _tmp105: Double = (x3 * x2)
    val _tmp107: Double = (_tmp105 * x4)
    val _tmp109: Double = (_tmp106 - _tmp107)
    val _tmp113: Double = (_tmp108 + _tmp109)
    val _tmp111: Double = (x1 * x3)
    val _tmp110: Double = (x2 * x1)
    val _tmp112: Double = (_tmp110 + x4)
    val _tmp114: Double = (_tmp111 + _tmp112)
    (_tmp113 - _tmp114)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 2.5e-13)*/
  /*Abs error: -, Range: -*/
    def kepler1_64_05(x1 : Double, x2 : Double, x3 : Double, x4 : Double) : DblDouble = {
    val _tmp118: Double = (x1 * x4)
    val _tmp115: Double = -(x1)
    val _tmp116: Double = (_tmp115 + x2)
    val _tmp117: Double = (x3 - x4)
    val _tmp119: Double = (_tmp116 + _tmp117)
    val _tmp131: Double = (_tmp118 * _tmp119)
    val _tmp120: Double = (x1 - x2)
    val _tmp121: Double = (_tmp120 + x3)
    val _tmp122: Double = (_tmp121 + x4)
    val _tmp126: DblDouble = (DblDouble(x2) * DblDouble(_tmp122))
    val _tmp123: DblDouble = (DblDouble(x2) - DblDouble(x3))
    val _tmp124: DblDouble = (DblDouble(x1) + _tmp123)
    val _tmp125: DblDouble = (_tmp124 + DblDouble(x4))
    val _tmp127: DblDouble = (DblDouble(x3) * _tmp125)
    val _tmp129: DblDouble = (_tmp126 + _tmp127)
    val _tmp128: DblDouble = (DblDouble(x3) * DblDouble(x2))
    val _tmp130: DblDouble = (_tmp128 * DblDouble(x4))
    val _tmp132: DblDouble = (_tmp129 - _tmp130)
    val _tmp136: DblDouble = (DblDouble(_tmp131) + _tmp132)
    val _tmp134: DblDouble = (DblDouble(x1) * DblDouble(x3))
    val _tmp133: DblDouble = (DblDouble(x2) * DblDouble(x1))
    val _tmp135: DblDouble = (_tmp133 + DblDouble(x4))
    val _tmp137: DblDouble = (_tmp134 + _tmp135)
    (_tmp136 - _tmp137)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 5.e-14)*/
  /*Abs error: -, Range: -*/
    def kepler1_64_01(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble) : DblDouble = {
    val _tmp141: DblDouble = (x1 * x4)
    val _tmp138: DblDouble = -(x1)
    val _tmp139: Double = (_tmp138 + x2).toDouble
    val _tmp140: Double = (x3 - x4).toDouble
    val _tmp142: Double = (_tmp139 + _tmp140)
    val _tmp154: DblDouble = (_tmp141 * DblDouble(_tmp142))
    val _tmp143: DblDouble = (x1 - x2)
    val _tmp144: DblDouble = (_tmp143 + x3)
    val _tmp145: DblDouble = (_tmp144 + x4)
    val _tmp149: DblDouble = (x2 * _tmp145)
    val _tmp146: DblDouble = (x2 - x3)
    val _tmp147: DblDouble = (x1 + _tmp146)
    val _tmp148: DblDouble = (_tmp147 + x4)
    val _tmp150: DblDouble = (x3 * _tmp148)
    val _tmp152: DblDouble = (_tmp149 + _tmp150)
    val _tmp151: DblDouble = (x3 * x2)
    val _tmp153: DblDouble = (_tmp151 * x4)
    val _tmp155: DblDouble = (_tmp152 - _tmp153)
    val _tmp159: DblDouble = (_tmp154 + _tmp155)
    val _tmp157: DblDouble = (x1 * x3)
    val _tmp156: DblDouble = (x2 * x1)
    val _tmp158: DblDouble = (_tmp156 + x4)
    val _tmp160: DblDouble = (_tmp157 + _tmp158)
    (_tmp159 - _tmp160)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 5.e-15)*/
  /*Abs error: -, Range: -*/
    def kepler1_64_001(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble) : DblDouble = {
    val _tmp164: DblDouble = (x1 * x4)
    val _tmp161: DblDouble = -(x1)
    val _tmp162: DblDouble = (_tmp161 + x2)
    val _tmp163: DblDouble = (x3 - x4)
    val _tmp165: DblDouble = (_tmp162 + _tmp163)
    val _tmp177: DblDouble = (_tmp164 * _tmp165)
    val _tmp166: DblDouble = (x1 - x2)
    val _tmp167: DblDouble = (_tmp166 + x3)
    val _tmp168: DblDouble = (_tmp167 + x4)
    val _tmp172: DblDouble = (x2 * _tmp168)
    val _tmp169: DblDouble = (x2 - x3)
    val _tmp170: DblDouble = (x1 + _tmp169)
    val _tmp171: DblDouble = (_tmp170 + x4)
    val _tmp173: DblDouble = (x3 * _tmp171)
    val _tmp175: DblDouble = (_tmp172 + _tmp173)
    val _tmp174: DblDouble = (x3 * x2)
    val _tmp176: DblDouble = (_tmp174 * x4)
    val _tmp178: DblDouble = (_tmp175 - _tmp176)
    val _tmp182: DblDouble = (_tmp177 + _tmp178)
    val _tmp180: DblDouble = (x1 * x3)
    val _tmp179: DblDouble = (x2 * x1)
    val _tmp181: DblDouble = (_tmp179 + x4)
    val _tmp183: DblDouble = (_tmp180 + _tmp181)
    (_tmp182 - _tmp183)
  }

  /*@pre : ((4. <= x1) && (x1 <= 6.36) && (4. <= x2) && (x2 <= 6.36) && (4. <= x3) && (x3 <= 6.36) && (4. <= x4) && (x4 <= 6.36))*/
  /*@post: (res) => (res +/- 2.e-28)*/
  /*Abs error: -, Range: -*/
    def kepler1_dbldbl(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble) : DblDouble = {
    val _tmp187: DblDouble = (x1 * x4)
    val _tmp184: DblDouble = -(x1)
    val _tmp185: DblDouble = (_tmp184 + x2)
    val _tmp186: DblDouble = (x3 - x4)
    val _tmp188: DblDouble = (_tmp185 + _tmp186)
    val _tmp200: DblDouble = (_tmp187 * _tmp188)
    val _tmp189: DblDouble = (x1 - x2)
    val _tmp190: DblDouble = (_tmp189 + x3)
    val _tmp191: DblDouble = (_tmp190 + x4)
    val _tmp195: DblDouble = (x2 * _tmp191)
    val _tmp192: DblDouble = (x2 - x3)
    val _tmp193: DblDouble = (x1 + _tmp192)
    val _tmp194: DblDouble = (_tmp193 + x4)
    val _tmp196: DblDouble = (x3 * _tmp194)
    val _tmp198: DblDouble = (_tmp195 + _tmp196)
    val _tmp197: DblDouble = (x3 * x2)
    val _tmp199: DblDouble = (_tmp197 * x4)
    val _tmp201: DblDouble = (_tmp198 - _tmp199)
    val _tmp205: DblDouble = (_tmp200 + _tmp201)
    val _tmp203: DblDouble = (x1 * x3)
    val _tmp202: DblDouble = (x2 * x1)
    val _tmp204: DblDouble = (_tmp202 + x4)
    val _tmp206: DblDouble = (_tmp203 + _tmp204)
    (_tmp205 - _tmp206)
  }

}
