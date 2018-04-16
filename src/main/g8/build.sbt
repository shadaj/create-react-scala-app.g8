enablePlugins(ScalaJSBundlerPlugin)

name := "$name$"

scalaVersion := "2.12.4"

npmDependencies in Compile += "react" -> "16.3.1"
npmDependencies in Compile += "react-dom" -> "16.3.1"
npmDependencies in Compile += "react-proxy" -> "1.1.8"

npmDevDependencies in Compile += "file-loader" -> "1.1.11"
npmDevDependencies in Compile += "style-loader" -> "0.20.3"
npmDevDependencies in Compile += "css-loader" -> "0.28.11"
npmDevDependencies in Compile += "html-webpack-plugin" -> "3.2.0"
npmDevDependencies in Compile += "copy-webpack-plugin" -> "4.5.1"

libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.3.2"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.3.2"

scalacOptions += "-P:scalajs:sjsDefinedByDefault"

addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M11" cross CrossVersion.full)

version in webpack := "4.5.0"
version in startWebpackDevServer:= "3.1.3"

webpackConfigFile in fastOptJS := Some(baseDirectory.value / "webpack-fastopt.config.js")
webpackConfigFile in fullOptJS := Some(baseDirectory.value / "webpack-opt.config.js")

webpackDevServerExtraArgs in fastOptJS := Seq("--inline", "--hot")

webpackBundlingMode in fastOptJS := BundlingMode.LibraryOnly()
