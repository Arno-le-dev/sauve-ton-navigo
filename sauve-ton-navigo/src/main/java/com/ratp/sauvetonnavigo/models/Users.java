package com.ratp.sauvetonnavigo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;


@Entity
@Table(name = "users")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    @NotBlank(message = "Ce champ est obligatoire.")
    private String firstName;


    @Column(name = "last_name")
    @NotBlank(message = "Le nom est obligatoire.")
    private String lastName;


    @Column(name = "email")
    @Email
    @NotBlank(message = "Le prénom est obligatoire.")
    private String email;

    @Column(name = "admin")
    private Boolean admin;


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

