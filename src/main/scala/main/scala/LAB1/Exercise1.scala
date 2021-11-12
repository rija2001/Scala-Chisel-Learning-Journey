package LAB1

import chisel3._

class Exercise1(counterBits:UInt) extends Module {
    val io = IO (new Bundle {
        val result = Output (Bool())
        })
    val max = (1.U << counterBits ) - 1.U
    val count = RegInit (0.U (16.W))
    when ( count === max ) {
         count := 0.S
    } 
    .otherwise {
        count := count + 1.U
    }
    io.result := count (15.U)
    //println ( s " counter created with max value $max " )

}