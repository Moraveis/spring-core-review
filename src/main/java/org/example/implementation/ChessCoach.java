package org.example.implementation;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ChessCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Learn defensive strategies";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
