package LAB8

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise1Test extends FreeSpec with ChiselScalatestTester{
    "Exercise1Test lab8 "in {
        test(new Exercise1 ){c =>
        c.io.enable.poke(1.B)
        c.io.write.poke(1.B)
        c.io.addr.poke(10.U)
        c.io.mask.poke(0.U)
        c.io.dataIn.poke(555.U)
        
       // c.io.dataOut(0).expect(0.U)
       
        c.clock.step(100)
    }
   
}
}
