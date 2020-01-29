package step_definitions_impl;

import org.openqa.selenium.WebDriver;
import pages.AdminHomePage;
import util.ConfigReader;
import util.Driver;
import util.SeleniumUtils;

public class AdminHomePage_impl {
    private static WebDriver driver = Driver.getDriver();
    AdminHomePage adminPage = new AdminHomePage();

    public void login(){
        SeleniumUtils.sendKeys(adminPage.emailField, ConfigReader.readProperty("email"));
        SeleniumUtils.sendKeys(adminPage.passwordField, ConfigReader.readProperty("password"));
        SeleniumUtils.click(adminPage.login_Btn);
    }

    public void navigateToPage(String pageName){
        switch (pageName.toLowerCase()){
            case "coupons":
                SeleniumUtils.click(adminPage.coupons_Btn);
                break;
        }
    }
}
