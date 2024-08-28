package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class ClockTest {

    @Autowired
    private ApplicationContext applicationContext;

    @BeforeAll
    public static void startTests() {
        System.out.println("Starting tests...");
    }

    @AfterAll
    public static void endTests() {
        System.out.println("Ending tests...");
    }

    @Test
    public void testDifferentClockInstances() {
        Clock clock1 = applicationContext.getBean(Clock.class);
        Clock clock2 = applicationContext.getBean(Clock.class);

        System.out.println("Clock 1 time: " + clock1.getTime());
        System.out.println("Clock 2 time: " + clock2.getTime());

        if (!clock1.getTime().equals(clock2.getTime())) {
            System.out.println("The clocks have different times.");
        } else {
            System.out.println("The clocks have the same time.");
        }
    }
}
