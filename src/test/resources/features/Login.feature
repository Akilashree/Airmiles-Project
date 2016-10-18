Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given user is on home page
    When User enters '<EmailID>' and '<Password>'
    Then Message displayed Login Successful
    # Scenario: Update first name and last name
  #  When user is on my account page
  #  When user is on update details page
  #  When Enter '<fname>' and '<lname>'
  #  And User saves the updated details
    When User click logout
    Then Logged Out Successfully

    Examples: 
      | EmailID                | Password   | fname     | lname    |
      | qa.tt01@mailinator.com | Aimia@2016 | firstnme  | lastnwme |
	   	| qa.tt01@mailinator.com | Aimia@2016 | firstname | lastname |
