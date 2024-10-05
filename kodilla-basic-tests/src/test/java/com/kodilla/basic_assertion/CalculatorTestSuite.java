package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testPow() {
        Calculator calculator = new Calculator();
        int a = 5;
        int powResult = calculator.pow(a);
        assertEquals(25,powResult,0.01);
    }

    @Test
    public void testPowWithZero() {
        Calculator calculator = new Calculator();
        int result = calculator.pow(0);
        assertEquals(0, result);
    }

    @Test
    public void testPowWithNegativeNumber() {
        Calculator calculator = new Calculator();
        int result = calculator.pow(-5);
        assertEquals(25, result);
    }
    @Test
    public void shouldReturnCorrectSumResult() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(5, 8);
        assertTrue(ResultChecker.assertEquals(13, result));
    }

}