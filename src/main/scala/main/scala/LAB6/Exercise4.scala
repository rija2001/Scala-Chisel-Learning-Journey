package LAB6
import chisel3._
import chisel3.util._
//import chisel3.iotesters.{ ChiselFlatSpec , Driver , PeekPokeTester }
    class Exercise4 extends Module {
            val io = IO ( new Bundle {
    val in = Flipped ( Decoupled ( UInt (8.W))) // valid = Input , ready =Output , bits = Input
    val out = Decoupled (UInt (8.W)) // valid = Output , ready =Input , bits = Output
    })
    val queue = Queue ( io.in ,5)
    val queue2 =Queue(queue,5)

    io.out.valid := 1.U
   // io.out.ready := 1.U

    queue.nodeq() // equivalent to qa.ready := false.B
    queue2.nodeq()
        when ((queue2.valid & io.out.ready) === 1.U ){
             io.out.enq(queue2.deq())

    }
        io.out <> queue
    }

