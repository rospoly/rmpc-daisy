package daisy.bench.mixedfixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import RigidBody1._
import daisy.bench.MixedFixedBaselineFunctions._

@strictfp
object RigidBody1BenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = -15.0f
  val input1Max = 15.0f
  val inputsFloat1 = Array.fill(numRuns) {
    //input1Min + (input1Max - input1Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input2Min = -15.0f
  val input2Max = 15.0f
  val inputsFloat2 = Array.fill(numRuns) {
    //input2Min + (input2Max - input2Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input3Min = -15.0f
  val input3Max = 15.0f
  val inputsFloat3 = Array.fill(numRuns) {
    //input3Min + (input3Max - input3Min) * rand.nextFloat()
    rand.nextInt()
  }
  var counter = 0.0

  counter = 0.0
  performance of "rigidBody1_Fixed16" in {
    measure method ("	rigidBody1_Fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody1_Fixed16(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += rigidBody1_Fixed16(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_Fixed32" in {
    measure method ("	rigidBody1_Fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody1_Fixed32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += rigidBody1_Fixed32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_fixed16" in {
    measure method ("	rigidBody1_fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody1_fixed16(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += rigidBody1_fixed16(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_fixed16_05" in {
    measure method ("	rigidBody1_fixed16_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody1_fixed16_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += rigidBody1_fixed16_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_fixed16_01" in {
    measure method ("	rigidBody1_fixed16_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody1_fixed16_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += rigidBody1_fixed16_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_fixed16_001" in {
    measure method ("	rigidBody1_fixed16_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody1_fixed16_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += rigidBody1_fixed16_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody1_fixed32" in {
    measure method ("	rigidBody1_fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody1_fixed32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += rigidBody1_fixed32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }


}