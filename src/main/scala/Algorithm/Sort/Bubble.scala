package Algorithm.Sort

private class Bubble(
            private var iterable: Array[Double]
            ) {
  def sort(): Array[Double] =
    for i <- iterable.indices do
      for j <- (iterable.length - 1) to i + 1 by -1 do
        if iterable(j) < iterable(j - 1) then
          val a = iterable(j)
          iterable(j) = iterable(j - 1)
          iterable(j - 1) = a
    iterable
}
