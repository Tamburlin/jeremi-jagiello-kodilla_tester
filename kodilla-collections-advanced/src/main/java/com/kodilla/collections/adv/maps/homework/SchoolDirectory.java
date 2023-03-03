package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> mapOfSchoolDirectory = new HashMap<>();

        Principal aXavier = new Principal("Adam", "Xavier");
        Principal aKleks = new Principal("Ambrozy", "Kleks");
        Principal mrHyde = new Principal("Mister", "Hyde");

        School xavierSchool = new School("liceum Xaviera", Arrays.asList(10, 15, 30, 5));
        School kleksSchool = new School("Akademia Pana Kleksa", Arrays.asList(2, 151, 65, 5));
        School hydeSchool = new School("Hide's school", Arrays.asList(105, 215, 330, 25));

        mapOfSchoolDirectory.put(aXavier, xavierSchool);
        mapOfSchoolDirectory.put(aKleks, kleksSchool);
        mapOfSchoolDirectory.put(mrHyde, hydeSchool);

        for (Map.Entry<Principal, School> principalEntry : mapOfSchoolDirectory.entrySet()) {
            int numberOfStudents = principalEntry.getValue().getNumberOfStudents();
            System.out.println("Principal: " + principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() + ", school: " + principalEntry.getValue().getSchoolName());
            System.out.println("Number of students: " + numberOfStudents);
            System.out.println("--------------------------------------");
        }
    }
}
