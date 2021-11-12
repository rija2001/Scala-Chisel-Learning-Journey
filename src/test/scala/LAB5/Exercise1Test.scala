package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise1Test extends FreeSpec with ChiselScalatestTester{
    "New Exercise1Test "in {
    test(new Exercise1(32)) {c=>
    c.io.arg_x.poke(3.U)
    c.io.arg_y.poke(3.U)
    c.io.alu_oper.poke(1.U)
    
    //c.io.sum.expect("b00".U)
    c.io.alu_out.expect(3.U)
    c.clock.step(100)
    }
   
}
}