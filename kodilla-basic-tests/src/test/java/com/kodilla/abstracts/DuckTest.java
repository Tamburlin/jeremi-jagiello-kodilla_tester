package com.kodilla.abstracts;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class DuckTest extends TestCase {
    Duck duck = new Duck();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldReturnNumberOfLegs() {
        Assertions.assertEquals(duck.getNumberOfLegs(),2);
    }

    @Test
    public void shouldReturnVoice() {
        System.setOut(new PrintStream(outputStreamCaptor));
        duck.giveVoice();
        Assertions.assertEquals("Quack", outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }


}