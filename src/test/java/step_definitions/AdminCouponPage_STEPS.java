package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;
import step_definitions_impl.AdminCouponPage_impl;
import util.Driver;
import util.SeleniumUtils;

public class AdminCouponPage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminHomePage = new AdminHomePage();
    AdminCouponPage_impl adminCouponPage_Impl = new AdminCouponPage_impl();


    @When("Creates a new coupon")
    public void creates_a_new_coupon() {
        adminCouponPage_Impl.createNewCoupon();
    }

    @Then("Verifies coupon is created")
    public void verifies_coupon_is_created() {

        Assert.assertTrue(adminCouponPage_Impl.verifyIfCouponExists());
    }



}




