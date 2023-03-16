/* package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookControllerTestNoHTTP {

    @Test
    public void shouldFetchBooks() {

        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title1", "Author1"));
        bookList.add(new BookDto("Title2", "Author2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);

        List<BookDto> result = bookController.getBooks();

        assertThat(result).hasSize(2);
    }

    @Test
    void shouldAddBooks() throws Exception {
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto bookDto1 = new BookDto("Title1", "Author1");
        List<BookDto> bookList = new ArrayList<>();

        bookServiceMock.addBook(bookDto1);
        bookController.addBook(bookDto1);
        Mockito.when(bookServiceMock.addBook(bookDto1).thenReturn(bookDto1);

        List<BookDto> result = bookController.getBooks();

  assertEquals(result.get(0), bookDto1);



    }
    }
 */