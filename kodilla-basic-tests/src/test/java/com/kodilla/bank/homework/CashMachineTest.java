package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {
    CashMachine cashMachine1 = new CashMachine(1);

    @BeforeEach
    public void initValue() {
        cashMachine1.addValue(250.0);
        cashMachine1.addValue(-120);
        cashMachine1.addValue(50);
        cashMachine1.addValue(-30);
    }

    @Test
    public void shouldAddValuesAndGetCashMachineBalance() {
        assertEquals(150, cashMachine1.getAccountBalance());
    }

    @Test
    public void shouldGetAverageAdd() {
        assertEquals(150, cashMachine1.averageAdd());
    }

    @Test
    public void shouldGetAverageWithdrawal() {
        assertEquals(-75, cashMachine1.averageWithdrawal());
    }
}