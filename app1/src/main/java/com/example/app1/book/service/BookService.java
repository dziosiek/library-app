package com.example.app1.book.service;

import com.example.app1.book.exception.BookNotFoundException;
import com.example.app1.book.repository.BookRepository;
import com.example.app1.book.document.BookDocument;
import com.example.app1.book.dto.RentBookRequest;
import com.example.app1.book.mapper.BookMapper;
import com.example.app1.book.model.Book;
import com.example.app1.book.topic.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final KafkaProducer kafkaProducer;

    public List<BookDocument> findAll() {
        return bookRepository.findAll();
    }

    public Book addNewBook(Book book){
        BookDocument toSave = BookMapper.MAPPER.mapToBookModel(book);
        return BookMapper.MAPPER.mapToBook(bookRepository.save(toSave));
    }

    public Book rentBook(String isbn, RentBookRequest request) {
        BookDocument book = bookRepository.findAll()
            .stream()
            .filter(bookModel -> bookModel.getIsbn().equals(isbn))
            .findAny()
            .orElseThrow(() -> new BookNotFoundException(isbn));

        book.setBorrower(request.getBorrower());
        BookDocument saved = bookRepository.save(book);

        kafkaProducer.send(saved);

        return BookMapper.MAPPER.mapToBook(saved);
    }

}
