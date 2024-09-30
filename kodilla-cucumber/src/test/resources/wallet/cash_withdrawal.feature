Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed
    And the balance of my wallet should be $170

  Scenario: Full withdrawal from a wallet
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed
    And the balance of my wallet should be $0

  Scenario: Attempting to withdraw more than available balance
    Given I have deposited $200 in my wallet
    When I request $300
    Then no money should be dispensed
    And I should be told that I have insufficient funds
