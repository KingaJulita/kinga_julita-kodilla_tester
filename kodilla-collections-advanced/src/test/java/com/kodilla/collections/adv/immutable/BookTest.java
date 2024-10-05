package com.kodilla.collections.adv.immutable;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void testGetAuthor() {
        Book book = new Book("J.K. Rowling", "Harry Potter");
        assertEquals("J.K. Rowling", book.getAuthor());
    }

    @Test
    public void testGetTitle() {
        Book book = new Book("J.K. Rowling", "Harry Potter");
        assertEquals("Harry Potter", book.getTitle());
    }
}
