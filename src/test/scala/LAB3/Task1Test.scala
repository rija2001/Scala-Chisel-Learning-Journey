package LAB3

import org.scalatest._
import chiseltest._
import chisel3._

class Task1Test extends FreeSpec with ChiselScalatestTester{
    "New branchcotrolTest "in {
    test(new Task1()) {c=>
    c.io.arg_x.poke(2.U)
    c.io.arg_y.poke(3.U)
    c.io.fnct3.poke("b001".U)
    c.io.branch.poke(true.B)
    //c.io.sum.expect("b00".U)
    c.io.br_taken.expect(true.B)
    c.clock.step(100)

    
        
        }
    }

}