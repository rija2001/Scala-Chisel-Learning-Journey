package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class MuxTreeTest extends FreeSpec with ChiselScalatestTester{
    "MuxTree Test "in {
        test(new MuxTree()) {c =>
        c.io.in.poke("b0100".U)
        c.io.s1.poke(true.B)
        c.io.s2.poke(true.B)
        c.io.s3.poke(false.B)
        c.io.out.expect(1.U)



        c.clock.step(100)
        
        }
    }

}