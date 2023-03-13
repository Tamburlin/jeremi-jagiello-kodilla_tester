package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {
    private String type = "SUV";

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return type;
    }
}
