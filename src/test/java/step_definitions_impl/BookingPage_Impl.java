package step_definitions_impl;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import pages.BookingPage;
import testData_PojoClas.Coupon;
import util.Driver;
import util.SeleniumUtils;

public class BookingPage_Impl {
    private static WebDriver driver = Driver.getDriver();
    BookingPage bookingPage = new BookingPage();

    public void  applyCoupon(Coupon coupon){
        SeleniumUtils.sendKeys(bookingPage.couponCodeTextArea,coupon.getCouponCode());
        SeleniumUtils.click(bookingPage.applyCouponButton);

    }

    public String expectedCouponMessage = AdminCouponPage_impl.currentCoupon.getPercentage() + "% coupon discount has been applied to your booking! please continue by clicking book now to see the discounted price on invoice page.";



    public String getCouponCodeConfirmationText(){
        return SeleniumUtils.getText(bookingPage.couponAppliedDisplayedText);
    }

    public void clickButton(String buttonName){
        switch (buttonName.toLowerCase()){
            case "book now":
                SeleniumUtils.moveIntoView(bookingPage.bookNow_Btn);
                SeleniumUtils.click(bookingPage.bookNow_Btn);
                break;
            case "cookies": SeleniumUtils.click(bookingPage.cookiesButton);
                break;
        }


//        String parentWindow = driver.getWindowHandle();
//        Set<String> windowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = windowHandles.iterator();
//        while (iterator.hasNext()) {
//            String handle = iterator.next();
//            if (!handle.contains(parentWindow)) {
//                // Switch to popup
//                driver.switchTo().window(handle);
//
//                // Add code to find element
//            }
//        }
//// Switch back to original window
//        driver.switchTo().window(parentWindow);
//        // This code will work with any number of popups
//

    }
    public static String getAlert(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();// from here to steps the string actual

    }

}
