package com.codingtheory.state.exercise;

public class Walking implements TravelMode {

    @Override
    public int getEta() {
        System.out.println("Calculating ETA (walking)");
        return 4;
    }

    @Override
    public int getDirection() {
        System.out.println("Calculating direction (walking)");
        return 4;
    }
}
