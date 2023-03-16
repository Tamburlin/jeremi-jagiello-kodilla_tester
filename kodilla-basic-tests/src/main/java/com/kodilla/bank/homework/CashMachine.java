package com.kodilla.bank.homework;

public class CashMachine {

    private double[] account;
    private int size;
    private int meterAdd;
    private int meterWithdrawal;
    public int cashMachineID;

    public CashMachine(int ID) {
        this.cashMachineID = ID;
        this.size = 0;
        this.account = new double[0];
        this.meterAdd = 0;
        this.meterWithdrawal = 0;
    }

    public void addValue(double value) {
        if (value != 0) {
            this.size++;
            if (value > 0) {
                this.meterAdd++;
            }
            if (value < 0) {
                this.meterWithdrawal++;
            }
            double[] newTab = new double[this.size];
            System.arraycopy(account, 0, newTab, 0, account.length);
            newTab[this.size - 1] = value;
            this.account = newTab;
        }
    }

    public double[] getAccount() {
        return account;
    }

    public double getAccountBalance() {
        if (this.account.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.account.length; i++) {
            sum += this.account[i];
        }
        return sum;
    }

    public double averageAdd() {
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.account[i] > 0) {
                sum = sum + this.account[i];
            }
        }
        return sum / this.meterAdd;
    }

    public double averageWithdrawal() {
        double averageWithdrawal = 0;
        for (int i = 0; i < this.size; i++) {
            if (this.account[i] < 0) {
                averageWithdrawal = averageWithdrawal + this.account[i];
            }
        }
        return averageWithdrawal / this.meterWithdrawal;
    }

    public int getMeterAdd() {
        return this.meterAdd;
    }

    public int getMeterWithdrawal() {
        return this.meterWithdrawal;
    }

    public int getWholeMeter() {
        return this.meterAdd + this.meterWithdrawal;
    }

}