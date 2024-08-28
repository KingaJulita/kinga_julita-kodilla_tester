package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Clock {

    private LocalTime time;

    public Clock() {
        this.time = LocalTime.now();
    }

    public LocalTime getTime() {
        return time;
    }
}
