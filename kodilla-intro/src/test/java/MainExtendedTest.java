import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainExtendedTest {

    @Test
    public void testMainExtendedOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        MainExtended.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        assertTrue(output.contains("Julita"));
        assertTrue(output.contains("28"));
        assertTrue(output.contains("1.58"));
        assertTrue(output.contains("B"));
        assertTrue(output.contains("true"));
        assertTrue(output.contains("true"));
    }
}

