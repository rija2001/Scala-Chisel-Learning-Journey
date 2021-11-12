package LAB6
import chisel3._
import chisel3.util._
class Task2 ( val max : Int=32) extends Module {
    val io = IO ( new Bundle {
    val out = Output (UInt((log2Ceil(max).W)))
})
// Start Coding here
    val REG = RegInit ( 0.U(5.W ) )

    val main1= REG(4) ^ 1.U
    val main= Mux((main1=== 1.U),0.U,REG+1.U)
    

    
    //REG:= main
    io.out := main

}


