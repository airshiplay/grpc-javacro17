name := "gatling-test-javacro-thrift"

organization := "hr.svg"

scalaVersion := "2.11.8"

lazy val root = (project in file(".")).enablePlugins(GatlingPlugin)

lazy val gatlingVersion = "2.2.2"

libraryDependencies ++= Seq(
  "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test" withJavadoc() withSources(),
  "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test" withJavadoc() withSources(),
  "io.gatling" % "gatling-core" % gatlingVersion,
  "org.apache.thrift" % "libthrift" % "0.10.0"
)

javaOptions in Gatling := overrideDefaultJavaOptions("-Xms1g", "-Xmx2g")

scalacOptions ++= Seq(
  "-deprecation", 					// Emit warning and location for usages of deprecated APIs.
  "-feature", 						// Emit warning and location for usages of features that should be imported explicitly.
  "-deprecation", 					// Emit warning and location for usages of deprecated APIs.
  "-unchecked", 					// Enable additional warnings where generated code depends on assumptions.
  "-language:existentials", 		// Existential types (besides wildcard types) can be written and inferred
  "-language:higherKinds", 			// Allow higher-kinded types
  "-language:implicitConversions", 	// Allow definition of implicit functions called views
  "-language:postfixOps", 			// postfix oprators enabled
  "-Xlint:_", 						// Enable recommended additional warnings.
  "-Xlint:-missing-interpolator", // Enable recommended additional warnings.
  "-Xfuture", 						// Turn on future language features.
  "-Yno-adapted-args", 				// Do not adapt an argument list (either by inserting () or creating a tuple) to match the receiver.  
  "-encoding", "UTF-8" 				// force encoding to UTF-8
)