package com.demo.library_service.repository;

import com.demo.library_service.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository
        extends JpaRepository<Book, Long> {
}
