package LAB8

import org.scalatest._
import chiseltest._
import chisel3._

class ForwardingTest extends FreeSpec with ChiselScalatestTester{
    "ForwardingTest "in {
        test(new Forwarding){c =>
        c.io.wr_en.poke(true.B)
        c.io.rdAddr.poke(4.U)
        c.io.wrAddr.poke(4.U)
        c.io.wrData.poke(10.U)
        
        c.clock.step(1)
        c.io.wr_en.poke(true.B)
        c.io.rdAddr.poke(4.U)
        c.io.wrAddr.poke(4.U)
        c.io.wrData.poke(10.U)
        
        c.clock.step(1)
        
    }
   
}
}
