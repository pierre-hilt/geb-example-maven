package module

import geb.Module

class TodoModule extends Module {
  def index

  static content = {
    deleteButton { $('.destroy') }
    task { $("label").text() }
  }

  void deleteTask() {
    js.exec("document.getElementsByClassName('destroy')[$index].click()")
  }
}
