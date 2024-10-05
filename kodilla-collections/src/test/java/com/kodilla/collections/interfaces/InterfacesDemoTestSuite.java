package com.kodilla.collections.interfaces;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class InterfacesDemoTestSuite {

    @Test
    public void testShowShapeDetails() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        InterfacesDemo.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("100.0"));
        assertTrue(output.contains("153.938"));
        assertTrue(output.contains("12.0"));
    }
}
