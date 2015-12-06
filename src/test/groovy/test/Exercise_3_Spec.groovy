package test

import org.openqa.selenium.Keys
import page.TodoPage

class Exercise_3_Spec extends BaseSpec {

  def setupSpec() {
    go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/todo_timeout.html"
  }

  def "Create a new task"() {
    setup:
      TodoPage todoPage = at TodoPage
    when: "Enter some value in the input"
      todoPage.input << "This is task"
    and: "Send enter key to create task"
      todoPage.input << Keys.ENTER
    then: "Task is created"
      todoPage.todoList.size() == 1
      todoPage.todoList(0).task == "This is task" // add wait: true in the content options
  }
}