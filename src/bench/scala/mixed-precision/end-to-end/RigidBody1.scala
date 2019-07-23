package daisy.bench.mixed

import daisy.tools.DblDouble

import scala.annotation.strictfp

@strictfp
object RigidBody1 {

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.0002)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_32(x1 : Float, x2 : Float, x3 : Float) : Float = {
    val _const0: Float = 2f
    val _tmp: Float = (x1 * x2)
    val _tmp1: Float = -(_tmp)
    val _tmp2: Float = (x1 + x3)
    val _tmp4: Float = (_tmp1 - _tmp2)
    val _tmp3: Float = (_const0 * x2)
    val _tmp5: Float = (_tmp3 * x3)
    (_tmp4 - _tmp5)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 0.0001)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_32_05(x1 : Float, x2 : Float, x3 : Float) : Double = {
    val _const0: Float = 2f
    val _tmp6: Float = (x1 * x2)
    val _tmp7: Float = -(_tmp6)
    val _tmp8: Float = (x1 + x3)
    val _tmp10: Double = (_tmp7.toDouble - _tmp8.toDouble)
    val _tmp9: Double = (_const0.toDouble * x2.toDouble)
    val _tmp11: Double = (_tmp9 * x3.toDouble)
    (_tmp10 - _tmp11)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 2.e-05)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_32_01(x1 : Double, x2 : Double, x3 : Float) : Double = {
    val _const0: Double = 2
    val _tmp12: Double = (x1 * x2)
    val _tmp13: Double = -(_tmp12)
    val _tmp14: Double = (x1 + x3.toDouble)
    val _tmp16: Double = (_tmp13 - _tmp14)
    val _tmp15: Double = (_const0 * x2)
    val _tmp17: Double = (_tmp15 * x3.toDouble)
    (_tmp16 - _tmp17)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 2.e-06)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_32_001(x1 : Double, x2 : Double, x3 : Double) : Double = {
    val _const0: Double = 2
    val _tmp18: Double = (x1 * x2)
    val _tmp19: Double = -(_tmp18)
    val _tmp20: Double = (x1 + x3)
    val _tmp22: Double = (_tmp19 - _tmp20)
    val _tmp21: Double = (_const0 * x2)
    val _tmp23: Double = (_tmp21 * x3)
    (_tmp22 - _tmp23)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 3.5e-13)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_64(x1 : Double, x2 : Double, x3 : Double) : Double = {
    val _const0: Double = 2
    val _tmp24: Double = (x1 * x2)
    val _tmp25: Double = -(_tmp24)
    val _tmp26: Double = (x1 + x3)
    val _tmp28: Double = (_tmp25 - _tmp26)
    val _tmp27: Double = (_const0 * x2)
    val _tmp29: Double = (_tmp27 * x3)
    (_tmp28 - _tmp29)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 1.75e-13)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_64_05(x1 : DblDouble, x2 : DblDouble, x3 : Double) : Double = {
    val _const0: Float = 2f
    val _tmp30: Double = (x1 * x2).toDouble
    val _tmp31: Double = -(_tmp30)
    val _tmp32: Double = (x1 + DblDouble(x3)).toDouble
    val _tmp34: Double = (_tmp31 - _tmp32)
    val _tmp33: Double = (DblDouble(_const0) * x2).toDouble
    val _tmp35: Double = (_tmp33 * x3)
    (_tmp34 - _tmp35)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 3.5e-14)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_64_01(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble) : DblDouble = {
    val _const0: Float = 2f
    val _tmp36: Double = (x1 * x2).toDouble
    val _tmp37: DblDouble = -(_tmp36)
    val _tmp38: DblDouble = (x1 + x3)
    val _tmp40: DblDouble = (_tmp37 - _tmp38)
    val _tmp39: DblDouble = (DblDouble(_const0) * x2)
    val _tmp41: DblDouble = (_tmp39 * x3)
    (_tmp40 - _tmp41)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 3.5e-15)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_64_001(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _tmp42: DblDouble = (x1 * x2)
    val _tmp43: DblDouble = -(_tmp42)
    val _tmp44: DblDouble = (x1 + x3)
    val _tmp46: DblDouble = (_tmp43 - _tmp44)
    val _tmp45: DblDouble = (_const0 * x2)
    val _tmp47: DblDouble = (_tmp45 * x3)
    (_tmp46 - _tmp47)
  }

  /*@pre : ((-15. <= x1) && (x1 <= 15.) && (-15. <= x2) && (x2 <= 15.) && (-15. <= x3) && (x3 <= 15.))*/
  /*@post: (res) => (res +/- 1.5e-28)*/
  /*Abs error: -, Range: -*/
    def rigidBody1_dbldbl(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble) : DblDouble = {
    val _const0: DblDouble = 2
    val _tmp48: DblDouble = (x1 * x2)
    val _tmp49: DblDouble = -(_tmp48)
    val _tmp50: DblDouble = (x1 + x3)
    val _tmp52: DblDouble = (_tmp49 - _tmp50)
    val _tmp51: DblDouble = (_const0 * x2)
    val _tmp53: DblDouble = (_tmp51 * x3)
    (_tmp52 - _tmp53)
  }

}
