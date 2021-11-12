// package LAB6
// import chisel3._
// import chisel3.util._


// class OneShot  extends Module {
// // one shot timer implementation
//     val timer_count = RegInit (0.U(8.W))
//     val done = timer_count === 0.U
//     val next = WireInit (0.U )
    
//     when ( reload ) {
//     next := done
// }
//     .elsewhen (! done ) {
//     next := timer_count - 1. U
// }
//     timer_count := next
// }