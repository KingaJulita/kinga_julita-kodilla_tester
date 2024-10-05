package com.kodilla.collections.lists.homework;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarsListApplicationTestSuite {

    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        CarsListApplication.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("4"));
        assertTrue(output.contains("Car brand: Toyota"));
        assertTrue(output.contains("Car increase speed:125.0"));
        assertTrue(output.contains("Car increase speed:115.0"));
        assertTrue(output.contains("Car brand: Volvo"));
        assertTrue(output.contains("Car increase speed:110.0"));
        assertTrue(output.contains("Car increase speed:135.0"));
    }
}
