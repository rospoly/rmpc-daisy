package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp
import scala.util.Random
import Doppler._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object DopplerBenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = -100.0f
  val input1Max = 100.0f
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  val input2Min = 20.0f
  val input2Max = 20000.0f
  //val input2 = input2Min + (input2Max - input2Min) * rand.nextFloat()
  val inputsFloat2 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
    //input2
  }
  val input3Min = -30.0f
  val input3Max = 50.0f
  //val input3 = input3Min + (input3Max - input3Min) * rand.nextFloat()
  val inputsFloat3 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
    //input3
  }
  var counter = 0.0

  counter = 0.0
  performance of "doppler_Float" in {
    measure method ("	doppler_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_Double" in {
    measure method ("	doppler_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_DblDouble" in {
    measure method ("	doppler_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_32" in {
    measure method ("	doppler_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_32_05" in {
    measure method ("	doppler_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_32_01" in {
    measure method ("	doppler_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_32_001" in {
    measure method ("	doppler_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_64" in {
    measure method ("	doppler_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_64_05" in {
    measure method ("	doppler_65_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_64_01" in {
    measure method ("	doppler_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_64_001" in {
    measure method (" doppler_65_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "doppler_dbldbl" in {
    measure method (" doppler_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = doppler_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += doppler_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

}