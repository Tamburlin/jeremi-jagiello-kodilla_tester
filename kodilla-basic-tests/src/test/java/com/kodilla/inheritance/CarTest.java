package com.kodilla.inheritance;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarTest extends TestCase {
    Car car = new Car(4,3);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldPrintCorrectMessageAboutLights() {
        System.setOut(new PrintStream(outputStreamCaptor));
        car.turnOnLights();
        Assertions.assertEquals("Lights were turned on",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldReturnCorrectMessageAboutSeats() {
        System.setOut(new PrintStream(outputStreamCaptor));
        car.openDoors();
        Assertions.assertEquals("Opening 4 doors",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldReturnNumberOfWheels() {
        Assertions.assertEquals(4,car.getWheels());
    }

    @Test
    public void shouldReturnNumberOfSeats() {
        Assertions.assertEquals(3,car.getSeats());
    }

    @Test
    public void shouldDisplayCorrectNumberOfSeats() {
        System.setOut(new PrintStream(outputStreamCaptor));
        car.displayNumberOfSeats();
        Assertions.assertEquals("Number of seats: 3",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }
}