package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Test;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class CabrioTest {

    @Test
    void testGetCarType() {
        Car car = new Cabrio();
        assertEquals("Cabrio", car.getCarType());
    }

    @Test
    void testHeadlightsOnDuringNight() {
        Car car = new Cabrio();
        // Set the time to simulate night
        LocalTime nightTime = LocalTime.of(21, 0);
        assertTrue(car.hasHeadlightsTurnedOn());
    }
}
