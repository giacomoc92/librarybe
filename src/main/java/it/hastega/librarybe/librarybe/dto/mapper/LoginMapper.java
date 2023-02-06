package it.hastega.librarybe.librarybe.dto.mapper;

import it.hastega.librarybe.librarybe.dto.LoginDTO;
import it.hastega.librarybe.librarybe.model.Account;

public class LoginMapper {
    private LoginMapper() {}

    public static LoginDTO toDto(Account account) {
        LoginDTO accountDTO = new LoginDTO();
        accountDTO.setEmail(account.getEmail());
        return accountDTO;
    }
}
