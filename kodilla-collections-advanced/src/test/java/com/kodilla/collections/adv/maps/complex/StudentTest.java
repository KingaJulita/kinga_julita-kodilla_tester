package com.kodilla.collections.adv.maps.complex;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testEqualsAndHashCode() {
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("John", "Doe");
        Student student3 = new Student("Jane", "Smith");

        assertEquals(student1, student2);
        assertNotEquals(student1, student3);
        assertEquals(student1.hashCode(), student2.hashCode());
        assertNotEquals(student1.hashCode(), student3.hashCode());
    }

    @Test
    public void testToString() {
        Student student = new Student("John", "Doe");
        assertEquals("Student{firstname='John', lastname='Doe'}", student.toString());
    }
}
