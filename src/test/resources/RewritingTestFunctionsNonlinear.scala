import daisy.lang._
import Real._

object RewritingTestFunctionsNonlinear {

  def rigidBody1(x1: Real, x2: Real, x3: Real): Real = {
    require(-15.0 <= x1 && x1 <= 15.0 && -15.0 <= x2 && x2 <= 15.0 && -15.0 <= x3 && x3 <= 15)

    -x1*x2 - 2*x2*x3 - x1 - x3
  }

  def rigidBody2(x1: Real, x2: Real, x3: Real): Real = {
    require(-15.0 <= x1 && x1 <= 15 && -15.0 <= x2 && x2 <= 15.0 &&
      -15.0 <= x3 && x3 <= 15)

    2*(x1*x2*x3) + (3*x3*x3) - x2*(x1*x2*x3) + (3*x3*x3) - x2
  }

  def dopplerInlined(u: Real, v: Real, T: Real): Real = {
    require(-100.0 <= u && u <= 100 && 20 <= v && v <= 20000 && -30 <= T && T <= 50)

    //val t1 = 331.4 + 0.6 * T
    (- (331.4 + 0.6 * T) *v) / (((331.4 + 0.6 * T) + u)*((331.4 + 0.6 * T) + u))

  }

  // doesn't work because of Let
  // def doppler(u: Real, v: Real, T: Real): Real = {
  //   require(-100.0 <= u && u <= 100 && 20 <= v && v <= 20000 && -30 <= T && T <= 50)

  //   val t1 = 331.4 + 0.6 * T
  //   (- (t1) *v) / ((t1 + u)*(t1 + u))

  // }

  def sine(x: Real): Real = {
    require(x > -1.57079632679 && x < 1.57079632679)
    x - (x*x*x)/6.0 + (x*x*x*x*x)/120.0 - (x*x*x*x*x*x*x)/5040.0
  }

  def sineOrder3(x: Real): Real = {
    require(-2.0 < x && x < 2.0)
    0.954929658551372 * x -  0.12900613773279798*(x*x*x)
  }


  def sqroot(x: Real): Real = {
    require(x >= 0.0 && x < 10.0)
    1.0 + 0.5*x - 0.125*x*x + 0.0625*x*x*x - 0.0390625*x*x*x*x
  }


  def bspline0(u: Real): Real = {
    require(0 <= u && u <= 1)
    (1 - u) * (1 - u) * (1 - u) / 6.0
  }

  def bspline1(u: Real): Real = {
    require(0 <= u && u <= 1)
    (3 * u*u*u - 6 * u*u + 4) / 6.0
  }

  def bspline2(u: Real): Real = {
    require(0 <= u && u <= 1)
    (-3 * u*u*u  + 3*u*u + 3*u + 1) / 6.0
  }

  def bspline3(u: Real): Real = {
    require(0 <= u && u <= 1)
    -u*u*u / 6.0
  }

  def verhulst(r: Real, K: Real, x: Real): Real = {
    require(r >= 4.0 && r <= 4.0 && K >= 1.11 && K <= 1.11 && 0.1 <= x && x <= 0.3)

    (r*x) / (1 + (x/K))

  }

  def predatorPrey(r: Real, K: Real, x: Real): Real = {
    require(r >= 4.0 && r <= 4.0 && K >= 1.11 && K <= 1.11 && 0.1 <= x && x <= 0.3)

    (r*x*x) / (1 + (x/K)*(x/K))

  }

  // doesn't work because of Let
  // def carbonGas(T: Real, a: Real, b: Real, N: Real, p: Real, V: Real): Real = {
  //   require(T >= 300 && T <= 300 && a >= 0.401 && a <= 0.401 && b >= 42.7e-6 && b <= 42.7e-6 && N >= 1000 && N <= 1000 &&
  //   p >= 3.5e7 && p <= 3.5e7 && 0.1 < V && V < 0.5)

  //   val k:Real = 1.3806503e-23
  //   (p + a * (N / V) * (N / V)) * (V - N * b) - k * N * T

  // }

  def turbine1(v: Real, w: Real, r: Real): Real = {
    require(-4.5 <= v && v <= -0.3 && 0.4 <= w && w <= 0.9 && 3.8 <= r && r <= 7.8)

    3 + 2/(r*r) - 0.125*(3-2*v)*(w*w*r*r)/(1-v) - 4.5

  }

  def turbine2(v: Real, w: Real, r: Real): Real = {
    require(-4.5 <= v && v <= -0.3 && 0.4 <= w && w <= 0.9 && 3.8 <= r && r <= 7.8)

    6*v - 0.5 * v * (w*w*r*r) / (1-v) - 2.5

  }

  def turbine3(v: Real, w: Real, r: Real): Real = {
    require(-4.5 <= v && v <= -0.3 && 0.4 <= w && w <= 0.9 && 3.8 <= r && r <= 7.8)

    3 - 2/(r*r) - 0.125 * (1+2*v) * (w*w*r*r) / (1-v) - 0.5

  }

