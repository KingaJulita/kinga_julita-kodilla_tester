package com.kodilla.collections.adv.maps;


import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicMapExampleTest {

    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        BasicMapExample.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("5.0"));
        assertTrue(output.contains("Grade of Mathematics is equal to 5.0"));
        assertTrue(output.contains("Grade of Physics is equal to 4.5"));
        assertTrue(output.contains("Grade of Philosophy is equal to 4.0"));
    }

    @Test
    public void testGradesMap() {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        assertEquals(5.0, grades.get("Mathematics"));
        assertEquals(4.5, grades.get("Physics"));
        assertEquals(4.0, grades.get("Philosophy"));
    }
}
