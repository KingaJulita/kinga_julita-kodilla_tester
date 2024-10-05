import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamesTest {

    @Test
    public void testNamesOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Names.main(new String[]{});

        System.setOut(originalOut);
        String output = outputStream.toString().trim();

        String[] expectedNames = {"Maria", "Teresa", "Olga", "Iwona"};
        String expectedOutput = String.join(System.lineSeparator(), expectedNames);

        assertEquals(expectedOutput, output);
    }
}
