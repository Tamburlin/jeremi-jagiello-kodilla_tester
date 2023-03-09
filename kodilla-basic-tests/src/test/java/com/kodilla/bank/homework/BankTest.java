package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {

    CashMachine cashMachine1 = new CashMachine(1);
    CashMachine cashMachine2 = new CashMachine(2);
    Bank bank1 = new Bank("Valint&Balk", 2);

    void initValues() {
        cashMachine1.addValue(250.0);
        cashMachine1.addValue(-120);
        cashMachine1.addValue(50);
        cashMachine1.addValue(-30);

        cashMachine2.addValue(120);
        cashMachine2.addValue(30);
        cashMachine2.addValue(-250);
        cashMachine2.addValue(-50);

        bank1.cashMachines[0] = cashMachine1;
        bank1.cashMachines[1] = cashMachine2;
    }
}