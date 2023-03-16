package com.kodilla.bank.homework;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    public CashMachine[] cashMachines;
    int size;

    public Bank(String name) {
        this.bankName = name;
        this.cashMachines = new CashMachine[0];
        this.size = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;

    }

    public double getBankCashMachinesBalance() {
        double balance = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            balance += this.cashMachines[i].getAccountBalance();
        }
        return balance;
    }

    public int getBankCashMachinesWithdrawals() {
        int withdrawals = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            withdrawals += this.cashMachines[i].getMeterWithdrawal();
        }
        return withdrawals;
    }

    public int getBankCashMachinesAdd() {
        int adds = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            adds += this.cashMachines[i].getMeterAdd();
        }
        return adds;
    }

    public double getBankCashMachinesAverageAdd() {
        double averageAdds = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            averageAdds += this.cashMachines[i].averageAdd();
        }
        return averageAdds / this.cashMachines.length;
    }

    public double getBankCashMachinesAverageWithdrawal() {
        double averageWithdrawals = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            averageWithdrawals += this.cashMachines[i].averageWithdrawal();
        }
        return averageWithdrawals / this.cashMachines.length;
    }
}