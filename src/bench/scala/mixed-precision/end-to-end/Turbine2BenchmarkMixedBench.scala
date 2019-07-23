package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Turbine2._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object Turbine2BenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = -4.5f
  val input1Max = -0.3f
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  val input2Min = 0.4f
  val input2Max = 0.9f
  //val input2 = input2Min + (input2Max - input2Min) * rand.nextFloat()
  val inputsFloat2 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
    //input2
  }
  val input3Min = 3.8f
  val input3Max = 7.8f
  //val input3 = input3Min + (input3Max - input3Min) * rand.nextFloat()
  val inputsFloat3 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
    //input3
  }
  var counter = 0.0

  counter = 0.0
  performance of "turbine2_Float" in {
    measure method ("	turbine2_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_Double" in {
    measure method ("	turbine2_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_DblDouble" in {
    measure method ("	turbine2_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_32" in {
    measure method ("	turbine2_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_32_05" in {
    measure method ("	turbine2_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_32_01" in {
    measure method ("	turbine2_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_32_001" in {
    measure method ("	turbine2_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_64" in {
    measure method ("	turbine2_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_64_05" in {
    measure method ("	turbine2_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_64_01" in {
    measure method ("	turbine2_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_64_001" in {
    measure method ("	turbine2_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "turbine2_dbldbl" in {
    measure method ("	turbine2_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = turbine2_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += turbine2_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}