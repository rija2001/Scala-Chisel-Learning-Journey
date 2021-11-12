package LAB5
import chisel3._
import chisel3.util._
//import chisel3.iotesters .{ ChiselFlatSpec , Driver , PeekPokeTester }
// your code for Transaction_in class
class packet [T<:Data] (gen: T ) extends Bundle {
    val addr = (UInt(10.W))
    val data = (gen)


}
// your code for Transaction_out class
class Task2(gen:UInt) extends Module {
    val io= IO(new Bundle{
        val in = Input(new packet(gen))
        val out =Output(new packet(gen))
    })
     io.out <> io.in
}