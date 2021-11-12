package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class MemBundleTest extends FreeSpec with ChiselScalatestTester{
    "MemBundle Test "in {
        test(new MemBundle()) {c =>
        c.io.data_in.poke(Vec(4,(3.U)))
        c.io.data_selector.poke(1.U)
        c.io.addr.poke(5.U)
        c.io.wr_en.poke(true.B)
        //c.io.sel.poke(2.U)
        c.io.data_out.expect(1.U)



        c.clock.step(100)
        
        }
    }

}