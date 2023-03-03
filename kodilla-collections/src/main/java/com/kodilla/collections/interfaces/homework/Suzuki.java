package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Suzuki implements Car {
    private int mass;
    private int engineForce = 15000;
    private int brakesForce = 15000;
    private int AccTimer = 0;
    private int DccTimer = 0;

    public Suzuki(int mass) {
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

    @Override
    public String toString() {
        return "Suzuki{" +
                "mass=" + mass +
                ", engineForce=" + engineForce +
                ", brakesForce=" + brakesForce +
                ", AccTimer=" + AccTimer +
                ", DccTimer=" + DccTimer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suzuki suzuki = (Suzuki) o;
        return mass == suzuki.mass && engineForce == suzuki.engineForce && brakesForce == suzuki.brakesForce && AccTimer == suzuki.AccTimer && DccTimer == suzuki.DccTimer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, engineForce, brakesForce, AccTimer, DccTimer);
    }
}