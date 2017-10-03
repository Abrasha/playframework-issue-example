name := "playframework_issue_example"
 
lazy val playframework_issue_example = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.2"

// test dependencies
libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.1"
).map(_ % Test)

      