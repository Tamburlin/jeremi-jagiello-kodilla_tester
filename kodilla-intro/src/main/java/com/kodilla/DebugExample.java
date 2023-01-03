package com.kodilla;


    public class DebugExample {
        public static void main(String [] args ) {
            int firstNumber = 11;
            int secondNumber = 22;
            Notebook notebook = new Notebook(600, 1000, 2015);
            System.out.println(notebook.weight + " " + notebook.price);
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYear();
            Notebook heavyNotebook = new Notebook(2000, 1500, 2047);
            System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
            heavyNotebook.checkPrice();
            heavyNotebook.checkWeight();
            heavyNotebook.checkYear();
            Notebook oldNotebook = new Notebook(1200, 500, 1988);
            System.out.println(oldNotebook.weight + " " + oldNotebook.price);
            oldNotebook.checkPrice();
            oldNotebook.checkWeight();
            oldNotebook.checkYear();

            System.out.println(firstNumber);
            System.out.println(secondNumber);

            if (notebook.price < 900){
                System.out.println("This book is cheap.");
            } else {
                System.out.println("This book is expensive.");
            }

            sumAndDisplay(firstNumber, secondNumber);
        }
        private static void sumAndDisplay(int a, int b) {
            int result = a + b;
            System.out.println(result);
        }
    }

