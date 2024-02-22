package com.example.app1.book.model;


public class Book {

    private String title;
    private String author;
    private String isbn;
    private String category;
    private String borrower;

    public Book(String title, String author, String isbn, String category, String borrower) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
        this.borrower = borrower;
    }

    public static BookBuilder builder() {
        return new BookBuilder();
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public static class BookBuilder {
        private String title;
        private String author;
        private String isbn;
        private String category;
        private String borrower;

        BookBuilder() {
        }

        public BookBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookBuilder category(String category) {
            this.category = category;
            return this;
        }

        public BookBuilder borrower(String borrower) {
            this.borrower = borrower;
            return this;
        }

        public Book build() {
            return new Book(this.title, this.author, this.isbn, this.category, this.borrower);
        }

        public String toString() {
            return "Book.BookBuilder(title=" + this.title + ", author=" + this.author + ", isbn=" +
                this.isbn + ", category=" + this.category + ", borrower=" + this.borrower + ")";
        }
    }
}