name := "gameOfStocks"

version := "1.0"

lazy val `gameofstocks` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc , cache , ws   , specs2 % Test,
  "com.typesafe.scala-logging" % "scala-logging-slf4j_2.11" % "2.1.2",
  "org.mongodb.scala" % "mongo-scala-driver_2.11" % "1.1.0"
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"  