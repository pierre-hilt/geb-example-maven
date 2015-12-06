package test

import page.CrossBrowserPage
import page.GebishOrgHomePage
import page.TheBookOfGebPage

class Exercise_1_with_pages_Spec extends BaseSpec {

  def setupSpec() {
    go "http://gebish.org"
  }

  def "Can get to Gebish webstite and check UI"() {
    setup:
      GebishOrgHomePage gebPage = at GebishOrgHomePage
    expect: 'Six links displayed in Higlights'
      gebPage.highlightModule.links.size()
    and: 'Text of the highlight section is "Highlights"'
      gebPage.highlightModule.title == "Highlights"
  }

  def "Can get to Crossbrowser page from highlights"() {
    setup:
      GebishOrgHomePage gebPage = at GebishOrgHomePage
    when: "Click on Cross Browser Link"
      gebPage.highlightModule.links[0].click()
    then: "Cross Browser page is displayed"
      at CrossBrowserPage
  }

  def "Can get to Manual section"() {
    setup:
      CrossBrowserPage crossBrowserPage = at CrossBrowserPage
    when: "Hover Manual menu"
      interact {
        moveToElement(crossBrowserPage.menuModule.toggle)
      }
    then: "Manual menu is displayed"
      crossBrowserPage.menuModule.links.displayed

    when: "Click on current item in menu"
      crossBrowserPage.menuModule.links.click()
    then: "Manual page is displayed"
      at TheBookOfGebPage
  }
}