package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Skoda{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skoda skoda = (Skoda) o;
        return Double.compare(speed, skoda.speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
