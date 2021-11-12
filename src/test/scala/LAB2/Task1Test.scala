package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester{
    "Task1 Test "in {
        test(new Task1()) {c =>
        //c.io.in.poke("b1111110".U)
        c.io.s0.poke(false.B)
        c.io.s1.poke(true.B)
        c.io.s2.poke(true.B)
        c.io.out.expect(32.U)



        c.clock.step(100)
        
        }
    }

}