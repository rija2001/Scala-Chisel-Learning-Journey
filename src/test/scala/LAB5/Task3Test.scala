package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class Task3Test extends FreeSpec with ChiselScalatestTester{
    "New Task3Test "in {
    test(new Task3(SInt(3.W))) {c=>
    c.io.in1.poke(3.S)
    c.io.in2.poke(1.S)
    c.io.sel.poke(true.B)
    
    //c.io.sum.expect("b00".U)
    c.io.out.expect(3.S)
    c.clock.step(100)
    }
   
}
}