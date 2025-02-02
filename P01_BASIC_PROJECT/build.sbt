name := """P01_BASIC_PROJECT"""
version := "1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.6.3"

val root: Project =
  (project in file("."))
    .enablePlugins(PlayScala)
    .settings(
      libraryDependencies += guice,
      libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
    )

val perf: Project =
  (project in file("perf"))
    .enablePlugins(PlayScala)
    .dependsOn(root % "test->test")
