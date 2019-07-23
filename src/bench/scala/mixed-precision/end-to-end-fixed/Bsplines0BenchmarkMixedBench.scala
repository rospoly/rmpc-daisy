package daisy.bench.mixedfixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Bsplines0._
import daisy.bench.MixedFixedBaselineFunctions._

@strictfp
object Bsplines0BenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = 0.0f
  val input1Max = 1.0f
  val inputsFloat1 = Array.fill(numRuns) {
    //input1Min + (input1Max - input1Min) * rand.nextFloat()
    rand.nextInt()
  }
  var counter = 0.0

  counter = 0.0
  performance of "bspline0_Fixed16" in {
    measure method ("	bspline0_Fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline0_Fixed16(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline0_Fixed16(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline0_Fixed32" in {
    measure method ("	bspline0_Fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline0_Fixed32(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline0_Fixed32(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }


  counter = 0.0
  performance of "bspline0_fixed16" in {
    measure method ("	bspline0_fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline0_fixed16(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline0_fixed16(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline0_fixed16_05" in {
    measure method ("	bspline0_fixed16_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline0_fixed16_05(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline0_fixed16_05(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline0_fixed16_01" in {
    measure method ("	bspline0_fixed16_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline0_fixed16_01(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline0_fixed16_01(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline0_fixed16_001" in {
    measure method ("	bspline0_fixed16_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline0_fixed16_001(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline0_fixed16_001(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline0_fixed32" in {
    measure method ("	bspline0_fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline0_fixed32(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline0_fixed32(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }





}