import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    @Test
    public void testLeapYearOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        LeapYear.main(new String[]{});

        System.setOut(originalOut);

        String output = outputStream.toString();

        assertTrue(output.contains("366"));
        assertTrue(output.contains("365"));
        assertTrue(output.contains("This is leap year"));
    }
}
