package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class Mux1HTest extends FreeSpec with ChiselScalatestTester{
    "Mux1H Test "in {
        test(new Mux1H()) {c =>
        c.io.in0.poke(1.U)
        c.io.in1.poke(4.U)
        c.io.in2.poke(5.U)
        c.io.in3.poke(2.U)
        c.io.sel.poke(2.U)
        c.io.out.expect(1.U)



        c.clock.step(100)
        
        }
    }

}