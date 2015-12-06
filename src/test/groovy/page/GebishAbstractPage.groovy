package page

import geb.Page
import module.HighlightModule
import module.MenuModule

class GebishAbstractPage extends Page {

  static content = {
    menuModule { module MenuModule }
    highlightModule { module HighlightModule }
    firstTitle { $("#main h1", 0).text() }
  }
}
