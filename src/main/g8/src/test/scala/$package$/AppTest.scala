package $package$

import slinky.web.ReactDOM
import org.scalajs.dom.document

import org.scalatest.FunSuite

import $package$.App

class AppTest extends FunSuite {
  test("Renders without crashing") {
    val div = document.createElement("div")
    ReactDOM.render(App(), div)
    ReactDOM.unmountComponentAtNode(div)
  }
}
