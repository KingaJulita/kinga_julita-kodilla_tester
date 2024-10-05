import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DebugExampleTest {

    @Test
    public void testSumAndDisplay() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        DebugExample.sumAndDisplay(10, 20);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertEquals("30", output);
    }

    @Test
    public void testSubtractAndDisplay() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        DebugExample.subtractAndDisplay(22, 11);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertEquals("11", output);
    }
}

