package com.kodilla.exception;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserDialogsTest {

    @Test
    void testGetNumberOfRoundsValidInput() {
        String input = "5\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        int result = UserDialogs.getNumberOfRounds();
        assertEquals(5, result);
    }

    @Test
    void testGetNumberOfRoundsInvalidInput() {
        String input = "abc\n3\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        int result = UserDialogs.getNumberOfRounds();
        assertEquals(3, result);
    }

    public static class ThirdExampleTest {
    }
}
