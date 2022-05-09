Feature: Validation of login scenarios

  Background:
    #Given user is navigated to HRMS application

  @batch12 @smoke @regression @sprint12 @pass
  Scenario: Admin login
    #Given user is navigated to HRMS application
    When user enters valid admin credentials
    And user clicks on login button
    Then admin user is successfully logged in

  @regression @smoke @sprint12
  Scenario: ESS login
   # Given user is navigated to HRMS application
    When user enters valid ess username and password
    And user clicks on login button
    Then ess user is successfully logged in

  @regression  @smoke @pass
  Scenario: Invalid login
   # Given user is navigated to HRMS application
    When user enters invalid username and password
    And user clicks on login button
    Then user see error message on the screen


    @pass
    Scenario:Invalid Password
       # Given user is navigated to HRMS application
      When user enters valid username
      And user enters invalid password
      And user clicks on login button
      Then user see Invalid message

      @pass1
      Scenario: Blank username
         # Given user is navigated to HRMS application
        When user leave username empty
        And user enters valid password
        And user clicks on login button
        Then user see username cannot be empty error message displayed

        @pass2
        Scenario:Blank password
           # Given user is navigated to HRMS application
         When user enters valid ess username
          And user enters leave password empty
          And user clicks on login button
          Then user see password cannot by empty error message


