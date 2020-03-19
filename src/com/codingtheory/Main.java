package com.codingtheory;

import com.codingtheory.state.abuse.Stopwatch;
import com.codingtheory.state.exercise.DirectionService;
import com.codingtheory.state.exercise.Driving;
import com.codingtheory.state.exercise.Walking;

public class Main {

    public static void main(String[] args) {

        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();

        var drivingService = new DirectionService(new Driving());
        System.out.println(drivingService.getEta());
        System.out.println(drivingService.getDirection());

        var walkingService = new DirectionService(new Walking());
        System.out.println(walkingService.getEta());
        System.out.println(walkingService.getDirection());
    }
}
