package com.sdi.lab

import cats.effect.IO
import cats.effect.IOApp

object Main extends IOApp.Simple {
  def run =
    for {
      myInt <- Producer.produce
      _ <- IO(Consumer.consume(myInt))
    } yield ()

}
