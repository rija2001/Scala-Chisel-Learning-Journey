package LAB8

import chisel3._
class Exericse2 extends Module {
    val io = IO ( new Bundle {
    val wr_en = Input ( Bool () )
    val rdAddr = Input ( UInt (10. W ) )
    val wrAddr = Input ( UInt (10. W ) )
    val mask = Input (Vec(2,Bool())) 
    val dataIn = Input (Vec(2 ,UInt ( 16.W )))
    val dataOut = Output (Vec(2, UInt (16.W )))
})
     val memory = SyncReadMem (1024 , (Vec(2,UInt (16.W) )))
     val wrDataReg = RegNext (io.dataIn)
     val doForwardReg = RegNext ( io.wrAddr === io.rdAddr && io.wr_en )
        val memData = memory.read ( io.rdAddr )
    when ( io.wr_en ){
    memory.write ( io.wrAddr , io.dataIn, io.mask )
}
    io.dataOut := Mux ( doForwardReg , wrDataReg , memData )


}