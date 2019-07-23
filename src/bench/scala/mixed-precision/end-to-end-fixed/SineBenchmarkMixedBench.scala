package daisy.bench.mixedfixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Sine._
import daisy.bench.MixedFixedBaselineFunctions._

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
  val inputsFloat1 = Array.fill(numRuns) {
    //input1Min + (input1Max - input1Min) * rand.nextFloat()
    rand.nextInt()
  }
  var counter = 0.0

  counter = 0.0
  performance of "sine_Fixed16" in {
    measure method ("	sine_Fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_Fixed16(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_Fixed16(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_Fixed32" in {
    measure method ("	sine_Fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_Fixed32(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_Fixed32(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_fixed16" in {
    measure method ("	sine_fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_fixed16(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_fixed16(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_fixed16_05" in {
    measure method ("	sine_fixed16_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_fixed16_05(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_fixed16_05(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_fixed16_01" in {
    measure method ("	sine_fixed16_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_fixed16_01(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_fixed16_01(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_fixed16_001" in {
    measure method ("	sine_fixed16_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_fixed16_001(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_fixed16_001(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "sine_fixed32" in {
    measure method ("	sine_fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = sine_fixed32(inputsFloat1(0))
          while(i < numRuns) {
            res += sine_fixed32(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

}