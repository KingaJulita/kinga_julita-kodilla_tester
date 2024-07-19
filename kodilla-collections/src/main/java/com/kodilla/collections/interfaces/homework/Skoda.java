package com.kodilla.collections.interfaces.homework;

public class Skoda implements Car {

    private double speed;

    public Skoda(double speed) {
        this.speed = speed;
    }


    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed += 10;
    }

    @Override
    public double decreaseSpeed() {
        return speed -= 15;
    }
}
