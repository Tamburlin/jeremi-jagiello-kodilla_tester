package com.kodilla.abstracts;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AnimalProcessorTest extends TestCase {
    Duck duck = new Duck();
    AnimalProcessor animalProcessor = new AnimalProcessor();

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldPrintCorrectMessage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        animalProcessor.process(duck);
        String part1 = "Animal has 2 legs.";
        String part2 = "Quack";
        String sum = part1 + "\r\n" + part2;
        Assertions.assertEquals(sum, outputStreamCaptor.toString().trim());
        System.setOut(standardOut);


    }

}