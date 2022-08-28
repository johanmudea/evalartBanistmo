Feature: Automation testing using Screenplay pattern.
  As an automation tester
  I need to practice automation testing using Screenplay patter
  for practice about serenity BDD framework

  Scenario: mandatory fields
    Given the user is on landing page
    When add items to cart
    Then the user will see the value of remaining item