
package LAB3

import org.scalatest._
import chiseltest._
import chisel3._




class Exercise2Test extends FreeSpec with ChiselScalatestTester{
    "New ALUTest1 "in {
    test(new Exercise2()) {c=>
    c.io.in_A.poke(2.U)
    c.io.in_B.poke(2.U)
    c.io.alu_Op.poke(1.U)
    c.clock.step(1)
    //c.io.sum.expect("b00".U)
    c.io.out.expect(0.U)


    
        
        }
    }

}