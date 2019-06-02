package blink

import chisel3._

class Blink extends Module {
  val io = IO(new Bundle {
    val portLed = Output(UInt(4.W))  
  })

  val cnt1sec = RegInit(124999999.U(27.W))
  val cnt = RegInit(0.U(27.W))
  val onoff = RegInit(false.B)

  when(cnt === cnt1sec) {
    cnt := 0.U
    onoff := ~onoff
  } .otherwise {
    cnt := cnt + 1.U
  }

  io.portLed := onoff
}
