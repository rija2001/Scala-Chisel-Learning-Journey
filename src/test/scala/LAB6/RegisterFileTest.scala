package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class RegisterFileTest extends FreeSpec with ChiselScalatestTester{
    "New RegisterFile LAB6"in {
        test(new RegisterFile) {c=>
        //c.regs(4(16,4.U))
        c.io.raddr1.poke("b00001".U)
        c.io.raddr2.poke("b00010".U)
        c.io.rdata1.expect(0.U)
        c.io.rdata2.expect(0.U)
        c.io.wen.poke(true.B)
        c.io.waddr.poke(1.U)
        c.io.wdata.poke(5.U)
        

    //c.io.out.expect(3.U)

    c.clock.step(100)
    }
   
}
}



