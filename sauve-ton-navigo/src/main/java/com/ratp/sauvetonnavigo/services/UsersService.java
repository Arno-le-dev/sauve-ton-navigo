package com.ratp.sauvetonnavigo.services;

import com.ratp.sauvetonnavigo.Config.Exception.EmailNotFondException;
import com.ratp.sauvetonnavigo.Config.Exception.EmailUnicityException;
import com.ratp.sauvetonnavigo.DAO.UsersDAO;
import com.ratp.sauvetonnavigo.DTO.UsersDto;
import com.ratp.sauvetonnavigo.DTO.UsersMapper;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Users;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

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
        for (Users value : users) {
            if (value.getEmail().equals(email)) {
                user = value;
                break;
            }
        }
        return user;
    }
    public Users connexion(String email, String mdp) throws Exception {
        List<Users> users = usersDao.findAll() ;
        Users user = new Users();
        Boolean trouve = false;
            for (Users value : users) {
                if (value.getEmail().equals(email)) {
                    user = value;
                    trouve = true;
                    break;
                }
            }
            if (trouve){
                if(!user.getMdp().equals(mdp)){
                    throw new EmailNotFondException("Mot de passe incorect");
                }
            }else{
                throw new EmailNotFondException("Email introuvable");
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
    public void addUser(@RequestBody UsersDto userDto) throws EmailUnicityException {
        if ( usersDao.existsByEmail(userDto.getEmail())) throw new EmailUnicityException("Cette adresse mail est déjà utilisée.");

        Users user = UsersMapper.fromDto(userDto, null);
        usersDao.save(user);
    }

    @Transactional
    public void updateUser(UsersDto usersDto, Long id) {
        usersDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        Users user = UsersMapper.fromDto(usersDto, id);
        usersDao.save(user);
    }

}
