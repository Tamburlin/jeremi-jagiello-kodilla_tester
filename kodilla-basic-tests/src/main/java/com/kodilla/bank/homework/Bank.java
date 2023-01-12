package com.kodilla.bank.homework;

public class Bank {

    private String bankName;
    private CashMachine cashMachine1;
    private CashMachine cashMachine2;
    private CashMachine cashMachine3;

    public Bank(String name) {
        this.bankName = name;
        this.cashMachine1 = new CashMachine(1);
        this.cashMachine2 = new CashMachine(2);
        this.cashMachine3 = new CashMachine(3);
    }

    public void addMoneyCashMachine1(double money) {
        this.cashMachine1.add(money);
    }

    public void addMoneyCashMachine2(double money) {
        this.cashMachine2.add(money);
    }

    public void addMoneyCashMachine3(double money) {
        this.cashMachine3.add(money);
    }

    public double getBankCashMachinesBalance() {
        return cashMachine1.getAccountBalance() + cashMachine2.getAccountBalance() + cashMachine3.getAccountBalance();
    }

    public int getBankCashMachinesWithdrawals() {
        int meter = cashMachine1.getMeterWithdrawal() + cashMachine2.getMeterWithdrawal() + cashMachine3.getMeterWithdrawal();
        return meter;
    }

    public int getBankCashMachinesAdd() {
        int meter = cashMachine1.getMeterAdd() + cashMachine2.getMeterAdd() + cashMachine3.getMeterAdd();
        return meter;
    }

    public double getBankCashMachinesAverageAdd() {
        double average = (cashMachine1.averageAdd() + cashMachine2.averageAdd() + cashMachine3.averageAdd()) / 3;
        return average;
    }

    public double getBankCashMachinesAverageWithdrawal() {
        double average = (cashMachine1.averageWithdrawal() + cashMachine2.averageWithdrawal() + cashMachine3.averageWithdrawal()) / 3;
        return average;
    }
}