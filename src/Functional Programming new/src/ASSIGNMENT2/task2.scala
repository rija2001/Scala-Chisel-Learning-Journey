package ASSIGNMENT2

object task2 extends  App {
  def CharArray ( start : Int ) : List [ Char ]={
    def main(list:List[Char], start:Int, end:Int):List[Char] = {
      if(start == end) list
      else main(start.toChar :: list, start + 1, end)
    }

    main(List(), 97, 123).reverse

  }
  
  println(CharArray(97))
  }


