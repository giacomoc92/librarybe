package it.hastega.librarybe.librarybe.repository;

import it.hastega.librarybe.librarybe.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
