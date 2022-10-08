
@tag
Feature: Title of your feature
I want to use this template for my feature file

  @tag1
    Scenario: HRM login 
    Given User wants to login into HRM
    When Username and password are valid
    Then  User is able to login

  @tag2
    Scenario: Apply for leave
    Given User wants to apply for leave
    When User is logged into HRM
    Then User can go into leave and then apply 
    
    
  @tag3
    Scenario: User wants to perform method overloading for searching
    Given User goes on the admin page
    Then User searches for his name and role
    
