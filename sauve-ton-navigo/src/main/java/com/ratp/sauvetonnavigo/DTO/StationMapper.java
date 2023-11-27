package com.ratp.sauvetonnavigo.DTO;

import com.ratp.sauvetonnavigo.models.Station;
import com.ratp.sauvetonnavigo.models.Users;

import java.io.IOException;

public class StationMapper {

    public static Station fromDto(StationDto dto, Long id) throws IOException {
        return Station.builder()
                .id(id)
                .numero_ligne(dto.getNumero_ligne())
                .nom(dto.getNom())
                .nbr_controlleurs(dto.getNbr_controlleurs())
                .nbr_sortie(dto.getNbr_sortie())
                .build();
    }

    public static StationDto toDto (Station station){
        return StationDto.builder()
                .numero_ligne(station.getNumero_ligne())
                .nom(station.getNom())
                .nbr_controlleurs(station.getNbr_controlleurs())
                .nbr_sortie(station.getNbr_sortie())
                .build();
    }
}
