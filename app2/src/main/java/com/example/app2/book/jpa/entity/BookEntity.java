package com.example.app2.book.jpa.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;


@Entity(name = "Book")
@Table(name = "Book")
public class BookEntity implements Serializable {

    @Column
    private String title;
    @Column
    private String author;
    @Column
    @Id
    private String isbn;
    @Column
    private String category;
    @Column
    private String borrower;

    public BookEntity(String title, String author, String isbn, String category, String borrower) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.category = category;
        this.borrower = borrower;
    }

    public BookEntity() {
    }

    public static BookEntityBuilder builder() {
        return new BookEntityBuilder();
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BookEntity)) {
            return false;
        }
        final BookEntity other = (BookEntity) o;
        if (!other.canEqual((Object) this)) {
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
        final Object this$isbn = this.getIsbn();
        final Object other$isbn = other.getIsbn();
        if (this$isbn == null ? other$isbn != null : !this$isbn.equals(other$isbn)) {
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
        return other instanceof BookEntity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $title = this.getTitle();
        result = result * PRIME + ($title == null ? 43 : $title.hashCode());
        final Object $author = this.getAuthor();
        result = result * PRIME + ($author == null ? 43 : $author.hashCode());
        final Object $isbn = this.getIsbn();
        result = result * PRIME + ($isbn == null ? 43 : $isbn.hashCode());
        final Object $category = this.getCategory();
        result = result * PRIME + ($category == null ? 43 : $category.hashCode());
        final Object $borrower = this.getBorrower();
        result = result * PRIME + ($borrower == null ? 43 : $borrower.hashCode());
        return result;
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

    public String toString() {
        return "BookEntity(title=" + this.getTitle() + ", author=" + this.getAuthor() + ", isbn=" +
            this.getIsbn() + ", category=" + this.getCategory() + ", borrower=" +
            this.getBorrower() + ")";
    }

    public static class BookEntityBuilder {
        private String title;
        private String author;
        private String isbn;
        private String category;
        private String borrower;

        BookEntityBuilder() {
        }

        public BookEntityBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BookEntityBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookEntityBuilder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public BookEntityBuilder category(String category) {
            this.category = category;
            return this;
        }

        public BookEntityBuilder borrower(String borrower) {
            this.borrower = borrower;
            return this;
        }

        public BookEntity build() {
            return new BookEntity(this.title, this.author, this.isbn, this.category, this.borrower);
        }

        public String toString() {
            return "BookEntity.BookEntityBuilder(title=" + this.title + ", author=" + this.author +
                ", isbn=" + this.isbn + ", category=" + this.category + ", borrower=" +
                this.borrower + ")";
        }
    }
}

