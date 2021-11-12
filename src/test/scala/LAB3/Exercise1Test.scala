package LAB3

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise1Test extends FreeSpec with ChiselScalatestTester{
    "New Exercise1 Test "in {
    test(new Exercise1()) {c=>
    c.io.in.poke("b0100".U)
    c.io.out.expect("b10".U)
    c.clock.step(100)
        
        }
    }

}