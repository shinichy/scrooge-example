import sbt._
import sbt.Keys._

object Settings {
  lazy val default = Project.defaultSettings ++ Seq(
    organization := "com.example",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := "2.10.3"
  )

  // thrift
  import com.twitter.scrooge._
  import ScroogeSBT._
  lazy val scrooge = ScroogeSBT.newSettings ++ Seq(
    scroogeBuildOptions := Seq("--finagle"),
    libraryDependencies ++= Dependencies.scroogeStack
  )
}