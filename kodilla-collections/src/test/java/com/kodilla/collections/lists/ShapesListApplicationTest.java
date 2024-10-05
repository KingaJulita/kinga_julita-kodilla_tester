package com.kodilla.collections.lists;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShapesListApplicationTest {

    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ShapesListApplication.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("Square{width=10.0}, area: 100.0"));
        assertTrue(output.contains("Square{width=5.0}, area: 25.0"));
    }
}
