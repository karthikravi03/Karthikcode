@tag
Feature: Verification of Cart functionality with single and multiple products

@tag1
Scenario: Add a single product into cart
Given Navigate to flipkart site
When Login with valid userid and password
And Goto mobile section 
And Add a single product in cart
Then click on Add to cart button for single product 



  @tag2
  Scenario: Add multiple products into cart
Given Navigate to flipkart site
When Login with valid userid and password
And Goto TV section 
And Add a multiple product in cart
Then click on Add to cart button for multi prdoucts

    
