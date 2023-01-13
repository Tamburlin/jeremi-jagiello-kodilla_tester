package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    private int mass;
    private int engineForce = 30000;
    private int brakesForce = 20000;
    private int AccTimer = 0;
    private int DccTimer = 0;

    public Opel(int mass) {
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