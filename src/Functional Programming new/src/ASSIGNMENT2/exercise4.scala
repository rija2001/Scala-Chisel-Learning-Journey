package ASSIGNMENT2

object exercise4  extends App{
  var arr = Array(2000,4000,5000)
  //one way //
  var doublesal = (x: Int) => x * 2
  var newSalaries = arr.map(doublesal)
  println(newSalaries.mkString(" "))
//another way//
  var newsal= arr.map(x => x * 2)
  println(newsal.mkString(" "))
// another shrink way//
var newsal2=arr.map(_ *2)
  println(newsal2.mkString(" "))
  //
  val salaries = Seq(20000, 70000, 40000)
  val newSalaries1 = salaries.map(x => x * 2)
  println(newSalaries1)

}
