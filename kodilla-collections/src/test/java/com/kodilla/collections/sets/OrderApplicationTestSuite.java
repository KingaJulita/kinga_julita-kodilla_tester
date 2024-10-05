package com.kodilla.collections.sets;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrderApplicationTestSuite {

    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        OrderApplication.main(new String[]{});

        String output = outputStream.toString();
        System.setOut(originalOut);

        assertTrue(output.contains("Order{orderNumber='1/2019', productName='Iron', quantity=1.0}"));
        assertTrue(output.contains("Order{orderNumber='2/2019', productName='Cutlery', quantity=6.0}"));
        assertTrue(output.contains("Order{orderNumber='3/2019', productName='Chair', quantity=2.0}"));
        assertEquals(3, output.split("Order").length - 1);
    }
}

