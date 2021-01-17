#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@shopcluesProducts
Feature: Shopclues products
  I want to test shopclues products


  @productsTest
  Scenario Outline: This test is to verify <productCategory> and <product>
    Given I am on the shopclues website
    When I hover over the "<productCategory>"
    When I click on the "<product>"
    When I click on the first product
    Then I click on the add to cart and verify that product has been added to the cart

    Examples: 
      | productCategory  | product       |
      | Home & Kitchen 	 | Curtains      |
      | Essentials 			 | Coffee & Tea  |
      |Mobiles & More    |Cables				 |
