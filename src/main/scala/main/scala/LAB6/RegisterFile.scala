package LAB6



import chisel3._

trait Config {
// word length configuration parameter
    val WLEN= 32
    val REGFILE_LEN=16 
}
class RegFileIO extends Bundle with Config {
val raddr1 =Input ( UInt (5. W ) )
val raddr2 =Input ( UInt (5. W ) )
val rdata1 =Output ( UInt ( WLEN.W ) )
val rdata2 =Output ( UInt ( WLEN.W ) )
val wen =Input ( Bool () )
val waddr =Input ( UInt (5.W ) )
val wdata =Input ( UInt ( WLEN.W ) )
}

class RegisterFile extends Module with Config {
    val io = IO ( new RegFileIO )
    val regs = Reg (Vec( REGFILE_LEN ,UInt ( WLEN.W) ) )
    io.rdata1 := Mux (( io.raddr1.orR ) ,regs ( io.raddr1 ) , 0.U )
    io.rdata2 := Mux (( io.raddr2.orR ) , regs ( io.raddr2 ) , 0.U )
    when ( io.wen & io.waddr.orR ) {
        regs ( io.waddr ) := io.wdata
}
}