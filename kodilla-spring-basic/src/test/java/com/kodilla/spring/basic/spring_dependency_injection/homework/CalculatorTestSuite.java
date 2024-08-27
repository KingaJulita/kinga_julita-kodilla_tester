package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTestSuite {

    private Calculator calculator;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Starting all tests...");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests completed.");
    }

    @BeforeEach
    public void setUp() {
        Display display = new Display();
        calculator = new Calculator(display);
    }

    @Test
    public void testAdd() {
        double result = calculator.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        double result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(20, 4);
        assertEquals(5, result);
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}

