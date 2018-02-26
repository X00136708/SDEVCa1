name := """WebCA2"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies ++= Seq(evolutions, jdbc) 
libraryDependencies +="javax.persistence" % "persistence-api" % "1.0.2"
libraryDependencies += "com.h2database" % "h2" % "1.4.192"