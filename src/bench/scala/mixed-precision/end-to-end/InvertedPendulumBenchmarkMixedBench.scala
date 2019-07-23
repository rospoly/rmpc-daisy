package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import InvertedPendulum._
import daisy.bench.MixedBaselineFunctions._

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
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  val input2Min = -10.0f
  val input2Max = 10.0f
  //val input2 = input2Min + (input2Max - input2Min) * rand.nextFloat()
  val inputsFloat2 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
    //input2
  }
  val input3Min = -0.785f
  val input3Max = 0.785f
  //val input3 = input3Min + (input3Max - input3Min) * rand.nextFloat()
  val inputsFloat3 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
    //input3
  }
  val input4Min = -0.785f
  val input4Max = 0.785f
  //val input4 = input4Min + (input4Max - input4Min) * rand.nextFloat()
  val inputsFloat4 = Array.fill(numRuns) {
    input4Min + (input4Max - input4Min) * rand.nextFloat()
    //input4
  }
  var counter = 0.0

  counter = 0.0
  performance of "invPendulum_Float" in {
    measure method ("	invPendulum_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invPendulum_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invPendulum_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invPendulum_Double" in {
    measure method ("	invPendulum_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invPendulum_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invPendulum_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invPendulum_DblDouble" in {
    measure method ("	invPendulum_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invPendulum_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invPendulum_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_32" in {
    measure method ("	invpendulum_out_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_32_05" in {
    measure method ("	invpendulum_out_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_32_01" in {
    measure method ("	invpendulum_out_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_32_001" in {
    measure method ("	invpendulum_out_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_64" in {
    measure method ("	invpendulum_out_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_64_05" in {
    measure method ("	invpendulum_out_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_64_01" in {
    measure method ("	invpendulum_out_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_64_001" in {
    measure method ("	invpendulum_out_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "invpendulum_out_dbldbl" in {
    measure method ("	invpendulum_out_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = invpendulum_out_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += invpendulum_out_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}