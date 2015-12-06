package test

import geb.Page
import geb.spock.GebSpec

class BaseSpec extends GebSpec{
  @Override
  void resetBrowser() {
    Page oldPage = page
    super.resetBrowser()
    browser.page = oldPage
  }
}
