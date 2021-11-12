package LAB3

import org.scalatest._
import chiseltest._
import chisel3._

class S_DecoderTest extends FreeSpec with ChiselScalatestTester{
    "New S_Decoder Test "in {
    test(new S_Decoder()) {c=>
    c.io.in.poke("b01".U)
    c.io.out.expect("b1000".U)
    c.clock.step(100)
        
        }
    }

}