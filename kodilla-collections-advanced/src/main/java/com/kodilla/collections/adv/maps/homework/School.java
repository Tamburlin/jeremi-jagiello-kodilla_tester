package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> listOfStudents = new ArrayList<>();

    public School(String schoolName, List<Integer> listOfStudents) {
        this.schoolName = schoolName;
        this.listOfStudents = listOfStudents;
    }


    public String getSchoolName() {
        return schoolName;
    }

    public List<Integer> getListOfStudents() {
        return listOfStudents;
    }

    public int getNumberOfStudents() {
        int numberOfStudents = 0;
        for (int i = 0; i < this.listOfStudents.size(); i++) {
            System.out.println(this.listOfStudents.get(i));
            numberOfStudents += this.listOfStudents.get(i);
        }
        return numberOfStudents;
    }
}
