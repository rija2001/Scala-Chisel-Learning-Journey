package LAB7

import org.scalatest._
import chiseltest._
import chisel3._

class Arbiter1Test extends FreeSpec with ChiselScalatestTester{
    "ArbiterTest Lab7"in {
        test(new Arbiter1) {c=>
        //c.io.in.ready.poke(1.B)
       c.io.in(0).valid.poke(1.B)
       c.io.in(1).valid.poke(1.B)
        c.io.in(0).bits.poke(24.U)
        c.io.in(1).bits.poke(24.U)
        c.io.out.ready.poke(1.B)

    //c.io.out(0).expect(true.B)

    c.clock.step(100)
    }
   
}
}