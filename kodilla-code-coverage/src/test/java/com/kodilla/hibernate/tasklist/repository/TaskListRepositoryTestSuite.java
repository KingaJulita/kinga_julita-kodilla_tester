package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {

    @Autowired
    private TaskListRepository taskListRepository;

    private static final String LISTNAME = "Test List";
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testFindByListName() {
        // Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListRepository.save(taskList);

        // When
        List<TaskList> result = taskListRepository.findByListName(LISTNAME);

        // Then
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(LISTNAME, result.get(0).getListName());
        Assertions.assertEquals(DESCRIPTION, result.get(0).getDescription());

        // Clean up
        taskListRepository.deleteById(result.get(0).getId());
    }
}
