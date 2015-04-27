package tri.le

/**
 * Created by TriLe on 04/27/15.
 */

object ClassEx {
  def main(args: Array[String]): Unit = {
    val book1 = new Book
    val book2 = new Book("Beginning Clojure")
    val book3 = new Book("Beginning Scala", 3333)

    println(book1)
    println(book2)
    println(book3)
  }
}


class Book(var title: String, var ISBN: Int) {
  def this(title: String) {
    this(title, 2222)
  }

  def this() {
    this("Beginning Erlang")
    this.ISBN = 1111
  }

  override def toString = s"$title - ISBN: $ISBN"
}


