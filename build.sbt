name := "ScalaTestDemo"

version := "1.0"

scalaVersion := "2.10.3"


libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0.M6" % "test->*"

testOptions in Test <+= (target in Test) map {
  t => Tests.Argument(TestFrameworks.ScalaTest, "junitxml(directory=\"%s\")" format (t / "test-reports"))
}