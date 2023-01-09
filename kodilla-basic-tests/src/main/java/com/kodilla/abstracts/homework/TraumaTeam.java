package com.kodilla.abstracts.homework;

public class TraumaTeam extends Job {
    public TraumaTeam(double salary, String responsibilities) {
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
