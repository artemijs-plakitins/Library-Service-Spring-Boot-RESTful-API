package com.demo.library_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LibraryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryServiceApplication.class, args);
	}
}
