import sbt._

object Dependencies {
  object Versions {
    val akka     = "2.6.19"
    val akkaHttp = "10.2.9"
  }

  val production: Seq[ModuleID] = Seq(
    "com.github.nscala-time"     %% "nscala-time"             % "2.30.0",
    "com.lihaoyi"                %% "pprint"                  % "0.7.3",
    "com.typesafe.akka"          %% "akka-http"               % Versions.akkaHttp,
    "com.typesafe.akka"          %% "akka-actor"              % Versions.akka,
    "com.typesafe.akka"          %% "akka-stream"             % Versions.akka, // Explicit dependency due to: https://bit.ly/akka-http-25
    "com.typesafe.akka"          %% "akka-http-spray-json"    % Versions.akkaHttp,
    "org.tpolecat"               %% "doobie-core"             % "0.13.4",
    "mysql"                      % "mysql-connector-java"     % "8.0.29",
    "com.github.scopt"           %% "scopt"                   % "4.0.1", // Command Line Commands such as de DbTablesCreator
    "ch.qos.logback"             % "logback-classic"          % "1.2.11", // Logging backend implementation
    "com.typesafe.scala-logging" %% "scala-logging"           % "3.9.5", // SLF4J Scala wrapper
    "net.logstash.logback"       % "logstash-logback-encoder" % "7.2", // Log JSON encoder
    "com.newmotion"              %% "akka-rabbitmq"           % "6.0.0",
  )
  val test: Seq[ModuleID] = Seq(
    // Test
    "org.scalatest"     %% "scalatest"         % "3.2.12"           % Test,
    "org.scalamock"     %% "scalamock"         % "5.2.0"           % Test,
    "com.typesafe.akka" %% "akka-testkit"      % Versions.akka     % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % Versions.akkaHttp % Test
  )
}
