package com.demo.library_service.controller;

import com.demo.library_service.model.Book;
import com.demo.library_service.service.BookService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping ("/new Book")
    public Book registerNewBook(
            @RequestParam String name,
            @RequestParam String author,
            @RequestParam float price,
            @RequestParam Integer quantity
    ) {
        Book book = new Book(name, author, price, quantity);
        return bookService.addNewBook(book);
    }
}