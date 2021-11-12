package LAB7

import chisel3._
import chisel3.util._


class Arbiter1 extends Module{
   
    val io = IO ( new Bundle {
    val in = Flipped ( Vec(2,Decoupled ( UInt (8.W))) )// valid = Input , ready =Output , bits = Input
    val out = Decoupled (UInt (8.W))
    })
    val queue = Queue ( io.in(0) ,5)
    val queue2 =Queue( io.in(1),5)

io.out.valid := 1.U
io.out.bits := 0.U
 
queue.nodeq() // equivalent to qa.ready := false.B
queue2.nodeq()
// connect the inputs to different producers

val arb_priority = Module ( new Arbiter (UInt(),2) )
arb_priority.io.in(0) <> queue
arb_priority.io.in(1)<> queue2

// connect the output to consumer
io.out <> arb_priority.io.out
}