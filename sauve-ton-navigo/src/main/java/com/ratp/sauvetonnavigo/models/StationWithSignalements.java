package com.ratp.sauvetonnavigo.models;

public class StationWithSignalements {
    private Station station;
    private int numberOfSignalements;

    public StationWithSignalements(Station station, int numberOfSignalements) {
        this.station = station;
        this.numberOfSignalements = numberOfSignalements;
    }

    public Station getStation() {
        return station;
    }

    public int getNumberOfSignalements() {
        return numberOfSignalements;
    }
}
