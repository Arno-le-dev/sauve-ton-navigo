package com.ratp.sauvetonnavigo.controllers;

import com.ratp.sauvetonnavigo.Config.Exception.EmailUnicityException;
import com.ratp.sauvetonnavigo.DTO.StationDto;
import com.ratp.sauvetonnavigo.DTO.UsersDto;
import com.ratp.sauvetonnavigo.models.Users;
import com.ratp.sauvetonnavigo.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("users")
@RestController
@RequiredArgsConstructor
@Validated
public class UsersControllers {
    private final UsersService usersServices;

    @GetMapping("getAll")
    public List<Users> getAllUsers() {
        return usersServices.findAll();
    }

    @GetMapping("getAllAdmin")
    public List<Users> getAllAdmin() {
        return usersServices.getAllAdmin();
    }

    @GetMapping("/{id}")
    public Users getUses(@PathVariable Long id ){
        return usersServices.findByID(id);
    }

    @GetMapping("email/{email}")
    public Users getUsesEmail(@PathVariable String email ){
        return usersServices.findByEmail(email);
    }

    @GetMapping("connexion/{email}/{mdp}")
    public Users connexion( @PathVariable String email, @PathVariable String mdp ) throws Exception{
        return usersServices.connexion(email, mdp);
    }

    @PostMapping
    public void addUser(@RequestBody UsersDto userDto) throws EmailUnicityException {
        usersServices.addUser(userDto);
    }
    @PostMapping("/update")
    public void updateUser(Long id, UsersDto userDto) {
        usersServices.updateUser(userDto, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUsers(@PathVariable Long id) {
        usersServices.deleteById(id);
    }

}