package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachine;
    double delta;
    double sumOfElements;
    int expectedNumberOfElementsSmallerThanZero;
    int expectedNumberOfElementsGreaterThanZero;
    int expectedNumberOfElementsInArray;
    double expectedAverageOfElementsGreaterThanZero;
    double expectedAverageOfElementsSmallerThanZero;

    @BeforeEach
    public void setUp() {
        cashMachine = new CashMachine(1);
        delta = 0.001;
        cashMachine.add(250);
        cashMachine.add(-300);
        sumOfElements = -50;
        expectedNumberOfElementsGreaterThanZero = 1;
        expectedNumberOfElementsSmallerThanZero = 1;
        expectedNumberOfElementsInArray = 2;
        expectedAverageOfElementsSmallerThanZero = -300;
        expectedAverageOfElementsGreaterThanZero = 250;
    }

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine(1);
        double[] account = cashMachine.getAccount();
        assertEquals(0, account.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        double[] account = cashMachine.getAccount();
        assertEquals(250, account[0]);
        assertEquals(-300, account[1]);
    }

    @Test
    public void shouldGiveSumOfElements() {
        double sum = cashMachine.getAccountBalance();
        assertEquals(sumOfElements, sum);
    }

    @Test
    public void shouldReturnNumberOfArrayElementsGreaterThanZero() {
        int number = cashMachine.getMeterAdd();
        assertEquals(expectedNumberOfElementsGreaterThanZero, number);
    }

    @Test
    public void shouldReturnNumberOfArrayElementsSmallerThanZero() {
        int number = cashMachine.getMeterWithdrawal();
        assertEquals(expectedNumberOfElementsSmallerThanZero, number);
    }

    @Test
    public void shouldGiveNumberOfAllArrayElements() {
        int number = cashMachine.getWholeMeter();
        assertEquals(expectedNumberOfElementsInArray, number);
    }

    @Test
    public void shouldGiveAverageOfArrayElementsGreaterThanZero() {
        double number = cashMachine.averageAdd();
        assertEquals(expectedAverageOfElementsGreaterThanZero, number, delta);
    }

    @Test
    public void shouldGiveAverageOfArrayElementsSmallerThanZero() {
        double number = cashMachine.averageWithdrawal();
        assertEquals(expectedAverageOfElementsSmallerThanZero, number, delta);
    }
}