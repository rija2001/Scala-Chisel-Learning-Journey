package LAB5
import chisel3._
import chisel3.util._
//import chisel3.iotesters.{Driver,PeekPokeTester }
class Exercise1(width_parameter : Int) extends Module {
val io = IO ( new IO_Interface ( width_parameter ) )
io.alu_out := 0.U
val index = log2Ceil ( width_parameter )

class IO_Interface ( width : Int ) extends Bundle {
val alu_oper = Input ( UInt ( width.W ) )
val arg_x = Input ( UInt ( width.W ) )
val arg_y = Input ( UInt ( width.W ) )
val alu_out = Output ( UInt ( width.W ) )

}
when (io.alu_oper ==="b0000".U){
    io.alu_out:= io.arg_x & io.arg_y
}.elsewhen(io.alu_oper === "b0001".U){
    io.alu_out := io.arg_x | io.arg_y
}.elsewhen(io.alu_oper === "b0010".U){
    io.alu_out := io.arg_x + io.arg_y
}.elsewhen(io.alu_oper === "b0110".U){
    io.alu_out := io.arg_x - io.arg_y
}.otherwise(
    io.alu_out := io.arg_x ^ io.arg_y
)
}
