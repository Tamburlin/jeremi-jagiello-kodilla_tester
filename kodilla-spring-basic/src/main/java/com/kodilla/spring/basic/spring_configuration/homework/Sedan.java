package com.kodilla.spring.basic.spring_configuration.homework;

public class Sedan implements Car {
    private String type = "Sedan";

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return type;
    }
}
