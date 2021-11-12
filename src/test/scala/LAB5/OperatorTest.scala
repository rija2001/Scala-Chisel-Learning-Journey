package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class OperatorTest extends FreeSpec with ChiselScalatestTester{
    "OperatorTest"in {
    test(new Operator(2,UInt(16.W))(_&_)) {c=>
    c.io.in(0).poke(1.U)
    c.io.in(1).poke(0.U)
    
    c.io.out.expect(0.U)
    c.clock.step(100)
    }
   
}
}