package it.hastega.librarybe.librarybe.dto.mapper;

import it.hastega.librarybe.librarybe.dto.BookDTO;
import it.hastega.librarybe.librarybe.dto.DetailBookDTO;
import it.hastega.librarybe.librarybe.model.Book;

public class BookMapper {
    private BookMapper() {}
    public static BookDTO toBookDTO(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setTitle(book.getTitle());
        bookDTO.setAuthor(book.getAuthor());
        return bookDTO;
    }

    public static DetailBookDTO toDetailBookDTO(Book book) {
        DetailBookDTO detailBookDTO = new DetailBookDTO();
        detailBookDTO.setId(book.getId());
        detailBookDTO.setTitle(book.getTitle());
        detailBookDTO.setAuthor(book.getAuthor());
        detailBookDTO.setIsbn(book.getIsbn());
        detailBookDTO.setPlot(book.getPlot());
        return detailBookDTO;
    }
}
