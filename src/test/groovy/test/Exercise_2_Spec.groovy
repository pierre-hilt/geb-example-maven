package test

import org.openqa.selenium.Keys
import page.TodoPage

class Exercise_2_Spec extends BaseSpec {

  def setupSpec() {
    go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/todo.html"
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
      todoPage.todoList(0).task == "This is task"
  }

  def "Delete the task"() {
    when: "Click to delete a task"
      todoList(0).deleteTask()
    then: "Task is deleted"
      todoList.size() == 0
  }
}