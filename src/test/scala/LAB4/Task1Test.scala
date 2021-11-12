package LAB4

import chisel3._
import chisel3.util._
import org.scalatest._
import chiseltest._
import org.scalatest.FreeSpec
import chiseltest.experimental.TestOptionBuilder._
import chiseltest.internal.VerilatorBackendAnnotation



import scala.util.Random
import BranchFuc3._


class Task1Test extends FreeSpec with ChiselScalatestTester {
    "Branch1 Test"in {
                //withAnnotations( Seq ( VerilatorBackendAnnotation))
                test(new Task1){c=>
                val array_op = Array ( ALU_beq , ALU_bne , ALU_blt, ALU_bge , ALU_bltu, ALU_bgeu)
        for (i<-0 until 100) {
        val src_a = Random.nextLong() & 0xFFFFFFFFL
        val src_b = Random.nextLong() & 0xFFFFFFFFL
        val branch1 = Random.nextBoolean()
        val fun3 = Random.nextInt(5)
        val aluop = array_op(fun3)
        val result = aluop match {
            case ALU_beq => if (src_a == src_b) 
                                1
            else
                                0
            case ALU_bne => if (src_a != src_b) 
                                1
            else
                                0
            case ALU_blt => if(src_a < src_b)
                                1
            else
                                0

            case ALU_bge => if(src_a >= src_b)
                                1
            else    
                                0

            case ALU_bltu => if(src_a < src_b)
                                1
            else    
                                0
            case ALU_bgeu => if(src_a >= src_b)
                                1
            else    
                                0            
        
        }
        println(src_a)
        println(src_b)
        println(fun3)
        println(branch1)
        println(result)
       // val main1=c.io.fnct3.poke(aluop)
            c.io.arg_x.poke(src_a.U)
            c.io.arg_y.poke(src_b.U)
             
        val re= if( result ==1 &  branch1 ==1)
           1   
        else
            0    
        // if ( branch1== true)
        //   c.io.br_taken.expect(result.B)
        

        // else 
        c.io.br_taken.expect(re.B)

        c.clock.step(1)
            
        
}
c.clock.step(2)
}
}     
} 