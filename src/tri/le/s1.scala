object HelloWorld {
  def main(args: Array[String]) {
    // Print hello word
    println("Hello, World!")
    println("\n--------------------")
    // Call function
    forEx1(10)
    println("\n--------------------")
    // Call function with nest loop
    forEx2(4, 5)
    println("\n--------------------")

    forEx3(4, 5)
    println("\n--------------------")
  }

  // function loop from 1 to 10
  def forEx1(i: Int): Unit = {
    for {i <- 1 to i}
      print(i + "\t")
  }

  // function nest loop
  def forEx2(i: Int, j: Int): Unit = {
    for {i <- 1 to i; j <- 1 to j} {
      print(i * j + "\t")
    }
  }

  // function nest loop
  def forEx3(i: Int, j: Int): Unit = {
    for {i <- 1 to i} {
      for {j <- 1 to j} {
        print(i * j + "\t")
      }
      println("\n--------------------")
    }
  }
}