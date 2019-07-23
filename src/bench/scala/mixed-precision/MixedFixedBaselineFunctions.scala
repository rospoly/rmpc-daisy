package daisy
package bench

import scala.annotation.strictfp
import tools.DblDouble

@strictfp
object MixedFixedBaselineFunctions {

  def bspline0_Fixed16(u : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 32768
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _tmp: Int = (_const0 - u)
    val _tmp1: Int = (_const1 - u)
    val _tmp2: Int = ((_tmp * _tmp1) >> 15)
    val _tmp3: Int = (_const2 - u)
    val _tmp4: Int = ((_tmp2 * _tmp3) >> 15)
    ((_tmp4 << 14) / _const3)
  }

  def bspline0_Fixed32(u : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 2147483648l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _tmp20: Long = (_const0 - u)
    val _tmp21: Long = (_const1 - u)
    val _tmp22: Long = ((_tmp20 * _tmp21) >> 31)
    val _tmp23: Long = (_const2 - u)
    val _tmp24: Long = ((_tmp22 * _tmp23) >> 31)
    ((_tmp24 << 30) / _const3)
  }

  def bspline1_Fixed16(u : Int) : Int = {
    val _const0: Int = 49152
    val _const1: Int = 49152
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _tmp: Int = ((_const0 * u) >> 15)
    val _tmp1: Int = ((_tmp * u) >> 15)
    val _tmp3: Int = ((_tmp1 * u) >> 15)
    val _tmp2: Int = ((_const1 * u) >> 15)
    val _tmp4: Int = ((_tmp2 * u) >> 15)
    val _tmp5: Int = (_tmp3 - (_tmp4 << 1))
    val _tmp6: Int = ((_tmp5 + (_const2 << 1)) >> 1)
    ((_tmp6 << 16) / _const3)
  }

  def bspline1_Fixed32(u : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _tmp28: Long = ((_const0 * u) >> 31)
    val _tmp29: Long = ((_tmp28 * u) >> 31)
    val _tmp31: Long = ((_tmp29 * u) >> 31)
    val _tmp30: Long = ((_const1 * u) >> 31)
    val _tmp32: Long = ((_tmp30 * u) >> 31)
    val _tmp33: Long = (_tmp31 - (_tmp32 << 1))
    val _tmp34: Long = ((_tmp33 + (_const2 << 1)) >> 1)
    ((_tmp34 << 32) / _const3)
  }



  def bspline2_Fixed16(u : Int) : Int = {
    val _const0: Int = -49153
    val _const1: Int = 49152
    val _const2: Int = 49152
    val _const3: Int = 32768
    val _const4: Int = 49152
    val _tmp: Int = ((_const0 * u) >> 15)
    val _tmp1: Int = ((_tmp * u) >> 15)
    val _tmp3: Int = ((_tmp1 * u) >> 15)
    val _tmp2: Int = ((_const1 * u) >> 15)
    val _tmp4: Int = ((_tmp2 * u) >> 15)
    val _tmp5: Int = ((_tmp3 + _tmp4) << 2)
    val _tmp6: Int = ((_const2 * u) >> 15)
    val _tmp7: Int = ((_tmp5 + (_tmp6 << 2)) >> 2)
    val _tmp8: Int = (((_tmp7 << 1) + _const3) >> 2)
    ((_tmp8 << 16) / _const4)
  }


  def bspline2_Fixed32(u : Long) : Long = {
    val _const0: Long = -3221225473l
    val _const1: Long = 3221225472l
    val _const2: Long = 3221225472l
    val _const3: Long = 2147483648l
    val _const4: Long = 3221225472l
    val _tmp36: Long = ((_const0 * u) >> 31)
    val _tmp37: Long = ((_tmp36 * u) >> 31)
    val _tmp39: Long = ((_tmp37 * u) >> 31)
    val _tmp38: Long = ((_const1 * u) >> 31)
    val _tmp40: Long = ((_tmp38 * u) >> 31)
    val _tmp41: Long = ((_tmp39 + _tmp40) << 2)
    val _tmp42: Long = ((_const2 * u) >> 31)
    val _tmp43: Long = ((_tmp41 + (_tmp42 << 2)) >> 2)
    val _tmp44: Long = (((_tmp43 << 1) + _const3) >> 2)
    ((_tmp44 << 32) / _const4)
  }


  // def doppler_Float(u: Float, v: Float, T: Float): Float = {
  //   val t1 = 331.4f + 0.6f * T
  //   (- (t1) *v) / ((t1 + u)*(t1 + u))
  // }

