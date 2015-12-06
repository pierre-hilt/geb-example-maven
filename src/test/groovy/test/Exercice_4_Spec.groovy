package test

class Exercice_4_Spec extends BaseSpec {

  def setupSpec() {
    go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/todo.html"
  }

  def "Create a new task"() {
    when: "Enter some value in the input"
    and: "Send enter key to create task"
    then: "Task is created"
  }

  def "Delete the task"() {
    when: "Click to delete a task"
    then: "Task is deleted"
  }
}