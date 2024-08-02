name := """play-scala-seed"""
organization := "com.softxpliot"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.14"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.softxpliot.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.softxpliot.binders._"