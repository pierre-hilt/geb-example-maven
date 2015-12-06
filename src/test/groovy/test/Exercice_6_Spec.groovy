package test

class Exercice_6_Spec extends BaseSpec {

  def setupSpec() {
    go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/display_none_element.html"
  }

  def "Click a button than will display a hidden element"() {
    setup:
      go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/display_none_element.html"
    when: "Click button"
    then: "Element is displayed"
  }

  def "Click a button than will display a hidden element after a timeout"() {
    setup:
      go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/display_none_element_timeout.html"
    when: "Click button"
    then: "Element is displayed"
  }
}