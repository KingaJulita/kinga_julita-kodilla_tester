package com.kodilla.collections.adv.immutable.homework;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordTest {

    @Test
    public void testRecordFields() {
        Record record = new Record("Math Homework", 60);
        assertEquals("Math Homework", record.title());
        assertEquals(60, record.duration());
    }
}
