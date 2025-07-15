package com.example.RESTful.Bookstore.API.service;

import com.example.RESTful.Bookstore.API.dto.BookDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    Page<BookDto> getBooks(Optional<String> genre, Pageable pageable);
    BookDto updateBook(Long id, BookDto bookDto);
    void deleteBook(Long id);
}
