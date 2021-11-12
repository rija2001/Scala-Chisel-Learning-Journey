package practice

import org.scalatest._
import chiseltest._
import chisel3._

class HalfAdderTest extends FreeSpec with ChiselScalatestTester{
    "New HalfAdder Gate Test "in {
        test(new HalfAdder()){c =>
        c.io.a.poke(0.U)
        c.io.b.poke(0.U)
        c.clock.step(1)
        c.io.output1.expect(1.U)
        c.io.output2.expect(0.U)

        }
    }
}