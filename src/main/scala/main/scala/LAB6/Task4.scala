package LAB6

import chisel3._
import chisel3.util._
class Task4 ( val max : Int = 10) extends Module {
val io = IO ( new Bundle {
val out = Output ( UInt ( log2Ceil ( max ) . W ) )
val up_down = Input ( Bool () )
})

   val counter1 = RegInit (0.U(4.W))
    when (counter1 =/= max.U && io.up_down ===1.B) {
        counter1 := counter1 +1.U
    } .otherwise{
        counter1 := counter1-1.U
    }
    
    io.out :=counter1
}