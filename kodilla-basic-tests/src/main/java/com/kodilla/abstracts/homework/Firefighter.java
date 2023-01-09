package com.kodilla.abstracts.homework;

public class Firefighter extends Job {

    public Firefighter(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public double giveSalary() {
        return getSalary();
    }

    @Override
    public String giveResponsibilities() {
        System.out.println(getResponsibilities());
        return getResponsibilities();
    }
}
