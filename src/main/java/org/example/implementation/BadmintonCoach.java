package org.example.implementation;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    /* @Autowired
    public void methodInjection(FortuneService fortuneService)  {
        this.fortuneService = fortuneService;
    }*/

    @Override
    public String getDailyWorkout() {
        return "Badminton stuff";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
