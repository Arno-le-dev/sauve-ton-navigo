package com.ratp.sauvetonnavigo.controllers;

import com.ratp.sauvetonnavigo.DTO.UsersDto;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Station;
import com.ratp.sauvetonnavigo.models.Users;
import com.ratp.sauvetonnavigo.services.SignalementService;
import com.ratp.sauvetonnavigo.services.UsersService;
import com.ratp.sauvetonnavigo.utils.Humeur;
import com.ratp.sauvetonnavigo.utils.Sorties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@CrossOrigin
@RequestMapping("signalement")
@RestController
@RequiredArgsConstructor
public class SignalementControllers {

    private final SignalementService signalementServices;
    @GetMapping("getAll")
    public List<Signalement> getAllSignalements() {
        return signalementServices.findAll();
    }

    @GetMapping("getAllStation/{id}")
    public List<Signalement> getAllSignalementsStation(@PathVariable Long id) {
        return signalementServices.findByStation(id);
    }

    @GetMapping("getAllDay")
    public List<Signalement> getAllSignalementsByDay( LocalDate jour) {
        return signalementServices.findByDay(jour);
    }

    @GetMapping("getAllStationAndDay")
    public List<Signalement> getAllSignalementsStation(Long id, LocalDate jour) {
        return signalementServices.findByStationAndDay(id, jour);
    }

    @GetMapping("/{id}")
    public Signalement getSignalement(@PathVariable Long id ){
        return signalementServices.findByID(id);
    }

    @PostMapping("")
    public void addSignalement(LocalDate date, LocalTime heure, Long station_id, Integer nbr_controlleurs, String commentaire, Humeur humeur, Sorties position_controlleurs){
    signalementServices.addSignalement( date, heure, station_id, nbr_controlleurs, commentaire, humeur,  position_controlleurs);
    }
    @PostMapping("/update")
    public void updateSignalement( Long id, LocalDate date, LocalTime heure, Long station_id, Integer nbr_controlleurs, String commentaire, Humeur humeur, Sorties position_controlleurs) {
        signalementServices.updateSignalement(id, date, heure, station_id, nbr_controlleurs, commentaire, humeur, position_controlleurs);
    }


    @DeleteMapping("/{id}")
    public void deleteSignalement(@PathVariable Long id) {
        signalementServices.deleteById(id);
    }
}
