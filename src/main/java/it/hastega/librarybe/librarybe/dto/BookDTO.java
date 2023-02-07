package it.hastega.librarybe.librarybe.dto;

import it.hastega.librarybe.librarybe.model.AccountBook;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class BookDTO {
    private Long id;
    private String title;
    private String author;
    private String plot;
    private String isbn;
    private List<AccountBook> accounts;
}
