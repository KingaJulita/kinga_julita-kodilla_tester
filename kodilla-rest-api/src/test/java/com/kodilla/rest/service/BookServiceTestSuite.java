package com.kodilla.rest.service;

import static org.junit.jupiter.api.Assertions.*;


import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    private BookService bookService;

    @BeforeEach
    void setUp() {
        bookService = new BookService();
    }

    @Test
    void testAddBook() {
        BookDto book = new BookDto("Title1", "Author1");
        bookService.addBook(book);

        List<BookDto> books = bookService.getBooks();
        assertEquals(1, books.size());
        assertEquals(book, books.get(0));
    }

    @Test
    void testRemoveBook() {
        BookDto book1 = new BookDto("Title1", "Author1");
        BookDto book2 = new BookDto("Title2", "Author2");
        bookService.addBook(book1);
        bookService.addBook(book2);

        bookService.removeBook(book1);

        List<BookDto> books = bookService.getBooks();
        assertEquals(1, books.size());
        assertEquals(book2, books.get(0));
    }

    @Test
    void testGetBooks() {
        BookDto book1 = new BookDto("Title1", "Author1");
        BookDto book2 = new BookDto("Title2", "Author2");
        bookService.addBook(book1);
        bookService.addBook(book2);

        List<BookDto> books = bookService.getBooks();
        assertEquals(2, books.size());
        assertTrue(books.contains(book1));
        assertTrue(books.contains(book2));
    }
}
