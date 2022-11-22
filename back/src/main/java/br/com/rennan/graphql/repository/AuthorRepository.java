package br.com.rennan.graphql.repository;

import br.com.rennan.graphql.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
