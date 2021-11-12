package LAB2
import chisel3 . _
// Mux IO interface class
class Exercise1_IO extends Bundle {
    val in_A= Input ( UInt (32. W ) )
    val in_B= Input ( UInt (32. W ) )
    val select = Input ( Bool () )
    val out= Output ( UInt () )
}
// 2 to 1 Mux implementation
class Exercise1 extends Module {
    val io = IO ( new Exercise1_IO )
io.out := io.in_A & (~io.select) | io.in_B& io.select
}