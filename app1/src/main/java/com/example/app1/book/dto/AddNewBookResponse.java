package com.example.app1.book.dto;

public class AddNewBookResponse {

    private String title;
    private String author;
    private String isbn;
    private String category;
    private String borrower;

    public AddNewBookResponse(String title, String author, String isbn, String category,
                              String borrower) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
        this.borrower = borrower;
    }

    public static AddNewBookResponseBuilder builder() {
        return new AddNewBookResponseBuilder();
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

    public static class AddNewBookResponseBuilder {
        private String title;
        private String author;
        private String isbn;
        private String category;
        private String borrower;

        AddNewBookResponseBuilder() {
        }

        public AddNewBookResponseBuilder title(String title) {
            this.title = title;
            return this;
        }

        public AddNewBookResponseBuilder author(String author) {
            this.author = author;
            return this;
        }

        public AddNewBookResponseBuilder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public AddNewBookResponseBuilder category(String category) {
            this.category = category;
            return this;
        }

        public AddNewBookResponseBuilder borrower(String borrower) {
            this.borrower = borrower;
            return this;
        }

        public AddNewBookResponse build() {
            return new AddNewBookResponse(this.title, this.author, this.isbn, this.category,
                this.borrower);
        }

        public String toString() {
            return "AddNewBookResponse.AddNewBookResponseBuilder(title=" + this.title +
                ", author=" + this.author + ", isbn=" + this.isbn + ", category=" + this.category +
                ", borrower=" + this.borrower + ")";
        }
    }
}
