package it.hastega.librarybe.librarybe.controller;

import it.hastega.librarybe.librarybe.dto.BookDTO;
import it.hastega.librarybe.librarybe.dto.DetailBookDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookControllerTest {
    @Autowired
    BookController bookController;

    @Test
    void getBookByAccountPositive() {
        String email = "andrea.galli@email.com";
        ResponseEntity<List<BookDTO>> response = bookController.getBookByAccount(email);
        List<BookDTO> books = response.getBody();

        Assertions.assertEquals("200 OK", response.getStatusCode().toString());
        Assertions.assertNotNull(books);
        assertEquals(2, books.size());
        assertEquals("I gioielli di famiglia", books.get(1).getTitle());
    }

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {"aaaabbbb", ""})
    void getBookByAccountNegative(String email) {
        ResponseEntity<List<BookDTO>> response = bookController.getBookByAccount(email);

        Assertions.assertEquals("400 BAD_REQUEST", response.getStatusCode().toString());
        Assertions.assertNull(response.getBody());
    }

    @Test
    void getBookByIdPositive() {
        Long id = 1L;
        ResponseEntity<DetailBookDTO> response = bookController.getBookById(id);
        DetailBookDTO book = response.getBody();

        Assertions.assertEquals("200 OK", response.getStatusCode().toString());
        Assertions.assertNotNull(book);
        Assertions.assertEquals("La scienza delle verdure", book.getTitle());
        Assertions.assertEquals("Dario Bressanini svela i principi chimici e fisici alla base delle verdure più utilizzate in cucina.",
                book.getPlot());
        Assertions.assertNotEquals("I Malavoglia", book.getTitle());
    }

    @Test
    void getBookByIdNull() {
        Long id = null;
        ResponseEntity<DetailBookDTO> response = bookController.getBookById(id);

        Assertions.assertEquals("400 BAD_REQUEST", response.getStatusCode().toString());
        Assertions.assertNull(response.getBody());
    }

    @Test
    void getBookByIdNegative() {
        Long id = 9999L;
        ResponseEntity<DetailBookDTO> response = bookController.getBookById(id);

        Assertions.assertEquals("404 NOT_FOUND", response.getStatusCode().toString());
        Assertions.assertNull(response.getBody());
    }
}