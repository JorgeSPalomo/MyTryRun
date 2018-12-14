Feature: Login

Scenario: Valid Login
Given I open browser
And I navigate to the FreeCrm
When I enter username and password
And I click login button
Then I successfully logged in

Scenario: Invalid Login
Given I open browser
And I navigate to the FreeCrm
When I enter invalid username and password
And I click login button
Then I see error message

Scenario: Still see Sign Up
Given I navigate to the FreeCrm
When I enter username and invalid password
Then I sitll see sign up link