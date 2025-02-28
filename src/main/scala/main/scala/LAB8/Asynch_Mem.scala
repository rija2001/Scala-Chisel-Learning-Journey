package LAB8

import chisel3._

class IO_Interface extends Bundle {
// Make an input from a Vector of 4 values
    val data_in = Input ( Vec (4 ,( UInt (32.W))))

    val data_selector = Input ( UInt (2. W ) )
    val data_out = Output ( UInt (32. W ) )
    val addr = Input ( UInt (5. W ) )
// The signal is high for write
    val wr_en = Input ( Bool () )
}
class Asynch_Mem extends Module {
    val io = IO ( new IO_Interface )
    io.data_out := 0. U
// Make a memory of 32 x32
    val memory = Mem (32 , UInt (32.W ) )
    when ( io.wr_en ) {
// Write for wr_en = 1
// Write at memory location addr , with selected data from data_in
    memory.write ( io.addr , io.data_in ( io.data_selector ) )
}
// Asyncronous read from addr location
    io.data_out := memory.read ( io.addr )
}