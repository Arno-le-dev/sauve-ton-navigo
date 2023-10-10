package com.ratp.sauvetonnavigo.services;


import com.ratp.sauvetonnavigo.DAO.SignalementDAO;
import com.ratp.sauvetonnavigo.DAO.StationDAO;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Station;
import com.ratp.sauvetonnavigo.utils.Humeur;
import com.ratp.sauvetonnavigo.utils.Sorties;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SignalementService {
    private final SignalementDAO signalementDao;

    @Transactional
    public void addSignalement(Long id, LocalDate date, LocalTime heure, Station station, Integer nbr_controlleurs, String commentaire, Humeur humeur, Sorties position_controlleurs) {
        Signalement signalement = new Signalement(id, date, heure, station,nbr_controlleurs, commentaire, humeur, position_controlleurs);
        signalementDao.save(signalement);
    }
    @Transactional
    public void deleteById(Long id) {
        signalementDao.deleteById(id);
    }
    public List<Signalement> findByStation(Long id_station){
        List<Signalement> signalements = signalementDao.findAll();
        List<Signalement> signalementsByStations = new ArrayList<>() ;
        for(int i =0; i<signalements.size(); i++){
            if(signalements.get(i).getStation().getId() == id_station ){
                signalementsByStations.add(signalements.get(i));
            }
        }
        return signalementsByStations;
    }
    public List<Signalement> findAll() {
        return signalementDao.findAll();
    }

    public Signalement findByID(Long id) {return signalementDao.findById(id).orElseThrow();}
}
