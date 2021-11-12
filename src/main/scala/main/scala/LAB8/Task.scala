package LAB8

import chisel3._
import chisel3.util._

class Task extends Module {
    val io = IO ( new Bundle {
    val memory_out = Decoupled ( UInt (32.W))
    val requestor = Vec (4 ,Flipped ( Decoupled ( UInt (32.W))))
    val readaddr = Input ( UInt (5. W ) )
    val writeaddr = Input ( UInt (5. W ) )
    val wr_en=Input(Bool())
    
})
    //val memory = Mem (32 , UInt (32. W ) )
    val mem=Mem(32,UInt(8.W))
    val queue0 = Queue ( io.requestor(0),5)
    val queue1 =Queue( io.requestor(1),5)
    val queue2 =Queue( io.requestor(2),5)
    val queue3 =Queue( io.requestor(3),5)




 
queue0.nodeq() 
queue1.nodeq()
queue2.nodeq()
queue3.nodeq()

//val memory = SyncReadMem (1024 , Vec (4 , UInt ( 8. W ) ) )
//val memory = Module(SyncReadMem (1024 , ( new Arbiter (UInt(),4))))
io.memory_out.valid:= 1.B
val arb_priority = Module ( new Arbiter (UInt(),4) )

    arb_priority.io.in(0) <> queue0
    arb_priority.io.in(1) <> queue1
    arb_priority.io.in(2) <> queue2
    arb_priority.io.in(3) <> queue3
    arb_priority.io.out.ready := 1.B
    when (io.wr_en){
        mem.write(io.writeaddr,(arb_priority.io.out).asUInt)
    }
    io.memory_out.bits:= mem.read(io.readaddr)
 
}
// Start your code from here
// End your code here
