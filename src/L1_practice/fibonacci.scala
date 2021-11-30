package L1_practice

object fibonacci {
  def fib(n: Int): Int = {
    def fib2(n: Int, a: Int, b: Int): Int = {
      if (n == 0) a
      else fib2(n - 1, b, a + b)
    }

    fib2(n, 0, 1)
  }
    private def formatfib(y: Int) = {
      val msg = "The numbers of fibonacci %d is %d"
      msg.format(y, fib(y))
    }

    def main(args: Array[String]): Unit =
      println(formatfib(6))


  }
