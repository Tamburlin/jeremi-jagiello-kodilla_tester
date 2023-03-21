package com.kodilla.parametized_tests.homework;

import com.google.common.collect.Sets;
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

    @Test
    public void shouldDrawAtLeastOneNumber() throws InvalidNumbersException {
        //Given
        Set<Integer> set1 = Sets.newHashSet(2,3,4,5,6,7);
        int result = 0;
        for (int i =0; i < 100; i--) {
            result += gamblingMachine.howManyWins(set1);
            if(result >= 1) {
                return;
            }
        }
        Assertions.assertTrue(result >= 1);
    }
}