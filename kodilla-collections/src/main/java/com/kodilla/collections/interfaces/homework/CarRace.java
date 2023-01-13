package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {

        Opel opel = new Opel(1830);
        Suzuki suzuki = new Suzuki(1200);
        Ford ford = new Ford(2200);

        doRace(opel);
        doRace(suzuki);
        doRace(ford);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}