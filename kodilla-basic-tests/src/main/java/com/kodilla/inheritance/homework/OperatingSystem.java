package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfProduction;

    public OperatingSystem(int yearOfProduction){
        this.yearOfProduction = yearOfProduction;
    }

    public void turnOn(){
        System.out.println("Power on.");
    }

    public void turnOff(){
        System.out.println("Power off");
    }

    public int getYearOfProduction(){
        return yearOfProduction;
    }

    public void displayYearOfProduction(){
        System.out.println(yearOfProduction);
    }
}
