package com.kodilla.inheritance.homework;

public class WindowsSystem extends OperatingSystem {

    public WindowsSystem(int yearOfProduction) {
        super(yearOfProduction);
    }

    public void company() {
        System.out.println("Windows");
    }
}
