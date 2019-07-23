package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Kepler0._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object Kepler0BenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = 4.0f
  val input1Max = 6.36f
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  val input2Min = 4.0f
  val input2Max = 6.36f
  //val input2 = input2Min + (input2Max - input2Min) * rand.nextFloat()
  val inputsFloat2 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
    //input2
  }
  val input3Min = 4.0f
  val input3Max = 6.36f
  //val input3 = input3Min + (input3Max - input3Min) * rand.nextFloat()
  val inputsFloat3 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
    //input3
  }
  val input4Min = 4.0f
  val input4Max = 6.36f
  //val input4 = input4Min + (input4Max - input4Min) * rand.nextFloat()
  val inputsFloat4 = Array.fill(numRuns) {
    input4Min + (input4Max - input4Min) * rand.nextFloat()
    //input4
  }
  val input5Min = 4.0f
  val input5Max = 6.36f
  //val input5 = input5Min + (input5Max - input5Min) * rand.nextFloat()
  val inputsFloat5 = Array.fill(numRuns) {
    input5Min + (input5Max - input5Min) * rand.nextFloat()
    //input5
  }
  val input6Min = 4.0f
  val input6Max = 6.36f
  //val input6 = input6Min + (input6Max - input6Min) * rand.nextFloat()
  val inputsFloat6 = Array.fill(numRuns) {
    input6Min + (input6Max - input6Min) * rand.nextFloat()
    //input6
  }
  var counter = 0.0

  counter = 0.0
  performance of "kepler0_Float" in {
    measure method ("	kepler0_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_Double" in {
    measure method ("	kepler0_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_DblDouble" in {
    measure method ("	kepler0_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_32" in {
    measure method ("	kepler0_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_32_05" in {
    measure method ("	kepler0_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_32_01" in {
    measure method ("	kepler0_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_32_001" in {
    measure method ("	kepler0_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_64" in {
    measure method ("	kepler0_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_64_05" in {
    measure method ("	kepler0_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_64_01" in {
    measure method ("	kepler0_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_64_001" in {
    measure method ("	kepler0_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler0_dbldbl" in {
    measure method ("	kepler0_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler0_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0))
          while(i < numRuns) {
            res += kepler0_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}