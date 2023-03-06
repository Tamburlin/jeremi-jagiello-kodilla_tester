package com.kodilla.basic_assertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorTestSuite {
    private double a = 0;
    private double b = 0;
    private Calculator  calculator;
    @BeforeAll
    void initData() {
        a = 9;
        b = 8;
    }
    @BeforeEach
    void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        double sumResult = calculator.sum(a, b);
        assertEquals(17, sumResult, 0.0001);
    }

    @Test
    public void testSquare() {
        double squareResult = calculator.square(a);
        assertEquals(81, squareResult, 0.001);
    }

    @Test
    public void testSubtract() {
        double subtractResult = calculator.subtract(a, b);
        assertEquals(1, subtractResult, 0.001);
    }
}
