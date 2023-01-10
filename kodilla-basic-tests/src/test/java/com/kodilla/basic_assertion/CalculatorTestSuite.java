package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double a = 5;
        double b = 8;
        double sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.0001);
    }
    @Test
            public void  testSquare() {
        Calculator calculator = new Calculator();
        double squareResult = calculator.square(9);
        assertEquals(81, squareResult, 0.001);
    }
}
