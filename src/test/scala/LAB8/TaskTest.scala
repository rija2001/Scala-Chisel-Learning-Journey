package LAB8

import org.scalatest._
import chiseltest._
import chisel3._

class TaskTest extends FreeSpec with ChiselScalatestTester{
    "TaskTest "in {
        test(new Task){c =>
       
        c.io.requestor(0).valid.poke(1.B)
        c.io.requestor(1).valid.poke(1.B)
        c.io.requestor(2).valid.poke(1.B)
        c.io.requestor(3).valid.poke(1.B)
        c.io.requestor(0).bits.poke(24.U)
        c.io.requestor(1).bits.poke(24.U)
        c.io.requestor(2).bits.poke(24.U)
        c.io.requestor(3).bits.poke(24.U)
        c.io.writeaddr.poke(8.U)
        c.io.readaddr.poke(4.U)
        c.io.wr_en.poke(true.B)
        c.io.memory_out.ready.poke(1.B)
        c.clock.step(100)
    }
   
}
}