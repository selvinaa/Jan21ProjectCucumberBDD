package pages;

import org.apache.commons.math3.random.Well512a;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

import java.util.List;

public class AdminCouponPage {
    private static WebDriver driver = Driver.getDriver();// INITIALIZE OUR DRIVER TO WEBPAGE

    public AdminCouponPage() {
        PageFactory.initElements(driver, this);// INITIALIZE OUR WEBELEMENTS

    }

    @FindBy(xpath = "//button[text()=' Add']")
    public WebElement addNewCoupon_Btn;

    @FindBy(xpath = "//select[@name='status']")
    public WebElement status_field;

    @FindBy(xpath = "//input[@placeholder='Percentage']")
    public WebElement percentage_field;
    //String percentage = "Percentage";

    @FindBy(xpath = "//input[@placeholder='Maximum Uses']")
    public WebElement maxUses_field;

    @FindBy(xpath = "//input[@placeholder='Start Date']")
    public WebElement startDate_field;

    @FindBy(xpath = "//input[@placeholder='Expiration Date']")
    public WebElement endDate_field;

    @FindBy(xpath = "//input[@value='tours']")
    public WebElement tours_checkBox;

    @FindBy(xpath = "//input[@value='cars']")
    public WebElement cars_checkBox;

    @FindBy(xpath = "//input[@placeholder='Coupon Code']")
    public WebElement codeInput_field;

    @FindBy(xpath = "//button[text()=' Submit']")
    public WebElement submit_Btn;

    @FindBy(xpath = "(//tr[contains(@class,'xcrud-row xcrud-row')])/td[4]")
    public List<WebElement> allCouponCodes;

    public String allCouponsCodes_XPATH = "(//tr[contains(@class,'xcrud-row xcrud-row')])/td[4]";





}

