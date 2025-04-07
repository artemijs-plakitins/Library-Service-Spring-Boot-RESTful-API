package com.demo.library_service.service;

import com.demo.library_service.model.Book;
import com.demo.library_service.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks () {
        return bookRepository.findAll();
    }
}
