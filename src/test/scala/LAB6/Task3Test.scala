package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class Task3Test extends FreeSpec with ChiselScalatestTester{
    "New Task3Test LAB6"in {
        test(new Task3) {c=>
    c.io.load.poke(0.B)
    c.io.in.poke(1.B)
    c.io.load_in(0).poke(1.B)
    c.io.load_in(1).poke(1.B)
    c.io.load_in(2).poke(1.B)
    //c.io.out(0).expect(true.B)

    c.clock.step(100)
    }
   
}
}