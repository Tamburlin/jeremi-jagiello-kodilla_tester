package com.kodilla.abstracts.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirefighterTest extends TestCase {
    Firefighter firefighter = new Firefighter(5000,"test");

    @Test
    public void shouldReturnSalary() {
        Assertions.assertEquals(5000, firefighter.getSalary());
        Assertions.assertEquals(5000, firefighter.giveSalary());
    }

    @Test
    public void shouldReturnResponsibilities() {
        Assertions.assertEquals("test", firefighter.getResponsibilities());
        Assertions.assertEquals("test", firefighter.giveResponsibilities());
    }
}