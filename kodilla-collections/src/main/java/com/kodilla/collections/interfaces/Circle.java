package com.kodilla.collections.interfaces;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", Pi=" + Pi +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Double.compare(circle.Pi, Pi) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, Pi);
    }
}