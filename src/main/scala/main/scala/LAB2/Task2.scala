package LAB2
import chisel3._
import chisel3.util._
class Task2 extends Module {
    val io = IO ( new Bundle {
        val in = Vec (4,Input ( Bool ()))
        val sel = Vec (2,Input ( Bool ()))
        val shift_type = Input ( Bool () )
        val out = Vec (4 , Output ( Bool () ) )
        
    })
    // Start you code here
    val mux_shift1= Mux(io.shift_type,io.in(0),0.U)
    val mux_shift2= Mux(io.shift_type,io.in(0),0.U)
    val mux_shift3= Mux(io.shift_type,io.in(1),0.U)
    val mux_shift4= Mux(io.shift_type,io.in(0),0.U)
    val mux_shift5= Mux(io.shift_type,io.in(1),0.U)
    val mux_shift6= Mux(io.shift_type,io.in(2),0.U)



    val mux_a=Mux(io.sel(1),Mux(io.sel(0),io.in(3),io.in(2)),Mux(io.sel(0),io.in(1),io.in(0)))
    val mux_b =Mux(io.sel(1),Mux(io.sel(0),mux_shift1,io.in(3)),Mux(io.sel(0),io.in(2),io.in(1)))
    val mux_c=Mux(io.sel(1),Mux(io.sel(0),mux_shift3,mux_shift2),Mux(io.sel(0),io.in(3),io.in(2)))
    val mux_d=Mux(io.sel(1),Mux(io.sel(0),mux_shift6,mux_shift5),Mux(io.sel(0),mux_shift4,io.in(3)))
    

// End your code here
    //val mux_main=Mux(io.sel,mux_a,mux_b)
    io.out(0):= mux_a
    io.out(1):= mux_b
    io.out(2):= mux_c
    io.out(3):= mux_d
}