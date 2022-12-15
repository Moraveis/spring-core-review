package org.example.implementation;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;

public class SwinCoach implements Coach {

    private FortuneService fortuneService;

    public SwinCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swin 1000 meters as a warn up.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
