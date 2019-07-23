package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Sine_triple._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object Sine_tripleBenchmarkMixedBench extends Bench[Double] {
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
  val inputsFloat2 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
  }
  val inputsFloat3 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
  }
  var counter = 0.0

  counter = 0.0
  performance of "sine_triple_Float" in {
    measure method ("	sine_triple_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_Double" in {
    measure method ("	sine_triple_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_DblDouble" in {
    measure method ("	sine_triple_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_32" in {
    measure method ("	sine_triple_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_32_05" in {
    measure method ("	sine_triple_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_32_01" in {
    measure method ("	sine_triple_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_32_001" in {
    measure method ("	sine_triple_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_64" in {
    measure method ("	sine_triple_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_64_05" in {
    measure method ("	sine_triple_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_64_01" in {
    measure method ("	sine_triple_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_64_001" in {
    measure method ("	sine_triple_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_triple_dbldbl" in {
    measure method ("	sine_triple_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_triple_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0))
          while(i < numRuns) {
            res += sine_triple_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}