package com.kodilla.abstracts;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DogTest extends TestCase {
    Dog dog = new Dog();
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldReturnNumberOfLegs() {
        Assertions.assertEquals(dog.getNumberOfLegs(),4);
    }

    @Test
    public void shouldReturnVoice() {
        System.setOut(new PrintStream(outputStreamCaptor));
        dog.giveVoice();
        Assertions.assertEquals("Hau hau", outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }

}