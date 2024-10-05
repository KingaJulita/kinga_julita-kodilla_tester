package com.kodilla.collections.adv.immutable;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImmutableExampleTest {

    @Test
    public void testMainMethod() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        ImmutableExample.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("Author: test"));
        assertTrue(output.contains("Title: testowa pozycja"));
        assertTrue(output.contains("Year: 2022"));
    }
}
