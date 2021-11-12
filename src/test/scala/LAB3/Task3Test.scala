package LAB3

import org.scalatest._
import chiseltest._
import chisel3._

class Task3Test extends FreeSpec with ChiselScalatestTester{
    "Valid_DecoderTest Test "in {
        test(new Task3()) {c =>
        c.io.in.poke("b10".U)
        c.io.out.valid.expect(true.B)
        c.clock.step(100)
        
        }
    }

}