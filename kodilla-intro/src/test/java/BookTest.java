import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BookTest {

    @Test
    void testBookCreation() {
        Book book = Book.of("Henryk Sienkiewicz", "Ogniem i mieczem");
        assertEquals("Henryk Sienkiewicz", book.getAuthor());
        assertEquals("Ogniem i mieczem", book.getTitle());
    }

    @Test
    void testBookOutput() {
        Book book = Book.of("Juliusz Słowacki", "Kordian");
        String expectedOutput = "Autorem książki " + book.getTitle() + " jest " + book.getAuthor();
        assertEquals("Autorem książki Kordian jest Juliusz Słowacki", expectedOutput);
    }
}
