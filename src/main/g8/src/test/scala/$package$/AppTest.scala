package $package$

import slinky.web.ReactDOM
import org.scalajs.dom.document

import org.scalatest.FunSuite

class AppTest extends FunSuite {
  test("Renders without crashing") {
    val div = document.createElement("div")
    ReactDOM.render(App.component(()), div)
    ReactDOM.unmountComponentAtNode(div)
  }
}
