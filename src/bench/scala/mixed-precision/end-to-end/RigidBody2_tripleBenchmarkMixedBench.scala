package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import RigidBody2_triple._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object RigidBody2_tripleBenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = -15.0f
  val input1Max = 15.0f
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  val input2Min = -15.0f
  val input2Max = 15.0f
  //val input2 = input2Min + (input2Max - input2Min) * rand.nextFloat()
  val inputsFloat2 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
    //input2
  }
  val input3Min = -15.0f
  val input3Max = 15.0f
  //val input3 = input3Min + (input3Max - input3Min) * rand.nextFloat()
  val inputsFloat3 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
    //input3
  }
  val inputsFloat4 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
  }
  val inputsFloat5 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
  }
  val inputsFloat6 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
  }
  val inputsFloat7 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
  }
  val inputsFloat8 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
  }
  val inputsFloat9 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
  }

  var counter = 0.0

  counter = 0.0
  performance of "rigidBody2_triple_Float" in {
    measure method ("	rigidBody2_triple_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_Double" in {
    measure method ("	rigidBody2_triple_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_DblDouble" in {
    measure method ("	rigidBody2_triple_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_32" in {
    measure method ("	rigidBody2_triple_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_32_05" in {
    measure method ("	rigidBody2_triple_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_32_01" in {
    measure method ("	rigidBody2_triple_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_32_001" in {
    measure method ("	rigidBody2_triple_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_64" in {
    measure method ("	rigidBody2_triple_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_64_05" in {
    measure method ("	rigidBody2_triple_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_64_01" in {
    measure method ("	rigidBody2_triple_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_64_001" in {
    measure method ("	rigidBody2_triple_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "rigidBody2_triple_dbldbl" in {
    measure method ("	rigidBody2_triple_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = rigidBody2_triple_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0),
            inputsFloat4(0), inputsFloat5(0), inputsFloat6(0),
            inputsFloat7(0), inputsFloat8(0), inputsFloat9(0))
          while(i < numRuns) {
            res += rigidBody2_triple_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i),
              inputsFloat4(i), inputsFloat5(i), inputsFloat6(i),
              inputsFloat7(i), inputsFloat8(i), inputsFloat9(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}