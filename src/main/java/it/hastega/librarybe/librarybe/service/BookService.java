package it.hastega.librarybe.librarybe.service;

import it.hastega.librarybe.librarybe.dto.BookDTO;
import it.hastega.librarybe.librarybe.dto.mapper.BookMapper;
import it.hastega.librarybe.librarybe.model.Book;
import it.hastega.librarybe.librarybe.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

import static it.hastega.librarybe.librarybe.service.ServiceUtils.isValidEmail;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public ResponseEntity<List<BookDTO>> getBookByAccount(String email) {
        if (!isValidEmail(email)) {
            return ResponseEntity.badRequest().build();
        } else {
            List<Book> books = bookRepository.findByEmail(email);
            return ResponseEntity.ok().body(books.stream().map(BookMapper::toBookDTO).toList());
        }
    }

}
