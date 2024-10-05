import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class HelloWorldTest {

    @Test
    public void testOutput() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        HelloWorld.main(new String[]{});

        System.setOut(originalOut);
        String[] expectedOutput = {"Kinga", "K", "28"};
        String[] actualOutput = outputStream.toString().trim().split(System.lineSeparator());

        assertArrayEquals(expectedOutput, actualOutput);
    }
}
