@homePage
Feature: Home page Testing
  @titleTest
  Scenario: Verify title of Home Page
    Given  User opens home page
    When User sees main button
    Then Verifies  title is PHPTRAVELS | Travel Technology Patner
