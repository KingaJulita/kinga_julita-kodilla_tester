package com.kodilla.collections.sets.homework;


import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StampApplicationTestSuite {

    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        StampApplication.main(new String[]{});

        String output = outputStream.toString();
        System.setOut(originalOut);

        assertTrue(output.contains("Stamp{stampHeight=5.0, stampName='Poczta lotnicza', stampWidth=5.0, stampMarked='true'}"));
        assertTrue(output.contains("Stamp{stampHeight=10.0, stampName='Poczta balonowa', stampWidth=10.0, stampMarked='true'}"));
        assertTrue(output.contains("Stamp{stampHeight=10.0, stampName='Poczta sterowcowa', stampWidth=10.0, stampMarked='false'}"));
        assertTrue(output.contains("Stamp{stampHeight=10.0, stampName='Poczta szybowcowa', stampWidth=15.0, stampMarked='true'}"));
        assertEquals(4, output.split("Stamp").length - 1);
    }
}
