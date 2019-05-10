name := "sbt-shade-tests"
organization := "org.opencypher"
version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.typelevel" %% "cats-core" % "1.6.0"
libraryDependencies += "org.neo4j.driver" % "neo4j-java-driver" % "1.7.3"

assemblyShadeRules in assembly := Seq(
  ShadeRule.rename("cats.**" -> "relocated.cats.@1").inAll,
  ShadeRule.rename("org.neo4j.driver.**" -> "relocated.org.neo4j.driver.@1").inAll
)