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

    @GetMapping("getAllHours")
    public List<Signalement> getAllSignalementsByHours( LocalTime heure) {
        return signalementServices.findByHour(heure);
    }
    @GetMapping("getAllStationAndDay")
    public List<Signalement> getAllSignalementsStation(Long id, LocalDate jour) {
        return signalementServices.findByStationAndDay(id, jour);
    }

    @GetMapping("getAllLigne/{num_ligne}")
    public List<Signalement> getAllLigne(@PathVariable int num_ligne) {
        return signalementServices.findByLigne(num_ligne);}
    @GetMapping("/{id}")
    public Signalement getSignalement(@PathVariable Long id ){
        return signalementServices.findByID(id);
    }

    @PostMapping("")
    public void addSignalement(@RequestBody Signalement signalement){
            signalementServices.addSignalement( signalement.getDate(), signalement.getHeure(), signalement.getStation().getId(), signalement.getNbr_controlleurs(), signalement.getCommentaire(), signalement.getHumeur() , signalement.getPosition_controlleurs()  );
    }
    @PostMapping("/update/{id}")
    public Signalement updateSignalement(@PathVariable Long id, @RequestBody Signalement signalement) {
        signalementServices.updateSignalement(id,  signalement.getDate(), signalement.getHeure(), signalement.getStation().getId(), signalement.getNbr_controlleurs(), signalement.getCommentaire(), signalement.getHumeur() , signalement.getPosition_controlleurs());
        return signalementServices.findByID(id);
    }


    @DeleteMapping("/{id}")
    public void deleteSignalement(@PathVariable Long id) {
        signalementServices.deleteById(id);
    }
}
