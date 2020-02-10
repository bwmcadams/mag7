ThisBuild / name := "mag7"
ThisBuild / version := "0.0.1"
ThisBuild / scalaVersion := "2.13.1"
ThisBuild / organization := "bytes.codes"

lazy val root = (project in file("."))
  .settings()
  .aggregate(core)

lazy val core = (project in file("core"))
  .settings(
    libraryDependencies ++= Seq(
      "org.mongodb.scala" %% "mongo-scala-driver" % "2.8.0",
      "org.scalactic" %% "scalactic" % "3.1.0",
      "org.scalatest" %% "scalatest" % "3.1.0" % Test,
      "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
      "org.scalacheck" %% "scalacheck" % "1.14.1" % "test"
    )
  )

lazy val enumeratum = (project in file("enumeratum"))
  .settings(
    libraryDependencies ++= Seq(
      "com.beachape" %% "enumeratum" % "1.5.15"
    )
  )
  .dependsOn(core)