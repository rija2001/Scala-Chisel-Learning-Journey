package LAB4
//package LM_Chisel
import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import org.scalatest.FreeSpec
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation


import scala.util.Random


class Task2Test extends FreeSpec with ChiselScalatestTester {
    "Immediate Test"in {
                
                test(new Task2){c=>
                val Array_instruc = Array ("h00500113","h00800113","h00c00113"
)

                for (i<-0 until 100) {
                val sel = Random.nextInt(2)
                val aluop = Array_instruc(sel)

                val result = aluop match {
                case "h00500113" => 5
               case "h00800113"  => 8
                case "h00c00113" => 12
                }
            c.io.instr.poke(aluop.U)
            c.clock.step(1)
            c.io.immd_se.expect(result.S)
    c.clock.step(2)
                
                }
        }
    }
}
