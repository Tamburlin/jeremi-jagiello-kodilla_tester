package com.kodilla.abstracts.homework;

public abstract class Job {
    private double salary;
    private String responsibilities;

    public double getSalary() {
        return salary;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public Job(double salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public abstract double giveSalary();

    public abstract String giveResponsibilities();
}
