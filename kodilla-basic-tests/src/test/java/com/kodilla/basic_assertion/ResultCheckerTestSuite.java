package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ResultCheckerTestSuite {

    @Test
    public void shouldReturnTrueForEqualValues() {
        assertTrue(ResultChecker.assertEquals(5, 5));
    }

    @Test
    public void shouldReturnFalseForDifferentValues() {
        assertFalse(ResultChecker.assertEquals(5, 8));
    }
}

