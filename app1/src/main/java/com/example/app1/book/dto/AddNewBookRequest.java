package com.example.app1.book.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class AddNewBookRequest {

    private final String title;
    private final String author;
    private final String isbn;
    private final String category;
    private final String borrower;
}
