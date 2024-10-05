import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleArrayTest {

    @Test
    public void testMainMethodOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        SimpleArray.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString();

        assertTrue(output.contains("5"));
    }
}


