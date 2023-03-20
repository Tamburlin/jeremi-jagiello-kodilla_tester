Feature: Cash Withdrawal
  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited <money> in my wallet
    When I request <withdrawal>
    Then <result> should be dispensed
    Examples:
    |money|withdrawal|result|
    |200  |0         |0     |
    |200  |200       |200   |
    |200  |-20       |0     |
    |200  |300       |0     |