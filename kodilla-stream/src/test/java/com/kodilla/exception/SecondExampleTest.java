package com.kodilla.exception;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondExampleTest {

    @Test
    void testMain() {
        String input = "5\n";
        System.setIn(new java.io.ByteArrayInputStream(input.getBytes()));
        String[] args = {};
        assertDoesNotThrow(() -> SecondExample.main(args));
    }
}
