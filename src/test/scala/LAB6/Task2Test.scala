// Counter with XOR example
package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class Task2Test extends FreeSpec with ChiselScalatestTester{
    "New Task2Test LAB6"in {
        test(new Task2) {c=>
    //c.io.out(0).expect(true.B)

    c.clock.step(100)
    }
   
}
}