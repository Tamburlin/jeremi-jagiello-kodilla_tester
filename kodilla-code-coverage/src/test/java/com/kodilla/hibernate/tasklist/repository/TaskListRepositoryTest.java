package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListRepositoryTest {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String DESCRIPTION = "Password : PERCH";
    private static final String NAME = "PERCH";

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList(NAME , DESCRIPTION);
        taskListRepository.save(taskList);

        //When
        List<TaskList> readTaskList = taskListRepository.findByListName(NAME);

        //Then
        Assertions.assertEquals(1, readTaskList.size());

        //CleanUp
        taskListRepository.delete(taskList);
    }
}