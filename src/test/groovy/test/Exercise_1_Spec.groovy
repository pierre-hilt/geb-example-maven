package test

class Exercise_1_Spec extends BaseSpec {

  def setupSpec() {
    go "http://gebish.org"
  }

  def "Can get to Gebish webstite and check UI"() {
    expect: 'Six links displayed in Higlights'
      $(".sidemenu a").size() == 6
    and: 'Text of the highlight section is "Highlights"'
      $("#sidebar h1").text() == "Highlights"
  }

  def "Can get to Crossbrowser page from highlights"() {
    when: "Click on Cross Browser Link"
      $("#sidebar a", text: "Cross Browser").click()
    then: "Cross Browser page is displayed"
      $("#main h1").text() == "Cross Browser Automation"
  }

  def "Can get to Manual section"() {
    when: "Hover Manual menu"
      interact {
        moveToElement($("#header-content span", text:'MANUAL'))
      }
    then: "Manual menu is displayed"
      $('.link-list', 0).displayed

    when: "Click on current item in menu"
      $('.link-list', 0).find("a", 0).click()
    then: "Manual page is displayed"
      title.startsWith("The Book Of Geb")
  }
}