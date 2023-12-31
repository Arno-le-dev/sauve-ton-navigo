package com.ratp.sauvetonnavigo.DTO;

import com.ratp.sauvetonnavigo.models.Users;
import lombok.Builder;

import java.io.IOException;

public class UsersMapper {
        public static Users fromDto(UsersDto dto, Long id) {
        return Users.builder()
                .id(id)
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .email(dto.getEmail())
                .mdp(dto.getMdp())
                .admin(dto.getAdmin())
                .build();
    }

    public static UsersDto toDto (Users user){
        return UsersDto.builder()
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .mdp(user.getMdp())
                .admin(user.getAdmin())
                .build();
    }
}