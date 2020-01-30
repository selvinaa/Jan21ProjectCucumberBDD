$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/bookingPage.feature");
formatter.feature({
  "name": "Booking Page Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@bookingPage"
    }
  ]
});
formatter.scenario({
  "name": "User select last feature tour on Home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@bookingPage"
    },
    {
      "name": "@testingBookinPage"
    }
  ]
});
formatter.step({
  "name": "User opens home page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens \"last tour\" featured tour",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_featured_tour(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select last tour package from list",
  "keyword": "And "
});
formatter.match({
  "location": "BookingPage_STEPS.user_select_last_tour_package_from_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see pop up window",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingPage_STEPS.user_should_see_pop_up_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill out form and click submit",
  "keyword": "When "
});
formatter.match({
  "location": "BookingPage_STEPS.user_fill_out_form_and_click_submit()"
});
formatter.result({
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of [[ChromeDriver: chrome on MAC (82c375dcc42edb8cc56a079d8b4109d3)] -\u003e xpath: //input[@name\u003d\u0027firstname\u0027]] (tried for 20 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027tests-MacBook-Air.local\u0027, ip: \u0027192.168.0.114\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.4\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: /var/folders/fq/gklp6t652wx...}, goog:chromeOptions: {debuggerAddress: localhost:63013}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 82c375dcc42edb8cc56a079d8b4109d3\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\n\tat util.SeleniumUtils.waitForClickability(SeleniumUtils.java:26)\n\tat util.SeleniumUtils.click(SeleniumUtils.java:45)\n\tat step_definitions.BookingPage_STEPS.user_fill_out_form_and_click_submit(BookingPage_STEPS.java:54)\n\tat ✽.User fill out form and click submit(file:src/test/resources/features/bookingPage.feature:24)\n",
  "status": "failed"
});
formatter.step({
  "name": "User should see message \"Your booking status is Unpaid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingPage_STEPS.user_should_see_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should click on \"Pay on Arrival\"",
  "keyword": "And "
});
formatter.match({
  "location": "BookingPage_STEPS.user_should_click_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see pop up window to confirm",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingPage_STEPS.user_should_see_pop_up_window_to_confirm()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User accept pop up window",
  "keyword": "When "
});
formatter.match({
  "location": "BookingPage_STEPS.user_accept_pop_up_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User see message \"Your booking status is Reserved\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingPage_STEPS.user_see_message(String)"
});
formatter.result({
  "status": "skipped"
});
});