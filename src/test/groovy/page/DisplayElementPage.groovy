package page

import geb.Page

class DisplayElementPage extends Page{

  static at = { button.displayed }

  static content = {
    button { $("#button_display") }
    element { $("#element") }
  }
}
