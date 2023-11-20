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
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SignalementService {
    private final SignalementDAO signalementDao;
    private final StationDAO stationDao;

    private final StationService stationService;


    @Transactional
    public void addSignalement( LocalDate date, LocalTime heure, Long station_id, Integer nbr_controlleurs, String commentaire, Humeur humeur, Sorties position_controlleurs) {
        Station station = stationDao.findById(station_id).orElseThrow(() -> new NoSuchElementException("Station doesn't exist"));;
        Signalement signalement = new Signalement( date, heure, station,nbr_controlleurs, commentaire, humeur, position_controlleurs);
        signalementDao.save(signalement);
    }

    public void updateSignalement(Long id, LocalDate date, LocalTime heure, Long station_id, Integer nbr_controlleurs, String commentaire, Humeur humeur, Sorties position_controlleurs) {
        Optional<Signalement> signalementOptional = signalementDao.findById(id);
        Signalement signalement = signalementOptional.orElseThrow(() -> new NoSuchElementException("Signalement doesn't exist"));
        Station station ;
        if(date==null){
            date = signalement.getDate();
        }if(heure==null){
            heure = signalement.getHeure();
        }if(station_id ==null){
            station = signalement.getStation();
        }if(station_id != null){
            station = stationDao.findById(station_id).orElseThrow(() -> new NoSuchElementException("Station doesn't exist"));;
        } if(nbr_controlleurs==null){
            nbr_controlleurs = signalement.getNbr_controlleurs();
        }if(commentaire==""){
            commentaire = signalement.getCommentaire();
        }if(humeur==null){
            humeur = signalement.getHumeur();
        }if(position_controlleurs==null) {
            position_controlleurs = signalement.getPosition_controlleurs();
        }
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

    public List<Signalement> findByLigne(int num_ligne){
        List<Station> stations = stationService.findAllLigne(num_ligne);
        List<Signalement> signalements = signalementDao.findAll();
        List<Signalement> signalementsByLignes = new ArrayList<>() ;
        for(int i =0; i<signalements.size(); i++){
            for(int j =0; j<stations.size(); j++){
                if(signalements.get(i).getStation().getId() == stations.get(j).getId() ){
                    signalementsByLignes.add(signalements.get(i));
                }
            }
        }
        return signalementsByLignes;
    }

    public List<Signalement> lebonJour(LocalDate jour, List<Signalement> signalements){
        List<Signalement> signalementsByStations = new ArrayList<>() ;
        for(int i =0; i<signalements.size(); i++){
            if(signalements.get(i).getDate().isEqual(jour) ){
                signalementsByStations.add(signalements.get(i));
            }
        }
        return signalementsByStations;
    }

    public List<Signalement> getByHeure(LocalTime heure, List<Signalement> signalements){
        List<Signalement> signalementsByHeures = new ArrayList<>() ;
        for(int i =0; i<signalements.size(); i++){
            if(signalements.get(i).getHeure().equals(heure) ){
                signalementsByHeures.add(signalements.get(i));
            }
        }
        return signalementsByHeures;
    }

    public List<Signalement> findByStationAndDay(Long id_station, LocalDate jour){
        List<Signalement> signalementsStation = findByStation(id_station);
        List<Signalement> signalementsStationDay = lebonJour( jour, signalementsStation);
        return signalementsStationDay;
    }



    public List<Signalement> findByStationAndDay(Long id_station, LocalTime heure){
        List<Signalement> signalementsStation = findByStation(id_station);
        List<Signalement> signalementsStationDay = getByHeure( heure, signalementsStation);
        return signalementsStationDay;
    }

    public List<Signalement> findByHour( LocalTime heure){
        List<Signalement> signalements = findAll();
        List<Signalement> signalementsDay = getByHeure( heure, signalements);
        return signalementsDay;
    }

    public List<Signalement> findByDay( LocalDate jour){
        List<Signalement> signalements = findAll();
        List<Signalement> signalementsDay = lebonJour( jour, signalements);
        return signalementsDay;
    }

    public List<Signalement> findAll() {
        return signalementDao.findAll();
    }

    public Signalement findByID(Long id) {return signalementDao.findById(id).orElseThrow();}
}
