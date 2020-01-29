package testData_PojoClas;

public class Coupon {
    private String percentage;
    private String maxUse;
    private String couponCode;
    private String startPage;
    private String endDate;

    //https://www.phptravels.net/index.php

    public Coupon(String percentage, String maxUse, String couponCode, String startPage, String endDate){
        this.percentage = percentage;
        this.maxUse = maxUse;
        this.couponCode = couponCode;
        this.startPage = startPage;
        this.endDate = endDate;
    }

    public String getPercentage() {
        return percentage;
    }
    public String getMaxUse() {
        return maxUse;
    }
    public String getCouponCode() {
        return couponCode;
    }
    public String getStartPage() {
        return startPage;
    }
    public String getEndDate() {
        return endDate;
    }

}
