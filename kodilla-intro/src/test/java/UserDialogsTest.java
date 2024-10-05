import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserDialogsTest {

    @Test
    public void testGetUsername() {
        String input = "John\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        String username = UserDialogs.getUsername();
        assertEquals("John", username);
    }

    @Test
    public void testGetUserSelection() {
        String input = "A\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        String selection = UserDialogs.getUserSelection();
        assertEquals("ADD", selection);
    }

    @Test
    public void testGetValue() {
        String input = "42\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int value = UserDialogs.getValue();
        assertEquals(42, value);
    }

    @Test
    public void testGetUserColor() {
        String input = "C\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        String color = UserDialogs.getUserColor();
        assertEquals("C", color);
    }
}
