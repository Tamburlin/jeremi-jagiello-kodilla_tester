package com.kodilla.parametized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametized_tests.homework.PersonsSource#providePersonsForTestingBMI")
    public void ShouldReturnCorrectBMI(double height, double weight, String expectedBmi) {
        Person person = new Person(height,weight);
        assertEquals(expectedBmi, person.getBMI());
    }

}