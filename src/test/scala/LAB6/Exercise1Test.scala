package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise1Test extends FreeSpec with ChiselScalatestTester{
    "New Exercise1"in {
        test(new Exercise1()) {c=>
    c.io.in(0).poke(true.B)
    c.io.in(1).poke(true.B)
    c.io.in(2).poke(false.B)
    c.io.in(3).poke(false.B)
    c.io.out(0).expect(3.U)
    c.io.out(1).expect(3.U)
    c.io.out(2).expect(2.U)
    c.io.out(3).expect(2.U)


    c.clock.step(4)
    }
   
}
}