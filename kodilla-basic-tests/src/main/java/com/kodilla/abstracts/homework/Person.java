package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showData() {
        System.out.println(this.firstName + " " + job.getResponsibilities());
    }

    public static void main(String[] args) {
        Person Jane = new Person("Jane", 33, new Firefighter(50000, "To protect humans against the Firenation."));
        Person Jake = new Person("Jake", 163, new PoliceOfficer(43221, "To protect life and property through the enforcement of laws & regulations."));
        Person Joe = new Person("Joe", 28, new TraumaTeam(80000, "To protect and save life of clients of TraumaTeam company."));
        Jane.showData();
        Joe.showData();
    }
}
