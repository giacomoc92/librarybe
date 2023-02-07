package it.hastega.librarybe.librarybe.dto.mapper;

import it.hastega.librarybe.librarybe.dto.BookDTO;
import it.hastega.librarybe.librarybe.model.Book;

public class BookMapper {
    private BookMapper() {}
    public static BookDTO toBookDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        bookDTO.setPlot(book.getPlot());
        bookDTO.setIsbn(book.getIsbn());
        return bookDTO;
    }
}
