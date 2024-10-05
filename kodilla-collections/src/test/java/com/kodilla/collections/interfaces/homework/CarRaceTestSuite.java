package com.kodilla.collections.interfaces.homework;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class CarRaceTestSuite {

    @Test
    public void testCarRaceOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        CarRace.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("115.0"));
        assertTrue(output.contains("125.0"));
        assertTrue(output.contains("100.0"));
    }
}
