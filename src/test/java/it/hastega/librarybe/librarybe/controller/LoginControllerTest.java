package it.hastega.librarybe.librarybe.controller;

import it.hastega.librarybe.librarybe.dto.LoginDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.List;

@SpringBootTest
class LoginControllerTest {
    @Autowired
    LoginController loginController;

    @Test
    void loginPositive() {
        ResponseEntity<List<LoginDTO>> responseEntity = loginController.login();
        List<LoginDTO> accountDTOList = responseEntity.getBody();

        Assertions.assertNotNull(responseEntity.getBody().get(0));
        Assertions.assertEquals(200, responseEntity.getStatusCodeValue());
        Assertions.assertTrue(accountDTOList.size() > 0);
        Assertions.assertEquals("matteo.bianchi@email.com", accountDTOList.get(0).getEmail());
    }
}