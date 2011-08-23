seq(webSettings :_*)

name := "helloworld"

version := "1.0"

scalaVersion := "2.9.0"

libraryDependencies += "org.mortbay.jetty" % "jetty" % "6.1.22" % "jetty"

libraryDependencies += "javax.servlet" % "servlet-api" % "2.5" % "provided->default"
