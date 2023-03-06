package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Teacher magnus = new Teacher("Magnus");
        Teacher karl = new Teacher("Karl");
        Student jacob = new Student("Jacob", karl);
        Student adam = new Student("Adam", null);
        Student filip = new Student("Filip", magnus);
        Student donald = new Student("Donald", null);
        students.add(jacob);
        students.add(adam);
        students.add(filip);
        students.add(donald);
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.teacher);
            optionalTeacher.ifPresentOrElse(u -> System.out.println("Student: " + student.getName() + " Teacher: " + u.getTeacherName()),
                    () -> System.out.println("Student: " + student.getName() + " Teacher: <undefined>"));
        }
    }
}
