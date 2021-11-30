package ASSIGNMENT2

object exercise2 extends App {
  //set//
  val set1 = Set(1, 2, 3, 4, 6, 3, 1)
  //set1 = set1 - (2) this shows that we can add or remove from set1 as it is val which is immutable
  print(set1)


  var set3 = Set(1, 2, 6, 8, 3)
  set3 = set3 + (5, 7) //this shows that we can add in set3 as it is var which is mutable
  println(set3)

  //map//
  val map1 = Map("rija" -> 30,
    "nabah" -> 20,
    "anhaaar" -> 50)
  //map1 += ("Areeba" -> 40) // will not add new entries as it is immutable because of val
  var map2 = Map("rija" -> 30,
    "nabah" -> 20,
    "anhaaar" -> 50,
    "areeba" -> 15)
  map2 += ("Areeba" -> 40) // new entries is possible becz of var which shows it is mutable/
  println(map2)


}