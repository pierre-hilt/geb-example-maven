package test

import geb.Page
import geb.spock.GebSpec

/**
 * Created by Pierre on 06/12/2015.
 */
class BaseSpec extends GebSpec{
  @Override
  void resetBrowser() {
    Page oldPage = page
    super.resetBrowser()
    browser.page = oldPage
  }
}
