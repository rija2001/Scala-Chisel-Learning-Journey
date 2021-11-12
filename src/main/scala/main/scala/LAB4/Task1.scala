package LAB4
import chisel3._
import chisel3.util._

object BranchFuc3{
    val ALU_beq= "b000".U
    val ALU_bne= "b001".U
    val ALU_blt= "b100".U
    val ALU_bge= "b101".U
    val ALU_bltu= "b110".U
    val ALU_bgeu= "b111".U
}

class LM_IO_Interface_BranchControl extends Bundle {
val fnct3= Input ( UInt (3.W ) )
val branch= Input ( Bool () )
val arg_x= Input ( UInt (32.W ) )
val arg_y= Input ( UInt (32.W ) )
val br_taken = Output ( Bool () )
}

import BranchFuc3._
class Task1 extends Module {
    val io = IO ( new LM_IO_Interface_BranchControl )
    val BEQ = io.arg_x === io.arg_y
    val BNE = io.arg_x =/= io.arg_y
    val BLT = io.arg_x < io.arg_y
    val BGE = io.arg_x >= io.arg_y
    val BLTU = io.arg_x < io.arg_y
    val BGEU =io.arg_x >= io.arg_y
    io.br_taken:= 0.U
    switch( io.fnct3 & (io.branch === true.B)){
        is (ALU_beq ){
            io.br_taken:= BEQ
    }
        is (ALU_bne){
            io.br_taken:= BNE
    }
        is (ALU_blt){
            io.br_taken:= BLT
    }
        is (ALU_bge){
            io.br_taken:= BGE
    }   
        is (ALU_bltu){
            io.br_taken:= BLTU
    }   
        is (ALU_bgeu){
            io.br_taken:= BGEU
    }
// Well , you can actually write classes too . So , technically you have no limit ; )
}
}