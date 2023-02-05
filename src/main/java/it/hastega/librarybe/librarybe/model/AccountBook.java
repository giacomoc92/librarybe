package it.hastega.librarybe.librarybe.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "account_book")
public class AccountBook implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @CreationTimestamp
    @Column(name = "date_added", nullable = false, updatable = false)
    private LocalDate dateAdded;

    @Column(name = "date_removed")
    private LocalDate dateRemoved;

    @Column(name = "times_read")
    private Integer timesRead;

}
