package com.kodilla.collections.adv.maps.complex;


import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradesTest {

    @Test
    public void testGetAverage() {
        Grades grades = new Grades(List.of(5.0, 4.0, 4.5, 5.0, 5.0));
        assertEquals(4.7, grades.getAverage(), 0.01);
    }

    @Test
    public void testToString() {
        Grades grades = new Grades(List.of(5.0, 4.0, 4.5));
        assertEquals("Grades{grades=[5.0, 4.0, 4.5]}", grades.toString());
    }
}
