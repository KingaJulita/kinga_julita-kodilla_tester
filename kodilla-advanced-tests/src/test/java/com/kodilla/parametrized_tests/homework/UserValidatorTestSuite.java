package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"validUser", "user.name", "user-name",
            "user_name123", "abc", "abc123", "12345", "user.name123"})
    public void shouldReturnTrueForValidUsernames(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"ab", "user name", "user@name.com", "user#name",
            "!username", "user%name", "user^name", "", "  ", "a b"})
    public void shouldReturnFalseForInvalidUsernames(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"firstname-lastname@example.com",
            "email@example.com", "125@example.com", "email@example.name", "email@subdomain.example.com"})
    public void shouldReturnTrueForValidEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "email.example.com", "email@example", "cfd..524@example.com",
            "email@email@example.com", "@example.com"})
    public void shouldReturnFalseForInvalidEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }
}
