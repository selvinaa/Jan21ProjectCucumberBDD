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
  "status": "passed"
});
formatter.step({
  "name": "User should see message \"Your booking status is Unpaid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "BookingPage_STEPS.user_should_see_message(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Day Visit of Petra from Oman]\u003e but was:\u003c[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat step_definitions.BookingPage_STEPS.user_should_see_message(BookingPage_STEPS.java:66)\n\tat ✽.User should see message \"Your booking status is Unpaid\"(file:src/test/resources/features/bookingPage.feature:25)\n",
  "status": "failed"
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