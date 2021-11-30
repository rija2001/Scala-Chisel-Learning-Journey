package ASSIGNMENT2

object exercise3 extends App{
  def func(x: Option[String]):Unit =
    println(x)


  func(Some("rija"))
  func(None)
}
