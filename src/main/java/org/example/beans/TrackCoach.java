package org.example.beans;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;

public class TrackCoach implements Coach {

    private final FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
