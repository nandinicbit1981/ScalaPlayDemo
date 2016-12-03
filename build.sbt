name := "reactivemongo-demo-app"

version := "0.11.10"

scalaVersion := "2.11.7"

libraryDependencies += "org.reactivemongo" %% "play2-reactivemongo" % "0.11.10"

routesGenerator := InjectedRoutesGenerator

fork in run := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)
