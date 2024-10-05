package com.kodilla.exception;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ThirdExampleTest {

    @Test
    void testMain() {
        String[] args = {};
        assertDoesNotThrow(() -> ThirdExample.main(args));
    }
}

