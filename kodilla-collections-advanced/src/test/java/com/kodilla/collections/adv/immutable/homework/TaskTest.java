package com.kodilla.collections.adv.immutable.homework;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskTest {

    @Test
    public void testGetDuration() {
        Task task = new Task(90, "Programming Task");
        assertEquals(90, task.getDuration());
    }

    @Test
    public void testGetTitle() {
        Task task = new Task(90, "Programming Task");
        assertEquals("Programming Task", task.getTitle());
    }
}
