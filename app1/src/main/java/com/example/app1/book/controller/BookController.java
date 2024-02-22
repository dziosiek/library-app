package com.example.app1.book.controller;

import com.example.app1.book.document.BookDocument;
import com.example.app1.book.dto.AddNewBookRequest;
import com.example.app1.book.dto.AddNewBookResponse;
import com.example.app1.book.dto.RentBookRequest;
import com.example.app1.book.dto.RentBookResponse;
import com.example.app1.book.mapper.BookMapper;
import com.example.app1.book.model.Book;
import com.example.app1.book.service.BookService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<BookDocument> getBooks() {
        List<BookDocument> books = bookService.findAll();
        return books;
    }

    @PostMapping("/books")
    public AddNewBookResponse addNewBook(@RequestBody AddNewBookRequest addNewBookRequest) {
        Book book = BookMapper.MAPPER.mapToBook(addNewBookRequest);
        return BookMapper.MAPPER.mapToAddNewBookResponse(bookService.addNewBook(book));
    }

    @PutMapping("/books/{isbn}")
    public RentBookResponse rentBook(@PathVariable("isbn") String isbn,
                                     @RequestBody RentBookRequest rentBookRequest)
        throws Exception {

        Book book = bookService.rentBook(isbn, rentBookRequest);
        return BookMapper.MAPPER.mapToRentBookResponse(bookService.addNewBook(book));
    }

}
