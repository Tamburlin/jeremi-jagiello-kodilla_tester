package com.kodilla.abstracts.homework;
public class Triangle extends Shape {

    public Triangle(double lengthOfSideA, double lengthOfSideB) {
        super(lengthOfSideA, lengthOfSideB);
    }

    @Override
    public double surfaceArea() {
        double result = (getLengthOfSideA() * getLengthOfSideB()) / 2;
        System.out.println("Surface area of our triangle = "+result);
        return result;
    }

    @Override
    public double perimeter() {
        double result1 = getLengthOfSideA() * 3;
        System.out.println("Perimeter of our triangle = "+result1);
        return result1;
    }

}
