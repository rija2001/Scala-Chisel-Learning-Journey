package LAB3

import org.scalatest._
import chiseltest._
import chisel3._

class Decoder_2to4Test extends FreeSpec with ChiselScalatestTester{
    "Decoder_2to4 Test "in {
        test(new Decoder_2to4()) {c =>
        c.io.in.poke("b01".U)
        c.io.out.expect("b0010".U)
        c.clock.step(100)
        
        }
    }

}