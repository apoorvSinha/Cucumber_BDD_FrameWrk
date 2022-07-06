@sanity
Feature: user wants to add a new manufacturer for the business
  Background: User is logged in and goes in Customers tab
    Given User launch chrome browser
    When User enters URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters emails as "admin@yourstore.com" and password as "admin"
    And Click on login
    Then page title should be "Dashboard / nopCommerce administration"

  Scenario: user want to add Boat multimedia as new partners
    Given user clicks on catalog main menu
    Then user clicks on manufacturer sub menu
    And user switches the Advanced switch on
    Then user enters all the details of manufacturer
    And user clicks on save button
    Then user should get confirmation message in next page