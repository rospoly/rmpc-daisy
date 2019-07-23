package daisy.bench.mixedfixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Traincar4_State9._
import daisy.bench.MixedFixedBaselineFunctions._

@strictfp
object Traincar4_State9BenchmarkMixedBench extends Bench[Double] {
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
  val input1Min = -2.5f
  val input1Max = 6.5f
  val inputsFloat1 = Array.fill(numRuns) {
    //input1Min + (input1Max - input1Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input2Min = -2.5f
  val input2Max = 6.5f
  val inputsFloat2 = Array.fill(numRuns) {
    //input2Min + (input2Max - input2Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input3Min = -2.5f
  val input3Max = 6.5f
  val inputsFloat3 = Array.fill(numRuns) {
    //input3Min + (input3Max - input3Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input4Min = -2.5f
  val input4Max = 6.5f
  val inputsFloat4 = Array.fill(numRuns) {
    //input4Min + (input4Max - input4Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input5Min = -2.0f
  val input5Max = 12.0f
  val inputsFloat5 = Array.fill(numRuns) {
    //input5Min + (input5Max - input5Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input6Min = -2.0f
  val input6Max = 12.0f
  val inputsFloat6 = Array.fill(numRuns) {
    //input6Min + (input6Max - input6Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input7Min = -2.0f
  val input7Max = 12.0f
  val inputsFloat7 = Array.fill(numRuns) {
    //input7Min + (input7Max - input7Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input8Min = -2.0f
  val input8Max = 12.0f
  val inputsFloat8 = Array.fill(numRuns) {
    //input8Min + (input8Max - input8Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input9Min = -2.0f
  val input9Max = 12.0f
  val inputsFloat9 = Array.fill(numRuns) {
    //input9Min + (input9Max - input9Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input10Min = -2.0f
  val input10Max = 12.0f
  val inputsFloat10 = Array.fill(numRuns) {
    //input10Min + (input10Max - input10Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input11Min = -2.0f
  val input11Max = 12.0f
  val inputsFloat11 = Array.fill(numRuns) {
    //input11Min + (input11Max - input11Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input12Min = -2.0f
  val input12Max = 12.0f
  val inputsFloat12 = Array.fill(numRuns) {
    //input12Min + (input12Max - input12Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input13Min = -2.0f
  val input13Max = 12.0f
  val inputsFloat13 = Array.fill(numRuns) {
    //input13Min + (input13Max - input13Min) * rand.nextFloat()
    rand.nextInt()
  }
  val input14Min = -2.0f
  val input14Max = 12.0f
  val inputsFloat14 = Array.fill(numRuns) {
    //input14Min + (input14Max - input14Min) * rand.nextFloat()
    rand.nextInt()
  }
  var counter = 0.0

  counter = 0.0
  performance of "train4_state9_Fixed16" in {
    measure method ("	train4_state9_Fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = state9_Fixed16(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0))
          while(i < numRuns) {
            res += state9_Fixed16(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_Fixed32" in {
    measure method ("	train4_state9_Fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = state9_Fixed32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0))
          while(i < numRuns) {
            res += state9_Fixed32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_fixed16" in {
    measure method ("	train4_state9_fixed16") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_fixed16(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0))
          while(i < numRuns) {
            res += train4_state9_fixed16(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_fixed16_05" in {
    measure method ("	train4_state9_fixed16_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_fixed16_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0))
          while(i < numRuns) {
            res += train4_state9_fixed16_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_fixed16_01" in {
    measure method ("	train4_state9_fixed16_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_fixed16_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0))
          while(i < numRuns) {
            res += train4_state9_fixed16_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_fixed16_001" in {
    measure method ("	train4_state9_fixed16_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_fixed16_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0))
          while(i < numRuns) {
            res += train4_state9_fixed16_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_fixed32" in {
    measure method ("	train4_state9_fixed32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_fixed32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0))
          while(i < numRuns) {
            res += train4_state9_fixed32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

}