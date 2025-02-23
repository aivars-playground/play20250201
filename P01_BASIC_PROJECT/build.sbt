
name := """P01_BASIC_PROJECT"""
version := "1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.6.3"

val root: Project =
  (project in file("."))
    .enablePlugins(PlayScala)
    .settings(
      libraryDependencies += guice,
      libraryDependencies += "dev.optics" %% "monocle-core" % "3.3.0",
      libraryDependencies += "dev.optics" %% "monocle-macro" % "3.3.0",
      libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.2.0",
      libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
    )

val it: Project =
  (project in file("it"))
    .enablePlugins(PlayScala)
    .dependsOn(root % "test->test")
