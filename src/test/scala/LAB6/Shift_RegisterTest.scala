// shift register example
package LAB6

import org.scalatest._
import chiseltest._
import chisel3._

class Shift_RegisterTest extends FreeSpec with ChiselScalatestTester{
    "New Shift_RegisterTest"in {
        test(new Shift_Register) {c=>
    c.io.in.poke(true.B)
    c.clock.step(3)
    //c.io.in.poke(true.B)
    //c.clock.step(1)
    //c.io.in.poke(true.B)
    //c.clock.step(1)

    c.io.out.expect(7.U)
    
    
    }
   
}
}