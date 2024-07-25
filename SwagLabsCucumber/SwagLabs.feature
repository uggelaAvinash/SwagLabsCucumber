Feature: Login With valid Credentials

  Scenario: Login With valid Credentials
    Given Open Edge Browser
    And Open URL www.saucedemo.com
    When Login Id Login Password
    And Click On Submit
    Then click on Add to cart
    And open add to cart
    Then click  checkout
    And checkout information
    Then click on continue
    And click on finish
    Then click on back home
    And logout
    Then close edge browser
