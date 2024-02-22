package com.example.app1.book.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class RentBookRequest {

    private final String isbn;
    private final String borrower;

}
