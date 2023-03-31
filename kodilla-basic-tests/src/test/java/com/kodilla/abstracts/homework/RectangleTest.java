package com.kodilla.abstracts.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RectangleTest extends TestCase {
    Rectangle rectangle = new Rectangle(10,10);

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Test
    public void shouldReturnSurfaceArea() {
        System.setOut(new PrintStream(outputStreamCaptor));
        rectangle.surfaceArea();
        Assertions.assertEquals("Surface area of our rectangle = 100.0",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldReturnPerimeter() {
        Assertions.assertEquals(40.0,rectangle.perimeter());
    }
}