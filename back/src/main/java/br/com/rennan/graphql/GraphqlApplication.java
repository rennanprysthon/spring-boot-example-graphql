package br.com.rennan.graphql;

import br.com.rennan.graphql.models.Author;
import br.com.rennan.graphql.models.Book;
import br.com.rennan.graphql.repository.AuthorRepository;
import br.com.rennan.graphql.repository.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
		return args -> {

			Author grrMartin = authorRepository.save(
				Author.builder().name("George R R Martin").id(null).build()
			);

			Author tolkien = authorRepository.save(
				Author.builder().name("J R R Tolkien").build()
			);

			bookRepository.saveAll(List.of(
				Book.builder().title("Game of Thrones").publisher("").author(grrMartin).build(),
				Book.builder().title("Dance of Dragons").publisher("").author(grrMartin).build(),
				Book.builder().title("A Clash of Kings").publisher("").author(grrMartin).build(),
				Book.builder().title("Lord of the rings").publisher("").author(tolkien).build(),
				Book.builder().title("Hobbit").publisher("").author(tolkien).build(),
				Book.builder().title("The Silmarillion").publisher("").author(tolkien).build(),
				Book.builder().title("Beren and Lúthien").publisher("").author(tolkien).build()
			));
		};
	}
}
