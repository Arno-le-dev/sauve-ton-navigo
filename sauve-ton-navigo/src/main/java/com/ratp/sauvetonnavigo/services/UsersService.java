package com.ratp.sauvetonnavigo.services;

import com.ratp.sauvetonnavigo.DAO.UsersDAO;
import com.ratp.sauvetonnavigo.DTO.UsersDto;
import com.ratp.sauvetonnavigo.DTO.UsersMapper;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Users;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class UsersService {
    private final UsersDAO usersDao ;

    public List<Users> findAll() {
        return usersDao.findAll();
    }

    public Users findByID(Long id) {return usersDao.findById(id).orElseThrow();}

    @Transactional
    public void deleteById(Long id) {
        usersDao.deleteById(id);
    }

    @Transactional
    public void addUser(UsersDto userDto) {
        Users user;
        try {
            user = UsersMapper.fromDto(userDto, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with Student image", e);
        }

        usersDao.save(user);
    }

}
