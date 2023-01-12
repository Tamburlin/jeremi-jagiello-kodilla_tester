package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    Bank bank;
    int expectedNumberOfWithdrawals;
    int expectedNumberOfAdd;
    double expectedAverageOfGreaterThanZero;
    double expectedAverageOfSmallerThanZero;
    double delta;

    @BeforeEach
    public void setUp() {
        bank = new Bank("Valint & Balk");
        bank.addMoneyCashMachine1(500);
        bank.addMoneyCashMachine1(-200);
        bank.addMoneyCashMachine2(-300);
        bank.addMoneyCashMachine2(-100);
        bank.addMoneyCashMachine3(1000);
        expectedNumberOfWithdrawals = 3;
        expectedNumberOfAdd = 2;
        expectedAverageOfGreaterThanZero = 500;
        expectedAverageOfSmallerThanZero = -200;
        delta = 0.001;
    }

    @Test
    public void shouldReturnSumOfElementsOfAllArrays() {
        double sum = bank.getBankCashMachinesBalance();
        assertEquals(900, sum);
    }

    @Test
    public void shouldReturnNumberOfElementsSmallerThanZeroFromAllArrays() {
        int number = bank.getBankCashMachinesWithdrawals();
        assertEquals(expectedNumberOfWithdrawals, number);
    }

    @Test
    public void shouldReturnNumberOfElementsGreaterThanZeroFromAllArrays() {
        int number = bank.getBankCashMachinesAdd();
        assertEquals(expectedNumberOfAdd, number);
    }

    @Test
    public void shouldReturnAverageOfAllElementsFromArraysGreaterThanZero() {
        double average = bank.getBankCashMachinesAverageAdd();
        assertEquals(expectedAverageOfGreaterThanZero, average, delta);
    }

    @Test
    public void shouldReturnAverageOfAllElementsFromArraysSmallerThanZero() {
        double average = bank.getBankCashMachinesAverageWithdrawal();
        assertEquals(expectedAverageOfSmallerThanZero, average, delta);
    }
}