package LAB3
import org.scalatest._
import chiseltest._
import chisel3._




class Task2Test extends FreeSpec with ChiselScalatestTester{
    "New ImmediateTest "in {
    test(new Task2()) {c=>
    c.io.instr.poke("b0000000011100000000000100010011".U)
    
    c.io.immd_se.expect(7.S)
    c.clock.step(100)

    
        
        }
    }

}