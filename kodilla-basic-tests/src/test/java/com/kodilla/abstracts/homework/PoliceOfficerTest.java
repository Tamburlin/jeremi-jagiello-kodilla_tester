package com.kodilla.abstracts.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoliceOfficerTest extends TestCase {

    PoliceOfficer policeOfficer = new PoliceOfficer(5000,"test");

    @Test
    public void shouldReturnSalary() {
        Assertions.assertEquals(5000, policeOfficer.getSalary());
        Assertions.assertEquals(5000, policeOfficer.giveSalary());
    }

    @Test
    public void shouldReturnResponsibilities() {
        Assertions.assertEquals("test", policeOfficer.getResponsibilities());
        Assertions.assertEquals("test", policeOfficer.giveResponsibilities());
    }
}