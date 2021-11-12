package LAB1
//Task3
import org.scalatest._
import chiseltest._
import chisel3._

class Exercise2Test extends FreeSpec with ChiselScalatestTester{
    "New Exercise2 Test "in {
        test(new Exercise2()) {c =>
        c.clock.step(100)
        
        }
    }

}