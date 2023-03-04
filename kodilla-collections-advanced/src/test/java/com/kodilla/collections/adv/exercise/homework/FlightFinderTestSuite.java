package com.kodilla.collections.adv.exercise.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        flightFinder.findFlightsFrom("Warsaw");
        //then
        assertEquals(1, flightFinder.findFlightsFrom("Warsaw").size());
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsTo("JewYork");
        assertEquals(1, flightFinder.findFlightsTo("JewYork").size());
    }

}