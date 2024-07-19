package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Toyota toyota = new Toyota(100.0);
        doRace(toyota);

        Volvo volvo = new Volvo(110);
        doRace(volvo);

        Skoda skoda = new Skoda(90);
        doRace(skoda);
    }

    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed());
    }
}