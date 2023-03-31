package com.kodilla.inheritance;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConvertibleTest extends TestCase {
    Convertible convertible = new Convertible(2,3);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldDisplayOpenRoofMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        convertible.openRoof();
        Assertions.assertEquals("Opening roof...",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldDisplayCloseRoofMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        convertible.closeRoof();
        Assertions.assertEquals("Closing roof...",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldDisplayDoorMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        convertible.openDoors();
        Assertions.assertEquals("Opening 2 doors",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

}