package com.example.RESTful.Bookstore.API.controller;

import com.example.RESTful.Bookstore.API.dto.AuthorDto;
import com.example.RESTful.Bookstore.API.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;


    @GetMapping
    public List<AuthorDto> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping

    public AuthorDto createAuthor(@RequestBody AuthorDto dto) {
        return authorService.createAuthor(dto);
    }
}
