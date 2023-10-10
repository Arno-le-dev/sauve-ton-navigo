package com.ratp.sauvetonnavigo.models;

import com.ratp.sauvetonnavigo.utils.Humeur;
import com.ratp.sauvetonnavigo.utils.Sorties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "signalements")
@Getter
@Builder
@AllArgsConstructor
public class Signalement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "heure")
    private LocalTime heure;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "station_id")
    private Station station;

    @Column(name = "nbr_controlleurs")
    private Integer nbr_controlleurs;

    @Column(name = "commentaire")
    private String commentaire;

    @Enumerated(EnumType.STRING)
    @Column(name = "humeur")
    private Humeur humeur;

    @Enumerated(EnumType.STRING)
    @Column(name = "position_controlleurs")
    private Sorties position_controlleurs;


    public Signalement(SignalementBuilder signalementBuilder) {
        this.id = signalementBuilder.id;
        this.date = signalementBuilder.date;
        this.heure = signalementBuilder.heure;
        this.station = signalementBuilder.station;
        this.nbr_controlleurs = signalementBuilder.nbr_controlleurs;
        this.commentaire = signalementBuilder.commentaire;
        this.humeur = signalementBuilder.humeur;
        this.position_controlleurs = signalementBuilder.position_controlleurs;
    }


    public Signalement(){
    }

}