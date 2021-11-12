package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class Mux_8to1Test extends FreeSpec with ChiselScalatestTester{
    "Mux_8to1 Test "in {
        test(new Mux_8to1()) {c =>
        c.io.in.poke("b0000100".U)
        c.io.s0.poke(false.B)
        c.io.s1.poke(false.B)
        c.io.s2.poke(false.B)
        c.io.out.expect(0.U)



        c.clock.step(100)
        
        }
    }

}