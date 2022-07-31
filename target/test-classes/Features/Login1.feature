@tag
Feature: Registration Page Validation2

	@tag2
  Scenario Outline: Filling the registration page data using Scenario Outline
    Given Addatin homepage loaded successfully
    And click on the new user registration link
    When input username with "<username>"
    And input password with "<password>"
    And input confimpassword with "<confirmpassword>"
    And input fullname with "<fullname>"
    And input emailid with "<emailId>"

    Examples: 
      |username|password|confirmpassword|fullname|emailId|
      |prashanth|test123|test123|Prashanth|prashanth@gmail.com|
      |murugan|test123|test123|murugan|murugan@gmail.com|
      |naresh|test123|test123|naresh|naresh@gmail.com|