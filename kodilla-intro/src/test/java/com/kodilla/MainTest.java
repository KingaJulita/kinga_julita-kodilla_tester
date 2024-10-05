package com.kodilla;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testMainOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Main.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("Hello and welcome!"));
        assertTrue(output.contains("i = 1"));
        assertTrue(output.contains("i = 2"));
        assertTrue(output.contains("i = 3"));
        assertTrue(output.contains("i = 4"));
        assertTrue(output.contains("i = 5"));
    }
}
