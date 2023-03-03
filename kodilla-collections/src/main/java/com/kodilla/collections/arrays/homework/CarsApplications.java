package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;

public class CarsApplications {

    public static void main(String[] args) {
        Random random = new Random();
        int numberOfCars = random.nextInt(16 - 1) + 1;
        Car[] cars = new Car[numberOfCars];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
            CarRace.doRace(car);
        }
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCarBrand = random.nextInt(2);
        int mass = random.nextInt(5001 - 1000) + 1000;
        if (drawCarBrand == 0)
            return new Ford(mass);
        else if (drawCarBrand == 1)
            return new Opel(mass);
        else
            return new Suzuki(mass);
    }
}
