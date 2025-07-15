package com.example.RESTful.Bookstore.API.service;

import com.example.RESTful.Bookstore.API.dto.AuthorDto;
import java.util.List;

public interface AuthorService {
    AuthorDto createAuthor(AuthorDto authorDto);
    List<AuthorDto> getAllAuthors();
}
