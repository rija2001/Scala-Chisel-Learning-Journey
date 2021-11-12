package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class EXERCISE2Test extends FreeSpec with ChiselScalatestTester{
    "EXERCISE2Test"in {
    test(new EXERCISE2(16.U)) {c=>
    c.io.in1.poke(3.U)
    c.io.in2.poke(1.U)
    c.io.sel.poke(false.B)
    
    //c.io.sum.expect("b00".U)
    c.io.out.expect(1.U)
    c.clock.step(100)
    }
   
}
}