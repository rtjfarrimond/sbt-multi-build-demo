ThisBuild / organization := "com.sdi.lab"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.1.0"

lazy val coreSettings = Seq(
  libraryDependencies ++= Seq(
    "org.typelevel" %% "cats-effect" % "3.3.1"
  )
)

lazy val root = project
  .in(file("."))
  .settings(coreSettings)
  .settings(
    name := "multi-build-demo",
  )
  .dependsOn(producer, consumer)

lazy val producer = project
  .in(file("producer"))
  .settings(coreSettings)
  .settings(
    name := "producer",
  )

lazy val consumer = project
  .in(file("consumer"))
  .settings(
    name := "consumer",
    libraryDependencies ++= Seq()
  )
