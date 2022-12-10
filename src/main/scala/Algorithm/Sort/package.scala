package Algorithm

package object Sort {

  def bubble(iterable: Array[Double]): Array[Double] =
    new Bubble(iterable).sort()
}
