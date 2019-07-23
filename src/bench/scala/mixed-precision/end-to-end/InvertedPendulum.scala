package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object InvertedPendulum {

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 2.e-05)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_32(s1 : Float, s2 : Float, s3 : Float, s4 : Float) : Float = {
    val _const0: Float = 1.6567f
    val _const1: Float = -18.6854f
    val _const2: Float = -3.4594f
    val _tmp2: Float = (s2 * _const0)
    val _tmp: Float = (_const1 * s3)
    val _tmp1: Float = (_const2 * s4)
    val _tmp3: Float = (_tmp + _tmp1)
    val _tmp4: Float = (_tmp2 + _tmp3)
    (s1 + _tmp4)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 1.e-05)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_32_05(s1 : Float, s2 : Float, s3 : Float, s4 : Float) : Double = {
    val _const0: Float = 1.6567f
    val _const1: Float = -18.6854f
    val _const2: Float = -3.4594f
    val _tmp7: Float = (s2 * _const0)
    val _tmp5: Float = (_const1 * s3)
    val _tmp6: Double = (_const2.toDouble * s4.toDouble)
    val _tmp8: Double = (_tmp5.toDouble + _tmp6)
    val _tmp9: Double = (_tmp7.toDouble + _tmp8)
    (s1 + _tmp9)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 2.e-06)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_32_01(s1 : Double, s2 : Double, s3 : Double, s4 : Float) : Double = {
    val _const0: Float = 1.6567f
    val _const1: Float = -18.6854f
    val _const2: Double = -3.4594
    val _tmp12: Double = (s2 * _const0.toDouble)
    val _tmp10: Double = (_const1.toDouble * s3)
    val _tmp11: Double = (_const2 * s4.toDouble)
    val _tmp13: Double = (_tmp10 + _tmp11)
    val _tmp14: Double = (_tmp12 + _tmp13)
    (s1 + _tmp14)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 2.e-07)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_32_001(s1 : Double, s2 : Double, s3 : Double, s4 : Double) : Double = {
    val _const0: Double = 1.6567
    val _const1: Double = -18.6854
    val _const2: Double = -3.4594
    val _tmp17: Double = (s2 * _const0)
    val _tmp15: Double = (_const1 * s3)
    val _tmp16: Double = (_const2 * s4)
    val _tmp18: Double = (_tmp15 + _tmp16)
    val _tmp19: Double = (_tmp17 + _tmp18)
    (s1 + _tmp19)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 4.e-14)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_64(s1 : Double, s2 : Double, s3 : Double, s4 : Double) : Double = {
    val _const0: Double = 1.6567
    val _const1: Double = -18.6854
    val _const2: Double = -3.4594
    val _tmp22: Double = (s2 * _const0)
    val _tmp20: Double = (_const1 * s3)
    val _tmp21: Double = (_const2 * s4)
    val _tmp23: Double = (_tmp20 + _tmp21)
    val _tmp24: Double = (_tmp22 + _tmp23)
    (s1 + _tmp24)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 2.e-14)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_64_05(s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : Double) : DblDouble = {
    val _const0: Double = 1.6567
    val _const1: Double = -18.6854
    val _const2: Double = -3.4594
    val _tmp27: Double = (s2 * DblDouble(_const0)).toDouble
    val _tmp25: Double = (DblDouble(_const1) * s3).toDouble
    val _tmp26: Double = (_const2 * s4)
    val _tmp28: Double = (_tmp25 + _tmp26)
    val _tmp29: Double = (_tmp27 + _tmp28)
    (s1 + _tmp29)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 4.e-15)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_64_01(s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : Double) : DblDouble = {
    val _const0: Double = 1.6567
    val _const1: Double = -18.6854
    val _const2: DblDouble = -3.4594
    val _tmp32: DblDouble = (s2 * DblDouble(_const0))
    val _tmp30: DblDouble = (DblDouble(_const1) * s3)
    val _tmp31: DblDouble = (_const2 * DblDouble(s4))
    val _tmp33: DblDouble = (_tmp30 + _tmp31)
    val _tmp34: DblDouble = (_tmp32 + _tmp33)
    (s1 + _tmp34)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 4.e-16)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_64_001(s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 1.6567
    val _const1: DblDouble = -18.6854
    val _const2: DblDouble = -3.4594
    val _tmp37: DblDouble = (s2 * _const0)
    val _tmp35: DblDouble = (_const1 * s3)
    val _tmp36: DblDouble = (_const2 * s4)
    val _tmp38: DblDouble = (_tmp35 + _tmp36)
    val _tmp39: DblDouble = (_tmp37 + _tmp38)
    (s1 + _tmp39)
  }

  /*@pre : ((-50. <= s1) && (s1 <= 50.) && (-10. <= s2) && (s2 <= 10.) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785))*/
  /*@post: (res) => (res +/- 1.5e-29)*/
  /*Abs error: -, Range: -*/
    def invpendulum_out_dbldbl(s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 1.6567
    val _const1: DblDouble = -18.6854
    val _const2: DblDouble = -3.4594
    val _tmp42: DblDouble = (s2 * _const0)
    val _tmp40: DblDouble = (_const1 * s3)
    val _tmp41: DblDouble = (_const2 * s4)
    val _tmp43: DblDouble = (_tmp40 + _tmp41)
    val _tmp44: DblDouble = (_tmp42 + _tmp43)
    (s1 + _tmp44)
  }

}
