
@productscenario
Feature: endtiend scenario for testmeapp
login with rick account and purchase product and complete payment

Scenario: login with valid credentials
Given user is on homepage
When user enters username and password and click on login button
Then user should be logged in and verified
  @addtocartandpaymentprocess
  Scenario: successful checkout
  Given navigate to all categories-electronics and headphone
  And add product into shopping cart
  When proceed to checkout
  And select bank and add credentials
  Then redirected to the thank you page

 