package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object RigidBody1 {

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.09)*/
  /*()*/
    def rigidBody1_fixed16(x1 : Int, x2 : Int, x3 : Int) : Int = {
    val _const0: Int = 32768
    val _tmp: Int = -(x1)
    val _tmp2: Int = ((_tmp * x2) >> 16)
    val _tmp1: Int = ((_const0 * x2) >> 15)
    val _tmp3: Int = ((_tmp1 * x3) >> 16)
    val _tmp4: Int = ((_tmp2 - (_tmp3 << 1)) >> 2)
    val _tmp5: Int = (((_tmp4 << 6) - x1) >> 6)
    (((_tmp5 << 6) - x3) >> 6)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.045)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_fixed16_05(x1 : Int, x2 : Int, x3 : Int) : Long = {
    val _const0: Int = 32768
    val _tmp6: Int = -(x1)
    val _tmp8: Int = ((_tmp6 * x2) >> 16)
    val _tmp7: Int = ((_const0 * x2) >> 15)
    val _tmp9: Long = (((_tmp7 << 16).toLong * (x3 << 16).toLong) >> 32)
    val _tmp10: Long = (((_tmp8 << 16).toLong - (_tmp9 << 1)) >> 2)
    val _tmp11: Long = (((_tmp10 << 6) - (x1 << 16).toLong) >> 6)
    (_tmp11 - (x3 << 10))
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.009)*/
  /*()*/
    def rigidBody1_fixed16_01(x1 : Int, x2 : Long, x3 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _tmp12: Long = -(x1)
    val _tmp14: Long = ((_tmp12 * x2) >> 32)
    val _tmp13: Long = ((_const0 * x2) >> 31)
    val _tmp15: Long = ((_tmp13 * x3) >> 32)
    val _tmp16: Long = ((_tmp14 - (_tmp15 << 1)) >> 2)
    val _tmp17: Long = (((_tmp16 << 6) - (x1 << 16).toLong) >> 6)
    (((_tmp17 << 6) - x3) >> 6)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.0009)*/
  /*()*/
    def rigidBody1_fixed16_001(x1 : Long, x2 : Long, x3 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _tmp18: Long = -(x1)
    val _tmp20: Long = ((_tmp18 * x2) >> 32)
    val _tmp19: Long = ((_const0 * x2) >> 31)
    val _tmp21: Long = ((_tmp19 * x3) >> 32)
    val _tmp22: Long = ((_tmp20 - (_tmp21 << 1)) >> 2)
    val _tmp23: Long = (((_tmp22 << 6) - x1) >> 6)
    (((_tmp23 << 6) - x3) >> 6)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 1.5e-06)*/
  /*()*/
    def rigidBody1_fixed32(x1 : Long, x2 : Long, x3 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _tmp24: Long = -(x1)
    val _tmp26: Long = ((_tmp24 * x2) >> 32)
    val _tmp25: Long = ((_const0 * x2) >> 31)
    val _tmp27: Long = ((_tmp25 * x3) >> 32)
    val _tmp28: Long = ((_tmp26 - (_tmp27 << 1)) >> 2)
    val _tmp29: Long = (((_tmp28 << 6) - x1) >> 6)
    (((_tmp29 << 6) - x3) >> 6)
  }

}
