package com.kodilla;

public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void applicationCheck() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm.");
            } else {
                System.out.println("User is 30 (or younger) and/or 160 tall (or shorter).");
            }
        }
    }

    public static void main(String[] args) {
        Application Mister1 = new Application("Adam", 40.5, 178);
        Mister1.applicationCheck();
        }
}