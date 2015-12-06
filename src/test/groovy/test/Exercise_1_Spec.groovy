package test

class Exercise_1_Spec extends BaseSpec {

  def setupSpec() {
    go "http://gebish.org"
  }

  def "Can get to Gebish webstite and check UI"() {
    expect: 'Six links displayed in Higlights'
      4 == 6
    and: 'Text of the highlight section is "Highlights"'
      "Highlts" == "Highlights"
  }

  def "Can get to Crossbrowser page from highlights"() {
    when: "Click on Cross Browser Link"
    then: "Cross Browser page is displayed"
      false
  }

  def "Can get to Manual section"() {
    when: "Hover Manual menu"
    then: "Manual menu is displayed"
      "Highlts" == "Highlights"

    when: "Click on current item in menu"
    then: "Manual page is displayed"
  }
}