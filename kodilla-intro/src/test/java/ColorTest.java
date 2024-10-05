import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class ColorTest {

    @Test
    public void testBurguntColor() {
        setInput("B");
        Color.main(new String[]{});
    }

    @Test
    public void testCzarnyColor() {
        setInput("C");
        Color.main(new String[]{});
    }

    @Test
    public void testHebanowyColor() {
        setInput("H");
        Color.main(new String[]{});
    }

    @Test
    public void testPopielatyColor() {
        setInput("P");
        Color.main(new String[]{});
    }

    @Test
    public void testInvalidColor() {
        setInput("X");
        Color.main(new String[]{});
    }

    private void setInput(String input) {
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
    }
}

