package com.ratp.sauvetonnavigo.services;


import ch.qos.logback.core.joran.sanity.Pair;
import com.ratp.sauvetonnavigo.DAO.SignalementDAO;
import com.ratp.sauvetonnavigo.DAO.StationDAO;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Station;
import com.ratp.sauvetonnavigo.models.StationWithSignalements;
import com.ratp.sauvetonnavigo.utils.Humeur;
import com.ratp.sauvetonnavigo.utils.Sorties;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SignalementService {
    private final SignalementDAO signalementDao;
    private final StationDAO stationDao;

    private final StationService stationService;


    @Transactional
    public void addSignalement( LocalDate date, LocalTime heure, Long station_id, Integer nbr_controlleurs, String commentaire, Humeur humeur, Sorties position_controlleurs) {
        Station station = stationDao.findById(station_id)
                .orElseThrow(() -> new NoSuchElementException("Station doesn't exist"));
        Signalement signalement = new Signalement( date, heure, station,nbr_controlleurs, commentaire, humeur, position_controlleurs);
        signalementDao.save(signalement);
    }

    public void updateSignalement(Long id, LocalDate date, LocalTime heure, Long station_id, Integer nbr_controlleurs, String commentaire, Humeur humeur, Sorties position_controlleurs) {
        Optional<Signalement> signalementOptional = signalementDao.findById(id);
        Signalement signalement = signalementOptional.orElseThrow(() -> new NoSuchElementException("Signalement doesn't exist"));
        Station station = signalement.getStation();;
        if(date==null){
            date = signalement.getDate();
        }if(heure==null){
            heure = signalement.getHeure();
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
        Signalement newSignalement = new Signalement( id, date, heure, station, nbr_controlleurs, commentaire,humeur,position_controlleurs);
        signalementDao.save(newSignalement);
    }
    @Transactional
    public void deleteById(Long id) {
        signalementDao.deleteById(id);
    }
    public List<Signalement> findByStation(Long id_station){
        List<Signalement> signalements = signalementDao.findAll();
        List<Signalement> signalementsByStations = new ArrayList<>() ;
        for(int i =0; i<signalements.size(); i++){
            if(signalements.get(i).getStation().getId() == id_station.intValue() ){
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

    public List<Signalement> lebonMois(int mois, List<Signalement> signalements){
        List<Signalement> signalementsByStations = new ArrayList<>() ;
        for(int i =0; i<signalements.size(); i++){
            if(signalements.get(i).getDate().getMonthValue()==mois){
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

    public List<Station> findAllStatStationPlusControlByDay( LocalDate jour){
        List<Station> stations = stationDao.findAll();
        List<Integer> nbrSignalement = new ArrayList<Integer>();
        List<Station> top3Stations = stations.stream()
                .map(station -> {
                    List<Signalement> signalementsStation = findByStation(station.getId());
                    List<Signalement> signalementsStationDay = lebonJour( jour, signalementsStation);
                    int numberOfSignalements = signalementsStationDay.size();
                    nbrSignalement.add(numberOfSignalements);
                    return new StationWithSignalements(station, numberOfSignalements);
                    })
                .filter(stationWithSignalements -> stationWithSignalements.getNumberOfSignalements() > 0)
                .sorted((s1, s2) -> Integer.compare(s2.getNumberOfSignalements(), s1.getNumberOfSignalements()))
                .limit(3)
                .map(StationWithSignalements::getStation)
                .collect(Collectors.toList());
        return top3Stations;
    }

    public List<Station> findAllStatStationPlusControlByMonth( int mois){
        List<Station> stations = stationDao.findAll();
        List<Integer> nbrSignalement = new ArrayList<Integer>();
        List<Station> top3Stations = stations.stream()
                .map(station -> {
                    List<Signalement> signalementsStation = findByStation(station.getId());
                    List<Signalement> signalementsStationDay = lebonMois( mois, signalementsStation);
                    int numberOfSignalements = signalementsStationDay.size();
                    nbrSignalement.add(numberOfSignalements);
                    return new StationWithSignalements(station, numberOfSignalements);
                })
                .filter(stationWithSignalements -> stationWithSignalements.getNumberOfSignalements() > 0)
                .sorted((s1, s2) -> Integer.compare(s2.getNumberOfSignalements(), s1.getNumberOfSignalements()))
                .limit(3)
                .map(StationWithSignalements::getStation)
                .collect(Collectors.toList());
        return top3Stations;
    }

    public List<Integer> findAllStatLingePlusControlByMonth( int mois){
       /* List<Integer> lignes = new ArrayList<>();
        for (int i = 1; i <= 14; i++) {
            lignes.add(i);
        }
        List<Integer> nbrSignalement = new ArrayList<>();
        List<Integer> top3Lignes = lignes.stream()
                .map(ligne -> {
                    List<Signalement> signalementsListe = findByLigne(ligne.intValue());
                    List<Signalement> signalementsListeDay = lebonMois( mois, signalementsListe);
                    int numberOfSignalements = signalementsListeDay.size();
                    System.out.println("la ligne "+ligne + " a "+ numberOfSignalements);
                    nbrSignalement.add(numberOfSignalements);
                    return ligne;
                })
                .sorted(Comparator.comparingInt(ligne -> nbrSignalement.get(ligne-1)))
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("la liste final" + top3Lignes);
        return top3Lignes;*/
        List<Integer> lignes = new ArrayList<>();
        List<Integer> nbrSignalement = new ArrayList<>();
        List<Map.Entry<Integer, Integer>> ligneSignalementPairs = new ArrayList<>();
        for (int i = 0; i < 14; i++) {
            lignes.add(i+1);
            List<Signalement> signalementsListe = findByLigne(lignes.get(i));
            List<Signalement> signalementsListeDay = lebonMois( mois, signalementsListe);
            nbrSignalement.add( signalementsListeDay.size());
            ligneSignalementPairs.add(new AbstractMap.SimpleEntry<>(lignes.get(i), nbrSignalement.get(i)));
        }
        ligneSignalementPairs.removeIf(entry -> entry.getValue() == 0);
        Collections.sort(ligneSignalementPairs, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        int topLinesCount = Math.min(5, ligneSignalementPairs.size());
        lignes.clear();
        for (int i = 0; i < topLinesCount; i++) {
            lignes.add(ligneSignalementPairs.get(i).getKey());
        }
        return lignes;
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

    public List<Signalement> findAllOrderByday(int debut) {
        List<Signalement> signalements = findAll();
        Collections.sort(signalements, Comparator.comparing(Signalement::getDate, Comparator.nullsLast(Comparator.reverseOrder())));
        int size = Math.min(signalements.size(), debut+5);
        return signalements.subList(debut, size);
    }

    public List<Signalement> findAllOrderByday() {
        List<Signalement> signalements = findAll();
        Collections.sort(signalements, Comparator.comparing(Signalement::getDate, Comparator.nullsLast(Comparator.reverseOrder())));
        return signalements;
    }

    public Signalement findByID(Long id) {return signalementDao.findById(id).orElseThrow();}
}
