package com.ratp.sauvetonnavigo.DAO;

import com.ratp.sauvetonnavigo.models.Signalement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SignalementDAO extends JpaRepository<Signalement, Long> {


}

