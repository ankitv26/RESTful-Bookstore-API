package com.example.RESTful.Bookstore.API.service.impl;

import com.example.RESTful.Bookstore.API.dto.BookDto;
import com.example.RESTful.Bookstore.API.entity.Author;
import com.example.RESTful.Bookstore.API.entity.Book;
import com.example.RESTful.Bookstore.API.repository.AuthorRepository;
import com.example.RESTful.Bookstore.API.repository.BookRepository;
import com.example.RESTful.Bookstore.API.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public BookDto createBook(BookDto dto) {
        Author author = authorRepository.findById(dto.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found"));

        Book book = new Book(null, dto.getTitle(), dto.getGenre(), dto.getPrice(), author);
        book = bookRepository.save(book);

        return new BookDto(book.getId(), book.getTitle(), book.getGenre(), book.getPrice(), author.getId());
    }

    @Override
    public Page<BookDto> getBooks(Optional<String> genre, Pageable pageable) {
        Page<Book> page = genre.map(g -> bookRepository.findByGenre(g, pageable))
                .orElse(bookRepository.findAll(pageable));

        return page.map(book -> new BookDto(
                book.getId(),
                book.getTitle(),
                book.getGenre(),
                book.getPrice(),
                book.getAuthor().getId()));
    }

    @Override
    public BookDto updateBook(Long id, BookDto dto) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));

        Author author = authorRepository.findById(dto.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found"));

        book.setTitle(dto.getTitle());
        book.setGenre(dto.getGenre());
        book.setPrice(dto.getPrice());
        book.setAuthor(author);
        book = bookRepository.save(book);

        return new BookDto(book.getId(), book.getTitle(), book.getGenre(), book.getPrice(), author.getId());
    }

    @Override
    public void deleteBook(Long id) {
        if (!bookRepository.existsById(id)) {
            throw new RuntimeException("Book not found");
        }
        bookRepository.deleteById(id);
    }
}
