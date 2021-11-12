package practice

import chisel3._

class HalfAdder extends Module{
    val io =IO(new Bundle{
        val a = Input(UInt(1.W))
        val b = Input(UInt(1.W))
        val output1 = Output(UInt(1.W))
        val output2 = Output(UInt(1.W))


    })

    io.output1:= io.a & io.b
    io.output2:= io.a ^io.b

}