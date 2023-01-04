package com.kodilla;

public class User {
    String name;
    String surename;
    int age;
    String job;

    public User(String name, String surename, int age, String job) {
        this.name = name;
        this.surename = surename;
        this.age = age;
        this.job = job;
    }


    public static void main(String[] args) {
        User johny = new User("Johny", "Silverhand", 490, "Terrorist/Musician");
        User jan = new User("Jan", "Pawel", 14, "Pope");
        User adam = new User("Adam", "Nowak", 33, "Baker");
        User john = new User("John", "Doe", 15, "Student");
        User[] users = {johny, jan, adam};
        int usersLength = users.length;
        int result = 0;
        for (int i = 0; i < usersLength; i++) {
            result = result + users[i].age;
        }
        int average = result / usersLength;
        for (int i = 0; i < usersLength; i++) {
            if (users[i].age < average) {
                System.out.println(users[i].name);
            }
        }
    }
}

