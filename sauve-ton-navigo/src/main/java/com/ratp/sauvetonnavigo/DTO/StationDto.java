package com.ratp.sauvetonnavigo.DTO;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StationDto {
    private Integer numero_ligne;
    private String nom;
    private Integer nbr_controlleurs;
    private Integer nbr_sortie;
}
