Feature:  validate Login Functionality for swag labs application

Scenario Outline:  check the login functionality for valid data
Given user is on the login page of swag lab
When user enter <username> & <password>
And user clicks on login button
Then Login should be successful

Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|