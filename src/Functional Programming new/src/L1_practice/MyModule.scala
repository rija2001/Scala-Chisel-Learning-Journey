package L1_practice

object MyModule {
  def  abs(n:Int): Int =
    if (n < 0) -n
    else n

  def fac(n: Int):Int ={
    def go(n:Int,acc:Int):Int =
      if (n<= 0) acc
      else go(n-1,n*acc)
    go(n,1)
  }
  def fib(n: Int): Int = {
    def fib2(n: Int, a: Int, b: Int): Int = {
      if (n == 0) a
      else fib2(n - 1, b, a + b)
    }

    fib2(n, 0, 1)
  }
  //private def formatFac (y:Int) ={
    //val msg ="The absolute fac of %d is %d"
    //msg.format(y,fac(y))
  //}
  //private def formatAbs (x:Int) ={
    //val msg ="The absolute value of %d is %d"
    //msg.format(x, abs(x))
  //}
  def formatResult(name:String,n:Int,f:Int)= {
      val msg = "The %s of %d is %d"
      msg.format(name, n, f)
    }
    def main(args: Array[String]): Unit =
      //println(formatAbs(-42)//
      //println(formatFac(5))//
      println(formatResult("fibb",6,fib(6)))



}


