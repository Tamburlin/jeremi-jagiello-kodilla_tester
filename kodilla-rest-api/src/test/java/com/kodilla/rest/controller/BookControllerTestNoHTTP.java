package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTestNoHTTP {

    private BookService bookServiceMock;
    private BookController bookController;
    private List<BookDto> bookDtoList;

    @BeforeEach
    public void setup() {
        bookServiceMock = Mockito.mock(BookService.class);
        bookController = new BookController(bookServiceMock);
        bookDtoList = new ArrayList<>();
    }

    @Test
    void shouldFetchBooks() {
        //given
        bookDtoList.add(new BookDto("Title 1", "Author 1"));
        bookDtoList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookDtoList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldAddBook() {
        //given
        BookDto bookDto = new BookDto("Title 1", "Author 1");

        //when
        bookController.addBook(bookDto);

        //then
        Mockito.verify(bookServiceMock, Mockito.times(1)).addBook(bookDto);
    }
}