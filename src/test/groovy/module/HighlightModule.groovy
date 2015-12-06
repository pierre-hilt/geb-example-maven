package module

import geb.Module

class HighlightModule extends Module {
  static base = { $("#sidebar") }

  static content = {
    title { $("h1").text() }
    links { $(".sidemenu a") }
  }
}
