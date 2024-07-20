package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

public class CarUtils {
    public static void describeCar (Car car) {
        System.out.println("____________");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car increase speed:" + car.increaseSpeed());
    }

    private static String getCarBrand( Car car) {
        if (car instanceof Skoda)
            return "Skoda";
        else if (car instanceof Volvo)
            return "Volvo";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car brand";
    }
}
