package LAB2
import chisel3._
//import chisel3.utils._
class LM_IO_Interface3 extends Bundle {
    //val in = Input ( UInt (8.W) )
    val s0 = Input ( Bool ())
    val s1 = Input ( Bool ())
    val s2 = Input ( Bool ())
    val out = Output (UInt (32.W ) )
    
}
class Task1 extends Module {
    val io = IO ( new LM_IO_Interface3 )
    //val main1= Cat(io.s2,io.s1,io.s0)
    when ((io.s0 === 0.U) & (io.s1 === 0.U) &(io.s2 === 0.U)){
        io.out:= 0.U
    }.elsewhen ((io.s0 === 1.U)& (io.s1 === 0.U)&(io.s2=== 0.U)){
        io.out := 8.U
    }.elsewhen ((io.s0 === 0.U)& (io.s1 ===  1.U)&(io.s2=== 0.U)){
        io.out := 16.U
    }.elsewhen ((io.s0 === 1.U)& (io.s1 ===  1.U)&(io.s2=== 0.U)){
        io.out := 24.U
    }.otherwise {
        io.out := 32.U
    }


}