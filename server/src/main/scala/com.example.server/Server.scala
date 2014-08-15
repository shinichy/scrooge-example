package com.example.server

import _root_.thrift.Hello
import com.twitter.finagle._
import com.twitter.util.{Await, Future}

object Main extends App {
  val server = Thrift.serveIface("localhost:8080", new Hello[Future] {
    def hi() = {
      println("Received request")
      Future.value("hi")
    }
  })
  Await.ready(server)
}