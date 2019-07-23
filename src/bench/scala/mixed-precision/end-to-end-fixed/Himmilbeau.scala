package daisy.bench.mixedfixed


import scala.annotation.strictfp

@strictfp
object Himmilbeau {

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 0.3)*/
  /*()*/
    def himmilbeau_fixed16(x1 : Int, x2 : Int) : Int = {
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

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 0.15)*/
  /*()*/
    def himmilbeau_fixed16_05(x1 : Int, x2 : Int) : Long = {
    val _const0: Int = 45056
    val _const1: Int = 45056
    val _const2: Int = 57344
    val _const3: Int = 57344
    val _tmp14: Int = ((x1 * x1) >> 15)
    val _tmp15: Int = (((_tmp14 << 2) + x2) >> 2)
    val _tmp18: Int = (((_tmp15 << 1) - _const0) >> 1)
    val _tmp16: Int = ((x1 * x1) >> 15)
    val _tmp17: Long = ((((_tmp16 << 16).toLong << 2) + (x2 << 16).toLong) >> 2)
    val _tmp19: Long = (((_tmp17 << 1) - (_const1 << 16).toLong) >> 1)
    val _tmp26: Long = (((_tmp18 << 16).toLong * _tmp19) >> 31)
    val _tmp20: Long = (((x2 << 16).toLong * (x2 << 16).toLong) >> 31)
    val _tmp21: Long = (((x1 << 16).toLong + (_tmp20 << 2)) >> 2)
    val _tmp24: Long = (((_tmp21 << 2) - (_const2 << 16).toLong) >> 2)
    val _tmp22: Long = (((x2 << 16).toLong * (x2 << 16).toLong) >> 31)
    val _tmp23: Long = (((x1 << 16).toLong + (_tmp22 << 2)) >> 2)
    val _tmp25: Long = (((_tmp23 << 2) - (_const3 << 16).toLong) >> 2)
    val _tmp27: Long = ((_tmp24 * _tmp25) >> 32)
    ((_tmp26 + (_tmp27 << 1)) >> 1)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 0.03)*/
  /*()*/
    def himmilbeau_fixed16_01(x1 : Long, x2 : Long) : Long = {
    val _const0: Int = 45056
    val _const1: Int = 45056
    val _const2: Int = 57344
    val _const3: Long = 3758096384l
    val _tmp28: Long = ((x1 * x1) >> 31)
    val _tmp29: Long = (((_tmp28 << 2) + x2) >> 2)
    val _tmp32: Long = (((_tmp29 << 1) - (_const0 << 16).toLong) >> 1)
    val _tmp30: Long = ((x1 * x1) >> 31)
    val _tmp31: Long = (((_tmp30 << 2) + x2) >> 2)
    val _tmp33: Long = (((_tmp31 << 1) - (_const1 << 16).toLong) >> 1)
    val _tmp40: Long = ((_tmp32 * _tmp33) >> 31)
    val _tmp34: Long = ((x2 * x2) >> 31)
    val _tmp35: Long = ((x1 + (_tmp34 << 2)) >> 2)
    val _tmp38: Long = (((_tmp35 << 2) - (_const2 << 16).toLong) >> 2)
    val _tmp36: Long = ((x2 * x2) >> 31)
    val _tmp37: Long = ((x1 + (_tmp36 << 2)) >> 2)
    val _tmp39: Long = (((_tmp37 << 2) - _const3) >> 2)
    val _tmp41: Long = ((_tmp38 * _tmp39) >> 32)
    ((_tmp40 + (_tmp41 << 1)) >> 1)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 0.003)*/
  /*()*/
    def himmilbeau_fixed16_001(x1 : Long, x2 : Long) : Long = {
    val _const0: Long = 2952790016l
    val _const1: Long = 2952790016l
    val _const2: Long = 3758096384l
    val _const3: Long = 3758096384l
    val _tmp42: Long = ((x1 * x1) >> 31)
    val _tmp43: Long = (((_tmp42 << 2) + x2) >> 2)
    val _tmp46: Long = (((_tmp43 << 1) - _const0) >> 1)
    val _tmp44: Long = ((x1 * x1) >> 31)
    val _tmp45: Long = (((_tmp44 << 2) + x2) >> 2)
    val _tmp47: Long = (((_tmp45 << 1) - _const1) >> 1)
    val _tmp54: Long = ((_tmp46 * _tmp47) >> 31)
    val _tmp48: Long = ((x2 * x2) >> 31)
    val _tmp49: Long = ((x1 + (_tmp48 << 2)) >> 2)
    val _tmp52: Long = (((_tmp49 << 2) - _const2) >> 2)
    val _tmp50: Long = ((x2 * x2) >> 31)
    val _tmp51: Long = ((x1 + (_tmp50 << 2)) >> 2)
    val _tmp53: Long = (((_tmp51 << 2) - _const3) >> 2)
    val _tmp55: Long = ((_tmp52 * _tmp53) >> 32)
    ((_tmp54 + (_tmp55 << 1)) >> 1)
  }

  /*@pre : ((-5. <= x1) && (x1 <= 5.) && (-5. <= x2) && (x2 <= 5.))*/
  /*@post: (res) => (res +/- 4.5e-06)*/
  /*()*/
    def himmilbeau_fixed32(x1 : Long, x2 : Long) : Long = {
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

}
