package practice

import org.scalatest._
import chiseltest._
import chisel3._

class NotTest extends FreeSpec with ChiselScalatestTester{
    "New Not Gate Test "in {
        test(new Not()){c =>
        c.io.a.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(0.U)

        }
    }
}