  // def doppler_Double(u: Double, v: Double, T: Double): Double = {
  //   val t1 = 331.4 + 0.6 * T
  //   (- (t1) *v) / ((t1 + u)*(t1 + u))
  // }

  def himmilbeau_Fixed16(x1 : Int, x2 : Int) : Int = {
    val _const0: Int = 45056
    val _const1: Int = 45056
    val _const2: Int = 57344
    val _const3: Int = 57344
    val _tmp: Int = ((x1 * x1) >> 15)
    val _tmp1: Int = (((_tmp << 2) + x2) >> 2)
    val _tmp4: Int = (((_tmp1 << 1) - _const0) >> 1)
    val _tmp2: Int = ((x1 * x1) >> 15)
    val _tmp3: Int = (((_tmp2 << 2) + x2) >> 2)
    val _tmp5: Int = (((_tmp3 << 1) - _const1) >> 1)
    val _tmp12: Int = ((_tmp4 * _tmp5) >> 15)
    val _tmp6: Int = ((x2 * x2) >> 15)
    val _tmp7: Int = ((x1 + (_tmp6 << 2)) >> 2)
    val _tmp10: Int = (((_tmp7 << 2) - _const2) >> 2)
    val _tmp8: Int = ((x2 * x2) >> 15)
    val _tmp9: Int = ((x1 + (_tmp8 << 2)) >> 2)
    val _tmp11: Int = (((_tmp9 << 2) - _const3) >> 2)
    val _tmp13: Int = ((_tmp10 * _tmp11) >> 16)
    ((_tmp12 + (_tmp13 << 1)) >> 1)
  }


  def himmilbeau_Fixed32(x1 : Long, x2 : Long) : Long = {
    val _const0: Long = 2952790016l
    val _const1: Long = 2952790016l
    val _const2: Long = 3758096384l
    val _const3: Long = 3758096384l
    val _tmp56: Long = ((x1 * x1) >> 31)
    val _tmp57: Long = (((_tmp56 << 2) + x2) >> 2)
    val _tmp60: Long = (((_tmp57 << 1) - _const0) >> 1)
    val _tmp58: Long = ((x1 * x1) >> 31)
    val _tmp59: Long = (((_tmp58 << 2) + x2) >> 2)
    val _tmp61: Long = (((_tmp59 << 1) - _const1) >> 1)
    val _tmp68: Long = ((_tmp60 * _tmp61) >> 31)
    val _tmp62: Long = ((x2 * x2) >> 31)
    val _tmp63: Long = ((x1 + (_tmp62 << 2)) >> 2)
    val _tmp66: Long = (((_tmp63 << 2) - _const2) >> 2)
    val _tmp64: Long = ((x2 * x2) >> 31)
    val _tmp65: Long = ((x1 + (_tmp64 << 2)) >> 2)
    val _tmp67: Long = (((_tmp65 << 2) - _const3) >> 2)
    val _tmp69: Long = ((_tmp66 * _tmp67) >> 32)
    ((_tmp68 + (_tmp69 << 1)) >> 1)
  }



  def invPendulum_Fixed16(s1 : Int, s2 : Int, s3 : Int, s4 : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 54287
    val _const2: Int = -38268
    val _const3: Int = -56679
    val _tmp: Int = ((_const0 * s1) >> 15)
    val _tmp1: Int = ((_const1 * s2) >> 16)
    val _tmp2: Int = (((_tmp << 1) + _tmp1) >> 2)
    val _tmp3: Int = ((_const2 * s3) >> 15)
    val _tmp4: Int = (((_tmp2 << 3) + _tmp3) >> 3)
    val _tmp5: Int = ((_const3 * s4) >> 16)
    (((_tmp4 << 5) + _tmp5) >> 5)
  }

  def invPendulum_Fixed32(s1 : Long, s2 : Long, s3 : Long, s4 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3557736160l
    val _const2: Long = -2507911935l
    val _const3: Long = -3714502466l
    val _tmp24: Long = ((_const0 * s1) >> 31)
    val _tmp25: Long = ((_const1 * s2) >> 32)
    val _tmp26: Long = (((_tmp24 << 1) + _tmp25) >> 2)
    val _tmp27: Long = ((_const2 * s3) >> 31)
    val _tmp28: Long = (((_tmp26 << 3) + _tmp27) >> 3)
    val _tmp29: Long = ((_const3 * s4) >> 32)
    (((_tmp28 << 5) + _tmp29) >> 5)
  }


