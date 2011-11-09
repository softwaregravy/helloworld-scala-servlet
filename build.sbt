// see https://github.com/siasia/xsbt-web-plugin for more information on the
// jetty plugin

// import web settings
seq(webSettings :_*)

name := "helloworld"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.1.v20110908" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided"
)
