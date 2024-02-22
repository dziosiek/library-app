package com.example.app1.book.document;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class BookDocument {

    @Id
    private String isbn;
    private String title;
    private String author;
    private String category;
    private String borrower;
}