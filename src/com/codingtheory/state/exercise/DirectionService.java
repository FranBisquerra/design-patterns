package com.codingtheory.state.exercise;

public class DirectionService {

    private TravelMode travelMode;

    public DirectionService(TravelMode transport) {
        this.travelMode = transport;
    }

    public int getEta() {
        return travelMode.getEta();
    }

    public int getDirection() {
        return travelMode.getDirection();
    }
}
