package com.kodilla.rest.domain;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookDtoTest {

    @Test
    public void testConstructorAndGetters() {
        BookDto bookDto = new BookDto("The Great Gatsby", "F. Scott Fitzgerald");
        assertEquals("The Great Gatsby", bookDto.getTitle());
        assertEquals("F. Scott Fitzgerald", bookDto.getAuthor());
    }

    @Test
    public void testDefaultConstructor() {
        BookDto bookDto = new BookDto();
        assertNull(bookDto.getTitle());
        assertNull(bookDto.getAuthor());
    }

    @Test
    public void testEqualsAndHashCode() {
        BookDto book1 = new BookDto("1984", "George Orwell");
        BookDto book2 = new BookDto("1984", "George Orwell");
        BookDto book3 = new BookDto("Animal Farm", "George Orwell");

        assertEquals(book1, book2);
        assertNotEquals(book1, book3);
        assertEquals(book1.hashCode(), book2.hashCode());
        assertNotEquals(book1.hashCode(), book3.hashCode());
    }
}
