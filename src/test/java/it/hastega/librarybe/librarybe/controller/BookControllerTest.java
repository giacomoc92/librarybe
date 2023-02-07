package it.hastega.librarybe.librarybe.controller;

import it.hastega.librarybe.librarybe.dto.BookDTO;
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
    @ValueSource(strings = {"aaaabbbb", "", })
    void getBookByAccountNegative(String email) {
        ResponseEntity<List<BookDTO>> response = bookController.getBookByAccount(email);

        Assertions.assertEquals("400 BAD_REQUEST", response.getStatusCode().toString());
        Assertions.assertNull(response.getBody());
    }
}