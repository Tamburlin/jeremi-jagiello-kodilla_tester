package com.kodilla.spotbugs;

import static java.lang.Math.PI;

public class BadCodeExample {

    public static double getPi() {
        return PI;
    }

    @Override
    public int hashCode() {
        return (int) (PI*20);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (this == o) return true;
        else return false;
    }
}