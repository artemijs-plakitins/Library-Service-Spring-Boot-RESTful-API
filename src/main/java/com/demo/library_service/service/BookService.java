package com.demo.library_service.service;

import com.demo.library_service.model.Book;
import com.demo.library_service.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    // Implementing BookRepository via constructor
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Returns all the books from repository
    public List<Book> getBooks () {
        return bookRepository.findAll();
    }

    // Adding new book if it's not exists (checking by Name)
    public Book addNewBook(Book book) {
        Optional<Book> bookOptional =
                bookRepository.findBookByName(book.getName());
        if (bookOptional.isPresent()) {
            throw  new IllegalStateException("Book Exists");
        }
        System.out.println("Book is saved");
        return bookRepository.save(book);
    }
}