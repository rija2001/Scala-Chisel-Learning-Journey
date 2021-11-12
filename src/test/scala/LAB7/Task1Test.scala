package LAB7

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester{
    "Task1Test "in {
        test(new Task1){c =>
        c.io.f1.poke(false.B)
        c.io.f2.poke(false.B)
        c.io.r1.poke(false.B)
        c.io.r2.poke(true.B)
        //c.io.out.expect(7.U)
         c.clock.step(100)
    }
   
}
}