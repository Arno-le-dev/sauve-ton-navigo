package com.ratp.sauvetonnavigo.controllers;

import com.ratp.sauvetonnavigo.DTO.StationDto;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Station;
import com.ratp.sauvetonnavigo.services.StationService;
import com.ratp.sauvetonnavigo.utils.Humeur;
import com.ratp.sauvetonnavigo.utils.Sorties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@CrossOrigin
@RequestMapping("station")
@RestController
@RequiredArgsConstructor
public class StationControllers {

    private final StationService stationService;

    @GetMapping("getAll")
    public List<Station> getAll() {
        return stationService.findAll();
    }

    @GetMapping("getAllLigne/{num_ligne}")
    public List<Station> getAllLigne(@PathVariable int num_ligne) {
        return stationService.findAllLigne(num_ligne);}

    @GetMapping("getAllControlleur")
    public List<Station> getAllControlleur() {
        return stationService.findAllnbControleurCroissant();}
    @GetMapping("/{id}")
    public Station getStation(@PathVariable Long id ){
        return stationService.findByID(id);
    }

    @GetMapping("getNbrSortie/{id}")
    public Integer getNbrSortie(@PathVariable Long id ){
        return stationService.findByID(id).getNbr_sortie();
    }

    @PostMapping("")
    public void addStation(StationDto stationDto){
        stationService.addStation( stationDto);
    }
    @PostMapping("/update")
    public void updateStation(Long id, StationDto stationDto) {
        stationService.updateStation(stationDto, id);
     }

    @DeleteMapping("/{id}")
    public void deleteSignalement(@PathVariable Long id) {
        stationService.deleteById(id);
    }
}
