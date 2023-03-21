package com.kodilla.parametized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTest {

    Set<Integer> numbers = new HashSet<>();
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/validGamblingMachineNumbers.csv", numLinesToSkip = 0, delimiter = ':')
    public void shouldCorrectlyValidateNumbers(String stringNumbers) {
        // given
        String[] strings = stringNumbers.split(",");

        for (String el : strings) {
            numbers.add(Integer.valueOf(el));
        }
        // when
        // then
        assertDoesNotThrow(() -> gamblingMachine.howManyWins(numbers));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/nonValidGamblingMachineNumbers.csv", numLinesToSkip = 0, delimiter = ':')
    public void shouldThrowException(String stringNumbers) {
        // given
        String[] strings = stringNumbers.split(",");

        for (String el : strings) {
            numbers.add(Integer.valueOf(el));
        }
        // when
        // then
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
}