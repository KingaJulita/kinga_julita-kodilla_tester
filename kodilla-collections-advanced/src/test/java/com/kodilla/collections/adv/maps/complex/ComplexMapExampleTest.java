package com.kodilla.collections.adv.maps.complex;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ComplexMapExampleTest {

    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ComplexMapExample.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("Grades{grades=[5.0, 4.0, 4.5, 5.0, 5.0]}"));
        assertTrue(output.contains("John, average: 4.7"));
        assertTrue(output.contains("Jessie, average: 2.5"));
        assertTrue(output.contains("Bart, average: 4.2"));
    }
}
