package test

import page.DisplayElementPage

class Exercise_4_Spec extends BaseSpec {

  def "Click a button than will display a hidden element"() {
    setup:
      go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/display_none_element.html"
      at DisplayElementPage
    when: "Click button"
      button.click()
    then: "Element is displayed"
      element.displayed
  }

  def "Click a button than will display a hidden element after a timeout"() {
    setup:
      go "file:///${System.getProperty("user.dir").replace("\\", "/")}/src/main/display_none_element_timeout.html"
      at DisplayElementPage
    when: "Click button"
      button.click()
    then: "Element is displayed"
      // wait: true not sufficient
      waitFor { element.displayed }
  }
}