package LAB7
import chisel3._
import chisel3.util._


class Task1 extends Module {
    val io = IO ( new Bundle {
    val f1 = Input ( Bool() )
    val f2 = Input( Bool() )
    val r1 = Input( Bool() )
    val r2 = Input( Bool() )
    val out = Output ( UInt (32.W) )
    })
    val s0 :: s1 :: s2 :: s3 :: s4 :: s5 :: Nil = Enum (6)
    val state = RegInit ( s0 )

    io.out := ( state === s5 ) & (! io.f1 )
    switch ( state ) {
        is ( s0 ) {
    when ( (io.f1 === 0.U)& (io.f2 === 0.U) ) {

    state := s0
    io.out := 0.U
    
    }.elsewhen( (io.f1 === 1.U)& (io.f2 === 0.U) ) {

    state := s1
    io.out := 0.U
    }.elsewhen( (io.f1 === 0.U)& (io.f2 === 1.U) ) {

    state := s5
    io.out := 0.U
    }.otherwise{
        state:= s1
        io.out:= 0.U
    }
    }
    is ( s1 ) {
    when ( (io.f1 === 0.U)& (io.r1 === 0.U) ) {

    state := s1
    io.out := 0.U
    
    }.elsewhen( (io.f1 === 1.U) ) {

    state := s2
    io.out := 0.U
    }.otherwise{
    state:= s0
    io.out := 0.U
    }
    }
    is ( s2 ) {
    when ( (io.f1 === 0.U)& (io.r1 === 0.U) ) {

    state := s2
    io.out:= 3.U
    
    }.elsewhen( (io.f1 === 1.U) ) {

    state := s3
    io.out:= 3.U
    }.otherwise{
    state:= s1
    io.out := 3.U
    }
    }
    is ( s3 ) {
    
    state := s0
    io.out:= 0.U
    }
    is ( s4 ) {
    when ( (io.f2 === 1.U) ) {

    state := s3
    io.out:= 7.U

    }.elsewhen( (io.f2 === 0.U)& (io.r2=== 0.U) ) {

    state := s4
    io.out := 7.U

    }.otherwise{

    state:= s5
    io.out:= 7.U
    }
    }
    is ( s5) {
    when ( (io.f2 === 1.U) ) {

    state := s4
    io.out:= 0.U

    }.elsewhen( (io.f2 === 0.U)& (io.r2=== 0.U) ) {

    state := s5
    io.out := 0.U

    }.otherwise{
        
    state:= s0
    io.out:= 0.U
    }
    }



}
}