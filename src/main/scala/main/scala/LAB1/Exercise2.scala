package LAB1
//Task2
import chisel3._

class Exercise2() extends Module {
    val io = IO (new Bundle {
        val result = Output (Bool())
    })
    val count = RegInit (0.U (4.W))
    when ( count(3.U) === 1.U ) {
         count := 0.U
    } 
    .otherwise {
        count := count + 1.U
    }
    io.result := count (3.U)
    //println ( s " counter created with max value $max " )

}