package LAB1
//Task2
import org.scalatest._
import chiseltest._
import chisel3._

class Counter2Test extends FreeSpec with ChiselScalatestTester{
    "New Counter2 Test "in {
        test(new Counter2(4,10.U)) {c =>
        
        c.clock.step(100)
        
        }
    }

}