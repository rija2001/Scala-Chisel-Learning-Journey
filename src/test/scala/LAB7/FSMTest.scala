package LAB7

import org.scalatest._
import chiseltest._
import chisel3._

class FSMTest extends FreeSpec with ChiselScalatestTester{
    "FSM Test "in {
        test(new FSM){c =>
        c.io.in.poke(false.B)
        c.io.out.expect(false.B)
         c.clock.step(100)
    }
   
}
}