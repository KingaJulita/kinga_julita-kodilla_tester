package com.kodilla.collections.sets.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StampTestSuite {

    @Test
    public void testStampEquality() {
        // Given
        Stamp stamp1 = new Stamp("Poczta lotnicza", 5, 5, true);
        Stamp stamp2 = new Stamp("Poczta lotnicza", 5, 5, true);
        Stamp stamp3 = new Stamp("Poczta balonowa", 10, 10, false);

        // When & Then
        assertEquals(stamp1, stamp2);
        assertNotEquals(stamp1, stamp3);
    }

    @Test
    public void testHashCode() {
        // Given
        Stamp stamp1 = new Stamp("Poczta lotnicza", 5, 5, true);
        Stamp stamp2 = new Stamp("Poczta lotnicza", 5, 5, true);
        Stamp stamp3 = new Stamp("Poczta balonowa", 10, 10, false);

        // When & Then
        assertEquals(stamp1.hashCode(), stamp2.hashCode());
        assertNotEquals(stamp1.hashCode(), stamp3.hashCode());
    }

    @Test
    public void testToString() {
        // Given
        Stamp stamp = new Stamp("Poczta lotnicza", 5, 5, true);

        // When
        String result = stamp.toString();

        // Then
        assertTrue(result.contains("stampName='Poczta lotnicza'"));
        assertTrue(result.contains("stampWidth=5.0"));
        assertTrue(result.contains("stampHeight=5.0"));
        assertTrue(result.contains("stampMarked='true'"));
    }
}
