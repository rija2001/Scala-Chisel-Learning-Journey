package practice

import org.scalatest._
import chiseltest._
import chisel3._

class NandTest extends FreeSpec with ChiselScalatestTester{
    "New Nand Gate Test "in {
        test(new Nand()){c =>
        c.io.a.poke(1.U)
        c.io.b.poke(1.U)
        c.clock.step(1)
        c.io.output.expect(1.U)

        }
    }
}