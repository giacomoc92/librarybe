package it.hastega.librarybe.librarybe.service;

import it.hastega.librarybe.librarybe.dto.LoginDTO;
import it.hastega.librarybe.librarybe.dto.mapper.LoginMapper;
import it.hastega.librarybe.librarybe.model.Account;
import it.hastega.librarybe.librarybe.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {
    @Autowired
    AccountRepository accountRepository;
    public ResponseEntity<List<LoginDTO>> login() {
        List<Account> accounts = accountRepository.findAll();

        return ResponseEntity.ok()
                .body(accounts.stream().map(LoginMapper::toDto).toList());
    }
}
