package daisy.bench.mixed

import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import scala.util.Random
import Traincar4_State9_double._
import daisy.bench.MixedBaselineFunctions._

@strictfp
object Traincar4_State9_doubleBenchmarkMixedBench extends Bench[Double] {
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
  //val input1 = input1Min + (input1Max - input1Min) * rand.nextFloat()
  val inputsFloat1 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
    //input1
  }
  val input2Min = -2.5f
  val input2Max = 6.5f
  //val input2 = input2Min + (input2Max - input2Min) * rand.nextFloat()
  val inputsFloat2 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
    //input2
  }
  val input3Min = -2.5f
  val input3Max = 6.5f
  //val input3 = input3Min + (input3Max - input3Min) * rand.nextFloat()
  val inputsFloat3 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
    //input3
  }
  val input4Min = -2.5f
  val input4Max = 6.5f
  //val input4 = input4Min + (input4Max - input4Min) * rand.nextFloat()
  val inputsFloat4 = Array.fill(numRuns) {
    input4Min + (input4Max - input4Min) * rand.nextFloat()
    //input4
  }
  val input5Min = -2.0f
  val input5Max = 12.0f
  //val input5 = input5Min + (input5Max - input5Min) * rand.nextFloat()
  val inputsFloat5 = Array.fill(numRuns) {
    input5Min + (input5Max - input5Min) * rand.nextFloat()
    //input5
  }
  val input6Min = -2.0f
  val input6Max = 12.0f
  //val input6 = input6Min + (input6Max - input6Min) * rand.nextFloat()
  val inputsFloat6 = Array.fill(numRuns) {
    input6Min + (input6Max - input6Min) * rand.nextFloat()
    //input6
  }
  val input7Min = -2.0f
  val input7Max = 12.0f
  //val input7= input7Min + (input7Max - input7Min) * rand.nextFloat()
  val inputsFloat7 = Array.fill(numRuns) {
    input7Min + (input7Max - input7Min) * rand.nextFloat()
    //input7
  }
  val input8Min = -2.0f
  val input8Max = 12.0f
  //val input8 = input8Min + (input8Max - input8Min) * rand.nextFloat()
  val inputsFloat8 = Array.fill(numRuns) {
    input8Min + (input8Max - input8Min) * rand.nextFloat()
    //input8
  }
  val input9Min = -2.0f
  val input9Max = 12.0f
  //val input9 = input9Min + (input9Max - input9Min) * rand.nextFloat()
  val inputsFloat9 = Array.fill(numRuns) {
    input9Min + (input9Max - input9Min) * rand.nextFloat()
    //input9
  }
  val input10Min = -2.0f
  val input10Max = 12.0f
  //val input10 = input10Min + (input10Max - input10Min) * rand.nextFloat()
  val inputsFloat10 = Array.fill(numRuns) {
    input10Min + (input10Max - input10Min) * rand.nextFloat()
    //input10
  }
  val input11Min = -2.0f
  val input11Max = 12.0f
  //val input11 = input11Min + (input11Max - input11Min) * rand.nextFloat()
  val inputsFloat11 = Array.fill(numRuns) {
    input11Min + (input11Max - input11Min) * rand.nextFloat()
    //input11
  }
  val input12Min = -2.0f
  val input12Max = 12.0f
  //val input12 = input12Min + (input12Max - input12Min) * rand.nextFloat()
  val inputsFloat12 = Array.fill(numRuns) {
    input12Min + (input12Max - input12Min) * rand.nextFloat()
    //input12
  }
  val input13Min = -2.0f
  val input13Max = 12.0f
  //val input13 = input13Min + (input13Max - input13Min) * rand.nextFloat()
  val inputsFloat13 = Array.fill(numRuns) {
    input13Min + (input13Max - input13Min) * rand.nextFloat()
    //input13
  }
  val input14Min = -2.0f
  val input14Max = 12.0f
  //val input14 = input14Min + (input14Max - input14Min) * rand.nextFloat()
  val inputsFloat14 = Array.fill(numRuns) {
    input14Min + (input14Max - input14Min) * rand.nextFloat()
    //input14
  }

  val inputsFloat1_2 = Array.fill(numRuns) {
    input1Min + (input1Max - input1Min) * rand.nextFloat()
  }
  val inputsFloat2_2 = Array.fill(numRuns) {
    input2Min + (input2Max - input2Min) * rand.nextFloat()
  }
  val inputsFloat3_2 = Array.fill(numRuns) {
    input3Min + (input3Max - input3Min) * rand.nextFloat()
  }
  val inputsFloat4_2 = Array.fill(numRuns) {
    input4Min + (input4Max - input4Min) * rand.nextFloat()
  }
  val inputsFloat5_2 = Array.fill(numRuns) {
    input5Min + (input5Max - input5Min) * rand.nextFloat()
  }
  val inputsFloat6_2 = Array.fill(numRuns) {
    input6Min + (input6Max - input6Min) * rand.nextFloat()
  }
  val inputsFloat7_2 = Array.fill(numRuns) {
    input7Min + (input7Max - input7Min) * rand.nextFloat()
  }
  val inputsFloat8_2 = Array.fill(numRuns) {
    input8Min + (input8Max - input8Min) * rand.nextFloat()
  }
  val inputsFloat9_2 = Array.fill(numRuns) {
    input9Min + (input9Max - input9Min) * rand.nextFloat()
  }
  val inputsFloat10_2 = Array.fill(numRuns) {
    input10Min + (input10Max - input10Min) * rand.nextFloat()
  }
  val inputsFloat11_2 = Array.fill(numRuns) {
    input11Min + (input11Max - input11Min) * rand.nextFloat()
  }
  val inputsFloat12_2 = Array.fill(numRuns) {
    input12Min + (input12Max - input12Min) * rand.nextFloat()
  }
  val inputsFloat13_2 = Array.fill(numRuns) {
    input13Min + (input13Max - input13Min) * rand.nextFloat()
  }
  val inputsFloat14_2 = Array.fill(numRuns) {
    input14Min + (input14Max - input14Min) * rand.nextFloat()
  }

  var counter = 0.0

  counter = 0.0
  performance of "train4_state9_double_Float" in {
    measure method ("	train4_state9_double_Float") in {
      using(nix) in {
        r => {
          var i = 0
          var res = state9_double_Float(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += state9_double_Float(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_Double" in {
    measure method ("	train4_state9_double_Double") in {
      using(nix) in {
        r => {
          var i = 0
          var res = state9_double_Double(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += state9_double_Double(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_DblDouble" in {
    measure method ("	train4_state9_double_DblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = state9_double_DblDouble(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += state9_double_DblDouble(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_32" in {
    measure method ("	train4_state9_double_32") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_32(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_32(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_32_05" in {
    measure method ("	train4_state9_double_32_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_32_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_32_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_32_01" in {
    measure method ("	train4_state9_double_32_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_32_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_32_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_32_001" in {
    measure method ("	train4_state9_double_32_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_32_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_32_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_64" in {
    measure method ("	train4_state9_double_64") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_64(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_64(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_64_05" in {
    measure method ("	train4_state9_double_64_05") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_64_05(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_64_05(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_64_01" in {
    measure method ("	train4_state9_double_64_01") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_64_01(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_64_01(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_64_001" in {
    measure method ("	train4_state9_double_64_001") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_64_001(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_64_001(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }

  counter = 0.0
  performance of "train4_state9_double_dbldbl" in {
    measure method ("	train4_state9_double_dbldbl") in {
      using(nix) in {
        r => {
          var i = 0
          var res = train4_state9_double_dbldbl(inputsFloat1(0), inputsFloat2(0), inputsFloat3(0), inputsFloat4(0), inputsFloat5(0), inputsFloat6(0), inputsFloat7(0), inputsFloat8(0), inputsFloat9(0), inputsFloat10(0), inputsFloat11(0), inputsFloat12(0), inputsFloat13(0), inputsFloat14(0),
            inputsFloat1_2(0), inputsFloat2_2(0), inputsFloat3_2(0), inputsFloat4_2(0), inputsFloat5_2(0), inputsFloat6_2(0), inputsFloat7_2(0), inputsFloat8_2(0), inputsFloat9_2(0), inputsFloat10_2(0), inputsFloat11_2(0), inputsFloat12_2(0), inputsFloat13_2(0), inputsFloat14_2(0))
          while(i < numRuns) {
            res += train4_state9_double_dbldbl(inputsFloat1(i), inputsFloat2(i), inputsFloat3(i), inputsFloat4(i), inputsFloat5(i), inputsFloat6(i), inputsFloat7(i), inputsFloat8(i), inputsFloat9(i), inputsFloat10(i), inputsFloat11(i), inputsFloat12(i), inputsFloat13(i), inputsFloat14(i),
              inputsFloat1_2(i), inputsFloat2_2(i), inputsFloat3_2(i), inputsFloat4_2(i), inputsFloat5_2(i), inputsFloat6_2(i), inputsFloat7_2(i), inputsFloat8_2(i), inputsFloat9_2(i), inputsFloat10_2(i), inputsFloat11_2(i), inputsFloat12_2(i), inputsFloat13_2(i), inputsFloat14_2(i))
            i = i + 1
          }
          counter += res.toDouble
        }
      }
    }
  }



}