package com.kodilla;

public class RandomNumbers {
    public static void main(String[] args) {
        randMax();
    }

    public static void rand() {
        int min = 0;
        int max = 30;
        int sum = 0;
        int randomN;
        int roof = 5000;
        while (sum < roof) {
            randomN = (int) Math.floor(Math.random() * (max - min + 1) + min);
            sum = sum + randomN;
        }
    }

    public static void randMin() {
        int min = 0;
        int max = 30;
        int sum = 0;
        int randomN;
        int minimalHelper = 1;
        int roof = 5000;
        while (sum < roof) {
            randomN = (int) Math.floor(Math.random() * (max - min + 1) + min);
            sum = sum + randomN;
            if (randomN < minimalHelper) {
                minimalHelper = randomN;
            }
        }
        System.out.println(minimalHelper);
    }

    public static void randMax() {
        int min = 0;
        int max = 30;
        int sum = 0;
        int randomN;
        int maxHelper = 1;
        int roof = 5000;
        while (sum < roof) {
            randomN = (int) Math.floor(Math.random() * (max - min + 1) + min);
            sum = sum + randomN;
            if (randomN > maxHelper) {
                maxHelper = randomN;
            }
        }
        System.out.println(maxHelper);
    }
}
