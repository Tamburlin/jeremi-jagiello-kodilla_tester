package com.kodilla.wallet;

public class CashSlot {
    private final Wallet wallet;
    private int contents;
    private String message;

    public CashSlot(Wallet wallet) {
        this.wallet = wallet;
    }

    public int getContents() {
        return contents;
    }

    public String getMessage() {
        return message;
    }
    public void MessageConstr(String message) {
        this.message = message;
    }

    public void dispense(int amount) {
        this.contents = amount;
        wallet.deposit(-amount);
    }
}
