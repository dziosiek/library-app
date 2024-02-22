package com.example.app1.book.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class AddNewBookResponse {

    private String title;
    private String author;
    private String isbn;
    private String category;
    private String borrower;
}
