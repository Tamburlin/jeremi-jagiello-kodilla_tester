package com.kodilla;
import java.util.Scanner;

public class Colors {
    public static String userColor(){
       Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("Can you type the First letter of you favorite color?");
           String color = scanner.nextLine().trim().toUpperCase();
           switch (color) {
               case "Y" : return "Yellow";
               case "G" : return "Green";
               case "B" : return "Blue";
               case "V" : return "Violet";
               case "R" : return "Red";
               case "O" : return "Orange";
               case "W" : return "White";
               case "P" : return "Pink";
               default: return "I'm sorry Dave, but there is no such color in my database, try again";
           }
       }
    }
    public static void main(String[] args){
        String answer = userColor();
        System.out.println("So your favorite color is: " + answer + ".");

    }
}
