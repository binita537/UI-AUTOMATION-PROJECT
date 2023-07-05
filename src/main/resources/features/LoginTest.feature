Feature: Login Page
  As a user
  I want to be able to log in to my account
  So that I can access the protected areas of the website

  @logintest
  Scenario Outline: Successful Login to the application
    Given I am on the login page of application
    When I enter "<username>" and "<password>" credentials
    Then User is "<status>" to login application

    Examples: 
      | username | password | status  |
      | mngr513115    | qahupeh    | success |
     # | Admin123 | Admin123 | fail    |
