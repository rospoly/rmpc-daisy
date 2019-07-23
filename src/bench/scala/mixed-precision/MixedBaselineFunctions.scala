package daisy
package bench

import scala.annotation.strictfp
import tools.DblDouble

@strictfp
object MixedBaselineFunctions {

  def bspline0_Float(u : Float) : Float = {
    //require(((0 <= u) && (u <= 1)))
    ((((1 - u) * (1 - u)) * (1 - u)) / 6.0f)
  }

  def bspline0_Double(u : Double) : Double = {
    //require(((0 <= u) && (u <= 1)))
    ((((1 - u) * (1 - u)) * (1 - u)) / 6.0)
  }

  def bspline0_DblDouble(u : DblDouble) : DblDouble = {
    //require(((0 <= u) && (u <= 1)))
    val _const0: DblDouble = 1
    val _const1: DblDouble = 1
    val _const2: DblDouble = 1
    val _const3: DblDouble = 6.0
    ((((_const0 - u) * (_const1 - u)) * (_const2 - u)) / _const3)
  }

  def bspline1_Float(u : Float) : Float = {
    //require(((0 <= u) && (u <= 1)))
    ((((((3 * u) * u) * u) - ((6 * u) * u)) + 4) / 6.0f)
  }

  def bspline1_Double(u : Double) : Double = {
    //require(((0 <= u) && (u <= 1)))
    ((((((3 * u) * u) * u) - ((6 * u) * u)) + 4) / 6.0)
  }

  def bspline1_DblDouble(u : DblDouble) : DblDouble = {
    //require(((0 <= u) && (u <= 1)))
    val _const0: DblDouble = 3
    val _const1: DblDouble = 6
    val _const2: DblDouble = 4
    val _const3: DblDouble = 6.0
    ((((((_const0 * u) * u) * u) - ((_const1 * u) * u)) + _const2) / _const3)
  }


  def bspline2_Float(u : Float) : Float = {
    //require(((0 <= u) && (u <= 1)))
    (((((((-3 * u) * u) * u) + ((3 * u) * u)) + (3 * u)) + 1) / 6.0f)
  }


  def bspline2_Double(u : Double) : Double = {
    //require(((0 <= u) && (u <= 1)))
    (((((((-3 * u) * u) * u) + ((3 * u) * u)) + (3 * u)) + 1) / 6.0)
  }


  def bspline2_DblDouble(u : DblDouble) : DblDouble = {
    //require(((0 <= u) && (u <= 1)))
    val _const0: DblDouble = -3
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    val _const3: DblDouble = 1
    val _const4: DblDouble = 6.0
    (((((((_const0 * u) * u) * u) + ((_const1 * u) * u)) + (_const2 * u)) + _const3) / _const4)
  }

  def doppler_Float(u: Float, v: Float, T: Float): Float = {
    val t1 = 331.4f + 0.6f * T
    (- (t1) *v) / ((t1 + u)*(t1 + u))
  }

  def doppler_Double(u: Double, v: Double, T: Double): Double = {
    val t1 = 331.4 + 0.6 * T
    (- (t1) *v) / ((t1 + u)*(t1 + u))
  }

  def doppler_DblDouble(u: DblDouble, v: DblDouble, T: DblDouble): DblDouble = {
    val t1 = 331.4 + 0.6 * T
    (- (t1) *v) / ((t1 + u)*(t1 + u))
  }

 def himmilbeau_Float(x1 : Float, x2 : Float) : Float = {
    //require(((-5 <= x1) && (x1 <= 5) && (-5 <= x2) && (x2 <= 5)))
    (((((x1 * x1) + x2) - 11) * (((x1 * x1) + x2) - 11)) + (((x1 + (x2 * x2)) - 7) * ((x1 + (x2 * x2)) - 7)))
  }


  def himmilbeau_Double(x1 : Double, x2 : Double) : Double = {
    //require(((-5 <= x1) && (x1 <= 5) && (-5 <= x2) && (x2 <= 5)))
    (((((x1 * x1) + x2) - 11) * (((x1 * x1) + x2) - 11)) + (((x1 + (x2 * x2)) - 7) * ((x1 + (x2 * x2)) - 7)))
  }


  def himmilbeau_DblDouble(x1 : DblDouble, x2 : DblDouble) : DblDouble = {
    //require(((-5 <= x1) && (x1 <= 5) && (-5 <= x2) && (x2 <= 5)))
    val _const0: DblDouble = 11
    val _const1: DblDouble = 11
    val _const2: DblDouble = 7
    val _const3: DblDouble = 7
    (((((x1 * x1) + x2) - _const0) * (((x1 * x1) + x2) - _const1)) + (((x1 + (x2 * x2)) - _const2) *
      ((x1 + (x2 * x2)) - _const3)))
  }


  def invPendulum_Float(s1 : Float, s2 : Float, s3 : Float, s4 : Float) : Float = {
    //require(((-50 <= s1) && (s1 <= 50) && (-10 <= s2) && (s2 <= 10) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785)))
    ((((1.0f * s1) + (1.6567f * s2)) + (-18.6854f * s3)) + (-3.4594f * s4))
  }

  def invPendulum_Double(s1 : Double, s2 : Double, s3 : Double, s4 : Double) : Double = {
    //require(((-50 <= s1) && (s1 <= 50) && (-10 <= s2) && (s2 <= 10) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785)))
    ((((1.0 * s1) + (1.6567 * s2)) + (-18.6854 * s3)) + (-3.4594 * s4))
  }


