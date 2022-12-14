package org.example.implementation;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ActCoach implements Coach {

    @Autowired
    @Qualifier("scriptedFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Practice memorization technics";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
