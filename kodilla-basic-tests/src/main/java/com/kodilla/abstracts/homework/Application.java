package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Square square = new Square(5.5, 0);
        square.perimeter();
        square.surfaceArea();

        Triangle triangle = new Triangle(5, 4.33);
        triangle.perimeter();
        triangle.surfaceArea();

        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.perimeter();
        rectangle.surfaceArea();
    }
}
