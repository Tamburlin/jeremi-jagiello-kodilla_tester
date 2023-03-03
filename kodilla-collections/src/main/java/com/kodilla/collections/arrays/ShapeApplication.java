package com.kodilla.collections.arrays;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.Random;

public class ShapeApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        for (int n = 0; n < shapes.length; n++) {
            shapes[n] = drawShape();
        }
        for (Shape shape : shapes)
            ShapeUtils.displayShapeInfo(shape);
    }
    private static Shape drawShape() {
        int drawShapeKind = RANDOM.nextInt(3);
        double a = getRandomSize(RANDOM);
        if (drawShapeKind == 0)
            return new Circle(a);
        else if (drawShapeKind == 1)
            return new Square(a);
        else {
            double b = getRandomSize(RANDOM);
            double c = getRandomSize(RANDOM);
            return new Triangle(a, b, c);
        }
    }

    private static double getRandomSize(Random random) {
        return RANDOM.nextDouble() * 100 + 1;
    }
}
