package com.example.app1.book.mapper;

import com.example.app1.book.document.BookDocument;
import com.example.app1.book.dto.AddNewBookRequest;
import com.example.app1.book.dto.AddNewBookResponse;
import com.example.app1.book.dto.RentBookResponse;
import com.example.app1.book.model.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Product mapper.
 */

@Mapper
public interface BookMapper {

    BookMapper MAPPER = Mappers.getMapper(BookMapper.class);

    Book mapToBook(AddNewBookRequest obj);

    BookDocument mapToBookModel(Book obj);

    Book mapToBook(BookDocument obj);

    AddNewBookResponse mapToAddNewBookResponse(Book obj);

    RentBookResponse mapToRentBookResponse(Book obj);

}
