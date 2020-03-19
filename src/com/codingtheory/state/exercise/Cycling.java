package com.codingtheory.state.exercise;

public class Cycling implements TravelMode {

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (cycling)");
        return 2;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating direction (cycling)");
        return 2;
    }
}