  def kepler0_Fixed16(x1 : Int, x2 : Int, x3 : Int, x4 : Int, x5 : Int, x6 : Int) : Int = {
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

   def kepler0_Fixed32(x1 : Long, x2 : Long, x3 : Long, x4 : Long, x5 : Long, x6 : Long) : Long = {
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


  def kepler1_Fixed16(x1 : Int, x2 : Int, x3 : Int, x4 : Int) : Int = {
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

  def kepler1_Fixed32(x1 : Long, x2 : Long, x3 : Long, x4 : Long) : Long = {
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


  def kepler2_Fixed16(x1 : Int, x2 : Int, x3 : Int, x4 : Int, x5 : Int, x6 : Int) : Int = {
    val _tmp5: Int = ((x1 * x4) >> 16)
    val _tmp: Int = -(x1)
    val _tmp1: Int = ((_tmp + x2) << 1)
    val _tmp2: Int = ((_tmp1 + (x3 << 1)) >> 2)
    val _tmp3: Int = ((_tmp2 << 1) - x4)
    val _tmp4: Int = ((_tmp3 + x5) >> 1)
    val _tmp6: Int = (((_tmp4 << 1) + x6) >> 2)
    val _tmp13: Int = ((_tmp5 * _tmp6) >> 15)
    val _tmp11: Int = ((x2 * x5) >> 16)
    val _tmp7: Int = ((x1 - x2) << 1)
    val _tmp8: Int = ((_tmp7 + (x3 << 1)) >> 2)
    val _tmp9: Int = (((_tmp8 << 1) + x4) >> 1)
    val _tmp10: Int = (((_tmp9 << 1) - x5) >> 1)
    val _tmp12: Int = (((_tmp10 << 1) + x6) >> 2)
    val _tmp14: Int = ((_tmp11 * _tmp12) >> 15)
    val _tmp21: Int = ((_tmp13 + _tmp14) >> 1)
    val _tmp19: Int = ((x3 * x6) >> 16)
    val _tmp15: Int = ((x1 + x2) >> 1)
    val _tmp16: Int = (((_tmp15 << 1) - x3) >> 1)
    val _tmp17: Int = (((_tmp16 << 1) + x4) >> 1)
    val _tmp18: Int = (((_tmp17 << 1) + x5) >> 2)
    val _tmp20: Int = (((_tmp18 << 2) - x6) >> 2)
    val _tmp22: Int = ((_tmp19 * _tmp20) >> 15)
    val _tmp24: Int = (((_tmp21 << 1) + _tmp22) >> 1)
    val _tmp23: Int = ((x2 * x3) >> 16)
    val _tmp25: Int = ((_tmp23 * x4) >> 16)
    val _tmp27: Int = (((_tmp24 << 2) - _tmp25) >> 2)
    val _tmp26: Int = ((x1 * x3) >> 16)
    val _tmp28: Int = ((_tmp26 * x5) >> 16)
    val _tmp30: Int = (((_tmp27 << 2) - _tmp28) >> 2)
    val _tmp29: Int = ((x1 * x2) >> 16)
    val _tmp31: Int = ((_tmp29 * x6) >> 16)
    val _tmp33: Int = (((_tmp30 << 2) - _tmp31) >> 2)
    val _tmp32: Int = ((x4 * x5) >> 16)
    val _tmp34: Int = ((_tmp32 * x6) >> 16)
    (((_tmp33 << 2) - _tmp34) >> 1)
  }

  def kepler2_Fixed32(x1 : Long, x2 : Long, x3 : Long, x4 : Long, x5 : Long, x6 : Long) : Long = {
    val _tmp145: Long = ((x1 * x4) >> 32)
    val _tmp140: Long = -(x1)
    val _tmp141: Long = ((_tmp140 + x2) << 1)
    val _tmp142: Long = ((_tmp141 + (x3 << 1)) >> 2)
    val _tmp143: Long = ((_tmp142 << 1) - x4)
    val _tmp144: Long = ((_tmp143 + x5) >> 1)
    val _tmp146: Long = (((_tmp144 << 1) + x6) >> 2)
    val _tmp153: Long = ((_tmp145 * _tmp146) >> 31)
    val _tmp151: Long = ((x2 * x5) >> 32)
    val _tmp147: Long = ((x1 - x2) << 1)
    val _tmp148: Long = ((_tmp147 + (x3 << 1)) >> 2)
    val _tmp149: Long = (((_tmp148 << 1) + x4) >> 1)
    val _tmp150: Long = (((_tmp149 << 1) - x5) >> 1)
    val _tmp152: Long = (((_tmp150 << 1) + x6) >> 2)
    val _tmp154: Long = ((_tmp151 * _tmp152) >> 31)
    val _tmp161: Long = ((_tmp153 + _tmp154) >> 1)
    val _tmp159: Long = ((x3 * x6) >> 32)
    val _tmp155: Long = ((x1 + x2) >> 1)
    val _tmp156: Long = (((_tmp155 << 1) - x3) >> 1)
    val _tmp157: Long = (((_tmp156 << 1) + x4) >> 1)
    val _tmp158: Long = (((_tmp157 << 1) + x5) >> 2)
    val _tmp160: Long = (((_tmp158 << 2) - x6) >> 2)
    val _tmp162: Long = ((_tmp159 * _tmp160) >> 31)
    val _tmp164: Long = (((_tmp161 << 1) + _tmp162) >> 1)
    val _tmp163: Long = ((x2 * x3) >> 32)
    val _tmp165: Long = ((_tmp163 * x4) >> 32)
    val _tmp167: Long = (((_tmp164 << 2) - _tmp165) >> 2)
    val _tmp166: Long = ((x1 * x3) >> 32)
    val _tmp168: Long = ((_tmp166 * x5) >> 32)
    val _tmp170: Long = (((_tmp167 << 2) - _tmp168) >> 2)
    val _tmp169: Long = ((x1 * x2) >> 32)
    val _tmp171: Long = ((_tmp169 * x6) >> 32)
    val _tmp173: Long = (((_tmp170 << 2) - _tmp171) >> 2)
    val _tmp172: Long = ((x4 * x5) >> 32)
    val _tmp174: Long = ((_tmp172 * x6) >> 32)
    (((_tmp173 << 2) - _tmp174) >> 2)
  }


  def rigidBody1_Fixed16(x1 : Int, x2 : Int, x3 : Int) : Int = {
    val _const0: Int = 32768
    val _tmp: Int = -(x1)
    val _tmp2: Int = ((_tmp * x2) >> 16)
    val _tmp1: Int = ((_const0 * x2) >> 15)
    val _tmp3: Int = ((_tmp1 * x3) >> 16)
    val _tmp4: Int = ((_tmp2 - (_tmp3 << 1)) >> 2)
    val _tmp5: Int = (((_tmp4 << 6) - x1) >> 6)
    (((_tmp5 << 6) - x3) >> 6)
  }

  def rigidBody1_Fixed32(x1 : Long, x2 : Long, x3 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _tmp24: Long = -(x1)
    val _tmp26: Long = ((_tmp24 * x2) >> 32)
    val _tmp25: Long = ((_const0 * x2) >> 31)
    val _tmp27: Long = ((_tmp25 * x3) >> 32)
    val _tmp28: Long = ((_tmp26 - (_tmp27 << 1)) >> 2)
    val _tmp29: Long = (((_tmp28 << 6) - x1) >> 6)
    (((_tmp29 << 6) - x3) >> 6)
  }


  def rigidBody2_Fixed16(x1 : Int, x2 : Int, x3 : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 49152
    val _const2: Int = 49152
    val _tmp: Int = ((x1 * x2) >> 16)
    val _tmp1: Int = ((_tmp * x3) >> 16)
    val _tmp3: Int = ((_const0 * _tmp1) >> 15)
    val _tmp2: Int = ((_const1 * x3) >> 16)
    val _tmp4: Int = ((_tmp2 * x3) >> 16)
    val _tmp7: Int = (((_tmp3 << 3) + _tmp4) >> 3)
    val _tmp5: Int = ((x1 * x2) >> 16)
    val _tmp6: Int = ((_tmp5 * x3) >> 16)
    val _tmp8: Int = ((x2 * _tmp6) >> 16)
    val _tmp10: Int = ((_tmp7 - (_tmp8 << 3)) >> 3)
    val _tmp9: Int = ((_const2 * x3) >> 16)
    val _tmp11: Int = ((_tmp9 * x3) >> 16)
    val _tmp12: Int = (((_tmp10 << 6) + _tmp11) >> 6)
    (((_tmp12 << 12) - x2) >> 12)
  }

  def rigidBody2_Fixed32(x1 : Long, x2 : Long, x3 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3221225472l
    val _const2: Long = 3221225472l
    val _tmp52: Long = ((x1 * x2) >> 32)
    val _tmp53: Long = ((_tmp52 * x3) >> 32)
    val _tmp55: Long = ((_const0 * _tmp53) >> 31)
    val _tmp54: Long = ((_const1 * x3) >> 32)
    val _tmp56: Long = ((_tmp54 * x3) >> 32)
    val _tmp59: Long = (((_tmp55 << 3) + _tmp56) >> 3)
    val _tmp57: Long = ((x1 * x2) >> 32)
    val _tmp58: Long = ((_tmp57 * x3) >> 32)
    val _tmp60: Long = ((x2 * _tmp58) >> 32)
    val _tmp62: Long = ((_tmp59 - (_tmp60 << 3)) >> 3)
    val _tmp61: Long = ((_const2 * x3) >> 32)
    val _tmp63: Long = ((_tmp61 * x3) >> 32)
    val _tmp64: Long = (((_tmp62 << 6) + _tmp63) >> 6)
    (((_tmp64 << 12) - x2) >> 12)
  }


  def sine_Fixed16(x : Int) : Int = {
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


  def sine_Fixed32(x : Long) : Long = {
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

  def sqroot_Fixed16(x : Int) : Int = {
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

  def sqroot_Fixed32(x : Long) : Long = {
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


  def state8_Fixed16(s0 : Int, s1 : Int, s2 : Int, s3 : Int, s4 : Int, s5 : Int, s6 : Int, s7 : Int, s8 : Int, y0 : Int, y1 : Int, y2 : Int, y3 : Int, y4 : Int) : Int = {
    val _const0: Int = 0
    val _const1: Int = 0
    val _const2: Int = 1
    val _const3: Int = -1
    val _const4: Int = -1
    val _const5: Int = 0
    val _const6: Int = 1
    val _const7: Int = 65530
    val _const8: Int = 2
    val _const9: Int = 0
    val _const10: Int = -1
    val _const11: Int = -1
    val _const12: Int = 6
    val _const13: Int = -3
    val _const14: Int = -1
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
    val _tmp13: Int = ((_const7 * s7) >> 16)
    val _tmp14: Int = ((_tmp12 + (_tmp13 << 4)) >> 4)
    val _tmp15: Int = ((_const8 * s8) >> 12)
    val _tmp16: Int = (((_tmp14 << 4) + _tmp15) >> 4)
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

  def state8_Fixed32(s0 : Long, s1 : Long, s2 : Long, s3 : Long, s4 : Long, s5 : Long, s6 : Long, s7 : Long, s8 : Long, y0 : Long, y1 : Long, y2 : Long, y3 : Long, y4 : Long) : Long = {
    val _const0: Long = 1l
    val _const1: Long = 4l
    val _const2: Long = 33572l
    val _const3: Long = -33574l
    val _const4: Long = -2811l
    val _const5: Long = 29521l
    val _const6: Long = 43108l
    val _const7: Long = 4294567864l
    val _const8: Long = 142969l
    val _const9: Long = 2811l
    val _const10: Long = -29511l
    val _const11: Long = -38423l
    val _const12: Long = 387909l
    val _const13: Long = -138262l
    val _const14: Long = -5l
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
    val _tmp121: Long = ((_const7 * s7) >> 32)
    val _tmp122: Long = ((_tmp120 + (_tmp121 << 4)) >> 4)
    val _tmp123: Long = ((_const8 * s8) >> 28)
    val _tmp124: Long = (((_tmp122 << 4) + _tmp123) >> 4)
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


  def state9_Fixed16(s0 : Int, s1 : Int, s2 : Int, s3 : Int, s4 : Int, s5 : Int, s6 : Int, s7 : Int, s8 : Int, y0 : Int, y1 : Int, y2 : Int, y3 : Int, y4 : Int) : Int = {
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

  def state9_Fixed32(s0 : Long, s1 : Long, s2 : Long, s3 : Long, s4 : Long, s5 : Long, s6 : Long, s7 : Long, s8 : Long, y0 : Long, y1 : Long, y2 : Long, y3 : Long, y4 : Long) : Long = {
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

  def turbine1_Fixed16(v : Int, w : Int, r : Int) : Int = {
    val _const0: Int = 32768
    val _const1: Int = 49152
    val _const2: Int = 32768
    val _const3: Int = 49152
    val _const4: Int = 8192
    val _const5: Int = 32768
    val _const6: Int = 36864
    val _tmp: Int = ((r * r) >> 16)
    val _tmp1: Int = ((_const0 << 12) / _tmp)
    val _tmp10: Int = (((_const1 << 2) + _tmp1) >> 2)
    val _tmp2: Int = ((_const2 * v) >> 15)
    val _tmp3: Int = ((_const3 - (_tmp2 << 2)) >> 2)
    val _tmp6: Int = ((_const4 * _tmp3) >> 13)
    val _tmp4: Int = ((w * w) >> 16)
    val _tmp5: Int = ((_tmp4 * r) >> 16)
    val _tmp7: Int = ((_tmp5 * r) >> 16)
    val _tmp8: Int = ((_tmp6 * _tmp7) >> 16)
    val _tmp9: Int = ((_const5 - (v << 2)) >> 2)
    val _tmp11: Int = ((_tmp8 << 15) / _tmp9)
    val _tmp12: Int = ((_tmp10 - (_tmp11 << 3)) >> 2)
    (((_tmp12 << 1) - _const6) >> 2)
  }

  def turbine1_Fixed32(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3221225472l
    val _const2: Long = 2147483648l
    val _const3: Long = 3221225472l
    val _const4: Long = 536870912l
    val _const5: Long = 2147483648l
    val _const6: Long = 2415919104l
    val _tmp52: Long = ((r * r) >> 32)
    val _tmp53: Long = ((_const0 << 28) / _tmp52)
    val _tmp62: Long = (((_const1 << 2) + _tmp53) >> 2)
    val _tmp54: Long = ((_const2 * v) >> 31)
    val _tmp55: Long = ((_const3 - (_tmp54 << 2)) >> 2)
    val _tmp58: Long = ((_const4 * _tmp55) >> 29)
    val _tmp56: Long = ((w * w) >> 32)
    val _tmp57: Long = ((_tmp56 * r) >> 32)
    val _tmp59: Long = ((_tmp57 * r) >> 32)
    val _tmp60: Long = ((_tmp58 * _tmp59) >> 32)
    val _tmp61: Long = ((_const5 - (v << 2)) >> 2)
    val _tmp63: Long = ((_tmp60 << 31) / _tmp61)
    val _tmp64: Long = ((_tmp62 - (_tmp63 << 3)) >> 2)
    (((_tmp64 << 1) - _const6) >> 2)
  }


   def turbine2_Fixed16(v : Int, w : Int, r : Int) : Int = {
    val _const0: Int = 49152
    val _const1: Int = 32768
    val _const2: Int = 32768
    val _const3: Int = 40960
    val _tmp6: Int = ((_const0 * v) >> 15)
    val _tmp2: Int = ((_const1 * v) >> 15)
    val _tmp: Int = ((w * w) >> 16)
    val _tmp1: Int = ((_tmp * r) >> 16)
    val _tmp3: Int = ((_tmp1 * r) >> 16)
    val _tmp4: Int = ((_tmp2 * _tmp3) >> 15)
    val _tmp5: Int = ((_const2 - (v << 2)) >> 2)
    val _tmp7: Int = ((_tmp4 << 15) / _tmp5)
    val _tmp8: Int = (_tmp6 - _tmp7)
    (((_tmp8 << 3) - _const3) >> 3)
  }

  def turbine2_Fixed32(v : Long, w : Long, r : Long) : Long = {
    val _const0: Long = 3221225472l
    val _const1: Long = 2147483648l
    val _const2: Long = 2147483648l
    val _const3: Long = 2684354560l
    val _tmp42: Long = ((_const0 * v) >> 31)
    val _tmp38: Long = ((_const1 * v) >> 31)
    val _tmp36: Long = ((w * w) >> 32)
    val _tmp37: Long = ((_tmp36 * r) >> 32)
    val _tmp39: Long = ((_tmp37 * r) >> 32)
    val _tmp40: Long = ((_tmp38 * _tmp39) >> 31)
    val _tmp41: Long = ((_const2 - (v << 2)) >> 2)
    val _tmp43: Long = ((_tmp40 << 31) / _tmp41)
    val _tmp44: Long = (_tmp42 - _tmp43)
    (((_tmp44 << 3) - _const3) >> 3)
  }


  def turbine3_Fixed16(v : Int, w : Int, r : Int) : Int = {
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

  def turbine3_Fixed32(v : Long, w : Long, r : Long) : Long = {
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

