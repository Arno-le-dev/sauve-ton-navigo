package com.ratp.sauvetonnavigo.controllers;

import com.ratp.sauvetonnavigo.models.Users;
import com.ratp.sauvetonnavigo.services.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RequestMapping("users/")
@RestController
@RequiredArgsConstructor
public class UsersControllers {
    private final UsersService usersServices;

    @GetMapping("getAll")
    public List<Users> getAllUsers() {
        return usersServices.findAll();
    }
}