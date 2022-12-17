package com.kodilla;

public class LeapYear {
    public static void main(String[] args) {
         boolean leap(int a) {
            boolean result;
            if (a%4 ==0) {
                if (a%100 == 0){
                    if (a%400== 0){
                        result = true;
                        return result;
                    }
                }
            } else {
                result = false;
                return result;
            }
        }
        boolean checkYear = leap(2137);
        System.out.println(checkYear);
    }
}
