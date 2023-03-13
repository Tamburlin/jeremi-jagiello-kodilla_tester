package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {
    private String type = "Cabrio";

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return true;
    }

    @Override
    public String getCarType() {
        return type;
    }
}
