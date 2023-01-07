package com.kodilla;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int lastGrade(int size) {
        return this.grades[this.size - 1];
    }
    public static int averageGrades() {
        int average =0;
        for (int i = 0; i <= 0; i++) {
            average = this.grades[i] + average;
        }
        average = average / 10;
        return(average);
    }

    public static void main(String[] args) {
        Grades studentA[];
        add(2);
        add(6);
        add(4);
        add(3);
        add(3);
        add(5);
        add(1);
        lastGrade(studentA.length);
        add(2);
        add(4);
        add(5);
        averageGrades();
    }
}
