package page

import geb.Page
import module.TodoModule

class TodoPage extends Page{
  static at = { input.displayed }

  static content = {
    input { $(".new-todo") }
    todoList { index -> moduleList TodoModule, $(".todo-list li"), index:index, index }
  }
}
