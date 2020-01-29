package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import pages.HomePage;
import step_definitions_impl.AdminCouponPage_impl;
import step_definitions_impl.BookingPage_Impl;
import util.Driver;
import util.SeleniumUtils;

public class BookingPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    BookingPage_Impl bookingPageImpl = new BookingPage_Impl();
    BookingPage bookingPage = new BookingPage();


    @When("Clicks on {string} button")
    public void clicks_on_Book_Now_button(String buttonName) {
        bookingPageImpl.clickButton("cookies");
        bookingPageImpl.clickButton(buttonName);
    }

    @When("Applies existing coupon code")
    public void applies_existing_coupon_code() {
        bookingPageImpl.applyCoupon(AdminCouponPage_impl.currentCoupon);
    }

    @Then("Verifies positive message is displayed")
    public void verifies_positive_message_is_displayed() {
        Assert.assertEquals(bookingPageImpl.expectedCouponMessage, bookingPageImpl.getCouponCodeConfirmationText());
    }
//*********************NEW HOME WORK****************

    @Given("User select last tour package from list")
    public void user_select_last_tour_package_from_list() {
        SeleniumUtils.waitForVisibilityOfElement(bookingPage.lastTourPackage);
    }

    @Then("User should see pop up window")
    public void user_should_see_pop_up_window() {
        //Assert.assertEquals(bookingPage.tourPackage_firstName);
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("User fill out form and click submit")
    public void user_fill_out_form_and_click_submit() {
        SeleniumUtils.sleep(2000);
        SeleniumUtils.click(bookingPage.tourPackage_firstName);
        SeleniumUtils.click(bookingPage.tourPackage_Phone);
        SeleniumUtils.click(bookingPage.tourPackage_Email);
        SeleniumUtils.click(bookingPage.tourPackage_Address);
        SeleniumUtils.click(bookingPage.tourPackage_BookNow);

        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("User should see message {string}")
    public void user_should_see_message(String string) {
        Assert.assertEquals(driver.getTitle(), "");//PENDING
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("User should click on {string}")
    public void user_should_click_on(String string) {
        Assert.assertEquals(driver.getTitle(), "Your booking status is Unpaid");// cancelled step
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("User should see pop up window to confirm")
    public void user_should_see_pop_up_window_to_confirm() {
       // Assert.assertEquals(driver.getTitle(), "");
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @When("User accept pop up window")
    public void user_accept_pop_up_window() {
        //SeleniumUtils.click(bookingPageImpl);
        // Write code here that turns the phrase above into concrete actions
        //throw new cucumber.api.PendingException();
    }

    @Then("User see message {string}")
    public void user_see_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }





}