package org.example.implementation;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwinCoach implements Coach {

    private FortuneService fortuneService;

    @Value("${coach.email}")
    private String email;

    @Value("${coach.team}")
    private String team;

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

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
