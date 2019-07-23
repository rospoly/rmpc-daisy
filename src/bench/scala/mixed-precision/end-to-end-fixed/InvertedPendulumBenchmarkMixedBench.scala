package daisy.bench.mixedfixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import InvertedPendulum._
import daisy.bench.MixedFixedBaselineFunctions._

@strictfp
object InvertedPendulumBenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = -50.0f
  val input1Max = 50.0f
  val inputsFloat1 = Array.fill(numRuns) {
    //input1Min + (input1Max - input1Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input2Min = -10.0f
  val input2Max = 10.0f
  val inputsFloat2 = Array.fill(numRuns) {
    //input2Min + (input2Max - input2Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input3Min = -0.785f
  val input3Max = 0.785f
  val inputsFloat3 = Array.fill(numRuns) {
    //input3Min + (input3Max - input3Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input4Min = -0.785f
  val input4Max = 0.785f
  val inputsFloat4 = Array.fill(numRuns) {
    //input4Min + (input4Max - input4Min) * rand.nextFloat()
    rand.nextInt()
  }
  var counter = 0.0

  counter = 0.0
  performance of "invPendulum_Fixed16" in {
    measure method ("	invPendulum_Fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invPendulum_Fixed16(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invPendulum_Fixed16(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invPendulum_Fixed32" in {
    measure method ("	invPendulum_Fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invPendulum_Fixed32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invPendulum_Fixed32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_fixed16" in {
    measure method ("	invpendulum_out_fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_fixed16(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_fixed16(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_fixed16_05" in {
    measure method ("	invpendulum_out_fixed16_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_fixed16_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_fixed16_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_fixed16_01" in {
    measure method ("	invpendulum_out_fixed16_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_fixed16_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_fixed16_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_fixed16_001" in {
    measure method ("	invpendulum_out_fixed16_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_fixed16_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_fixed16_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_fixed32" in {
    measure method ("	invpendulum_out_fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_fixed32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_fixed32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}