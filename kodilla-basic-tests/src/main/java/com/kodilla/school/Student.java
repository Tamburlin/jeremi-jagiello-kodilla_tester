package com.kodilla.school;

public class Student {
    private String name;
    private Grades math;
    private Grades physics;
    private Grades geography;
    private Grades history;

    public Student(String name) {
        this.name = name;
        this.math = new Grades();
        this.physics = new Grades();
        this.geography = new Grades();
        this.history = new Grades();
    }

    public void addMathGrade(int grade) {
        if (grade > 0 && grade < 7 ) {
            this.math.add(grade);
        }
    }

    public void addPhysicsGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.physics.add(grade);
        }
    }

    public  void addGeographyGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.geography.add(grade);
        }
    }

    public void addHistoryGrade(int grade) {
        if (grade > 0 && grade < 7) {
            this.history.add(grade);
        }
    }

    public double getMathsAverage() {
        return this.math.getAverage();
    }

    public double getPhysicsAverage() {
        return this.physics.getAverage();
    }

    public double getGeographyAverage() {
        return this.geography.getAverage();
    }

    public double getHistoryAverage() {
        return this.history.getAverage();
    }

    public double getAverage() {
        double sum = this.geography.getAverage() + this.history.getAverage() + this.math.getAverage() + this.physics.getAverage();
        return sum/4;
    }

}
