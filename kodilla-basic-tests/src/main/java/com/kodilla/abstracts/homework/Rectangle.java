package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public Rectangle(double lengthOfSideA, double lengthOfSideB) {
        super(lengthOfSideA, lengthOfSideB);
    }

    @Override
    public double surfaceArea() {
        double result = getLengthOfSideA() * getLengthOfSideB();
        System.out.println("Surface area of our rectangle = "+result);
        return result;
    }

    @Override
    public double perimeter() {
        double result2 = getLengthOfSideA()*2 + getLengthOfSideB()*2;
        System.out.println("Perimeter of our rectangle =  "+result2);
        return result2;
    }
}
