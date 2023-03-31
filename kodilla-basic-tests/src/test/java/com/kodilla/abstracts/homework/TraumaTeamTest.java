package com.kodilla.abstracts.homework;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TraumaTeamTest extends TestCase {

    TraumaTeam traumaTeam = new TraumaTeam(5000,"test");

    @Test
    public void shouldReturnSalary() {
        Assertions.assertEquals(5000, traumaTeam.getSalary());
        Assertions.assertEquals(5000, traumaTeam.giveSalary());
    }

    @Test
    public void shouldReturnResponsibilities() {
        Assertions.assertEquals("test", traumaTeam.getResponsibilities());
        Assertions.assertEquals("test", traumaTeam.giveResponsibilities());
    }
}