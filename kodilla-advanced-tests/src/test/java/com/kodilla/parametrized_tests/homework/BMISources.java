package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMISources {

    public static Stream<Arguments> dataBMIProvide() {
        return Stream.of(
                Arguments.of(1.60, 45, "Underweight"),
                Arguments.of(1.70, 70, "Normal (healthy weight)"),
                Arguments.of(1.80, 90, "Overweight"),
                Arguments.of(1.75, 110, "Obese Class II (Severely obese)"),
                Arguments.of(1.65, 130, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.60, 160, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.60, 200, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.60, 250, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.60, 300, "Obese Class VI (Hyper Obese)")
        );
    }
}