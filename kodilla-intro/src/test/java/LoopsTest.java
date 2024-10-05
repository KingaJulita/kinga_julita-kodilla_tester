import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopsTest {

    @Test
    public void testSumNumbers() {
        Loops loops = new Loops();
        int[] numbers = {1, 2, 3, 4, 5};
        int expectedSum = 15;
        int actualSum = loops.sumNumbers(numbers);
        assertEquals(expectedSum, actualSum);
    }
    @Test
    public void testMainOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Loops.main(new String[0]);

        System.setOut(originalOut);
        String output = outputStream.toString().trim();
        String expectedOutput = "0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
        assertEquals(expectedOutput.replaceAll("\\s+", ""), output.replaceAll("\\s+", ""));
    }
}
