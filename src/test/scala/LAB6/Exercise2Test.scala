package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise2Test extends FreeSpec with ChiselScalatestTester{
    "New Exercise2Test lab6"in {
        test(new Exercise2(20)) {c=>
   // c.io.out.expect()
    c.clock.step(100)
    }
   
}
}