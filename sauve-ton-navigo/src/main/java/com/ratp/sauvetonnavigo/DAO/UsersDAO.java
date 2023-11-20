package com.ratp.sauvetonnavigo.DAO;

import com.ratp.sauvetonnavigo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDAO extends JpaRepository<Users, Long> {


    boolean existsByEmail(String email);
}


