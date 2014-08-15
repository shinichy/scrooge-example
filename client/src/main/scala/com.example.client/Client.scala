package com.example.client

import _root_.thrift.Hello
import com.twitter.finagle._
import com.twitter.util.Await

object Main extends App {
  val client = Thrift.newIface[Hello.FutureIface]("localhost:8080")
  val future = client.hi() onSuccess { response =>
    println("Received response: " + response)
  }
  Await.ready(future)
}