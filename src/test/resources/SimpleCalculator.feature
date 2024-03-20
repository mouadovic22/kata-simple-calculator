Feature: Simple Calculator
  As a user
  I want to use a simple calculator
  So that I can perform basic arithmetic operations

  Scenario: Addition
    Given I have a simple calculator
    When I input "2 + 3"
    Then I should get 5

  Scenario: Subtraction
    Given I have a simple calculator
    When I input "2 - 3"
    Then I should get -1

  Scenario: Multiplication
    Given I have a simple calculator
    When I input "2 * 3"
    Then I should get 6

  Scenario: Singleton Operand
    Given I have a simple calculator
    When I input "3"
    Then I should get 3

  Scenario: Empty Expression
    Given I have a simple calculator
    When I input ""
    Then I should get 0

  Scenario: Blank Expression
    Given I have a simple calculator
    When I input "    "
    Then I should get 0

  Scenario: More Than Two Operands
    Given I have a simple calculator
    When I input "2 + 3 + 4"
    Then I should get an error "More than two operands."

  Scenario: Non-Integer Operand
    Given I have a simple calculator
    When I input "2 + a"
    Then I should get an error "Non-integer operand."

  Scenario: Unsupported Operation
    Given I have a simple calculator
    When I input "2 / 3"
    Then I should get an error "Unsupported operation."