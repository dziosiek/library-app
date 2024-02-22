package com.example.app2.book.controller;

import com.example.app2.book.model.Book;
import com.example.app2.book.service.BookService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getBooks() {
        List<Book> books = bookService.findAll();
        return books;
    }
}
