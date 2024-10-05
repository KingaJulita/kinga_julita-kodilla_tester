package com.kodilla.collections.adv.maps.complex.homework;


import com.kodilla.collections.adv.maps.homework.School;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolTest {

    @Test
    public void testGetTotalStudents() {
        School school = new School("High School", 5, List.of(30, 25, 28, 22, 27));

        assertEquals(132, school.getTotalStudents());
    }
}
