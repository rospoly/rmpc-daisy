package unit

import ceres.QuadDouble

class QuadDoubleTest extends UnitSuite {


  ignore("addition") {
    val qd1 = QuadDouble(3.2)
    val qd2 = QuadDouble(5.5)

    val doubleResult = 3.2 + 5.5

    val qdResult = qd1 + qd2

    assert (qdResult != doubleResult)
  }

}