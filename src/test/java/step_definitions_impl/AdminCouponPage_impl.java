package step_definitions_impl;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.AdminCouponPage;
import testData_PojoClas.Coupon;
import util.DateUtils;
import util.Driver;
import util.SeleniumUtils;

import java.util.List;

public class AdminCouponPage_impl {

    private static WebDriver driver = Driver.getDriver();
    AdminCouponPage adminCouponPage = new AdminCouponPage();
    static String testCode = "Test Code" + DateUtils.currentDateTime();

    public static Coupon currentCoupon = new Coupon("25", "5", testCode, DateUtils.currentDatePlus(0),DateUtils.currentDatePlus(5));
        public void createNewCoupon(){
            SeleniumUtils.click(adminCouponPage.addNewCoupon_Btn);
            SeleniumUtils.sendKeys(adminCouponPage.percentage_field, currentCoupon.getPercentage());
            SeleniumUtils.sendKeys(adminCouponPage.maxUses_field, currentCoupon.getMaxUse());
            SeleniumUtils.sendKeys(adminCouponPage.startDate_field, currentCoupon.getStartPage());
            SeleniumUtils.sendKeys(adminCouponPage.endDate_field, currentCoupon.getEndDate());
            SeleniumUtils.click(adminCouponPage.tours_checkBox);
            SeleniumUtils.click(adminCouponPage.cars_checkBox);
            SeleniumUtils.sendKeys(adminCouponPage.codeInput_field, currentCoupon.getCouponCode());
            SeleniumUtils.click(adminCouponPage.submit_Btn);
            SeleniumUtils.waitForVisibilityOfElement(adminCouponPage.addNewCoupon_Btn);
        }

        public List<WebElement> getAllExistingCouponCodes(){
            List<WebElement> ls = driver.findElements(By.xpath(adminCouponPage.allCouponsCodes_XPATH));

            try {
              WebElement element = driver.findElement(By.xpath("//*[text()='" + currentCoupon.getCouponCode() + "']"));
              SeleniumUtils.waitForVisibilityOfElement(element);

            }catch (StaleElementReferenceException e){
                WebElement element = driver.findElement(By.xpath("//*[text()='" + currentCoupon.getCouponCode() + "']"));
                SeleniumUtils.waitForVisibilityOfElement(element);
                ls = driver.findElements(By.xpath(adminCouponPage.allCouponsCodes_XPATH));
            }
            return ls;
        }

        public boolean verifyIfCouponExists(){
            boolean exists = false;
            List<WebElement> ls = getAllExistingCouponCodes();
            try {
                ls = getAllExistingCouponCodes();
                for (WebElement element : ls) {
                    if (element.getText().equalsIgnoreCase(currentCoupon.getCouponCode()))
                        exists = true;
                }
            }catch (StaleElementReferenceException e){
                ls = getAllExistingCouponCodes();
                for (WebElement element : ls) {
                    if (element.getText().equalsIgnoreCase(currentCoupon.getCouponCode()))
                        exists = true;
                }
            }
            return exists;
        }



    }





