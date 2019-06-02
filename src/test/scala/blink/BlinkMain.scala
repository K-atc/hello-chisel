package blink

import chisel3._

object BlinkMain extends App {
  chisel3.Driver.execute(args, () => new Blink)
}
