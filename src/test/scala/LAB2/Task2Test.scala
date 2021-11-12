package LAB2
import org.scalatest._
import chiseltest._
import chisel3._

class Task2Test extends FreeSpec with ChiselScalatestTester{
    "Task2 Test "in {
        test(new Task2()) {c =>
        c.io.in(0).poke(true.B)
        c.io.in(1).poke(true.B)
        c.io.in(2).poke(true.B)
        c.io.in(3).poke(true.B)
        c.io.sel(0).poke(false.B)
        c.io.sel(1).poke(true.B)
        c.io.shift_type.poke(true.B)
        c.io.out(0).expect(true.B)
        c.io.out(1).expect(true.B)
        c.io.out(2).expect(true.B)
        c.io.out(3).expect(true.B)

        c.clock.step(100)
        
        }
    }

}