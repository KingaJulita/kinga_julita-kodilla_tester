package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarConfigurationTestSuite {

    @Autowired
    private Car car;

    @BeforeAll
    public static void startTests() {
        System.out.println("Starting tests...");
    }

    @AfterAll
    public static void endTests() {
        System.out.println("Ending tests...");
    }

    @Test
    public void testCarBean() {
        String carType = car.getCarType();

        if (car instanceof SUV) {
            assertEquals("SUV", carType);
        } else if (car instanceof Cabrio) {
            assertEquals("Cabrio", carType);
        } else if (car instanceof Sedan) {
            assertEquals("Sedan", carType);
        }
    }

    @Test
    public void testHeadlightsOn() {
        boolean headlightsOn = car.hasHeadlightsTurnedOn();
        LocalTime now = LocalTime.now();

        if (now.isAfter(LocalTime.of(20, 0)) || now.isBefore(LocalTime.of(6, 0))) {
            assertTrue(headlightsOn);
        } else {
            assertFalse(headlightsOn);
        }
    }
}
