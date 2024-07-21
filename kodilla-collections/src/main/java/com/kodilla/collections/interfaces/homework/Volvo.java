package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Volvo{" +
                "speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volvo volvo = (Volvo) o;
        return Double.compare(speed, volvo.speed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(speed);
    }
}
