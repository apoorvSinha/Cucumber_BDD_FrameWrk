Feature: Add a new Product
  Background: User is logged in and goes in Customers tab
    Given User launch chrome browser
    When User enters URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enters emails as "admin@yourstore.com" and password as "admin"
    And Click on login
    Then page title should be "Dashboard / nopCommerce administration"

    Scenario: user wants to add a new product
      Given user clicks on catalog on main menu
      And user clicks on Products in sub menu
      Then user clicks on add new button
      And user verifies that Basic input is selected
      Then user enters all the details in the fields
      Then user clicks on save button
      And user closes the browser