package com.kodilla.collections.adv.maps.complex.homework;


import com.kodilla.collections.adv.maps.homework.SchoolDirectory;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SchoolDirectoryTest {

    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        SchoolDirectory.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("Dyrektor Castiel w szkole Drumstrang"));
        assertTrue(output.contains("Dyrektor Bobby w szkole Eton College"));
        assertTrue(output.contains("Dyrektor Dean w szkole Beauxbaton"));
        assertTrue(output.contains("Dyrektor Jack w szkole Elite Way School"));
    }
}
