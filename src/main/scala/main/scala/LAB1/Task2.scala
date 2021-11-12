package LAB1
import chisel3._
import chisel3.util._
import java.io.File
class Task2(n:Int)extends Module {
    val io = IO (new Bundle {
        val data_in = Input(UInt(n.W))
        //val reload = Input(Bool())
        val out = Output(Bool())
        //val out1= Output(UInt())
    })
    val counter = RegInit (0.U(n.W))
    val max_count = RegInit (6.U(n.W))
    //val counter2:= {counter=== counter(1.U)}
    var flag= RegInit(1.B)
        when (counter === max_count  | flag === 1.B)         
        {
            counter:= counter - 1.U
            when (counter === 0.U){
                flag := 0.B
            }
            .otherwise{
                flag :=1.B
                }
         }
        .otherwise {
            counter:= counter +1.U
            when (counter === max_count)
            { flag := 1.B}
            .otherwise{
                flag := 0.B
            }
            }
                
        io.out:= counter((n-1).U)
        //io.out1:= counter((n.U))
        //val counter2:= (counter=== counter(1.U))
        //io.out1:= counter2(true.B)

}