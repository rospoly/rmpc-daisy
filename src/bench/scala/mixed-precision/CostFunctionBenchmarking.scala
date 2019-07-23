package daisy
package bench

import scala.util.Random
import org.scalameter.api._
import org.scalameter.picklers.Implicits._
import scala.annotation.strictfp

import tools.DblDouble

@strictfp
object CostFunctionBenchmarking extends Bench[Double] {

  lazy val executor = SeparateJvmsExecutor(
    new Executor.Warmer.Default,
    Aggregator.average,
    measurer)
  lazy val measurer = new Measurer.Default
  def persistor = Persistor.None
  def reporter = new LoggingReporter[Double]//new DsvReporter(',')

  val rand = new Random(System.currentTimeMillis)
  val nix = Gen.unit("unit")
  val numInputs = 10000

  val input1Float = Array.fill(numInputs) {
    -10000f + 20000f * rand.nextFloat()
  }

  val input2Float = Array.fill(numInputs) {
    -10000f + 20000f * rand.nextFloat()
  }

  val input1Double = input1Float.map(x => x.toDouble)
  val input2Double = input2Float.map(x => x.toDouble)

  val input1DblDouble = input1Float.map(x => DblDouble(x))
  val input2DblDouble = input2Float.map(x => DblDouble(x))

  var counterFloat = 0.0f
  var counterDouble = 0.0
  var counterDblDouble = DblDouble(0.0)

  counterFloat = 0
  //this measures the overhead of running the loop and adding up the results
  performance of "float baseline" in {
    measure method ("float baseline") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) //+ input2Float(i)
            i = i + 1
          }
          counterFloat += res //+ i
        }
      }
    }
  }

  counterFloat = 0
  performance of "float baseline2" in {
    measure method ("float baseline2") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input2Float(i) //+ input2Float(i)
            i = i + 1
          }
          counterFloat += res //+ i
        }
      }
    }
  }

  counterDouble = 0.0
  performance of "double baseline" in {
    measure method ("double baseline") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) //+ input2Float(i)
            i = i + 1
          }
          counterDouble += res //+ i
        }
      }
    }
  }

  counterDouble = 0.0
  performance of "double baseline2" in {
    measure method ("double baseline2") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input2Double(i) //+ input2Float(i)
            i = i + 1
          }
          counterDouble += res //+ i
        }
      }
    }
  }

  counterDblDouble = DblDouble(0.0)
  performance of "dbl-double baseline" in {
    measure method ("dbl-double baseline") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) //+ input2Float(i)
            i = i + 1
          }
          counterDblDouble += res //+ i
        }
      }
    }
  }

  counterDblDouble = DblDouble(0.0)
  performance of "dbl-double baseline2" in {
    measure method ("dbl-double baseline2") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input2DblDouble(i) //+ input2Float(i)
            i = i + 1
          }
          counterDblDouble += res //+ i
        }
      }
    }
  }


  performance of "float" in {
    counterFloat = 0
    measure method ("float plus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) + input2Float(i)
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float plus castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) + input2Double(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    measure method ("float plus castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) + input2DblDouble(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float minus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) - input2Float(i)
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float minus castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) - input2Double(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float minus castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) - input2DblDouble(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float times") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) * input2Float(i)
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float times castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) * input2Double(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float times castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) * input2DblDouble(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float div") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) / input2Float(i)
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float div castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) / input2Double(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float div castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Float(i) / input2DblDouble(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterFloat = 0
    measure method ("float u_minus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += -input1Float(i)
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    // counterFloat = 0
    // measure method ("float u_minus") in {
    //   using(nix) in {
    //     r => {
    //       var i = 0
    //       var res = 0.0f
    //       while(i < numInputs) {
    //         res += math.sqrt(input1Float(i))
    //         i = i + 1
    //       }
    //       counterFloat += res
    //     }
    //   }
    // }

    counterDouble = 0
    measure method ("float toDouble (double baseline)") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Float(i).toDouble
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDblDouble = 0
    measure method ("float toDoubleDouble (dbldbl baseline)") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += DblDouble(input1Float(i))
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }
  }




  performance of "double" in {
    counterDouble = 0.0
    measure method ("double plus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) + input2Double(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double plus castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) + input2Float(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    measure method ("double plus castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) + input2DblDouble(i).toDouble
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double minus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) - input2Double(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double minus castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) - input2Float(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double minus castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) - input2DblDouble(i).toDouble
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double times") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) * input2Double(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double times castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) * input2Float(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double times castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) * input2DblDouble(i).toDouble
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double div") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) / input2Double(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double div castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) / input2Float(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double div castFromDblDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1Double(i) / input2DblDouble(i).toDouble
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double u_minus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += -input1Double(i)
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double sqrt") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += math.sqrt(-input1Double(i))
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

    counterFloat = 0.0f
    measure method ("double toFloat (float baseline)") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1Double(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double toDoubleDouble (DblDbl baseline)") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += DblDouble(input1Double(i))
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }
  }


  performance of "double-double" in {
    counterDblDouble = 0.0
    measure method ("double-double plus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) + input2DblDouble(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double plus castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) + input2Float(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double plus castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) + input2Double(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double minus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) - input2DblDouble(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double minus castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) - input2Float(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double minus castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) - input2Double(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double times") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) * input2DblDouble(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double times castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) * input2Float(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double times castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) * input2Double(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double div") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) / input2DblDouble(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double div castFromFloat") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) / input2Float(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double div castFromDouble") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += input1DblDouble(i) / input2Double(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double u_minus") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += - input1DblDouble(i)
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterDblDouble = 0.0
    measure method ("double-double sqrt") in {
      using(nix) in {
        r => {
          var i = 0
          var res = DblDouble(0.0)
          while(i < numInputs) {
            res += - DblDouble.sqrt(input1DblDouble(i))
            i = i + 1
          }
          counterDblDouble += res
        }
      }
    }

    counterFloat = 0.0f
    measure method ("double-double toFloat (float baseline)") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0f
          while(i < numInputs) {
            res += input1DblDouble(i).toFloat
            i = i + 1
          }
          counterFloat += res
        }
      }
    }

    counterDouble = 0.0
    measure method ("double-double toDouble (double baseline)") in {
      using(nix) in {
        r => {
          var i = 0
          var res = 0.0
          while(i < numInputs) {
            res += input1DblDouble(i).toDouble
            i = i + 1
          }
          counterDouble += res
        }
      }
    }

  }
}