package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Kepler1._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object Kepler1BenchmarkMixedBench extends Bench[Double] {
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
  var counter = 0.0

  counter = 0.0
  performance of "kepler1_Float" in {
    measure method ("	kepler1_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_Double" in {
    measure method ("	kepler1_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_DblDouble" in {
    measure method ("	kepler1_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_32" in {
    measure method ("	kepler1_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_32_05" in {
    measure method ("	kepler1_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_32_01" in {
    measure method ("	kepler1_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_32_001" in {
    measure method ("	kepler1_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_64" in {
    measure method ("	kepler1_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_64_05" in {
    measure method ("	kepler1_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_64_01" in {
    measure method ("	kepler1_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_64_001" in {
    measure method ("	kepler1_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "kepler1_dbldbl" in {
    measure method ("	kepler1_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = kepler1_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0))
          while(i < numRuns) {
            res += kepler1_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}