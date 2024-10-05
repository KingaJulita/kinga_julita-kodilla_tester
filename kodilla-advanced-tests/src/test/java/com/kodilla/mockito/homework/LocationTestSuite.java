package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LocationTestSuite {

    @Test
    public void testLocationEquality() {
        Location location1 = new Location("New York");
        Location location2 = new Location("New York");
        Location location3 = new Location("Los Angeles");

        assertEquals(location1, location2);
        assertNotEquals(location1, location3);
    }

    @Test
    public void testLocationHashCode() {
        Location location1 = new Location("New York");
        Location location2 = new Location("New York");

        assertEquals(location1.hashCode(), location2.hashCode());
    }

    @Test
    public void testGetName() {
        Location location = new Location("New York");
        assertEquals("New York", location.getName());
    }
}
