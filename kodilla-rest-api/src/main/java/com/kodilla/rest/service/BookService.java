package com.kodilla.rest.service;

import com.kodilla.rest.domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private List<BookDto> books = new ArrayList<>();

    public List<BookDto> getBooks() {
        return books;
    }

    public void addBook(BookDto bookDto) {
        books.add(bookDto);
    }

    public void removeBook(BookDto bookToRemove) {
        for(int i =0; i < books.size(); i++) {
            if(BookDto.equals(books.get(i), bookToRemove)) {
                books.remove(i);
                break;
            }
        }
    }
}