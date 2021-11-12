package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise3Test extends FreeSpec with ChiselScalatestTester{
    "Exercise3Test"in {
    test(new Exercise3(2,UInt(16.W))(_ + _)) {c=>
    c.io.in(0).poke(1.U)
    c.io.in(1).poke(1.U)
    
    c.io.out(0).expect(2.U)
    c.io.out(1).expect(2.U)
    c.clock.step(100)
    }
   
}
}