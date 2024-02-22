package com.example.app2.book.mapper;

import com.example.app2.book.model.Book;
import com.example.app2.book.jpa.entity.BookEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper MAPPER = Mappers.getMapper(BookMapper.class);

    Book mapToBook(BookEntity obj);
}
