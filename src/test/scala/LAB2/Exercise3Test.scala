package LAB2

import chisel3._
import  chiseltest._
import org.scalatest._

class Exercise3Test extends FreeSpec with ChiselScalatestTester{
    "Encoder"  in{
        test(new Exercise3()) {c=>
        // x.io.mainin.poke("b0100".U)
        c.io.in.poke("b1000".U)
        
        c.clock.step(1)
        c.io.out.expect("b11".U)        
        }}}