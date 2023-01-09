package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double lengthOfSideA;
    private double lengthOfSideB;
    public final double PI = 3.1415926;

    public double getLengthOfSideA() {
        return lengthOfSideA;
    }
    public double getLengthOfSideB() {
        return lengthOfSideB;
    }

    public Shape(double lengthOfSideA, double lengthOfSideB) {
        this.lengthOfSideA = lengthOfSideA;
        this.lengthOfSideB = lengthOfSideB;
    }

    public abstract double surfaceArea();
    public abstract double perimeter();

}
