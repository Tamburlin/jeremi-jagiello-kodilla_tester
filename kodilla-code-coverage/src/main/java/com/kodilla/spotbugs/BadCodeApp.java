package com.kodilla.spotbugs;

public class BadCodeApp {
    public static void main(String[] args) {
        BadCodeExample badCodeExample = new BadCodeExample();
        BadCodeExample o = new BadCodeExample();
        System.out.println(badCodeExample.equals(o));
    }
}
