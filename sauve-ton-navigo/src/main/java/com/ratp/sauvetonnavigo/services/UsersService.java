package com.ratp.sauvetonnavigo.services;

import com.ratp.sauvetonnavigo.DAO.UsersDAO;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UsersService {
    private final UsersDAO usersDao ;

    public List<Users> findAll() {
        return usersDao.findAll();
    }

    public Users findByID(Long id) {return usersDao.findById(id).orElseThrow();}

}
