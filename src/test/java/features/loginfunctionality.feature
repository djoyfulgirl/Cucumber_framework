Feature: Verify login functionality
  I want to use this template for my feature file

@LoginPage
  Scenario Outline: To Test Login Page
  Given Launch the browser
Then I click on log in button
Then I enter username "<username>"
Then I enter password "<password>"
Then I click on login button
And I verify the title of the page

Examples: 
      | username                                    | password              |
      | chatterjeeamit41@gmail.com | Testing12345$      |
