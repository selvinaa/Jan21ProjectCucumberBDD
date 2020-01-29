@bookingPage
  Feature: Booking Page Test
    @couponTest
    Scenario: Verify coupon code
    Given User opens Admin home page
      When User logsin with admin account
      And User navigate to Coupons page
      And Creates a new coupon
      Then Verifies coupon is created
      Given User opens home page
      When User opens "first tour" featured tour
      And Clicks on "book now" button
      And Applies existing coupon code
      Then Verifies positive message is displayed
      #  = test I don't want to run at present comment it out


      @testingBookinPage
      Scenario: User select last feature tour on Home page
        Given User opens home page
        And User opens "last tour" featured tour
        And User select last tour package from list
        Then User should see pop up window
        When User fill out form and click submit
        Then User should see message "Your booking status is Unpaid"
        And User should click on "Pay on Arrival"
        Then User should see pop up window to confirm
        When User accept pop up window
        Then User see message "Your booking status is Reserved"