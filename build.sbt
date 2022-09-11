name := "playground-github-actions"
version := "0.0.1"
scalaVersion := "3.2.0"

assembly / mainClass := Some("Main")

libraryDependencies += "org.scalactic" %% "scalactic" % "3.2.13"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.13" % "test"
