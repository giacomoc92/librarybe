package it.hastega.librarybe.librarybe.controller;

import it.hastega.librarybe.librarybe.dto.BookDTO;
import it.hastega.librarybe.librarybe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("/book")
    public ResponseEntity<List<BookDTO>> getBookByAccount(@RequestParam String email ) {
        return bookService.getBookByAccount(email);
    }
}
