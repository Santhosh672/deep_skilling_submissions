package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;   // dependency

    // Setter for Spring to inject
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(String title) {
        bookRepository.saveBook(title);
        System.out.println("BookService: Book added – " + title);
    }
}
