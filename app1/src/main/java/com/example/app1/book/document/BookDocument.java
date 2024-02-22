package com.example.app1.book.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookDocument {

    @Id
    private String isbn;
    private String title;
    private String author;
    private String category;
    private String borrower;

    BookDocument(String isbn, String title, String author, String category, String borrower) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.borrower = borrower;
    }

    public static BookDocumentBuilder builder() {
        return new BookDocumentBuilder();
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getCategory() {
        return this.category;
    }

    public String getBorrower() {
        return this.borrower;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BookDocument)) {
            return false;
        }
        final BookDocument other = (BookDocument) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object this$isbn = this.getIsbn();
        final Object other$isbn = other.getIsbn();
        if (this$isbn == null ? other$isbn != null : !this$isbn.equals(other$isbn)) {
            return false;
        }
        final Object this$title = this.getTitle();
        final Object other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        final Object this$author = this.getAuthor();
        final Object other$author = other.getAuthor();
        if (this$author == null ? other$author != null : !this$author.equals(other$author)) {
            return false;
        }
        final Object this$category = this.getCategory();
        final Object other$category = other.getCategory();
        if (this$category == null ? other$category != null :
            !this$category.equals(other$category)) {
            return false;
        }
        final Object this$borrower = this.getBorrower();
        final Object other$borrower = other.getBorrower();
        if (this$borrower == null ? other$borrower != null :
            !this$borrower.equals(other$borrower)) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BookDocument;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $isbn = this.getIsbn();
        result = result * PRIME + ($isbn == null ? 43 : $isbn.hashCode());
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        final Object $category = this.getCategory();
        result = result * PRIME + ($category == null ? 43 : $category.hashCode());
        final Object $borrower = this.getBorrower();
        result = result * PRIME + ($borrower == null ? 43 : $borrower.hashCode());
        return result;
    }

    public String toString() {
        return "BookDocument(isbn=" + this.getIsbn() + ", title=" + this.getTitle() + ", author=" +
            this.getAuthor() + ", category=" + this.getCategory() + ", borrower=" +
            this.getBorrower() + ")";
    }

    public static class BookDocumentBuilder {
        private String isbn;
        private String title;
        private String author;
        private String category;
        private String borrower;

        BookDocumentBuilder() {
        }

        public BookDocumentBuilder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookDocumentBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookDocumentBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookDocumentBuilder category(String category) {
            this.category = category;
            return this;
        }

        public BookDocumentBuilder borrower(String borrower) {
            this.borrower = borrower;
            return this;
        }

        public BookDocument build() {
            return new BookDocument(this.isbn, this.title, this.author, this.category,
                this.borrower);
        }

        public String toString() {
            return "BookDocument.BookDocumentBuilder(isbn=" + this.isbn + ", title=" + this.title +
                ", author=" + this.author + ", category=" + this.category + ", borrower=" +
                this.borrower + ")";
        }
    }
}