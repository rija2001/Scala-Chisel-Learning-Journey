package LAB8

import org.scalatest._
import chiseltest._
import chisel3._

class MaskTest extends FreeSpec with ChiselScalatestTester{
    "MaskTest "in {
        test(new Mask){c =>
        c.io.enable.poke(true.B)
        c.io.write.poke(true.B)
        c.io.addr.poke(2.U)
        c.io.mask(0).poke(1.B)
        c.io.mask(1).poke(0.B)
        c.io.mask(2).poke(1.B)
        c.io.mask(3).poke(0.B)
        c.io.dataIn(0).poke(4.U)
        c.io.dataIn(1).poke(4.U)
        c.io.dataIn(2).poke(4.U)
        c.io.dataIn(3).poke(4.U)
        
       
        c.clock.step(100)
    }
   
}
}
