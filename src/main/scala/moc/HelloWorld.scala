package moc

object HelloWorld {
  def main(args: Array[String]): Unit = {


    var name = "lisa"
    var a: Null = null
    var b : Nothing =  {println("hello")
    throw new RuntimeException
    }
    println(b)

  }

}
