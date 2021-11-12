package LAB7
import org.scalatest._
import chiseltest._
import chisel3._
import chisel3 . util . _

class Task2Test extends FreeSpec with ChiselScalatestTester{
    "Task2Test lab7" in  {
        test (new Task2){c=>
        c.io.in.poke(1.U)
        c.io.start.poke(1.B)


        c.clock.step(50)
        }
    }
}