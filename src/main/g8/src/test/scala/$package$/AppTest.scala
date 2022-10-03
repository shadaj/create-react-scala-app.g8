package $package$

import slinky.web.ReactDOM
import org.scalajs.dom.document

import org.scalatest.funsuite.AnyFunSuite

class AppTest extends AnyFunSuite {
  test("Renders without crashing") {
    val div = document.createElement("div")
    ReactDOM.render(App(), div)
    ReactDOM.unmountComponentAtNode(div)
  }
}
