package LAB3

import org.scalatest._
import chiseltest._
import chisel3._

class Encoder4to2Test extends FreeSpec with ChiselScalatestTester{
    "New Encoder4to2 Test "in {
    test(new Encoder4to2()) {c=>
    c.io.in.poke("b0100".U)
    c.io.out.expect("b10".U)
    c.clock.step(100)
        
        }
    }

}