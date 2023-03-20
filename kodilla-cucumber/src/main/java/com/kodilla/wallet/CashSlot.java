package com.kodilla.wallet;

public class CashSlot {
    private final Wallet wallet;
    private int contents;
    public CashSlot(Wallet wallet) {
        this.wallet = wallet;
    }

    public int getContents() {
        return contents;
    }

    public void dispense(int amount) {
        this.contents = amount;
        wallet.deposit(-amount);
    }
}
