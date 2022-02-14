Feature: Get report from system
  Background: User is logged in and goes in Systems tab
    Given User launch chrome browser
    When User enters URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters emails as "admin@yourstore.com" and password as "admin"
    And Click on login
    Then page title should be "Dashboard / nopCommerce administration"

  Scenario: Get Best seller report from admin
    Given User clicks on reports on home page
    And User clicks on Best seller on sub menu
    When User analyzes the Product and the amount related to it
    Then User gets the report with details of bestsellers