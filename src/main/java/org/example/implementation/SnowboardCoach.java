package org.example.implementation;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;

public class SnowboardCoach implements Coach {

    private FortuneService fortuneService;

    public SnowboardCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Balance on Your Edges.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
