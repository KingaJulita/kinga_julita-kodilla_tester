package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car {

    @Override
    public String getCarType() {
        return "Sedan";
    }

    @Override
    public boolean hasHeadlightsTurnedOn() {
        LocalTime now = LocalTime.now();
        if (now.isAfter(LocalTime.of(20, 0)) ||
                now.isBefore(LocalTime.of(6, 0))) {
            return true;
        } else {
            return false;
        }
    }
}
