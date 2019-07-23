package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object RigidBody2 {

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 10.5)*/
  /*()*/
    def rigidBody2_fixed16(x1 : Int, x2 : Int, x3 : Int) : Int = {
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

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 5.25)*/
  /*Abs error: -, Range: -*/
    def rigidBody2_fixed16_05(x1 : Int, x2 : Int, x3 : Int) : Long = {
    val _const0: Int = 32768
    val _const1: Int = 49152
    val _const2: Int = 49152
    val _tmp13: Int = ((x1 * x2) >> 16)
    val _tmp14: Int = ((_tmp13 * x3) >> 16)
    val _tmp16: Int = ((_const0 * _tmp14) >> 15)
    val _tmp15: Long = (((_const1 << 16).toLong * (x3 << 16).toLong) >> 32)
    val _tmp17: Long = ((_tmp15 * (x3 << 16).toLong) >> 32)
    val _tmp20: Long = ((((_tmp16 << 16).toLong << 3) + _tmp17) >> 3)
    val _tmp18: Long = (((x1 << 16).toLong * (x2 << 16).toLong) >> 32)
    val _tmp19: Long = ((_tmp18 * (x3 << 16).toLong) >> 32)
    val _tmp21: Long = (((x2 << 16).toLong * _tmp19) >> 32)
    val _tmp23: Long = ((_tmp20 - (_tmp21 << 3)) >> 3)
    val _tmp22: Long = (((_const2 << 16).toLong * (x3 << 16).toLong) >> 32)
    val _tmp24: Long = ((_tmp22 * (x3 << 16).toLong) >> 32)
    val _tmp25: Long = (((_tmp23 << 6) + _tmp24) >> 6)
    (_tmp25 - (x2 << 4))
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 1.05)*/
  /*()*/
    def rigidBody2_fixed16_01(x1 : Long, x2 : Long, x3 : Int) : Long = {
    val _const0: Int = 32768
    val _const1: Long = 3221225472l
    val _const2: Long = 3221225472l
    val _tmp26: Long = ((x1 * x2) >> 32)
    val _tmp27: Long = ((_tmp26 * (x3 << 16).toLong) >> 32)
    val _tmp29: Long = (((_const0 << 16).toLong * _tmp27) >> 31)
    val _tmp28: Long = ((_const1 * (x3 << 16).toLong) >> 32)
    val _tmp30: Long = ((_tmp28 * (x3 << 16).toLong) >> 32)
    val _tmp33: Long = (((_tmp29 << 3) + _tmp30) >> 3)
    val _tmp31: Long = ((x1 * x2) >> 32)
    val _tmp32: Long = ((_tmp31 * (x3 << 16).toLong) >> 32)
    val _tmp34: Long = ((x2 * _tmp32) >> 32)
    val _tmp36: Long = ((_tmp33 - (_tmp34 << 3)) >> 3)
    val _tmp35: Long = ((_const2 * (x3 << 16).toLong) >> 32)
    val _tmp37: Long = ((_tmp35 * (x3 << 16).toLong) >> 32)
    val _tmp38: Long = (((_tmp36 << 6) + _tmp37) >> 6)
    (((_tmp38 << 12) - x2) >> 12)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.105)*/
  /*()*/
    def rigidBody2_fixed16_001(x1 : Long, x2 : Long, x3 : Long) : Long = {
    val _const0: Long = 2147483648l
    val _const1: Long = 3221225472l
    val _const2: Long = 3221225472l
    val _tmp39: Long = ((x1 * x2) >> 32)
    val _tmp40: Long = ((_tmp39 * x3) >> 32)
    val _tmp42: Long = ((_const0 * _tmp40) >> 31)
    val _tmp41: Long = ((_const1 * x3) >> 32)
    val _tmp43: Long = ((_tmp41 * x3) >> 32)
    val _tmp46: Long = (((_tmp42 << 3) + _tmp43) >> 3)
    val _tmp44: Long = ((x1 * x2) >> 32)
    val _tmp45: Long = ((_tmp44 * x3) >> 32)
    val _tmp47: Long = ((x2 * _tmp45) >> 32)
    val _tmp49: Long = ((_tmp46 - (_tmp47 << 3)) >> 3)
    val _tmp48: Long = ((_const2 * x3) >> 32)
    val _tmp50: Long = ((_tmp48 * x3) >> 32)
    val _tmp51: Long = (((_tmp49 << 6) + _tmp50) >> 6)
    (((_tmp51 << 12) - x2) >> 12)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.0002)*/
  /*()*/
    def rigidBody2_fixed32(x1 : Long, x2 : Long, x3 : Long) : Long = {
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

}
