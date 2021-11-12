package LAB1
//Task3
import org.scalatest._
import chiseltest._
import chisel3._

class CounterTest extends FreeSpec with ChiselScalatestTester{
    "New Counter Test "in {
        test(new Counter(4.U)) {c =>
        //c.io.counterBits.poke(4.U)
        c.clock.step(100)
        
        }
    }

}