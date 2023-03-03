package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Suzuki;

import java.util.Random;

public class CarUtils {
    public static void describeCar (Car car) {
        System.out.println("-----------------------");
        System.out.println("Car brand: " + getCarBrand(car));
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
                return "Opel";
        else if (car instanceof Suzuki)
            return "Suzuki";
        else
            return "Unknown car Brand";
    }
}
