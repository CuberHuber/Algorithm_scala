package Algorithm.Sort

import org.scalatest.funsuite.AnyFunSuite

class BubbleTest extends AnyFunSuite {
  val list1: Array[Double] = Array(3, 1, 2, 4, 1, 2, 6, 4, -1, 55, 12, 0 , 0, 1)
  val list2: Array[Double] = Array(-1.0, 0.0, 0.0, 1.0, 1.0, 1.0, 2.0, 2.0, 3.0, 4.0, 4.0, 6.0, 12.0, 55.0)

  test("Bubble") {
    assert(new Bubble(list1).sort() === list2)
  }
}
