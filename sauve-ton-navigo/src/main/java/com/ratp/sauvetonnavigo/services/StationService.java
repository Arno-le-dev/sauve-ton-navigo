package com.ratp.sauvetonnavigo.services;

import com.ratp.sauvetonnavigo.DAO.StationDAO;
import com.ratp.sauvetonnavigo.models.Signalement;
import com.ratp.sauvetonnavigo.models.Station;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
    public Station findByID(Long id) {return stationDao.findById(id).orElseThrow();}
}
