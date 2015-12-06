package test

class Exercise_3_Spec extends BaseSpec {

  def setupSpec() {
    go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/todo_timeout.html"
  }

  def "Create a new task"() {
    when: "Enter some value in the input"
    and: "Send enter key to create task"
    then: "Task is created"
  }
}