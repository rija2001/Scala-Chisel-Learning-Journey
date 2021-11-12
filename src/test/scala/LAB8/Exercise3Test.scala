package LAB8

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise3Test extends FreeSpec with ChiselScalatestTester{
    "Exercise3 Test"in {
        test(new Exercise3){c =>
        c.io.addr.poke(1.U)
        c.io.inst.expect("b1100000000000100010011".U)
        c.clock.step(100)
    }
   
}
}
       