package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    CashMachine cashMachine1 = new CashMachine(1);
    CashMachine cashMachine2 = new CashMachine(2);
    Bank bank1 = new Bank("Valint&Balk");

    @BeforeEach
    public void initValues() {
        cashMachine1.addValue(250.0);
        cashMachine1.addValue(-120);
        cashMachine1.addValue(50);
        cashMachine1.addValue(-30);

        cashMachine2.addValue(250.0);
        cashMachine2.addValue(-120);
        cashMachine2.addValue(50);
        cashMachine2.addValue(-30);

        bank1.addCashMachine(cashMachine1);
        bank1.addCashMachine(cashMachine2);
    }

    @Test
    public void shouldReturnBalanceFromAllCashMachines() {
        assertEquals(300, bank1.getBankCashMachinesBalance());
    }

    @Test
    public void shouldReturnNumberOfAllWithdrawals() {
        assertEquals(4, bank1.getBankCashMachinesWithdrawals());
    }

    @Test
    public void shouldReturnNumberOfAllAtmPayments() {
        assertEquals(4, bank1.getBankCashMachinesAdd());
    }

    @Test
    public void shouldReturnAverageAddOfAllCashMachines() {
        assertEquals(150, bank1.getBankCashMachinesAverageAdd());
    }

    @Test
    public void shouldReturnAverageWithdrawalOfAllCashMachines() {
        assertEquals(-75, bank1.getBankCashMachinesAverageWithdrawal());
    }
}