  def invPendulum_DblDouble(s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble) : DblDouble = {
    //require(((-50 <= s1) && (s1 <= 50) && (-10 <= s2) && (s2 <= 10) && (-0.785 <= s3) && (s3 <= 0.785) && (-0.785 <= s4) && (s4 <= 0.785)))
    val _const0: DblDouble = 1.0
    val _const1: DblDouble = 1.6567
    val _const2: DblDouble = -18.6854
    val _const3: DblDouble = -3.4594
    ((((_const0 * s1) + (_const1 * s2)) + (_const2 * s3)) + (_const3 * s4))
  }

  def kepler0_Float(x1 : Float, x2 : Float, x3 : Float, x4 : Float, x5 : Float, x6 : Float) : Float = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36) && (4 <= x5) && (x5 <= 6.36) && (4 <= x6) && (x6 <= 6.36)))
    (((((x2 * x5) + (x3 * x6)) - (x2 * x3)) - (x5 * x6)) + (x1 * (((((-(x1) + x2) + x3) - x4) + x5) + x6)))
  }

  def kepler0_Double(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : Double = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36) && (4 <= x5) && (x5 <= 6.36) && (4 <= x6) && (x6 <= 6.36)))
    (((((x2 * x5) + (x3 * x6)) - (x2 * x3)) - (x5 * x6)) + (x1 * (((((-(x1) + x2) + x3) - x4) + x5) + x6)))
  }

  def kepler0_DblDouble(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36) && (4 <= x5) && (x5 <= 6.36) && (4 <= x6) && (x6 <= 6.36)))
    (((((x2 * x5) + (x3 * x6)) - (x2 * x3)) - (x5 * x6)) + (x1 * (((((-(x1) + x2) + x3) - x4) + x5) + x6)))
  }

  def kepler1_Float(x1 : Float, x2 : Float, x3 : Float, x4 : Float) : Float = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36)))
    ((((((((x1 * x4) * (((-(x1) + x2) + x3) - x4)) + (x2 * (((x1 - x2) + x3) + x4))) + (x3 * (((x1 + x2) - x3) + x4))) - ((x2 * x3) * x4)) - (x1 * x3)) - (x1 * x2)) - x4)
  }

  def kepler1_Double(x1 : Double, x2 : Double, x3 : Double, x4 : Double) : Double = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36)))
    ((((((((x1 * x4) * (((-(x1) + x2) + x3) - x4)) + (x2 * (((x1 - x2) + x3) + x4))) + (x3 * (((x1 + x2) - x3) + x4))) - ((x2 * x3) * x4)) - (x1 * x3)) - (x1 * x2)) - x4)
  }

  def kepler1_DblDouble(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble) : DblDouble = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36)))
    ((((((((x1 * x4) * (((-(x1) + x2) + x3) - x4)) + (x2 * (((x1 - x2) + x3) + x4))) + (x3 * (((x1 + x2) - x3) + x4))) - ((x2 * x3) * x4)) - (x1 * x3)) - (x1 * x2)) - x4)
  }

  def kepler2_Float(x1 : Float, x2 : Float, x3 : Float, x4 : Float, x5 : Float, x6 : Float) : Float = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36) && (4 <= x5) && (x5 <= 6.36) && (4 <= x6) && (x6 <= 6.36)))
    ((((((((x1 * x4) * (((((-(x1) + x2) + x3) - x4) + x5) + x6)) + ((x2 * x5) * (((((x1 - x2) + x3) + x4) - x5) + x6))) + ((x3 * x6) * (((((x1 + x2) - x3) + x4) + x5) - x6))) - ((x2 * x3) * x4)) - ((x1 * x3) * x5)) - ((x1 * x2) * x6)) - ((x4 * x5) * x6))
  }

  def kepler2_Double(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double) : Double = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36) && (4 <= x5) && (x5 <= 6.36) && (4 <= x6) && (x6 <= 6.36)))
    ((((((((x1 * x4) * (((((-(x1) + x2) + x3) - x4) + x5) + x6)) + ((x2 * x5) * (((((x1 - x2) + x3) + x4) - x5) + x6))) + ((x3 * x6) * (((((x1 + x2) - x3) + x4) + x5) - x6))) - ((x2 * x3) * x4)) - ((x1 * x3) * x5)) - ((x1 * x2) * x6)) - ((x4 * x5) * x6))
  }

  def kepler2_DblDouble(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble) : DblDouble = {
    //require(((4 <= x1) && (x1 <= 6.36) && (4 <= x2) && (x2 <= 6.36) && (4 <= x3) && (x3 <= 6.36) && (4 <= x4) && (x4 <= 6.36) && (4 <= x5) && (x5 <= 6.36) && (4 <= x6) && (x6 <= 6.36)))
    ((((((((x1 * x4) * (((((-(x1) + x2) + x3) - x4) + x5) + x6)) + ((x2 * x5) * (((((x1 - x2) + x3) + x4) - x5) + x6))) + ((x3 * x6) * (((((x1 + x2) - x3) + x4) + x5) - x6))) - ((x2 * x3) * x4)) - ((x1 * x3) * x5)) - ((x1 * x2) * x6)) - ((x4 * x5) * x6))
  }
  //------------
  def kepler2_double_Float(x1 : Float, x2 : Float, x3 : Float, x4 : Float, x5 : Float, x6 : Float,
    x1_2 : Float, x2_2 : Float, x3_2 : Float, x4_2 : Float, x5_2 : Float, x6_2 : Float) : Float = {
    x1 * x4 * (-x1 + x2 + x3 - x4 + x5 + x6) + x2 * x5 * (x1 - x2 + x3 + x4 - x5 + x6) +
        x3* x6 * (x1 + x2 - x3 + x4 + x5 - x6) - x2 * x3 * x4 -
          x1* x3* x5 - x1 * x2 * x6 - x4 * x5 * x6 +
      x1_2 * x4_2 * (-x1_2 + x2_2 + x3_2 - x4_2 + x5_2 + x6_2) + x2_2 * x5_2 * (x1_2 - x2_2 + x3_2 + x4_2 - x5_2 + x6_2) +
        x3_2* x6_2 * (x1_2 + x2_2 - x3_2 + x4_2 + x5_2 - x6_2) - x2_2 * x3_2 * x4_2 -
          x1_2* x3_2* x5_2 - x1_2 * x2_2 * x6_2 - x4_2 * x5_2 * x6_2
  }

  def kepler2_double_Double(x1 : Double, x2 : Double, x3 : Double, x4 : Double, x5 : Double, x6 : Double,
    x1_2 : Double, x2_2 : Double, x3_2 : Double, x4_2 : Double, x5_2 : Double, x6_2 : Double) : Double = {
    x1 * x4 * (-x1 + x2 + x3 - x4 + x5 + x6) + x2 * x5 * (x1 - x2 + x3 + x4 - x5 + x6) +
        x3* x6 * (x1 + x2 - x3 + x4 + x5 - x6) - x2 * x3 * x4 -
          x1* x3* x5 - x1 * x2 * x6 - x4 * x5 * x6 +
      x1_2 * x4_2 * (-x1_2 + x2_2 + x3_2 - x4_2 + x5_2 + x6_2) + x2_2 * x5_2 * (x1_2 - x2_2 + x3_2 + x4_2 - x5_2 + x6_2) +
        x3_2* x6_2 * (x1_2 + x2_2 - x3_2 + x4_2 + x5_2 - x6_2) - x2_2 * x3_2 * x4_2 -
          x1_2* x3_2* x5_2 - x1_2 * x2_2 * x6_2 - x4_2 * x5_2 * x6_2
  }

  def kepler2_double_DblDouble(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble, x4 : DblDouble, x5 : DblDouble, x6 : DblDouble,
    x1_2 : DblDouble, x2_2 : DblDouble, x3_2 : DblDouble, x4_2 : DblDouble, x5_2 : DblDouble, x6_2 : DblDouble) : DblDouble = {
    x1 * x4 * (-x1 + x2 + x3 - x4 + x5 + x6) + x2 * x5 * (x1 - x2 + x3 + x4 - x5 + x6) +
        x3* x6 * (x1 + x2 - x3 + x4 + x5 - x6) - x2 * x3 * x4 -
          x1* x3* x5 - x1 * x2 * x6 - x4 * x5 * x6 +
      x1_2 * x4_2 * (-x1_2 + x2_2 + x3_2 - x4_2 + x5_2 + x6_2) + x2_2 * x5_2 * (x1_2 - x2_2 + x3_2 + x4_2 - x5_2 + x6_2) +
        x3_2* x6_2 * (x1_2 + x2_2 - x3_2 + x4_2 + x5_2 - x6_2) - x2_2 * x3_2 * x4_2 -
          x1_2* x3_2* x5_2 - x1_2 * x2_2 * x6_2 - x4_2 * x5_2 * x6_2
  }

  def rigidBody1_Float(x1 : Float, x2 : Float, x3 : Float) : Float = {
    //require(((-15.0 <= x1) && (x1 <= 15) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15)))
    ((((-(x1) * x2) - ((2 * x2) * x3)) - x1) - x3)
  }

  def rigidBody1_Double(x1 : Double, x2 : Double, x3 : Double) : Double = {
    //require(((-15.0 <= x1) && (x1 <= 15) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15)))
    ((((-(x1) * x2) - ((2 * x2) * x3)) - x1) - x3)
  }

  def rigidBody1_DblDouble(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble) : DblDouble = {
    //require(((-15.0 <= x1) && (x1 <= 15) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15)))
    val _const0: DblDouble = 2
    ((((-(x1) * x2) - ((_const0 * x2) * x3)) - x1) - x3)
  }

  def rigidBody2_Float(x1 : Float, x2 : Float, x3 : Float) : Float = {
    //require(((-15.0 <= x1) && (x1 <= 15) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15)))
    (((((2 * ((x1 * x2) * x3)) + ((3 * x3) * x3)) - (x2 * ((x1 * x2) * x3))) + ((3 * x3) * x3)) - x2)
  }

  def rigidBody2_Double(x1 : Double, x2 : Double, x3 : Double) : Double = {
    //require(((-15.0 <= x1) && (x1 <= 15) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15)))
    (((((2 * ((x1 * x2) * x3)) + ((3 * x3) * x3)) - (x2 * ((x1 * x2) * x3))) + ((3 * x3) * x3)) - x2)
  }

  def rigidBody2_DblDouble(x1 : DblDouble, x2 : DblDouble, x3 : DblDouble) : DblDouble = {
    //require(((-15.0 <= x1) && (x1 <= 15) && (-15.0 <= x2) && (x2 <= 15.0) && (-15.0 <= x3) && (x3 <= 15)))
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3
    (((((_const0 * ((x1 * x2) * x3)) + ((_const1 * x3) * x3)) - (x2 * ((x1 * x2) * x3))) +
      ((_const2 * x3) * x3)) - x2)
  }

  def rigidBody2_triple_Float(x1: Float, x2: Float, x3: Float, x4: Float, x5: Float, x6: Float,
    x7: Float, x8: Float, x9: Float) : Float = {
    2*(x1*x2*x3) + (3*x3*x3) - x2*(x1*x2*x3) + (3*x3*x3) - x2 +
      2*(x4*x5*x6) + (3*x6*x6) - x5*(x4*x5*x6) + (3*x6*x6) - x5 +
      2*(x7*x8*x9) + (3*x9*x9) - x8*(x7*x8*x9) + (3*x9*x9) - x8
  }

  def rigidBody2_triple_Double(x1: Double, x2: Double, x3: Double, x4: Double, x5: Double, x6: Double,
    x7: Double, x8: Double, x9: Double) : Double = {
    2*(x1*x2*x3) + (3*x3*x3) - x2*(x1*x2*x3) + (3*x3*x3) - x2 +
      2*(x4*x5*x6) + (3*x6*x6) - x5*(x4*x5*x6) + (3*x6*x6) - x5 +
      2*(x7*x8*x9) + (3*x9*x9) - x8*(x7*x8*x9) + (3*x9*x9) - x8
  }

  def rigidBody2_triple_DblDouble(x1: DblDouble, x2: DblDouble, x3: DblDouble, x4: DblDouble, x5: DblDouble, x6: DblDouble,
    x7: DblDouble, x8: DblDouble, x9: DblDouble) : DblDouble = {

    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 3

    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 3

    val _const6: DblDouble = 2
    val _const7: DblDouble = 3
    val _const8: DblDouble = 3

    (((((_const0 * ((x1 * x2) * x3)) + ((_const1 * x3) * x3)) - (x2 * ((x1 * x2) * x3))) +
      ((_const2 * x3) * x3)) - x2) +
    (((((_const3 * ((x4 * x5) * x6)) + ((_const4 * x6) * x6)) - (x5 * ((x4 * x5) * x6))) +
      ((_const3 * x6) * x6)) - x5) +
    (((((_const6 * ((x7 * x8) * x9)) + ((_const7 * x9) * x9)) - (x8 * ((x7 * x8) * x9))) +
      ((_const8 * x9) * x9)) - x8)
  }

  def sine_Float(x : Float) : Float = {
    //require(((x > -1.57079632679) && (x < 1.57079632679)))
    (((x - (((x * x) * x) / 6.0f)) + (((((x * x) * x) * x) * x) / 120.0f)) - (((((((x * x) * x) * x) * x) * x) * x) / 5040.0f))
  }

  def sine_Double(x : Double) : Double = {
    //require(((x > -1.57079632679) && (x < 1.57079632679)))
    (((x - (((x * x) * x) / 6.0)) + (((((x * x) * x) * x) * x) / 120.0)) - (((((((x * x) * x) * x) * x) * x) * x) / 5040.0))
  }

  def sine_DblDouble(x : DblDouble) : DblDouble = {
    //require(((x > -1.57079632679) && (x < 1.57079632679)))
    val _const0: DblDouble = 6.0
    val _const1: DblDouble = 120.0
    val _const2: DblDouble = 5040.0
    (((x - (((x * x) * x) / _const0)) + (((((x * x) * x) * x) * x) / _const1)) -
      (((((((x * x) * x) * x) * x) * x) * x) / _const2))
  }

  def sine_triple_Float(x : Float, x1: Float, x2: Float) : Float = {
    x - (x*x*x)/6.0f + (x*x*x*x*x)/120.0f - (x*x*x*x*x*x*x)/5040.0f +
    x1 - (x1*x1*x1)/6.0f + (x1*x1*x1*x1*x1)/120.0f - (x1*x1*x1*x1*x1*x1*x1)/5040.0f +
    x2 - (x2*x2*x2)/6.0f + (x2*x2*x2*x2*x2)/120.0f - (x2*x2*x2*x2*x2*x2*x2)/5040.0f
  }

  def sine_triple_Double(x : Double, x1: Double, x2: Double) : Double = {
    x - (x*x*x)/6.0 + (x*x*x*x*x)/120.0 - (x*x*x*x*x*x*x)/5040.0 +
    x1 - (x1*x1*x1)/6.0 + (x1*x1*x1*x1*x1)/120.0 - (x1*x1*x1*x1*x1*x1*x1)/5040.0 +
    x2 - (x2*x2*x2)/6.0 + (x2*x2*x2*x2*x2)/120.0 - (x2*x2*x2*x2*x2*x2*x2)/5040.0
  }

  def sine_triple_DblDouble(x : DblDouble, x1: DblDouble, x2: DblDouble) : DblDouble = {

    val _const0: DblDouble = 6.0
    val _const1: DblDouble = 120.0
    val _const2: DblDouble = 5040.0

    val _const3: DblDouble = 6.0
    val _const4: DblDouble = 120.0
    val _const5: DblDouble = 5040.0

    val _const6: DblDouble = 6.0
    val _const7: DblDouble = 120.0
    val _const8: DblDouble = 5040.0

    (((x - (((x * x) * x) / _const0)) + (((((x * x) * x) * x) * x) / _const1)) -
      (((((((x * x) * x) * x) * x) * x) * x) / _const2)) +
    (((x1 - (((x1 * x1) * x1) / _const3)) + (((((x1 * x1) * x1) * x1) * x1) / _const4)) -
      (((((((x1 * x1) * x1) * x1) * x1) * x1) * x1) / _const5)) +
    (((x2 - (((x2 * x2) * x2) / _const6)) + (((((x2 * x2) * x2) * x2) * x2) / _const7)) -
      (((((((x2 * x2) * x2) * x2) * x2) * x2) * x2) / _const8))
  }

  def sqroot_Float(x : Float) : Float = {
    //require(((x >= 0.0) && (x < 10.0)))
    ((((1.0f + (0.5f * x)) - ((0.125f * x) * x)) + (((0.0625f * x) * x) * x)) - ((((0.0390625f * x) * x) * x) * x))
  }

  def sqroot_Double(x : Double) : Double = {
    //require(((x >= 0.0) && (x < 10.0)))
    ((((1.0 + (0.5 * x)) - ((0.125 * x) * x)) + (((0.0625 * x) * x) * x)) - ((((0.0390625 * x) * x) * x) * x))
  }

  def sqroot_DblDouble(x : DblDouble) : DblDouble = {
    //require(((x >= 0.0) && (x < 10.0)))
    val _const0: DblDouble = 0.5
    val _const1: DblDouble = 1.0
    val _const2: DblDouble = 0.125
    val _const3: DblDouble = 0.0625
    val _const4: DblDouble = 0.0390625
    ((((_const1 + (_const0 * x)) - ((_const2 * x) * x)) + (((_const3 * x) * x) * x)) -
      ((((_const4 * x) * x) * x) * x))
  }


   def state8_Float(s0 : Float, s1 : Float, s2 : Float, s3 : Float, s4 : Float, s5 : Float, s6 : Float, s7 : Float, s8 : Float, y0 : Float, y1 : Float, y2 : Float, y3 : Float, y4 : Float) : Float = {
    //require(((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2 <= s4) && (s4 <= 12) &&
     // (-2 <= s5) && (s5 <= 12) && (-2 <= s6) && (s6 <= 12) && (-2 <= s7) && (s7 <= 12) && (-2 <= s8) && (s8 <= 12) && (-2 <= y0) && (y0 <= 12) && (-2 <= y1) && (y1 <= 12) && (-2 <= y2) && (y2 <= 12) && (-2 <= y3) && (y3 <= 12) && (-2 <= y4) && (y4 <= 12)))
    (((((((((((((((2.5093E-10f * s0) + (9.15884E-10f * s1)) + (7.81656E-6f * s2)) + (-7.81701E-6f * s3)) + (-6.54335E-7f * s4)) + (6.87341E-6f * s5)) + (1.00368E-5f * s6)) +
      (0.999907f * s7)) + (3.32876E-5f * s8)) + (6.5448232E-7f * y0)) + (-6.8708837E-6f * y1)) + (-8.9460042E-6f * y2)) + (9.0317123E-5f * y3)) + (-3.2191562E-5f * y4)) + -9.65830567023206E-10f)
  }

  def state8_Double(s0 : Double, s1 : Double, s2 : Double, s3 : Double, s4 : Double, s5 : Double, s6 : Double, s7 : Double, s8 : Double, y0 : Double, y1 : Double, y2 : Double, y3 : Double, y4 : Double) : Double = {
    //require(((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2 <= s4) && (s4 <= 12) && (-2 <= s5) && (s5 <= 12) && (-2 <= s6) && (s6 <= 12) && (-2 <= s7) && (s7 <= 12) && (-2 <= s8) && (s8 <= 12) && (-2 <= y0) && (y0 <= 12) && (-2 <= y1) && (y1 <= 12) && (-2 <= y2) && (y2 <= 12) && (-2 <= y3) && (y3 <= 12) && (-2 <= y4) && (y4 <= 12)))
    (((((((((((((((2.5093E-10 * s0) + (9.15884E-10 * s1)) + (7.81656E-6 * s2)) + (-7.81701E-6 * s3)) + (-6.54335E-7 * s4)) + (6.87341E-6 * s5)) + (1.00368E-5 * s6)) +
      (0.999907 * s7)) + (3.32876E-5 * s8)) + (6.5448232E-7 * y0)) + (-6.8708837E-6 * y1)) + (-8.9460042E-6 * y2)) + (9.0317123E-5 * y3)) + (-3.2191562E-5 * y4)) + -9.65830567023206E-10)
  }

  def state8_DblDouble(s0 : DblDouble, s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble, s5 : DblDouble, s6 : DblDouble, s7 : DblDouble, s8 : DblDouble, y0 : DblDouble, y1 : DblDouble, y2 : DblDouble, y3 : DblDouble, y4 : DblDouble) : DblDouble = {
    //require(((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2 <= s4) && (s4 <= 12) && (-2 <= s5) && (s5 <= 12) && (-2 <= s6) && (s6 <= 12) && (-2 <= s7) && (s7 <= 12) && (-2 <= s8) && (s8 <= 12) && (-2 <= y0) && (y0 <= 12) && (-2 <= y1) && (y1 <= 12) && (-2 <= y2) && (y2 <= 12) && (-2 <= y3) && (y3 <= 12) && (-2 <= y4) && (y4 <= 12)))
    val _const0: DblDouble = 2.5093E-10
    val _const1: DblDouble = 9.15884E-10
    val _const2: DblDouble = 7.81656E-6
    val _const3: DblDouble = -7.81701E-6
    val _const4: DblDouble = -6.54335E-7
    val _const5: DblDouble = 6.87341E-6
    val _const6: DblDouble = 1.00368E-5
    val _const7: DblDouble = 0.999907
    val _const8: DblDouble = 3.32876E-5
    val _const9: DblDouble = 6.5448232E-7
    val _const10: DblDouble = -6.8708837E-6
    val _const11: DblDouble = -8.9460042E-6
    val _const12: DblDouble = 9.0317123E-5
    val _const13: DblDouble = -3.2191562E-5
    val _const14: DblDouble = -9.65830567023206E-10

    (((((((((((((((_const0 * s0) + (_const1 * s1)) + (_const2 * s2)) + (_const3 * s3)) +
      (_const4 * s4)) + (_const5 * s5)) + (_const6 * s6)) +
      (_const7 * s7)) + (_const8 * s8)) + (_const9 * y0)) + (_const10 * y1)) +
    (_const11 * y2)) + (_const12 * y3)) + (_const13 * y4)) + _const14)
  }

  def state9_Float(s0 : Float, s1 : Float, s2 : Float, s3 : Float, s4 : Float, s5 : Float, s6 : Float, s7 : Float, s8 : Float, y0 : Float, y1 : Float, y2 : Float, y3 : Float, y4 : Float) : Float = {
    //require(((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2 <= s4) && (s4 <= 12) && (-2 <= s5) && (s5 <= 12) && (-2 <= s6) && (s6 <= 12) && (-2 <= s7) && (s7 <= 12) && (-2 <= s8) && (s8 <= 12) && (-2 <= y0) && (y0 <= 12) && (-2 <= y1) && (y1 <= 12) && (-2 <= y2) && (y2 <= 12) && (-2 <= y3) && (y3 <= 12) && (-2 <= y4) && (y4 <= 12)))
    (((((((((((((((-1.73572E-9f * s0) + (-6.90441E-9f * s1)) + (1.91831E-8f * s2)) + (7.80416E-6f * s3)) + (5.01527E-6f * s4)) + (-4.73947E-6f * s5)) + (4.30545E-7f * s6)) + (3.35281E-5f * s7)) +
      (0.999934f * s8)) + (-5.0163739E-6f * y0)) + (4.7201386E-6f * y1)) + (-4.156438E-7f * y2)) + (-3.2406398E-5f * y3)) + (6.4987306E-5f * y4)) + 7.402204482912982E-9f)
  }

  def state9_Double(s0 : Double, s1 : Double, s2 : Double, s3 : Double, s4 : Double, s5 : Double, s6 : Double, s7 : Double, s8 : Double, y0 : Double, y1 : Double, y2 : Double, y3 : Double, y4 : Double) : Double = {
    //require(((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2 <= s4) && (s4 <= 12) && (-2 <= s5) && (s5 <= 12) && (-2 <= s6) && (s6 <= 12) && (-2 <= s7) && (s7 <= 12) && (-2 <= s8) && (s8 <= 12) && (-2 <= y0) && (y0 <= 12) && (-2 <= y1) && (y1 <= 12) && (-2 <= y2) && (y2 <= 12) && (-2 <= y3) && (y3 <= 12) && (-2 <= y4) && (y4 <= 12)))
    (((((((((((((((-1.73572E-9 * s0) + (-6.90441E-9 * s1)) + (1.91831E-8 * s2)) + (7.80416E-6 * s3)) + (5.01527E-6 * s4)) + (-4.73947E-6 * s5)) + (4.30545E-7 * s6)) + (3.35281E-5 * s7)) +
      (0.999934 * s8)) + (-5.0163739E-6 * y0)) + (4.7201386E-6 * y1)) + (-4.156438E-7 * y2)) + (-3.2406398E-5 * y3)) + (6.4987306E-5 * y4)) + 7.402204482912982E-9)
  }

  def state9_DblDouble(s0 : DblDouble, s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble, s5 : DblDouble, s6 : DblDouble, s7 : DblDouble, s8 : DblDouble, y0 : DblDouble, y1 : DblDouble, y2 : DblDouble, y3 : DblDouble, y4 : DblDouble) : DblDouble = {
    //require(((-2.5 <= s0) && (s0 <= 6.5) && (-2.5 <= s1) && (s1 <= 6.5) && (-2.5 <= s2) && (s2 <= 6.5) && (-2.5 <= s3) && (s3 <= 6.5) && (-2 <= s4) && (s4 <= 12) && (-2 <= s5) && (s5 <= 12) && (-2 <= s6) && (s6 <= 12) && (-2 <= s7) && (s7 <= 12) && (-2 <= s8) && (s8 <= 12) && (-2 <= y0) && (y0 <= 12) && (-2 <= y1) && (y1 <= 12) && (-2 <= y2) && (y2 <= 12) && (-2 <= y3) && (y3 <= 12) && (-2 <= y4) && (y4 <= 12)))
    val _const0: DblDouble = -1.73572E-9
    val _const1: DblDouble = -6.90441E-9
    val _const2: DblDouble = 1.91831E-8
    val _const3: DblDouble = 7.80416E-6
    val _const4: DblDouble = 5.01527E-6
    val _const5: DblDouble = -4.73947E-6
    val _const6: DblDouble = 4.30545E-7
    val _const7: DblDouble = 3.35281E-5
    val _const8: DblDouble = 0.999934
    val _const9: DblDouble = -5.0163739E-6
    val _const10: DblDouble = 4.7201386E-6
    val _const11: DblDouble = -4.156438E-7
    val _const12: DblDouble = -3.2406398E-5
    val _const13: DblDouble = 6.4987306E-5
    val _const14: DblDouble = 7.402204482912982E-9

    (((((((((((((((_const0 * s0) + (_const1 * s1)) + (_const2 * s2)) + (_const3 * s3)) +
      (_const4 * s4)) + (_const5 * s5)) + (_const6 * s6)) + (_const7 * s7)) +
      (_const8 * s8)) + (_const9 * y0)) + (_const10 * y1)) + (_const11 * y2)) +
    (_const12 * y3)) + (_const13 * y4)) + _const14)
  }

  def state9_double_Float(s0 : Float, s1 : Float, s2 : Float, s3 : Float, s4 : Float, s5 : Float, s6 : Float, s7 : Float, s8 : Float, y0 : Float, y1 : Float, y2 : Float, y3 : Float, y4 : Float,
    s0_2 : Float, s1_2 : Float, s2_2 : Float, s3_2 : Float, s4_2 : Float, s5_2 : Float, s6_2 : Float, s7_2 : Float, s8_2 : Float, y0_2 : Float, y1_2 : Float, y2_2 : Float, y3_2 : Float, y4_2 : Float) : Float = {
    (((((((((((((((-1.73572E-9f * s0) + (-6.90441E-9f * s1)) + (1.91831E-8f * s2)) + (7.80416E-6f * s3)) + (5.01527E-6f * s4)) + (-4.73947E-6f * s5)) + (4.30545E-7f * s6)) + (3.35281E-5f * s7)) +
      (0.999934f * s8)) + (-5.0163739E-6f * y0)) + (4.7201386E-6f * y1)) + (-4.156438E-7f * y2)) + (-3.2406398E-5f * y3)) + (6.4987306E-5f * y4)) + 7.402204482912982E-9f) +
    (((((((((((((((-1.73572E-9f * s0_2) + (-6.90441E-9f * s1_2)) + (1.91831E-8f * s2_2)) + (7.80416E-6f * s3_2)) + (5.01527E-6f * s4_2)) + (-4.73947E-6f * s5_2)) + (4.30545E-7f * s6_2)) + (3.35281E-5f * s7_2)) +
      (0.999934f * s8_2)) + (-5.0163739E-6f * y0_2)) + (4.7201386E-6f * y1_2)) + (-4.156438E-7f * y2_2)) + (-3.2406398E-5f * y3_2)) + (6.4987306E-5f * y4_2)) + 7.402204482912982E-9f)
  }

  def state9_double_Double(s0 : Double, s1 : Double, s2 : Double, s3 : Double, s4 : Double, s5 : Double, s6 : Double, s7 : Double, s8 : Double, y0 : Double, y1 : Double, y2 : Double, y3 : Double, y4 : Double,
    s0_2 : Double, s1_2 : Double, s2_2 : Double, s3_2 : Double, s4_2 : Double, s5_2 : Double, s6_2 : Double, s7_2 : Double, s8_2 : Double, y0_2 : Double, y1_2 : Double, y2_2 : Double, y3_2 : Double, y4_2 : Double) : Double = {
    (((((((((((((((-1.73572E-9 * s0) + (-6.90441E-9 * s1)) + (1.91831E-8 * s2)) + (7.80416E-6 * s3)) + (5.01527E-6 * s4)) + (-4.73947E-6 * s5)) + (4.30545E-7 * s6)) + (3.35281E-5 * s7)) +
      (0.999934 * s8)) + (-5.0163739E-6 * y0)) + (4.7201386E-6 * y1)) + (-4.156438E-7 * y2)) + (-3.2406398E-5 * y3)) + (6.4987306E-5 * y4)) + 7.402204482912982E-9) +
    (((((((((((((((-1.73572E-9 * s0_2) + (-6.90441E-9 * s1_2)) + (1.91831E-8 * s2_2)) + (7.80416E-6 * s3_2)) + (5.01527E-6 * s4_2)) + (-4.73947E-6 * s5_2)) + (4.30545E-7 * s6_2)) + (3.35281E-5 * s7_2)) +
      (0.999934 * s8_2)) + (-5.0163739E-6 * y0_2)) + (4.7201386E-6 * y1_2)) + (-4.156438E-7 * y2_2)) + (-3.2406398E-5 * y3_2)) + (6.4987306E-5 * y4_2)) + 7.402204482912982E-9)
  }

  def state9_double_DblDouble(s0 : DblDouble, s1 : DblDouble, s2 : DblDouble, s3 : DblDouble, s4 : DblDouble, s5 : DblDouble, s6 : DblDouble, s7 : DblDouble, s8 : DblDouble, y0 : DblDouble, y1 : DblDouble, y2 : DblDouble, y3 : DblDouble, y4 : DblDouble,
    s0_2 : DblDouble, s1_2 : DblDouble, s2_2 : DblDouble, s3_2 : DblDouble, s4_2 : DblDouble, s5_2 : DblDouble, s6_2 : DblDouble, s7_2 : DblDouble, s8_2 : DblDouble, y0_2 : DblDouble, y1_2 : DblDouble, y2_2 : DblDouble, y3_2 : DblDouble, y4_2 : DblDouble) : DblDouble = {
    val _const0: DblDouble = -1.73572E-9
    val _const1: DblDouble = -6.90441E-9
    val _const2: DblDouble = 1.91831E-8
    val _const3: DblDouble = 7.80416E-6
    val _const4: DblDouble = 5.01527E-6
    val _const5: DblDouble = -4.73947E-6
    val _const6: DblDouble = 4.30545E-7
    val _const7: DblDouble = 3.35281E-5
    val _const8: DblDouble = 0.999934
    val _const9: DblDouble = -5.0163739E-6
    val _const10: DblDouble = 4.7201386E-6
    val _const11: DblDouble = -4.156438E-7
    val _const12: DblDouble = -3.2406398E-5
    val _const13: DblDouble = 6.4987306E-5
    val _const14: DblDouble = 7.402204482912982E-9

    val _const0_2: DblDouble = -1.73572E-9
    val _const1_2: DblDouble = -6.90441E-9
    val _const2_2: DblDouble = 1.91831E-8
    val _const3_2: DblDouble = 7.80416E-6
    val _const4_2: DblDouble = 5.01527E-6
    val _const5_2: DblDouble = -4.73947E-6
    val _const6_2: DblDouble = 4.30545E-7
    val _const7_2: DblDouble = 3.35281E-5
    val _const8_2: DblDouble = 0.999934
    val _const9_2: DblDouble = -5.0163739E-6
    val _const10_2: DblDouble = 4.7201386E-6
    val _const11_2: DblDouble = -4.156438E-7
    val _const12_2: DblDouble = -3.2406398E-5
    val _const13_2: DblDouble = 6.4987306E-5
    val _const14_2: DblDouble = 7.402204482912982E-9


    (((((((((((((((_const0 * s0) + (_const1 * s1)) + (_const2 * s2)) + (_const3 * s3)) +
      (_const4 * s4)) + (_const5 * s5)) + (_const6 * s6)) + (_const7 * s7)) +
      (_const8 * s8)) + (_const9 * y0)) + (_const10 * y1)) + (_const11 * y2)) +
    (_const12 * y3)) + (_const13 * y4)) + _const14) +
    (((((((((((((((_const0_2 * s0_2) + (_const1_2 * s1_2)) + (_const2_2 * s2_2)) + (_const3_2 * s3_2)) +
      (_const4_2 * s4_2)) + (_const5_2 * s5_2)) + (_const6_2 * s6_2)) + (_const7_2 * s7_2)) +
      (_const8_2 * s8_2)) + (_const9_2 * y0_2)) + (_const10_2 * y1_2)) + (_const11_2 * y2_2)) +
    (_const12_2 * y3_2)) + (_const13_2 * y4_2)) + _const14_2)
  }


  def turbine1_Float(v : Float, w : Float, r : Float) : Float = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    (((3 + (2 / (r * r))) - (((0.125f * (3 - (2 * v))) * (((w * w) * r) * r)) / (1 - v))) - 4.5f)
  }

  def turbine1_Double(v : Double, w : Double, r : Double) : Double = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    (((3 + (2 / (r * r))) - (((0.125 * (3 - (2 * v))) * (((w * w) * r) * r)) / (1 - v))) - 4.5)
  }

  def turbine1_DblDouble(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 4.5
    val _const3: DblDouble = 2
    val _const4: DblDouble = 3
    val _const5: DblDouble = 0.125
    val _const6: DblDouble = 1
    (((_const1 + (_const0 / (r * r))) - (((_const5 * (_const4 - (_const3 * v))) *
      (((w * w) * r) * r)) / (_const6 - v))) - _const2)
  }

  def turbine2_Float(v : Float, w : Float, r : Float) : Float = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    (((6 * v) - (((0.5f * v) * (((w * w) * r) * r)) / (1 - v))) - 2.5f)
  }

  def turbine2_Double(v : Double, w : Double, r : Double) : Double = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    (((6 * v) - (((0.5 * v) * (((w * w) * r) * r)) / (1 - v))) - 2.5)
  }

  def turbine2_DblDouble(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    val _const0: DblDouble = 6
    val _const1: DblDouble = 2.5
    val _const2: DblDouble = 0.5
    val _const3: DblDouble = 1
    (((_const0 * v) - (((_const2 * v) * (((w * w) * r) * r)) / (_const3 - v))) - _const1)
  }

  def turbine3_Float(v : Float, w : Float, r : Float) : Float = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    (((3 - (2 / (r * r))) - (((0.125f * (1 + (2 * v))) * (((w * w) * r) * r)) / (1 - v))) - 0.5f)
  }

  def turbine3_Double(v : Double, w : Double, r : Double) : Double = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    (((3 - (2 / (r * r))) - (((0.125 * (1 + (2 * v))) * (((w * w) * r) * r)) / (1 - v))) - 0.5)
  }

  def turbine3_DblDouble(v : DblDouble, w : DblDouble, r : DblDouble) : DblDouble = {
    //require(((-4.5 <= v) && (v <= -0.3) && (0.4 <= w) && (w <= 0.9) && (3.8 <= r) && (r <= 7.8)))
    val _const0: DblDouble = 2
    val _const1: DblDouble = 3
    val _const2: DblDouble = 2
    val _const3: DblDouble = 1
    val _const4: DblDouble = 0.125
    val _const5: DblDouble = 1
    val _const6: DblDouble = 0.5
    (((_const1 - (_const0 / (r * r))) - (((_const4 * (_const3 + (_const2 * v))) *
      (((w * w) * r) * r)) / (_const5 - v))) - _const6)
  }

}

