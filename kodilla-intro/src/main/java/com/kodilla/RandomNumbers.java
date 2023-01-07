package com.kodilla;

import java.util.Random;

public class RandomNumbers {
    static int min = 30;
    static int max = 0;

    public static void main(String[] args) {
        RandomNumbers randomnumbers = new RandomNumbers();
        randomnumbers.rand();
    }

    public void rand() {
        int sum = 0;
        int randomN;
        int roof = 5000;
        Random random = new Random();
        while (sum < roof) {
            //  randomN = (int) Math.floor(Math.random() * (max - min + 1) + min);
            int temp = random.nextInt(31);
            randMin(temp);
            randMax(temp);
            System.out.println(temp);
            sum = sum + temp;
        }
    }

    public int randMin(int number) {
        if (number < min) {
            min = number;
        }
        return min;
    }

    public int randMax(int number) {
        if (number > max) {
            max = number;
        }
        return max;
    }
}