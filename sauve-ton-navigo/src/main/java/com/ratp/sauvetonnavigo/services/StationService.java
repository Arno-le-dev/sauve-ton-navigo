package com.ratp.sauvetonnavigo.services;

import com.ratp.sauvetonnavigo.DAO.StationDAO;
import com.ratp.sauvetonnavigo.DTO.StationDto;
import com.ratp.sauvetonnavigo.DTO.StationMapper;
import com.ratp.sauvetonnavigo.DTO.UsersDto;
import com.ratp.sauvetonnavigo.DTO.UsersMapper;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Station;
import com.ratp.sauvetonnavigo.models.Users;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

@Service
@RequiredArgsConstructor
public class StationService {

    private final StationDAO stationDao;

    public List<Station> findAll() {
        return stationDao.findAll();
    }

    public List<Station> findAllLigne(int num_ligne) {
        List<Station> stations = stationDao.findAll();
        List<Station> stationsBonneLigne = new ArrayList<>();
        for(int i =0; i<stations.size(); i++){
            if(stations.get(i).getNumero_ligne()== num_ligne ){
                stationsBonneLigne.add(stations.get(i));
            }
        }
        return stationsBonneLigne;
    }

    public List<Station> findAllnbControleurCroissant() {
        List<Station> stations = stationDao.findAll();
        Comparator<Station> comparator = Comparator.comparingInt(s -> s.getNbr_controlleurs());
        Collections.sort(stations, comparator);
        return stations;
    }

    @Transactional
    public void addStation(StationDto stationDto) {
        Station station;
        try {
            station = StationMapper.fromDto(stationDto, null);
        } catch (IOException e) {
            throw new RuntimeException("Error with Student image", e);
        }
    }
    @Transactional
    public void updateStation(StationDto stationDto, Long id) {
        stationDao.findById(id)
                .orElseThrow(() -> new NoSuchElementException("User doesn't exist"));
        Station station;
        try {
            station = StationMapper.fromDto(stationDto, id);
        } catch (IOException e) {
            throw new RuntimeException("Error with Student image", e);
        }
        stationDao.save(station);
    }

    @Transactional
    public void deleteById(Long id) {
        stationDao.deleteById(id);
    }
    public Station findByID(Long id) {return stationDao.findById(id).orElseThrow();}
}
