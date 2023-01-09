package com.kodilla.inheritance.homework;

public class Cogitator extends OperatingSystem {

    public Cogitator(int yearOfProduction){
        super(yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Activation rituals engaged");
    }

    @Override
    public void turnOff() {
        System.out.println("Deactivation rituals engaged");
    }

}
