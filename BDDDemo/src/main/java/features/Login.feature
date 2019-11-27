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

#with examples keyword
Scenario Outline: This is parametarized test with examples keyword
Given test1
When test2
Then user enter "<data>" and "<pwd>" in search text box
And close Browser

Examples:
 |data|pwd|
 |data1|pwd1|
 |data2|pwd2|
 |data3|pwd3|
 
 #achhieving data driven test without scenario outline

Scenario Outline: This is parametarized test with without examples keyword
Given test1
When test2
Then user enter username and pwd in search text box
|irfan | mypassword|
Then print tt1 and tt2 and tt3 yay
|first | second| third 
And close Browser
 