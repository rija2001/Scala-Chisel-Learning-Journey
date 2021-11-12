package LAB1
import org.scalatest._
import chiseltest._
import chisel3._

class Task2Test extends FreeSpec with ChiselScalatestTester{
    "New Task2 Test "in {
        test(new Task2(4)) {c =>
        c.io.data_in.poke(6.U)


        c.clock.step(100)
        
        }
    }

}