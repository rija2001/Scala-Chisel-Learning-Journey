package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class EMuxTest extends FreeSpec with ChiselScalatestTester{
    "New EmuxTest "in {
    test(new EMux(UInt(2.W))) {c=>
    c.io.in1.poke(3.U)
    c.io.in2.poke(1.U)
    c.io.sel.poke(true.B)
    
    //c.io.sum.expect("b00".U)
    c.io.out.expect(3.U)
    c.clock.step(100)
    }
   
}
}