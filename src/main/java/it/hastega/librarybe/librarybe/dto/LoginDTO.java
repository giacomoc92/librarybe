package it.hastega.librarybe.librarybe.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter
public class LoginDTO implements Serializable {
    private String email;
}
