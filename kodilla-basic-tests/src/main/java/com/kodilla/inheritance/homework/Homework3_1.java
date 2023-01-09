package com.kodilla.inheritance.homework;

public class Homework3_1 {

    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2000);
        operatingSystem.displayYearOfProduction();
        operatingSystem.turnOff();

        WindowsSystem windowsSystem = new WindowsSystem(2012);
        windowsSystem.company();
        windowsSystem.turnOn();

        Cogitator cogitator = new Cogitator(39023);
        cogitator.displayYearOfProduction();
        cogitator.turnOn();
    }
}
