ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "michalzc.foundry"

lazy val `foundry-vtt-types` = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "foundry-vtt-types-scala"
  )