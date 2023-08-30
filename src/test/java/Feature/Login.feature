@login
Feature:  validate Login Functionality for swag labs application
Background:
Given user is on the login page of swag lab

@log1
Scenario:  check the login functionality for valid data
When user enter uname & password
And user clicks on login button
Then Login should be successful

@log2
Scenario:  check the login functionality for invalid data
When user enter invalid uname & password
And user clicks on login button
Then error msg should be displayed