package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GamblingMachineTestSuite {

    private GamblingMachine machine = new GamblingMachine();


    @ParameterizedTest
    @CsvFileSource(resources = "/dataTestGamblingMachine.csv", numLinesToSkip = 1)
    public void shouldThrowInvalidNumbersExceptionForInvalidData(String userNumbers) {
        Set<Integer> userNumbersSet = Arrays.stream(userNumbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());

        if (userNumbersSet.size() != 6 || userNumbersSet.stream().anyMatch(number -> number < 1 || number > 49)) {
            assertThrows(InvalidNumbersException.class, () -> machine.howManyWins(userNumbersSet));
        }
    }
}