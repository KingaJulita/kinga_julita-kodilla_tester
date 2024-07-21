package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Toyota implements Car {

    private double speed;

    public Toyota(double speed) {
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
        return speed -= 10;

    }

    @Override
    public String toString() {
        return "Toyota{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return Double.compare(speed, toyota.speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
