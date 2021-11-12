package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class Exercise1Test extends FreeSpec with ChiselScalatestTester{
    "Exercise1 Test "in {
        test(new Exercise1()) {c =>
        c.io.in_A.poke(4.U)
        c.io.in_B.poke(4.U)
        c.io.select.poke(false.B)
        c.io.out.expect(0.U)



        c.clock.step(100)
        
        }
    }

}