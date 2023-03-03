package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        cars.add(new Suzuki(1500));
        cars.add(new Opel(1400));
        cars.add(new Ford(1800));

        System.out.println(cars.size());
        for( Car car : cars) {
            CarUtils.describeCar(car);
            CarRace.doRace(car);
        }

        cars.remove(1);
        Ford ford = new Ford(1800);
        cars.remove(ford);
        System.out.println(cars.size());
        for(Car car : cars) {
            CarUtils.describeCar(car);
            CarRace.doRace(car);
        }
    }
}
