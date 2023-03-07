package com.kodilla.optional.homework;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void shouldAddTeacher() {
        Teacher teacher1 = new Teacher("1");
        assertEquals("1", teacher1.getTeacherName());
    }

    @Test
    public void shouldAddStudent() {
        Teacher teacher1 = new Teacher("1");
        Student nemo = new Student("1", teacher1);
        Student donald = new Student("Donald", null);
        assertEquals("1", nemo.getName());
        assertEquals("1", nemo.getTeacher().getTeacherName());
        assertNull(donald.getTeacher());
    }
}
