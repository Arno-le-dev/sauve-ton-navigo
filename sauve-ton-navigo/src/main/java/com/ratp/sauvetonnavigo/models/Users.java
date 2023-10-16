package com.ratp.sauvetonnavigo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@Entity
@Table(name = "users")
@Getter
@Builder
@AllArgsConstructor
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

  /*  public static class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private boolean admin;

        public Builder id (Long id) {
            this.id = id;
            return this;
        }
        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder admin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        public Users build() {
            return new Users(this);
        }
    }*/
}

