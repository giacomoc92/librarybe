package it.hastega.librarybe.librarybe.controller;

import it.hastega.librarybe.librarybe.dto.LoginDTO;
import it.hastega.librarybe.librarybe.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    public LoginService loginService;

    @GetMapping("/login")
    public ResponseEntity<List<LoginDTO>> login() {
        return loginService.login();
    }
}
