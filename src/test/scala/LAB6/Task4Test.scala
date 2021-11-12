package LAB6
import org.scalatest._
import chisel3._
import chiseltest._

class Task4Test extends FreeSpec with ChiselScalatestTester{
    "up_down_counter test" in {
        test(new Task4()){c=>
            c.io.up_down.poke(1.B)
            c.clock.step(5)
            
         
           
        }
    }
}