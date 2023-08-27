Feature: Login Page
  As a user  
  I want to be able to log in to my account
  So that I can access the protected areas of the website

  @logintest
  Scenario Outline: Successful Register to the application
    Given I am on the register page of application
    When I enter "<email>" to get userid and password
    Then User gets userId and Password 

    Examples:  
      | email   | 
      | test@gmail.com | 
    #  | Admin123   | 
