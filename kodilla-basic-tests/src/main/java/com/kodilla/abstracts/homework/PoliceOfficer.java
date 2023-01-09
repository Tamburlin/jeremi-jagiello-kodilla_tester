package com.kodilla.abstracts.homework;

public class PoliceOfficer extends Job {
    public PoliceOfficer(double salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public double giveSalary() {
        return getSalary();
    }

    @Override
    public String giveResponsibilities() {
        return getResponsibilities();
    }
}