  def kepler0(x1: Real, x2: Real, x3: Real, x4: Real, x5: Real, x6: Real): Real = {
    require(4 <= x1 && x1 <= 6.36 && 4 <= x2 && x2 <= 6.36 && 4 <= x3 && x3 <= 6.36 &&
      4 <= x4 && x4 <= 6.36 && 4 <= x5 && x5 <= 6.36 && 4 <= x6 && x6 <= 6.36)

    x2 * x5 + x3 * x6 - x2 * x3 - x5 * x6 + x1 * (-x1 + x2 + x3 - x4 + x5 + x6)

  } // 1.15e-15


  def kepler1(x1: Real, x2: Real, x3: Real, x4: Real): Real = {
    require(4 <= x1 && x1 <= 6.36 && 4 <= x2 && x2 <= 6.36 && 4 <= x3 && x3 <= 6.36 &&
      4 <= x4 && x4 <= 6.36)

    x1 * x4 * (-x1 + x2 + x3 - x4) + x2 * (x1 - x2 + x3 + x4) + x3 * (x1 + x2 - x3 + x4) -
      x2 * x3 * x4 - x1 * x3 - x1 * x2 - x4

  } // 4.50e–13

  def kepler2(x1: Real, x2: Real, x3: Real, x4: Real, x5: Real, x6: Real): Real = {
    require(4 <= x1 && x1 <= 6.36 && 4 <= x2 && x2 <= 6.36 && 4 <= x3 && x3 <= 6.36 &&
      4 <= x4 && x4 <= 6.36 && 4 <= x5 && x5 <= 6.36 && 4 <= x6 && x6 <= 6.36)

      x1 * x4 * (-x1 + x2 + x3 - x4 + x5 + x6) + x2 * x5 * (x1 - x2 + x3 + x4 - x5 + x6) +
        x3* x6 * (x1 + x2 - x3 + x4 + x5 - x6) - x2 * x3 * x4 -
          x1* x3* x5 - x1 * x2 * x6 - x4 * x5 * x6

  } //2.08e–12

  def himmilbeau(x1: Real, x2: Real) = {
    require(-5 <= x1 && x1 <= 5 && -5 <= x2 && x2 <= 5)

    (x1*x1 + x2 - 11)*(x1 * x1 + x2 - 11) + (x1 + x2*x2 - 7)*(x1 + x2*x2 - 7)

  } //1.43e–12

  def floudas26(x1: Real, x2: Real, x3: Real, x4: Real, x5: Real, x6: Real,
    x7: Real, x8: Real, x9: Real, x10: Real): Real = {
    require(0 <= x1 && x1 <= 1 && 0 <= x2 && x2 <= 1 && 0 <= x3 && x3 <= 1 && 0 <= x4 && x4 <= 1 &&
      0 <= x5 && x5 <= 1 && 0 <= x6 && x6 <= 1 && 0 <= x7 && x7 <= 1 && 0 <= x8 && x8 <= 1 &&
      0 <= x9 && x9 <= 1 && 0 <= x10 && x10 <= 1)

    48*x1 + 42*x2 + 48*x3 + 45*x4 + 44*x5 + 41*x6 + 47*x7 + 42*x8 + 45*x9 + 46*x10 -
      50*(x1*x1 + x2*x2 + x3*x3 + x4*x4 + x5*x5 + x6*x6 + x7*x7 + x8*x8 + x9*x9 + x10*x10)

  }// 5.15e-13

  def floudas33(x1: Real, x2: Real, x3: Real, x4: Real, x5: Real, x6: Real): Real = {
    require(0 <= x1 && x1 <= 6 && 0 <= x2 && x2 <= 6 && 1 <= x3 && x3 <= 5 &&
      0 <= x4 && x4 <= 6 && 1 <= x5 && x5 <= 5 && 0 <= x6 && x6 <= 10)

    - (25 * (x1 -2)*(x1 -2)) - (x2 -2)* (x2 -2) - (x3 -1)*(x3 -1) -
      (x4 -4)*(x4 -4) - (x5 - 1)*(x5 - 1) - (x6 - 4)* (x6 - 4)
  } //5.81e–13

  def floudas34(x1: Real, x2: Real, x3: Real): Real = {
    require(0 <= x1 && x1 <= 2 && 0 <= x2 && x2 <= 2 && 0 <= x3 && x3 <= 3)

    -2 * x1 + x2 - x3

  } //2.67e - 15

  def floudas46(x1: Real, x2: Real): Real = {
    require(0 <= x1 && x1 <= 3 && 0 <= x2 && x2 <= 4)

    -x1 - x2
  } //1.38e–15

  def floudas47(x1: Real, x2: Real): Real = {
    require(0 <= x1 && x1 <= 2 && 0 <= x2 && x2 <= 3)

    -12*x1 -7*x2 +x2 *x2

  } //1.01e–14


  // from FPTaylor github
  def floudas1(x1: Real, x2: Real, x3: Real, x4: Real, x5: Real, x6: Real): Real = {
    require(0 <= x1 && x1 <= 6 && 0 <= x2 && x2 <= 6 && 1 <= x3 && x3 <= 5 &&
      0 <= x4 && x4 <= 6 && 1 <= x5 && x5 <= 5 && 0 <= x6 && x6 <= 10)

    -25 * ((x1 - 2) * (x1 - 2)) - ((x2 - 2) * (x2 - 2)) - ((x3 - 1) * (x3 - 1)) -
      ((x4 - 4) * (x4 - 4)) - ((x5 - 1) * (x5 - 1)) - ((x6 - 4) * (x6 - 4))
  }


}