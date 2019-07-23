package daisy
package bench

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import MixedBaselineFunctions._
import tools.DblDouble

@strictfp
object MixedBaselineBenchmark extends Bench[Double] {
  lazy val executor = SeparateJvmsExecutor(
    new Executor.Warmer.Default,
    Aggregator.average,
    measurer)
  lazy val measurer = new Measurer.Default
  def persistor = Persistor.None
  def reporter = new LoggingReporter[Double]//new DsvReporter(',')

  val rand = new Random(System.currentTimeMillis)
  val numRuns = 100000
  val nix = Gen.unit("unit")

  val input1Min = 0.0f
  val input1Max = 1.0f
  val inputsFloatBspline0 = Array.fill(numRuns) {
    0.0f + (1.0f - 0.0f) * rand.nextFloat()
  }
  var counter = 0.0

  counter = 0.0
  performance of "bspline0_Float" in {
    measure method ("	bspline0_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += bspline0_Float(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline0_Double" in {
    measure method ("	bspline0_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += bspline0_Double(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline0_DblDouble" in {
    measure method ("	bspline0_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += bspline0_DblDouble(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline1_Float" in {
    measure method (" bspline1_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += bspline1_Float(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline1_Double" in {
    measure method (" bspline1_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += bspline1_Double(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline1_DblDouble" in {
    measure method (" bspline1_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += bspline1_DblDouble(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_Float" in {
    measure method (" bspline2_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += bspline2_Float(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_Double" in {
    measure method (" bspline2_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += bspline2_Double(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_DblDouble" in {
    measure method (" bspline2_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += bspline2_DblDouble(inputsFloatBspline0(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  // ----------------------------
  //         Himmilbeau
  // ----------------------------

  val inputsFloatHimmilbeau = Array.fill(numRuns) {
    -5.0f + (5.0f - -5.0f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "himmilbeau_Float" in {
    measure method (" himmilbeau_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += himmilbeau_Float(inputsFloatHimmilbeau(i), inputsFloatHimmilbeau(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "himmilbeau_Double" in {
    measure method (" himmilbeau_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += himmilbeau_Double(inputsFloatHimmilbeau(i), inputsFloatHimmilbeau(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "himmilbeau_DblDouble" in {
    measure method (" himmilbeau_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += himmilbeau_DblDouble(inputsFloatHimmilbeau(i), inputsFloatHimmilbeau(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  // ----------------------------
  //         Inverted Pendulum
  // ----------------------------
  val inputsFloatInvPend1 = Array.fill(numRuns) {
    -50.0f + (50.0f - -50.0f) * rand.nextFloat()
  }
  val inputsFloatInvPend2 = Array.fill(numRuns) {
    -10.0f + (10.0f - -10.0f) * rand.nextFloat()
  }
  val inputsFloatInvPend3 = Array.fill(numRuns) {
    -0.785f + (0.785f - -0.785f) * rand.nextFloat()
  }
  val inputsFloatInvPend4 = Array.fill(numRuns) {
    -0.785f + (0.785f - -0.785f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "invPendulum_Float" in {
    measure method (" invPendulum_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += invPendulum_Float(inputsFloatInvPend1(i), inputsFloatInvPend2(i), inputsFloatInvPend3(i), inputsFloatInvPend4(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "invPendulum_Double" in {
    measure method ("invPendulum_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += invPendulum_Double(inputsFloatInvPend1(i), inputsFloatInvPend2(i), inputsFloatInvPend3(i), inputsFloatInvPend4(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "invPendulum_DblDouble" in {
    measure method ("invPendulum_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += invPendulum_DblDouble(inputsFloatInvPend1(i), inputsFloatInvPend2(i), inputsFloatInvPend3(i), inputsFloatInvPend4(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }


  // ----------------------------
  //         Kepler
  // ----------------------------
  val inputsFloatKepler = Array.fill(numRuns) {
    4.0f + (6.36f - 4.0f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "kepler0_Float" in {
    measure method (" kepler0_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += kepler0_Float(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_Double" in {
    measure method (" kepler0_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += kepler0_Double(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_DblDouble" in {
    measure method (" kepler0_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += kepler0_DblDouble(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_Float" in {
    measure method (" kepler1_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += kepler1_Float(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_Double" in {
    measure method (" kepler1_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += kepler1_Double(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_DblDouble" in {
    measure method (" kepler1_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += kepler1_DblDouble(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler2_Float" in {
    measure method (" kepler2_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += kepler2_Float(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler2_Double" in {
    measure method (" kepler2_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += kepler2_Double(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler2_DblDouble" in {
    measure method (" kepler2_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += kepler2_DblDouble(inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i), inputsFloatKepler(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  // ----------------------------
  //         Rigid Body
  // ----------------------------
  val inputsFloatRigidBody = Array.fill(numRuns) {
    -15.0f + (15.0f - -15.0f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "rigidBody1_Float" in {
    measure method (" rigidBody1_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += rigidBody1_Float(inputsFloatRigidBody(i), inputsFloatRigidBody(i), inputsFloatRigidBody(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_Double" in {
    measure method (" rigidBody1_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += rigidBody1_Double(inputsFloatRigidBody(i), inputsFloatRigidBody(i), inputsFloatRigidBody(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_DblDouble" in {
    measure method (" rigidBody1_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += rigidBody1_DblDouble(inputsFloatRigidBody(i), inputsFloatRigidBody(i), inputsFloatRigidBody(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_Float" in {
    measure method (" rigidBody2_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += rigidBody2_Float(inputsFloatRigidBody(i), inputsFloatRigidBody(i), inputsFloatRigidBody(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_Double" in {
    measure method (" rigidBody2_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += rigidBody2_Double(inputsFloatRigidBody(i), inputsFloatRigidBody(i), inputsFloatRigidBody(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_DblDouble" in {
    measure method (" rigidBody2_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += rigidBody2_DblDouble(inputsFloatRigidBody(i), inputsFloatRigidBody(i), inputsFloatRigidBody(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  // ----------------------------
  //         Sine
  // ----------------------------
  val inputsFloatSine = Array.fill(numRuns) {
    -1.5707964f + (1.5707964f - -1.5707964f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "sine_Float" in {
    measure method (" sine_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += sine_Float(inputsFloatSine(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_Double" in {
    measure method (" sine_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += sine_Double(inputsFloatSine(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_DblDouble" in {
    measure method (" sine_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += sine_DblDouble(inputsFloatSine(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  // ----------------------------
  //         Sqrt
  // ----------------------------
  val inputsFloatSqrt = Array.fill(numRuns) {
    0.0f + (10.0f - 0.0f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "sqroot_Float" in {
    measure method (" sqroot_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += sqroot_Float(inputsFloatSqrt(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "sqroot_Double" in {
    measure method (" sqroot_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += sqroot_Double(inputsFloatSqrt(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "sqroot_DblDouble" in {
    measure method (" sqroot_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += sqroot_DblDouble(inputsFloatSqrt(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }




  // ----------------------------
  //         Traincar
  // ----------------------------

  // 4 x
  val inputsFloatTraincar1 = Array.fill(numRuns) {
    -2.5f + (6.5f - -2.5f) * rand.nextFloat()
  }

  // 10 x
  val inputsFloatTraincar2 = Array.fill(numRuns) {
    -2.0f + (12.0f - -2.0f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "state8_Float" in {
    measure method (" state8_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += state8_Float(inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "state8_Double" in {
    measure method (" state8_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += state8_Double(inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "state8_DblDouble" in {
    measure method (" state8_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += state8_DblDouble(inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "state9_Float" in {
    measure method (" state9_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += state9_Float(inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "state9_Double" in {
    measure method (" state9_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += state9_Double(inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i),
             inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i),
             inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "state9_DblDouble" in {
    measure method (" state9_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += state9_DblDouble(inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i), inputsFloatTraincar1(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i),
              inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i), inputsFloatTraincar2(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }


  // ----------------------------
  //         Turbine
  // ----------------------------
  val inputsFloatTurbine1 = Array.fill(numRuns) {
    -4.5f + (-0.3f - -4.5f) * rand.nextFloat()
  }
  val inputsFloatTurbine2 = Array.fill(numRuns) {
    0.4f + (0.9f - 0.4f) * rand.nextFloat()
  }
  val inputsFloatTurbine3 = Array.fill(numRuns) {
    3.8f + (7.8f - 3.8f) * rand.nextFloat()
  }

  counter = 0.0
  performance of "turbine1_Float" in {
    measure method (" turbine1_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += turbine1_Float(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine1_Double" in {
    measure method (" turbine1_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += turbine1_Double(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine1_DblDouble" in {
    measure method (" turbine1_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += turbine1_DblDouble(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_Float" in {
    measure method (" turbine2_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += turbine2_Float(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_Double" in {
    measure method (" turbine2_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += turbine2_Double(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_DblDouble" in {
    measure method (" turbine2_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += turbine2_DblDouble(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine3_Float" in {
    measure method (" turbine3_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += turbine3_Float(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine3_Double" in {
    measure method (" turbine3_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numRuns) {
            res += turbine3_Double(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res + i
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine3_DblDouble" in {
    measure method (" turbine3_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numRuns) {
            res += turbine3_DblDouble(inputsFloatTurbine1(i), inputsFloatTurbine2(i), inputsFloatTurbine3(i))
            i = i + 1
          }
          counter += res.toDouble + i
        }
      }
    }
  }

}