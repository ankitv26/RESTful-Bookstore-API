package com.example.RESTful.Bookstore.API.service.impl;

import com.example.RESTful.Bookstore.API.dto.AuthorDto;
import com.example.RESTful.Bookstore.API.entity.Author;
import com.example.RESTful.Bookstore.API.repository.AuthorRepository;
import com.example.RESTful.Bookstore.API.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public AuthorDto createAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setName(authorDto.getName());
        author = authorRepository.save(author);
        return new AuthorDto(author.getId(), author.getName());
    }

    @Override
    public List<AuthorDto> getAllAuthors() {
        return authorRepository.findAll().stream()
                .map(author -> new AuthorDto(author.getId(), author.getName()))
                .toList();
    }
}
