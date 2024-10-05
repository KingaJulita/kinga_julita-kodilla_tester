package com.kodilla.collections.lists;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneralShapesListApplicationTest {

    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        GeneralShapesListApplication.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("0")); // Oczekujemy, że wynik będzie zawierał "0"
    }
}

