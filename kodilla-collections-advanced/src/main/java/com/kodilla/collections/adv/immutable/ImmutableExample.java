package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book1 = new Book("John Steward", "The last chance");
        BookRecord bookRecord = new BookRecord("test", "testowa pozycja", 2023);
        System.out.println(book1);
        System.out.println("---------------------------");
        System.out.println(bookRecord);
    }
}
