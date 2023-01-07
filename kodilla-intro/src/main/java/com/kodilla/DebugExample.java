package com.kodilla;


    public class DebugExample {
        public static void main(String [] args ) {
            Notebook notebook = new Notebook(600, 1000, 2015);
            Notebook heavyNotebook = new Notebook(2000, 1500, 2047);
            Notebook oldNotebook = new Notebook(1200, 500, 1988);

            displayNotebookParameters(notebook);
            displayNotebookParameters(heavyNotebook);
            displayNotebookParameters(oldNotebook);
        }

        private static void displayNotebookParameters(Notebook notebook) {
            System.out.println(notebook.weight + " " + notebook.price);
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYear();
        }
    }