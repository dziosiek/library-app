package com.example.app1.book.dto;

public class AddNewBookRequest {

    private final String title;
    private final String author;
    private final String isbn;
    private final String category;
    private final String borrower;

    public AddNewBookRequest(String title, String author, String isbn, String category,
                             String borrower) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
        this.borrower = borrower;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getCategory() {
        return this.category;
    }

    public String getBorrower() {
        return this.borrower;
    }
}
