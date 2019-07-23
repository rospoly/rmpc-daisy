package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object InvertedPendulum {

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 0.015)*/
  /*()*/
    def invpendulum_out_fixed16(s1 : Int, s2 : Int, s3 : Int, s4 : Int) : Int = {
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

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 0.0075)*/
  /*()*/
    def invpendulum_out_fixed16_05(s1 : Int, s2 : Int, s3 : Int, s4 : Int) : Long = {
    val _const0: Int = 32768
    val _const1: Int = 54287
    val _const2: Int = -38268
    val _const3: Int = -56679
    val _tmp6: Int = ((_const0 * s1) >> 15)
    val _tmp7: Int = ((_const1 * s2) >> 16)
    val _tmp8: Long = ((((_tmp6 << 16).toLong << 1) + (_tmp7 << 16).toLong) >> 2)
    val _tmp9: Long = (((_const2 << 16).toLong * (s3 << 16).toLong) >> 31)
    val _tmp10: Long = (((_tmp8 << 3) + _tmp9) >> 3)
    val _tmp11: Long = (((_const3 << 16).toLong * (s4 << 16).toLong) >> 32)
    (((_tmp10 << 5) + _tmp11) >> 5)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 0.0015)*/
  /*()*/
    def invpendulum_out_fixed16_01(s1 : Long, s2 : Long, s3 : Long, s4 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3557736160l
    val _const2: Long = -2507911935l
    val _const3: Long = -3714502466l
    val _tmp12: Long = ((_const0 * s1) >> 31)
    val _tmp13: Long = ((_const1 * s2) >> 32)
    val _tmp14: Long = (((_tmp12 << 1) + _tmp13) >> 2)
    val _tmp15: Long = ((_const2 * s3) >> 31)
    val _tmp16: Long = (((_tmp14 << 3) + _tmp15) >> 3)
    val _tmp17: Long = ((_const3 * s4) >> 32)
    (((_tmp16 << 5) + _tmp17) >> 5)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 0.00015)*/
  /*()*/
    def invpendulum_out_fixed16_001(s1 : Long, s2 : Long, s3 : Long, s4 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3557736160l
    val _const2: Long = -2507911935l
    val _const3: Long = -3714502466l
    val _tmp18: Long = ((_const0 * s1) >> 31)
    val _tmp19: Long = ((_const1 * s2) >> 32)
    val _tmp20: Long = (((_tmp18 << 1) + _tmp19) >> 2)
    val _tmp21: Long = ((_const2 * s3) >> 31)
    val _tmp22: Long = (((_tmp20 << 3) + _tmp21) >> 3)
    val _tmp23: Long = ((_const3 * s4) >> 32)
    (((_tmp22 << 5) + _tmp23) >> 5)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 1.6e-07)*/
  /*()*/
    def invpendulum_out_fixed32(s1 : Long, s2 : Long, s3 : Long, s4 : Long) : Long = {
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

}
