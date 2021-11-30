package ASSIGNMENT2

object exercise1 extends App {
  // ** 1st method **//
  var days = Array( "Monday", "Tuesday",
    "Wednesday", "Thursday", "Friday",
    "Saturday" )
  println(days.mkString(" "))



  //*** 2nd method**//
    var name = new Array[String](4)
    name(0)="rija"
    name(1)="nabah"
    name(2)= "anhaar"
    name(3)= "areeba"
    /*println(name)*/
    println(name.mkString(" "))


}