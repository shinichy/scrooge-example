import sbt._
import sbt.Keys._

object Dependencies {
  private lazy val finagleVer = "6.20.0"
  lazy val thrift = "org.apache.thrift" % "libthrift" % "0.8.0"
  lazy val finagleThrift = "com.twitter"  %% "finagle-thrift" % finagleVer
  lazy val scroogeCore = "com.twitter" %% "scrooge-core" % "3.16.3"

  lazy val scroogeStack = Seq(
    thrift,
    finagleThrift,
    scroogeCore
  )
}