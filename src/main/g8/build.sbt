enablePlugins(ScalaJSBundlerPlugin)

name := "$name$"

scalaVersion := "2.12.7"

npmDependencies in Compile += "react" -> "16.5.2"
npmDependencies in Compile += "react-dom" -> "16.5.2"
npmDependencies in Compile += "react-proxy" -> "1.1.8"

npmDevDependencies in Compile += "file-loader" -> "2.0.0"
npmDevDependencies in Compile += "style-loader" -> "0.23.1"
npmDevDependencies in Compile += "css-loader" -> "1.0.0"
npmDevDependencies in Compile += "html-webpack-plugin" -> "3.2.0"
npmDevDependencies in Compile += "copy-webpack-plugin" -> "4.5.4"
npmDevDependencies in Compile += "webpack-merge" -> "4.1.4"

libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.5.1"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.5.1"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.5" % Test

scalacOptions += "-P:scalajs:sjsDefinedByDefault"
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)

version in webpack := "4.21.0"
version in startWebpackDevServer:= "3.1.9"

webpackResources := baseDirectory.value / "webpack" * "*"

webpackConfigFile in fastOptJS := Some(baseDirectory.value / "webpack" / "webpack-fastopt.config.js")
webpackConfigFile in fullOptJS := Some(baseDirectory.value / "webpack" / "webpack-opt.config.js")
webpackConfigFile in Test := Some(baseDirectory.value / "webpack" / "webpack-core.config.js")

webpackDevServerExtraArgs in fastOptJS := Seq("--inline", "--hot")
webpackBundlingMode in fastOptJS := BundlingMode.LibraryOnly()

requiresDOM in Test := true

addCommandAlias("dev", ";fastOptJS::startWebpackDevServer;~fastOptJS")
