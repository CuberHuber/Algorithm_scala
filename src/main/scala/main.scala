import Algorithm.Sort.bubble

@main
def main(): Unit = {
  println("Hello world!")

  var list: Array[Double] = Array(3, 1, 2, 4, 1, 2, 6, 4, -1, 55, 12, 0 , 0, 1)

//  for i <- list.indices do
//    for j <- (list.length - 1) to i + 1 by -1 do
//      if list(j) < list(j - 1) then
//        val a = list(j)
//        list(j) = list(j - 1)
//        list(j - 1) = a
//      println(s"j = $j")
//    println()
//for i <- list do println(i)
  for i <- bubble(list) do print(s"$i ")
}
