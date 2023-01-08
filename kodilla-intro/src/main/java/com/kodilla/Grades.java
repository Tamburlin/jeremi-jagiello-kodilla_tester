package com.kodilla;

public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size ==10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public int lastGrade() {
        System.out.println("Last added grade is: " + this.grades[this.size-1]);
        return this.grades[this.size-1];
    }
    public double averageGrade() {
        int average = 0;
        for (int i = 0; i<10; i++){
            average = average +this.grades[i];
        }
        average = average/this.size;
        System.out.println(average);
        return average;
    }
    public static void main(String[] args){
        Grades grades = new Grades();
        grades.add(1);
        grades.add(5);
        grades.add(3);
        grades.add(2);
        grades.add(1);
        int x = grades.lastGrade();
        System.out.println(x);
        grades.add(6);
        grades.add(4);
        grades.add(1);
        grades.add(6);
        grades.add(4);
        System.out.println("average grades = " +grades.averageGrade());
    }
}

