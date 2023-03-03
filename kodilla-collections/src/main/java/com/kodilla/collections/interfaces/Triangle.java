package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Triangle implements Shape {

    private double height;
    private double width;
    private double hypotenuse;

    public Triangle(double height, double width, double hypotenuse) {
        this.height = height;
        this.width = width;
        this.hypotenuse = hypotenuse;
    }

    public double getArea() {
        return width * height / 2;
    }

    public double getPerimeter() {
        return width + hypotenuse + height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", hypotenuse=" + hypotenuse +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.height, height) == 0 && Double.compare(triangle.width, width) == 0 && Double.compare(triangle.hypotenuse, hypotenuse) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, hypotenuse);
    }
}