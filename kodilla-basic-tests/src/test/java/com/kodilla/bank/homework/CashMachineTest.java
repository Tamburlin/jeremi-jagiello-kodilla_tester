package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {
    CashMachine cashMachine1 = new CashMachine(1);
    @BeforeEach
    void initValues() {

        cashMachine1.addValue(250.0);
        cashMachine1.addValue(-120);
        cashMachine1.addValue(50);
        cashMachine1.addValue(-30);
    }

    @Test
    public void ShouldAddValuesAndGetCashMachineBalance() {
        assertEquals(150, cashMachine1.getAccountBalance());
    }

    @Test
    public void ShouldGetAverageAdd() {
        assertEquals(150,cashMachine1.averageAdd());
    }
}