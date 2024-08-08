package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    private Person person;

    @ParameterizedTest
    @MethodSource("com.kodilla.parametrized_tests.homework.BMISources#dataBMIProvide")
    public void shouldReturnCorrectCategoryBMI(double heightInMeters, double weightInKilogram, String expectedCategory) {
        person = new Person(heightInMeters, weightInKilogram);
        String result = person.getBMI();
        assertEquals(expectedCategory, result, "The BMI category is not as expected.");
    }
}