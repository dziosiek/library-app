package com.example.app2.book.service;

import com.example.app2.book.model.Book;
import com.example.app2.book.jpa.repository.BookRepository;
import com.example.app2.book.mapper.BookMapper;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll()
            .stream()
            .map(BookMapper.MAPPER::mapToBook)
            .collect(
            Collectors.toList());

    }
}
