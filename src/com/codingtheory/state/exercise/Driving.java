package com.codingtheory.state.exercise;

public class Driving implements TravelMode {

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating direction (driving)");
        return 1;
    }
}
