package br.com.rennan.graphql.controller;

import br.com.rennan.graphql.models.Book;
import br.com.rennan.graphql.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @QueryMapping
    Iterable<Book> books() {
        return this.bookRepository.findAll();
    }
}
