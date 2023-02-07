package it.hastega.librarybe.librarybe.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class BookDTO implements Serializable {
    private Long id;
    private String title;
    private String author;
}
