package com.kodilla.rest.domain;

public class BookDto {
    private String title;
    private String author;

    public BookDto(){

    }

    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }

    public String getAuthor() { return author; }

    public static int hashCode(BookDto bookDto) {

        return (bookDto.getAuthor().hashCode() + bookDto.getTitle().hashCode());
    }

    public static boolean equals(BookDto bookDto1, BookDto bookDto2) {
        if(hashCode(bookDto1) == hashCode(bookDto2)) {
            return true;
        }
        return false;
    }
}