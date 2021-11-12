package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class Mux1_2to1Test extends FreeSpec with ChiselScalatestTester{
    "Mux1_2to1 Test "in {
        test(new Mux1_2to1()) {c =>
        c.io.in_A.poke(true.B)
        c.io.in_B.poke(true.B)
        c.io.select.poke(false.B)
        c.io.out.expect(true.B)



        c.clock.step(100)
        
        }
    }

}