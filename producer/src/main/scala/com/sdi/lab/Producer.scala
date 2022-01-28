package com.sdi.lab

import cats.effect.IO

object Producer {

  def produce: IO[Int] =
    IO(scala.util.Random.nextInt())

}
