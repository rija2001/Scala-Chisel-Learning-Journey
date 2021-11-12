package LAB8

import org.scalatest._
import chiseltest._
import chisel3._

class Asynch_MemTest extends FreeSpec with ChiselScalatestTester{
    "Asynch_MemTest "in {
        test(new Asynch_Mem){c =>
        c.io.data_in(0).poke(1.U)
        c.io.data_in(1).poke(1.U)
        c.io.data_in(2).poke(1.U)
        c.io.data_in(3).poke(1.U)
        c.io.data_selector.poke(1.U)
        c.io.addr.poke(1.U)
        c.io.wr_en.poke(1.B)
        c.io.data_out.expect(0.U)
        c.clock.step(100)
    }
   
}
}