@Login
Feature: Login Functionality of Swag Labs

  Background: 
    Given User is on login page

  @LoginValidCredentials
  Scenario Outline: Successful login with valid credential
    When User enter username as "<username>" and password as "<password>"
    And Click on login button
    Then Swag Labs title displayed after succesfully login

    Examples: 
      | username      |  | password     |
      | standard_user |  | secret_sauce |

  @LoginInValidCredentials
  Scenario Outline: Unsuccessful login with invalid credential
    When User enter username as "<username>" and password as "<password>"
    And Click on login button
    Then Error message displayed after unsuccessful login

    Examples: 
      | username      |  | password |
      | standard_user |  | sauce    |
