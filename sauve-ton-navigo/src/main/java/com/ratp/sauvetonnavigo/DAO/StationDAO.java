package com.ratp.sauvetonnavigo.DAO;


import com.ratp.sauvetonnavigo.models.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationDAO extends JpaRepository<Station, Long> {
}

