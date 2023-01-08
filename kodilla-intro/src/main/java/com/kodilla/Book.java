package com.kodilla;

public class Book {
    private String author = "Isaac Asimov";
    private String title = "Foundation";
    public static Book of(){
        return new Book();
    }
    public static void main(String[] args) {
        Book book = Book.of();
        System.out.println(book.author + " " + book.title);
    }
}
