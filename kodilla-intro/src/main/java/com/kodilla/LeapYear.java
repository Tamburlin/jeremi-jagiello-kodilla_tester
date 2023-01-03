package com.kodilla;

public class LeapYear {
    public static void main(String[] args) {
        boolean checkYear = leap(2137);
        System.out.println(checkYear);
    }

    static boolean leap(int a) {
        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}