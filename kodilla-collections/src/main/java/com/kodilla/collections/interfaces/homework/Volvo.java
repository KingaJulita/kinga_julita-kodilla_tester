package com.kodilla.collections.interfaces.homework;

public class Volvo implements Car {

    private double speed;

    public Volvo(double speed) {
        this.speed = speed;
    }


    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double increaseSpeed() {
        return speed += 15;
    }

    @Override
    public double decreaseSpeed() {
        return speed -= 15;
    }
}
