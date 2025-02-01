name := """BASICS"""
version := "1.0-SNAPSHOT"

scalaVersion := "3.6.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test

lazy val root = (project in file(".")).enablePlugins(PlayScala)



// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
