name := "reactivemongo-demo-app"

version := "0.11.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.reactivemongo" %% "play2-reactivemongo" % "0.11.0.play24"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies +=  "com.typesafe.play" %% "play-json" % "2.5.2"

routesGenerator := InjectedRoutesGenerator

fork in run := false

lazy val root = (project in file(".")).enablePlugins(PlayScala)

maintainer:= "Nandini"

dockerExposedPorts in Docker := Seq(9000, 9443)