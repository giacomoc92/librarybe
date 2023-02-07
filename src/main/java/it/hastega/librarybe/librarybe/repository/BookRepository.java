package it.hastega.librarybe.librarybe.repository;

import it.hastega.librarybe.librarybe.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("""
            SELECT b
            FROM Book b
            INNER JOIN AccountBook ab ON ab.book.id = b.id
            LEFT JOIN Account ac ON ac.id = ab.account.id
            WHERE ac.email = :email
            """)
    List<Book> findByEmail(@Param("email") String email);
}
