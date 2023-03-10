package it.hastega.librarybe.librarybe.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "book")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "plot")
    private String plot;

    @Column(name = "isbn")
    private String isbn;

    @OneToMany(mappedBy = "book")
    private List<AccountBook> accounts;
}
