package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class Exercise4Test extends FreeSpec with ChiselScalatestTester{
    "New Exercise4 LAB6"in {
        test(new Exercise4) {c=>
        //c.io.in.ready.poke(1.B)
        c.io.in.valid.poke(1.B)
        c.io.out.ready.poke(1.B)
        c.io.in.bits.poke(24.U)

    //c.io.out(0).expect(true.B)

    c.clock.step(100)
    }
   
}
}