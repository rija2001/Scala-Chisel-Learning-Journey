package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class CounterTest extends FreeSpec with ChiselScalatestTester{
    "New CounterTest"in {
        test(new Counter(20)) {c=>
   // c.io.out.expect()
    c.clock.step(100)
    }
   
}
}