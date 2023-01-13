package com.kodilla.collections.interfaces;

public class InterfacesDemo {

    public static void main(String[] args) {
        Square square = new Square(10.0);
        showShapeDetail(square);

        Circle circle = new Circle(7);
        showShapeDetail(circle);

        Triangle triangle = new Triangle(6, 4, 7.211);
        showShapeDetail(triangle);
    }

    private static void showShapeDetail(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}