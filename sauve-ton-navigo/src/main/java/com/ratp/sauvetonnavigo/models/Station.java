package com.ratp.sauvetonnavigo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;


@Entity
@Table(name = "station")
@Getter
@Builder
@AllArgsConstructor
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero_ligne")
    private Integer numero_ligne;

    @Column(name = "nom")
    private String nom;

    @Column(name = "nbr_controlleurs")
    private Integer nbr_controlleurs;

    @Column(name = "nbr_sortie")
    private Integer nbr_sortie;

    public Station(StationBuilder stationBuilder) {
        this.id = stationBuilder.id;
        this.numero_ligne = stationBuilder.numero_ligne;
        this.nom = stationBuilder.nom;
        this.nbr_controlleurs = stationBuilder.nbr_controlleurs;
        this.nbr_sortie = stationBuilder.nbr_sortie;
    }

    public Long getId() {
        return id;
    }

    public Station(){}

}