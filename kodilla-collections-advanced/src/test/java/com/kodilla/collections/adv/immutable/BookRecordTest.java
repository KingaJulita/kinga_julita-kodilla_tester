package com.kodilla.collections.adv.immutable;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRecordTest {

    @Test
    public void testBookRecordFields() {
        BookRecord bookRecord = new BookRecord("George Orwell", "1984", 1949);
        assertEquals("George Orwell", bookRecord.author());
        assertEquals("1984", bookRecord.title());
        assertEquals(1949, bookRecord.year());
    }
}
