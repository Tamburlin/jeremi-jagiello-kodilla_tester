package com.kodilla.wallet;

public class Cashier {
    private final Wallet wallet;
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot, Wallet wallet) {
        this.cashSlot = cashSlot;
        this.wallet = wallet;
    }

    public void withdrawal(Wallet wallet, int amount) {
        if(amount > wallet.getBalance())  {
            cashSlot.dispense(0);
            return;
        }
        if(amount < 0) {
            cashSlot.dispense(0);
            return;
        }
        cashSlot.dispense(amount);
    }
}
