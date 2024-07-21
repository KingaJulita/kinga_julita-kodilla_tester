package com.kodilla.collections.lists.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Toyota toyota = new Toyota(130);
        cars.add(toyota);
        cars.add(new Toyota(110));
        cars.add(new Toyota(100));
        cars.add(new Volvo(95));
        cars.add(new Volvo(120));
        cars.add(new Volvo(140));
        cars.add(new Skoda(90));

        cars.remove(toyota);
        cars.remove(4);

        Skoda skoda = new Skoda(90);
        cars.remove(skoda);

        System.out.println(cars.size());
        for (Car car : cars) {
            describeCar(car);
        }
    }
}