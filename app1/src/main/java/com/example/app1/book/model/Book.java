package com.example.app1.book.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@Builder
@Getter
@Setter
public class Book {

    private String title;
    private String author;
    private String isbn;
    private String category;
    private String borrower;
}