package com.example.app2.book.jpa.repository;

import com.example.app2.book.jpa.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, String> {
}
