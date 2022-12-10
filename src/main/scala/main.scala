import Algorithm.Sort.bubble

@main
def main(): Unit = {
  println("Hello world!")

  var list: Array[Double] = Array(3, 1, 2, 4, 1, 2, 6, 4, -1, 55, 12, 0 , 0, 1)
  
  for i <- bubble(list) do print(s"$i ")
}
