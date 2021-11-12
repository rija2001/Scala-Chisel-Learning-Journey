package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester{
    "Task1Test"in {
    test(new Task1(16)) {c=>
    c.io.in0.poke(4.U)
    c.io.in1.poke(4.U)
    c.io.sum.expect(8.U)
    c.clock.step(100)
    }
    }
}