package com.demo.library_service.config;

import com.demo.library_service.model.Book;
import com.demo.library_service.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {

    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Book book1 = new Book("Clean Code", "Robert C. Martin", 50.00f, 8);
            Book book2 = new Book( "Structure and Interpretation", "Harold Abelson", 40.00f, 15);

            repository.saveAll(List.of(book1,book2));

        };
    }
}
