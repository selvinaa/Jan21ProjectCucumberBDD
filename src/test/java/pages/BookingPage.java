package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class BookingPage {
    private static WebDriver driver = Driver.getDriver();
    public BookingPage(){
        PageFactory.initElements(driver, this);// INITIALIZE ALL OUR WEBELEMENTS
    }
    @FindBy(xpath = "//button[@class='btn btn-secondary btn-block mt-20 btn-action btn-lg loader']")
    public WebElement bookNow_Btn;

    @FindBy(xpath = "//label[@class='pure-material-textfield-outlined float-none coupon-label']//input[contains(@placeholder,'')]")
    public  WebElement couponCodeTextArea;

    @FindBy(xpath = "//button[@class='btn btn-danger applycoupon btn-block']")
    public WebElement applyCouponButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement couponAppliedDisplayedText;

    @FindBy(xpath = "//button[@aria-label='dismiss cookie message']")
    public WebElement cookiesButton;

    //*****************new hOme Work****************

    @FindBy(xpath = "(//a[@class='btn btn-primary btn-sm btn-block'])[5]")
    public WebElement lastTourPackage;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement packeges_Booking_Title;

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement tourPackage_firstName;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement tourPackage_Phone;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement tourPackage_Email;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement tourPackage_Address;

    @FindBy(id = "ClickMyButton")
    public WebElement tourPackage_BookNow;

    @FindBy(xpath = "//h4[text()='Your booking status is Unpaid']")// maybe cancelled
    public WebElement booking_Status_Unpaid;

    @FindBy(xpath = "//button[text()='Pay on Arrival']")
    public WebElement pay_On_Arrival_Btn;




}
