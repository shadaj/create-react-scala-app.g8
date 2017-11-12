package $package$

import me.shadaj.slinky.core.StatelessComponent
import me.shadaj.slinky.web.html._

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@JSImport("resources/app.css", JSImport.Default)
@js.native
object AppCSS extends js.Object

@JSImport("resources/logo.svg", JSImport.Default)
@js.native
object ReactLogo extends js.Object

object App extends StatelessComponent {
  type Props = Unit

  private val css = AppCSS

  @ScalaJSDefined
  class Def(jsProps: js.Object) extends Definition(jsProps) {
    def render() = {
      div(className := "App")(
        header(className := "App-header")(
          img(src := ReactLogo.asInstanceOf[String], className := "App-logo", alt := "logo"),
          h1(className := "App-title")("Welcome to React (with Scala.js!)")
        ),
        p(className := "App-intro")(
          "To get started, edit ", code("App.scala"), " and save to reload."
        )
      )
    }
  }
}
