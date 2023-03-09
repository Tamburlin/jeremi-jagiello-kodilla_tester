package com.kodilla.parametized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonsSource {

    static Stream<Arguments> providePersonsForTestingBMI() {
        return Stream.of(
                Arguments.of(1.75, 88.0,"Overweight"),
                Arguments.of(1.665, 44.6,"Underweight"),
                Arguments.of(1.53,40.0, "Underweight" ),
                Arguments.of(1.53, 150,"Obese Class VI (Hyper Obese)")
        );
    }
}
