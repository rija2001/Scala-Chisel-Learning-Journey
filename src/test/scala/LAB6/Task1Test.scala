package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester{
    "New Task1Test LAB6"in {
        test(new Task1(13)) {c=>
   // c.io.out.expect()
    c.clock.step(100)
    }
   
}
}