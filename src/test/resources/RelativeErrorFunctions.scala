

import daisy.lang._
import Real._

object RelativeErrorFunctions {


  //
  def addition(x: Real, y: Real): Real = {
    require(1 <= x && x <= 10 && 1 <= y && y <= 10)
    x + y + x + y
  }

  //
  def mult(x: Real, y: Real): Real = {
    require(1 <= x && x <= 10 && 1 <= y && y <= 10)
    x * y * x * y
  }

  def compound(x: Real, y: Real): Real = {
    require(1 <= x && x <= 10 && 1 <= y && y <= 10)
    (x + y - x) * y
  }

  def manyVariables(x: Real, y: Real, z: Real, w: Real): Real = {
    require(1 <= x && x <= 10 && 1 <= y && y <= 10 && 1 <= z && z <= 10 &&
     1 <= w && w <= 10)
    x + y + z + w
  }

}

