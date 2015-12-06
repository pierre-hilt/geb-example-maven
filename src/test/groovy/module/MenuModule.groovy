package module

import geb.Module

class MenuModule extends Module {
  static base = { $("#header-content ul li", 0) }
  static content = {
    toggle { $("span") }
    links { $('.link-list li a') }
  }
}
