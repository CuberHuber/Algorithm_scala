ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.14" % Test

lazy val root = (project in file("."))
  .settings(
    name := "scala-test"
  )
