package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Bsplines2._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object Bsplines2BenchmarkMixedBench extends Bench[Double] {
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
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  var counter = 0.0

  counter = 0.0
  performance of "bspline2_Float" in {
    measure method ("	bspline2_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_Float(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_Float(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_Double" in {
    measure method ("	bspline2_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_Double(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_Double(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_DblDouble" in {
    measure method ("	bspline2_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_DblDouble(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_DblDouble(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_32" in {
    measure method ("	bspline2_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_32(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_32(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_32_05" in {
    measure method ("	bspline2_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_32_05(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_32_05(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_32_01" in {
    measure method ("	bspline2_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_32_01(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_32_01(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_32_001" in {
    measure method ("	bspline2_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_32_001(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_32_001(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_64" in {
    measure method ("	bspline2_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_64(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_64(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_64_05" in {
    measure method ("	bspline2_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_64_05(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_64_05(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_64_01" in {
    measure method ("	bspline2_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_64_01(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_64_01(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_64_001" in {
    measure method ("	bspline2_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_64_001(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_64_001(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "bspline2_dbldbl" in {
    measure method ("	bspline2_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = bspline2_dbldbl(inputsFloat1(0))
          while(i < numRuns) {
            res += bspline2_dbldbl(inputsFloat1(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}