package com.kodilla.spring.basic.spring_configuration.homework;


import org.junit.jupiter.api.Test;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class SUVTest {

    @Test
    void testGetCarType() {
        Car car = new SUV();
        assertEquals("SUV", car.getCarType());
    }

    @Test
    void testHeadlightsOnDuringNight() {
        Car car = new SUV();
        // Simulate night
        assertTrue(car.hasHeadlightsTurnedOn());
    }
}
