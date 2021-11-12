package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class MuxLookupTest extends FreeSpec with ChiselScalatestTester{
    "MuxLookup Test "in {
        test(new MuxLookup()) {c =>
        //c.io.in.poke("b0100".U)
        c.io.in0.poke(true.B)
        c.io.in1.poke(true.B)
        c.io.in2.poke(false.B)
        c.io.in3.poke(true.B)
        c.io.in4.poke(false.B)
        c.io.in5.poke(false.B)
        c.io.in6.poke(true.B)
        c.io.in7.poke(true.B)
        c.io.sel.poke(4.U)
        c.io.out.expect(false.B)



        c.clock.step(100)
        
        }
    }

}