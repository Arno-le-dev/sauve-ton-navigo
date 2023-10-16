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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Component
@RequiredArgsConstructor
public class UsersService {
    private final UsersDAO usersDao ;

    public List<Users> findAll() {
        return usersDao.findAll();
    }

    public Users findByID(Long id) {return usersDao.findById(id).orElseThrow();}

    public Users findByEmail(String email) {
            List<Users> users = usersDao.findAll() ;
            Users user = new Users();
            for(int i =0; i<users.size(); i++){
                if(users.get(i).getEmail().equals(email) ){
                    user = users.get(i);
                    break;
                }
            }
        return user;}

    public List<Users> getAllAdmin() {
        List<Users> users = usersDao.findAll() ;
        List<Users> usersAdmin = new ArrayList<>();
        for(int i =0; i<users.size(); i++){
            if(users.get(i).getAdmin() ){
                usersAdmin.add(users.get(i));
            }
        }
        return usersAdmin;
    }

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

    @Transactional
    public void updateUser(UsersDto usersDto, Long id) {
        usersDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        Users user;
        try {
            user = UsersMapper.fromDto(usersDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Student image", e);
        }
        usersDao.save(user);
    }

}
