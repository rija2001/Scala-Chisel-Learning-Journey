package LAB2
import org.scalatest._
import chiseltest._
import chisel3._




class Exercise2Test extends FreeSpec with ChiselScalatestTester{
    "Exercise2 Test "in {
        test(new Exercise2()) {c =>
        //c.io.in.poke("b0100".U)
        c.io.in0.poke(true.B)
        c.io.in1.poke(true.B)
        c.io.in2.poke(false.B)
        c.io.in3.poke(true.B)
        c.io.in4.poke(false.B)
        c.io.in5.poke(false.B)
        c.io.in6.poke(true.B)
        c.io.in7.poke(true.B)
        c.io.sel0.poke(1.U)
        c.io.sel1.poke(1.U)
        c.io.sel2.poke(1.U)
        c.io.out.expect(true.B)



        c.clock.step(100)
        
        }
    }

}