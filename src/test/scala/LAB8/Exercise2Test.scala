package LAB8

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise2Test extends FreeSpec with ChiselScalatestTester{
    "Exercise2Test "in {
        test(new Exericse2){c =>
        c.io.wr_en.poke(true.B)
        c.io.rdAddr.poke(4.U)
        c.io.wrAddr.poke(4.U)
        c.io.dataIn(0).poke(55.U)
        c.io.mask(0).poke(1.B)
        
        c.clock.step(1)
        c.io.wr_en.poke(true.B)
        c.io.rdAddr.poke(4.U)
        c.io.wrAddr.poke(4.U)
        c.io.dataIn(1).poke(10.U)
        c.io.mask(1).poke(1.B)
        
        c.clock.step(2)
        
    }
   
}
}
