package com.kodilla.wallet;

public class Wallet {
    private int balance = 0;
    private String notEnoughMoneyMessage = "You don't have anough money in your wallet.";

    public Wallet() {

    }

    public void deposit(int money){
        this.balance += money;
    }

    public int getBalance() {
        return balance;
    }
    public String getNotEnoughMoneyMessage() {
        return notEnoughMoneyMessage;
    }
}
