package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int mass;
    private int engineForce = 20000;
    private int brakesForce = 30000;
    private int AccTimer = 0;
    private int DccTimer = 0;

    public Ford(int mass) {
        this.mass = mass;
    }

    public int getSpeed() {
        if ((engineForce / mass * AccTimer) - (brakesForce / mass * DccTimer) <= 0) {
            return 0;
        }
        return (engineForce / mass * AccTimer) - (brakesForce / mass * DccTimer);
    }

    public void increaseSpeed() {
        AccTimer++;
    }

    public void decreaseSpeed() {
        DccTimer--;
    }
}