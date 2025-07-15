package com.example.RESTful.Bookstore.API.repository;

import com.example.RESTful.Bookstore.API.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
