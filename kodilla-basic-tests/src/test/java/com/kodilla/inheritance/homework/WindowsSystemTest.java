package com.kodilla.inheritance.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WindowsSystemTest extends TestCase {
    WindowsSystem windowsSystem = new WindowsSystem(2000);
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    public void shouldPrintWindows() {
        System.setOut(new PrintStream(outputStreamCaptor));
        windowsSystem.company();
        Assertions.assertEquals("Windows",outputStreamCaptor.toString().trim());
        System.setOut(standardOut);
    }
}