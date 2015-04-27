package tri.le

/**
 * Created by TriLe on 04/27/15.
 */
object ArraysListsRangesTuples {
  def main(args: Array[String]) {

    val booksArray = Array("Beginning Scala", "Beginning Java", "Beginning Groovy", "Pro Scala", "Scala in 24 hours")

    booksArray.foreach {
      println
    }

    println("-------------------- 1")

    // In Scala Lists, all elements have the same type like arrays, but unlike arrays, elements of a list cannot by
    // changed by assignment.
    val booksList: List[String] = List("Beginning Scala", "Beginning Groovy", "Beginning Java")

    for (book <- booksList) {
      println(book)
    }

    println("-------------------- 2")

    val empty = Nil
    println(empty)
    println("-------------------- 3")

    // Creating a List of Books Using a Tail Nill and ::
    val booksNil = "Beginning Scala" :: ("Beginning Groovy" :: ("Beginning Java" :: Nil))
    println(booksNil)
    println("-------------------- 4")

    val myList = scala.collection.mutable.MutableList(1.0, 5.5)
    myList.++=(List(2.2, 3.7))
    println(myList)


    val rangeTo = 1 to 5
    rangeTo.foreach((i: Int) => println(i))
    println("-------------------- 5")


    val rangeUntil = 1 until 5
    rangeUntil.foreach((i: Int) => {
      if (i % 2 == 0)
        println(i)
    })

    rangeUntil.foreach((i: Int) => {
      if (i % 2 == 0)
        println(i)
    })
    println("-------------------- 6")



    val rangeToBy = 1 to 20 by 3
    rangeToBy.foreach(println)
    println("-------------------- 7")

    // For with filter
    for (i <- rangeToBy if i % 2 == 0) {
      println(i)
    }

    println("-------------------- 8")
    // A tuple is an ordered container of two or more values of same or different types. Unlike lists and arrays,
    // however, there is no way to iterate through elements in a tuple. Its purpose is only as a container for more
    // than one value. Tuples are useful when you need to group discrete elements and provide a generic means to
    // structure data.
    val tuple = (1, false, "Scala")
    println(tuple)
    val tuple2 = "title" -> "Beginning Scala"
    println(tuple2)

    // Variable Binding
    // You can define variables inside for expressions. You can then re-use these variables within the body
    for {book <- booksArray
         bookVal = book.toUpperCase()
    } println(bookVal)
    println("-------------------- 9")

    // Yielding
    // In Scala’s for expression you can use the yield keyword to generate new collections.
    val scalaBooks = for {
      book <- booksArray
      if book.contains("Scala")
    } yield book

    scalaBooks.foreach(println)
    println("-------------------- 10")



    val matchEx = 44 match {
      case 44 => true // if wematch 44,theresult is true
      case _ => false // otherwisetheresult isfalse
    }
    println(matchEx)
  }
}