package LAB5

import org.scalatest._
import chiseltest._
import chisel3._

class Task2Test extends FreeSpec with ChiselScalatestTester{
    "Task2Test"in {
        test(new Task2(UInt(16.W))){c=>
    c.io.in.data.poke(5.U)
    c.io.in.addr.poke(4.U)
    c.io.out.data.expect(5.U)
    c.io.out.addr.expect(4.U)
    c.clock.step(100)
    }
    }
}