package com.kodilla.collections.adv.exercise.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightRepository {

    private String airportName;

    public static List<Flight> getFlightTable() {
        List<Flight> airportFlights = new ArrayList<>();
        airportFlights.add(new Flight("Lost Angles", "Warsaw"));
        airportFlights.add(new Flight("Warsaw", "Lost Angles"));
        airportFlights.add(new Flight("Lost Angles", "JewYork"));
        airportFlights.add(new Flight("This is your final warning humans.", "Ohio will be eliminated."));
        return airportFlights;
    }

}
