enablePlugins(ScalaJSBundlerPlugin)

name := "$name$"

npmDependencies in Compile += "react" -> "15.6.1"
npmDependencies in Compile += "react-dom" -> "15.6.1"
npmDependencies in Compile += "react-proxy" -> "1.1.8"

npmDevDependencies in Compile += "file-loader" -> "1.1.5"
npmDevDependencies in Compile += "style-loader" -> "0.19.0"
npmDevDependencies in Compile += "css-loader" -> "0.28.7"
npmDevDependencies in Compile += "html-webpack-plugin" -> "2.30.1"
npmDevDependencies in Compile += "copy-webpack-plugin" -> "4.2.0"

libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.1.1"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.1.1"

webpackConfigFile in fastOptJS := Some(baseDirectory.value / "webpack-fastopt.config.js")
webpackConfigFile in fullOptJS := Some(baseDirectory.value / "webpack-opt.config.js")

webpackDevServerExtraArgs in fastOptJS := Seq("--inline", "--hot")
