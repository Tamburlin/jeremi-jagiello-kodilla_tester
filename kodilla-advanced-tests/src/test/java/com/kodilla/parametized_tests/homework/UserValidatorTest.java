package com.kodilla.parametized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    private  UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"xXxNoob_Slayer69.-xXx", "Michai_Biaukov3", "III"})
    public void shouldReturnTrueIfStringInRegex( String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "::Adolfino", "Adam Miłosz", "łłłł", "Filip Dupa", "II"})
    public void shouldReturnFalseIfStringNotInRegex( String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Adam.malysz@gmail.com.pl", "adam@gmail.com", "adam.malysz@com.pl",""})
    public void shouldReturnTrueIfStringMatchesRegex(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Adam@gmailcom", " ", "null","KaczkaDziwaczka.gmail.com"})
    public void shouldReturnFalseIfStringDoesNotMatchesRegex(String email) {
        assertFalse(validator.validateEmail(email));
    }

}