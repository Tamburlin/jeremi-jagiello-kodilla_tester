package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double lengthOfSideA, double lengthOfSideB) {
        super(lengthOfSideA, lengthOfSideB);
    }

    @Override
    public double surfaceArea() {
        double result = getLengthOfSideA() * getLengthOfSideA();
        System.out.println("Surface area of our square = " + result);
        return result;
    }

    @Override
    public double perimeter() {
        double result1 = getLengthOfSideA() * 4;
        System.out.println("Perimeter of our square = " + result1);
        return result1;
    }
}
