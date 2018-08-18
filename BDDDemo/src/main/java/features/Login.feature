Feature: Login Test 

Scenario: google login test
Given user is already on login page
When title is page is google
Then user enter testing in search text box
Then user clicks login button
And check if same title is present

Scenario: Checkout Test
Given user added product to cart
When user did checkout
Then order number generated
