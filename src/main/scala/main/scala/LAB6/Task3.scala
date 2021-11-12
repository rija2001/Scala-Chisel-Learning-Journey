package LAB6

import chisel3._
import chisel3.util._
class Task3 ( val len : Int =3) extends Module {
    val io = IO ( new Bundle {
    val out = Output(Vec(len,(Bool())))
    val load_in = Input(Vec(len,(Bool())))
    val in = Input (Bool())
    val load = Input (Bool())
    })
val REG1 = RegInit ( 1.U(32.W))
val REG2 = RegInit ( 1.U(32.W))
val REG3 = RegInit ( 1.U(32.W))

val Mux0 = Mux(io.load, io.load_in(0),io.in)
val Mux1 =Mux(io.load, io.load_in(1),io.out(0))
val Mux2 =Mux(io.load, io.load_in(2),io.out(1))

val out_0=  ( REG1 <<1) | Mux0
val out_1=  ( REG2 <<1) | Mux1
val out_2=   (REG2 <<1) | Mux2

    
    REG1 := out_0
    REG2 := out_1
    REG3 := out_2

    io.out(0) := REG1
    io.out(1) := REG2
    io.out(2) := REG3
    
//io.out := Mux1



}