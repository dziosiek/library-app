package com.example.app1.book.exception;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException(String message) {
        super(String.format("Book doesn't exist:%s", message));
    }
}
