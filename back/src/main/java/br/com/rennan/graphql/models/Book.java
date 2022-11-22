package br.com.rennan.graphql.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String publisher;
    @ManyToOne(fetch = FetchType.LAZY)
    private Author author;
}
