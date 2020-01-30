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
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d78.0.3904.108)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027tests-MacBook-Air.local\u0027, ip: \u0027192.168.0.114\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.4\u0027, java.version: \u002712.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 78.0.3904.108, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: /var/folders/fq/gklp6t652wx...}, goog:chromeOptions: {debuggerAddress: localhost:60756}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: dda26915969fae1787e6b3cf80bcb4bf\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\n\tat step_definitions.HomePage_STEPS.user_opens_home_page(HomePage_STEPS.java:23)\n\tat ✽.User opens home page(file:src/test/resources/features/bookingPage.feature:20)\n",
  "status": "failed"
});
formatter.step({
  "name": "User opens \"last tour\" featured tour",
  "keyword": "And "
});
formatter.match({
  "location": "HomePage_STEPS.user_opens_featured_tour(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User select last tour package from list",
  "keyword": "And "
});
formatter.match({
  "location": "BookingPage_STEPS.user_select_last_tour_package_from_list()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see pop up window",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingPage_STEPS.user_should_see_pop_up_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User fill out form and click submit",
  "keyword": "When "
});
formatter.match({
  "location": "BookingPage_STEPS.user_fill_out_form_and_click_submit()"
});
formatter.result({
  "status": "skipped"
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