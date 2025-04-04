package com.demo.library_service.service;

import com.demo.library_service.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    public List<Book> getBooks () {
        return  List.of(
                new Book(
                        1L, "Harry Potter", "J.K Rowling", 25.60f, 10)
        );
    }
}
