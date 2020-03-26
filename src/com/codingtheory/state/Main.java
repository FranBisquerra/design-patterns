package com.codingtheory.state;

import com.codingtheory.state.abuse.Stopwatch;
import com.codingtheory.state.exercise.DirectionService;
import com.codingtheory.state.exercise.Driving;
import com.codingtheory.state.exercise.Walking;
import com.codingtheory.strategy.BlackAndWhiteFilter;
import com.codingtheory.strategy.ImageStorage;
import com.codingtheory.strategy.JpegCompressor;
import com.codingtheory.strategy.exercice.ChatClient;
import com.codingtheory.strategy.exercice.DESEncryptor;

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
