package org.example.beans;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;

public class SoccerCoach implements Coach {

    private final FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 100 kicks to goal.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
