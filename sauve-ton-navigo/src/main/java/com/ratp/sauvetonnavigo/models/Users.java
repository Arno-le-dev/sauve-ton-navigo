package com.ratp.sauvetonnavigo.models;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;


@Entity
@Table(name = "users")
@Getter
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;

    @Column(name = "admin")
    private Boolean admin;

    public Users(UsersBuilder usersBuilder) {
        this.id = usersBuilder.id;
        this.firstName = usersBuilder.firstName;
        this.lastName = usersBuilder.lastName;
        this.email = usersBuilder.email;
        this.admin = usersBuilder.admin;
    }
    public Users(){
    }
}

