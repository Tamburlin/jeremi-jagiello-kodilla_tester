package com.kodilla.inheritance.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OperatingSystemTest extends TestCase {
    OperatingSystem operatingSystem = new OperatingSystem(2000);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldDisplayTurnOnMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        operatingSystem.turnOn();
        Assertions.assertEquals("Power on.",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldDisplayTurnOffMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        operatingSystem.turnOff();
        Assertions.assertEquals("Power off",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldReturnYearOfProduction() {
        Assertions.assertEquals(2000,operatingSystem.getYearOfProduction());
    }

    @Test
    public void shouldDisplayYearOfProduction() {
        System.setOut(new PrintStream(outputStreamCaptor));
        operatingSystem.displayYearOfProduction();
        Assertions.assertEquals("2000",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }
}