package com.kodilla.fizzbuzzchecker;

public class FizzBuzzChecker {

    private static boolean isNumberDivisibleByThree(int number) {
        if (number % 3 == 0) {
            return true;
        }
        return false;
    }

    private static boolean isNumberDivisibleByFive(int number) {
        if (number % 5 == 0) {
            return true;
        }
        return false;
    }

    public static String checkIfDivisible(int number) {
        if (isNumberDivisibleByFive(number) == true && isNumberDivisibleByThree(number) == true) {
            return "FizzBuzz";
        } else if (isNumberDivisibleByThree(number) == true && isNumberDivisibleByFive(number) == false ) {
            return "Fizz";
        } else if (isNumberDivisibleByFive(number) == true && isNumberDivisibleByThree(number) == false) {
            return "Buzz";
        } else return "None";
    }
}

