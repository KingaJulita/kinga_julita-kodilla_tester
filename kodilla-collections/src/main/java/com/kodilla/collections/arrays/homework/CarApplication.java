package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Skoda;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Volvo;

import java.util.Random;

public class CarApplication {
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] car = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < car.length; n++)
            car[n] = drawCar();
        for (Car car1 : car)
            CarUtils.describeCar(car1);
    }

    public static Car drawCar() {
        int drawnCarBrand = RANDOM.nextInt(3);
        double a = getRandomIncreaseSpeed();
        if (drawnCarBrand == 0)
            return new Skoda(a);
        else if (drawnCarBrand == 1)
            return new Volvo(a);
        else
            return new Toyota(a);
    }

    public static double getRandomIncreaseSpeed() {
        return RANDOM.nextDouble() * 60 +1;
    }
}
