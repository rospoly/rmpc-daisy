package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Sine._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object SineBenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = -1.5707964f
  val input1Max = 1.5707964f
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  var counter = 0.0

  counter = 0.0
  performance of "sine_Float" in {
    measure method ("	sine_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_Float(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_Float(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_Double" in {
    measure method ("	sine_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_Double(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_Double(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_DblDouble" in {
    measure method ("	sine_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_DblDouble(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_DblDouble(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_32" in {
    measure method ("	sine_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_32(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_32(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_32_05" in {
    measure method ("	sine_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_32_05(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_32_05(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_32_01" in {
    measure method ("	sine_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_32_01(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_32_01(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_32_001" in {
    measure method ("	sine_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_32_001(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_32_001(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_64" in {
    measure method ("	sine_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_64(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_64(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_64_05" in {
    measure method ("	sine_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_64_05(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_64_05(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_64_01" in {
    measure method ("	sine_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_64_01(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_64_01(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_64_001" in {
    measure method ("	sine_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_64_001(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_64_001(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_dbldbl" in {
    measure method ("	sine_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_dbldbl(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_dbldbl(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}