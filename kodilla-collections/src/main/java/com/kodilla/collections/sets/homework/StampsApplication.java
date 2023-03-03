package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("XYJewYork", "5x5", true));
        stamps.add(new Stamp("XYJewYork", "5x5", false)); //should add this one
        stamps.add(new Stamp("XYJewYork", "5x5", true)); // should not add this one
        stamps.add(new Stamp("YearOfTheRatVer2", "6x6", true));
        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
