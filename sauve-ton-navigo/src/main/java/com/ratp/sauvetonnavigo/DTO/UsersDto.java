package com.ratp.sauvetonnavigo.DTO;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UsersDto {
    private String firstName;
    private String lastName;
    private String email;
    private Boolean admin;
}

