package com.kodilla.collections.adv.exercise.homework;

import com.kodilla.collections.adv.exercise.dictionary.EnglishWord;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    public static void main(String[] args) {
        FlightFinder airport1 = new FlightFinder();
        airport1.findFlightsFrom("Lost Angles");
        airport1.findFlightsTo("Warsaw");
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> listOfFlights = FlightRepository.getFlightTable();
        List<Flight> result = new ArrayList<>();

        for (Flight flight : listOfFlights) {
            if (flight.getDeparture() == departure) {
                result.add(flight);
            }
        }
        System.out.println(result);
        return result;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> listOfFlights = FlightRepository.getFlightTable();
        List<Flight> result = new ArrayList<>();
        for (Flight flight : listOfFlights) {
            if (flight.getArrival() == arrival) {
                result.add(flight);
            }
        }
        System.out.println(result);
        return result;
    }
}
