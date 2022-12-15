package org.example.implementation;

import org.example.interfaces.Coach;
import org.example.interfaces.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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

    @PostConstruct
    public void startUp() {
        System.out.println("Adding changes after creating the bean");
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("Adding changes before destroying the bean");
    }


}
