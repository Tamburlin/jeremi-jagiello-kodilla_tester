Feature: Fizz or Buzz or FizzBuzz
  Nobody likes this game

  Scenario Outline: Number returns Fizz or Buzz or FizzBuzz or None
    Given There is number <number>
    When I ask if it is divisible by 3 and/or 5
    Then I should be told <result>
    Examples:
      | number | result |
      |0      |"FizzBuzz"|
      |1      |"None"|
      |2      |"None"|
      |3      |"Fizz"|
      |4      |"None"|
      |5      |"Buzz"|
      |6      |"Fizz |
      |7      |"None"|
      |8      |"None"|
      |9      |"Fizz"|
      |10     |"Buzz"|
      |11     |"None"|
      |12     |"Fizz"|
      |13     |"None |
      |14     |"None"|
      |15     |"FizzBuzz"|


