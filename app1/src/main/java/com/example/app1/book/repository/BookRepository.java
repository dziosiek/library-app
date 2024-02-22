package com.example.app1.book.repository;

import com.example.app1.book.document.BookDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepository extends MongoRepository<BookDocument, String> {
}
