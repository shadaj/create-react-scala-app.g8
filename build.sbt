enablePlugins(ScriptedPlugin)

organization := "me.shadaj"

name := "create-react-scala-app.g8"

test in Test := {
  val _ = (g8Test in Test).toTask("").value
}

scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8")

resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
