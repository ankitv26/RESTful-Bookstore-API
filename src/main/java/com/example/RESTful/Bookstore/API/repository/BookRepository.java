package com.example.RESTful.Bookstore.API.repository;

import com.example.RESTful.Bookstore.API.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Page<Book> findByGenre(String genre, Pageable pageable);
}
