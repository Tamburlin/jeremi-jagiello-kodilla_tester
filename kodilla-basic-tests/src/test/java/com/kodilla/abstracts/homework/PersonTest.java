package com.kodilla.abstracts.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PersonTest extends TestCase {
    PoliceOfficer policeOfficer = new PoliceOfficer(5000,"test");
    Person person = new Person("Joe", 69,policeOfficer);

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    @Test
    public void shouldShowData() {
        System.setOut(new PrintStream(outputStreamCaptor));
        person.showData();
        Assertions.assertEquals("Joe test",outputStreamCaptor.toString().trim() );
        System.setOut(standardOut);
    }
}