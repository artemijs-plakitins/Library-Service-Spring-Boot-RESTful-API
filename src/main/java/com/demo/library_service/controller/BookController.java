package com.demo.library_service.controller;

import com.demo.library_service.model.Book;
import com.demo.library_service.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {

    private final BookService bookService;

    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks () {
        return  bookService.getBooks();
    }
}
