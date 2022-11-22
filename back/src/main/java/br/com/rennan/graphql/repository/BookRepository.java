package br.com.rennan.graphql.repository;


import br.com.rennan.graphql.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
