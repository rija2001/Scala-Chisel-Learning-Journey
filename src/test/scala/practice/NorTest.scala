package practice

import org.scalatest._
import chiseltest._
import chisel3._

class NorTest extends FreeSpec with ChiselScalatestTester{
    "New Nor Gate Test "in {
        test(new Nor()){c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(1.U)

        }
    }
}