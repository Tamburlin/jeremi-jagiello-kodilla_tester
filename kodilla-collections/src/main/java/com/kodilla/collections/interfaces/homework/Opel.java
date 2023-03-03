package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Opel{" +
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
        Opel opel = (Opel) o;
        return mass == opel.mass && engineForce == opel.engineForce && brakesForce == opel.brakesForce && AccTimer == opel.AccTimer && DccTimer == opel.DccTimer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mass, engineForce, brakesForce, AccTimer, DccTimer);
    }
}