
organization := "com.github.robertberry"

name := "fpis"

scalaVersion := "2.10.2"

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.3" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
