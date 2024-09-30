Feature: FizzBuzz game
  The game returns specific words based on divisibility of a number.

  Scenario Outline: Determine if a number is divisible by 3, 5, or both
    Given the number is <number>
    When I check the divisibility
    Then I should get <result>

    Examples:
      | number | result     |
      | 3      | "Fizz"     |
      | 5      | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 2      | "None"     |
      | 9      | "Fizz"     |
      | 10     | "Buzz"     |
      | 30     | "FizzBuzz" |
      | 7      | "None"     |
