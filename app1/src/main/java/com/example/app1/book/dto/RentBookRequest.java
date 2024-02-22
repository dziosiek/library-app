package com.example.app1.book.dto;

public class RentBookRequest {

    private final String isbn;
    private final String borrower;

    public RentBookRequest(String isbn, String borrower) {
        this.isbn = isbn;
        this.borrower = borrower;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getBorrower() {
        return this.borrower;
    }
}
