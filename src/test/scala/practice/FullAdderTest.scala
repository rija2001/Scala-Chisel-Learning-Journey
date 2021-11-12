package practice

import org.scalatest._
import chiseltest._
import chisel3._

class FullAdderTest extends FreeSpec with ChiselScalatestTester{
    "New FullAdder Gate Test "in {
        test(new FullAdder()){d =>
        d.io.a.poke(1.U)
        d.io.b.poke(1.U)
        d.io.c.poke(0.U)
        d.clock.step(1)
        d.io.output1.expect(1.U)
        d.io.output2.expect(1.U)

        }
    }
}
