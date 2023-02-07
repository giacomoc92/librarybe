package it.hastega.librarybe.librarybe.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class DetailBookDTO extends BookDTO {
    private String isbn;
    private String plot;
}
