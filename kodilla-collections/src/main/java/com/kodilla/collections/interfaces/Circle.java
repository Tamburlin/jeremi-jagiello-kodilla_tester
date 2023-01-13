package com.kodilla.collections.interfaces;

public class Circle implements Shape {

    private double radius;
    private double Pi = Math.PI;

    public  Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Pi * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Pi * radius;
    }
}