package com.kodilla.inheritance.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CogitatorTest extends TestCase {
    Cogitator cogitator = new Cogitator(200);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldDisplayTurnOnMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        cogitator.turnOn();
        Assertions.assertEquals("Activation rituals engaged",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

    @Test
    public void shouldDisplayTurnOffMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        cogitator.turnOff();
        Assertions.assertEquals("Deactivation rituals engaged",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

}