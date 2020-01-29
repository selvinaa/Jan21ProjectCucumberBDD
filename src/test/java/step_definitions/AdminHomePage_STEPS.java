package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import step_definitions_impl.AdminHomePage_impl;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminHomePage_STEPS {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage_impl adminHomePage = new AdminHomePage_impl();

    @Given("User opens Admin home page")
    public void user_opens_Admin_home_page() {
        driver.get(ConfigReader.readProperty("adminUrl"));
    }

    @When("User logsin with admin account")
    public void user_logsin_with_admin_account() {
        adminHomePage.login();
    }

    @Then("Verifies title is Dashboard")
    public void verifies_title_is_Dashboard() {
        SeleniumUtils.sleep(2000);
        Assert.assertEquals("Dashboard", driver.getTitle());
    }

    @When("User navigate to Coupons page")
    public void user_navigate_to_Coupons_page() {
        adminHomePage.navigateToPage("coupons");
    }
}
